package com.lc.ibps.skeleton.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.InvalidClaimException;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.lc.ibps.api.base.query.FieldRelation;
import com.lc.ibps.api.base.query.QueryOP;
import com.lc.ibps.base.core.monitor.StopWatchUtil;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.core.util.FseUtil;
import com.lc.ibps.base.core.util.FstUtil;
import com.lc.ibps.base.core.util.JacksonUtil;
import com.lc.ibps.base.core.util.KryoUtil;
import com.lc.ibps.base.db.model.DefaultFieldLogic;
import com.lc.ibps.base.db.model.DefaultQueryFilter;
import com.lc.ibps.base.framework.executor.concurrent.CountDownLatchExecutor;
import com.lc.ibps.skeleton.model.AddressVO;
import com.lc.ibps.skeleton.model.ValidatorVO;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.UUID;

public class QueryMain {

	private static final Logger LOGGER = LoggerFactory.getLogger(QueryMain.class);
	
	public static void main(String[] args) {
//		queryFilter();
//		copy();
//		jwt();
//		countDownLatch();
//		cyclicBarrier();
		countDownLatchExecutor();
	}
	
	protected static void countDownLatchExecutor() {
		CountDownLatch countDownLatch = new CountDownLatch(3);
		Semaphore errorSemaphore = new Semaphore(0);
		CountDownLatchExecutor executor = new CountDownLatchExecutor(countDownLatch, errorSemaphore);
		executor.addAwaitTask("await", new Callable<Void>() {
			@Override
			public Void call() throws Exception {
				// ??????????????????????????????????????????????????????
				System.out.println("BusiThread " + Thread.currentThread().getId() + " do business-----");
				return null;
			}
		});
		executor.addCountDownTask("countDown-1", new Callable<Void>() {
			@Override
			public Void call() throws Exception {
				System.out.println("thread_" + Thread.currentThread().getId() + "..... do before business ");
				return null;
			}
		});
		executor.addCountDownTask("countDown-2", new Callable<Void>() {
			@Override
			public Void call() throws Exception {
				System.out.println("thread_" + Thread.currentThread().getId() + "..... do before business ");
				return null;
			}
		});
		executor.addCountDownTask("countDown-3", new Callable<Void>() {
			@Override
			public Void call() throws Exception {
				System.out.println("thread_" + Thread.currentThread().getId() + "..... do before business ");
				throw new RuntimeException();
				//return null;
			}
		});
		executor.start();
		executor.waitForTasks();
		LOGGER.info("Over.");
	}
	
	protected static void cyclicBarrier() {
		Map<String, Long> resultMap = new ConcurrentHashMap<>();
	    CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new CollectCyclicBarrierThread(resultMap));
	    for (int i = 0; i <= 4; i++) {
            new Thread(new SubCyclicBarrierThread(resultMap, cyclicBarrier)).start();
        }
	}
	
	/**
     * ??????????????????
     * ????????????CyclicBarrier??????????????????,barrierAction
     */
    private static class CollectCyclicBarrierThread implements Runnable {
    	private Map<String, Long> resultMap;
    	public CollectCyclicBarrierThread(Map<String, Long> resultMap){
    		this.resultMap = resultMap;
    	}
        @Override
        public void run() {
            StringBuffer result = new StringBuffer();
            for (Map.Entry<String, Long> workResult : resultMap.entrySet()) {
                result.append("[" + workResult.getValue() + "]");
            }
            System.out.println("the result = " + result);
            System.out.println("do other business.....");
            try {
				TimeUnit.SECONDS.sleep(Thread.currentThread().getId());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }

    /**
     * ???????????????
     * ??????CyclicBarrier???????????????
     */
    private static class SubCyclicBarrierThread implements Runnable {
    	private Map<String, Long> resultMap;
    	private CyclicBarrier cyclicBarrier;
    	public SubCyclicBarrierThread(Map<String, Long> resultMap, CyclicBarrier cyclicBarrier){
    		this.resultMap = resultMap;
    		this.cyclicBarrier = cyclicBarrier;
    	}
        @Override
        public void run() {
            // ?????????????????????ID
            long id = Thread.currentThread().getId();
            // ?????????????????????
            resultMap.put(String.valueOf(id), id);
            try {
                System.out.println("Thread_"+id+"..... do something");
                TimeUnit.SECONDS.sleep(id);
                System.out.println(id+" is await");
                cyclicBarrier.await();
                System.out.println("Thread_"+id+".....do its business");
                //TimeUnit.SECONDS.sleep(id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
	
	protected static void countDownLatch() {
		CountDownLatch countDownLatch = new CountDownLatch(3);
		// ??????????????????
        new Thread(new BusiCountDownLatchThread(countDownLatch)).start();
        // ?????????????????????
        for (int i = 1; i <= 3; i++) {
            new Thread(new InitCountDownLatchThread(countDownLatch, i + 2)).start();
        }
        // ?????????????????????
        try {
            countDownLatch.await();
            System.out.println("Main do ites work.....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	/**
     * ???????????????
     */
    private static class InitCountDownLatchThread implements Runnable {
    	private CountDownLatch countDownLatch;
    	private int seconds;
    	public InitCountDownLatchThread(CountDownLatch countDownLatch, int seconds) {
			this.countDownLatch = countDownLatch;
			this.seconds = seconds;
		}
    	
        @Override
        public void run() {
            try {
            	System.out.println("thread_" + Thread.currentThread().getId() + " ready init work ..... " + seconds);
            	TimeUnit.SECONDS.sleep(seconds);
            	// ???????????? ?????????????????????
            	countDownLatch.countDown();
				System.out.println("thread_" + Thread.currentThread().getId() + ".....continue do its work " + seconds);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }

    /**
     * ????????????
     */
    private static class BusiCountDownLatchThread implements Runnable {
    	private CountDownLatch countDownLatch;
    	public BusiCountDownLatchThread(CountDownLatch countDownLatch) {
			this.countDownLatch = countDownLatch;
		}
    	
        @Override
        public void run() {
            // ??????????????????????????????????????????????????????
            try {
                countDownLatch.await();
                System.out.println("BusiThread " + Thread.currentThread().getId() + " do business-----");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	
	protected static void jwt() {
		Algorithm algorithm = Algorithm.HMAC256("secret");
		try {
			Date now = new Date();
			Map<String, Object> payloadClaims = new HashMap<>();
//			Map<String, Object> employee = new HashMap<>();
//			payloadClaims.put("employee", employee);
			Map<String, Object> user = new HashMap<>();
			user.put("id", "8743276872358273985798322");
			user.put("account", "admin");
			user.put("isSuper", "Y");
			//user.put("fullName", "?????????");
			payloadClaims.put("user", user);

//			List<Map<String, Object>> roles = new ArrayList<>();
//			for(int i =0, z=10;i<z;i++){
//				Map<String, Object> map = new HashMap<>();
//				map.put("id", "id"+i);
//				map.put("alias", "alias"+i);
//				map.put("name", "name"+i);
//				roles.add(map);
//			}
//			payloadClaims.put("role", roles);
			
			String context = JacksonUtil.toJsonString(payloadClaims);
			context = Base64.encode(context);
			//AES aes = new AES("algorithalgorith".getBytes(CharsetUtil.UTF_8));
			//byte[] contextBtyes = aes.encrypt(context.getBytes(CharsetUtil.UTF_8));
			
		    String token = 
		    		JWT.create()
		    		//.withHeader(map)// ????????????
		    		.withIssuer("ibps")// ????????????
		    		.withIssuedAt(now)// ?????????????????????
		    		.withAudience("ibps")// ????????????
		    		.withExpiresAt(DateUtil.offsetMinute(now, 3))
		    		//.withExpiresAt(DateUtil.offsetSecond(now, 3))
		    		//.withClaim("context", context)
		    		.withClaim("u", "8743276872358273985798322:zhongd:Y:8743276872358273985798322")
					//.withClaim("account", "admin")
					//.withClaim("isSuper", "Y")
		    		//.withPayload(payloadClaims)
		    		.sign(algorithm);
		    System.out.println(String.format("Token   ==> %s", token));
		    System.out.println(String.format("Token.length   ==> %s", token.length()));
		    
		    //Thread.sleep(4000);
		    
		    JWTVerifier verifier = JWT.require(algorithm)
		    	    .withIssuer("ibps")
		    	    .build();
		    DecodedJWT jwt = verifier.verify(token);
		    System.out.println(String.format("?????????  ==> %s", jwt.getIssuer()));
		    System.out.println(String.format("??????  ==> %s", jwt.getSignature()));
		    System.out.println(String.format("????????????  ==> %s", Base64.decodeStr(jwt.getHeader())));
		    System.out.println(String.format("???????????? ==> %s", jwt.getClaims()));
		    
		    Claim claim = jwt.getClaim("u");
		    System.out.println(String.format("?????????base64????????? ==> %s", claim));
		    //System.out.println(String.format("?????????base64?????? ==> %s", Base64.decodeStr(claim.asString())));
		    //contextBtyes = aes.decrypt(claim.asString().getBytes(CharsetUtil.UTF_8));
		    //System.out.println(String.format("?????????aes?????? ==> %s", new String(contextBtyes, CharsetUtil.UTF_8)));
		    //System.out.println(String.format("?????????base64?????? ==> %s", Base64.decodeStr(new String(contextBtyes, CharsetUtil.UTF_8))));
		}
		catch (InvalidClaimException e1) {
			e1.printStackTrace();
		}
		catch (JWTCreationException e2) {
			e2.printStackTrace();
		}
//		catch (InterruptedException e3) {
//			e3.printStackTrace();
//		}
//		catch (UnsupportedEncodingException e4) {
//			e4.printStackTrace();
//		}
	}
	
	protected static void copy() {
		int threads = 50;
		List<Integer> datas = new ArrayList<>(threads);
		for(int i = 0; i < threads; i++) {
			datas.add(i);
		}
		int len = 100000;
		datas.parallelStream().forEach((data) -> {
			deepCopy(len);
		});
	}
	
	protected static void deepCopy(int len) {
		ValidatorVO vo = new ValidatorVO();
		vo.setAge(2);
		vo.setMobile("12331");
		vo.setName("1241");
		vo.setPhone("24234");
		vo.setTelephone("24234");
		vo.setUserName("124432");
		
		AddressVO avo = new AddressVO();
		avo.setCity("dads");
		avo.setCountry("qrqr");
		avo.setDetail("rfsfsfd");
		avo.setProvince("avoqrrew");
		avo.setStreet("avowerwddf");
		vo.setAddr(avo);
		
		String stopWatchId = UUID.fastUUID().toString(true);
		String step = "";
		StopWatchUtil.init(stopWatchId, Level.INFO);
		// kryo
		StopWatchUtil.start(step, "kryo");
		for(int i = 0; i < len; i++) {
			KryoUtil.copy(vo);
		}
		// kryo
		StopWatchUtil.stopAndStartNew(step, "kryo2");
		for(int i = 0; i < len; i++) {
			KryoUtil.deepCopy(vo);
		}
		// jdk
		StopWatchUtil.stopAndStartNew(step, "jdk");
		for(int i = 0; i < len; i++) {
			BeanUtils.copy(vo);
		}
		// fst
		StopWatchUtil.stopAndStartNew(step, "fst");
		for(int i = 0; i < len; i++) {
			FstUtil.deepCopy(vo);
		}
		// fse
		StopWatchUtil.stopAndStartNew(step, "fse");
		for(int i = 0; i < len; i++) {
			FseUtil.deepCopy(vo);
		}
		
		StopWatchUtil.stop(step);
		String pretty = StopWatchUtil.getPretty(step);
		System.out.println(pretty);
	}
	
	protected static void queryFilter() {
		// ????????????
		DefaultQueryFilter queryFilter = new DefaultQueryFilter();
		DefaultFieldLogic fieldLogic = new DefaultFieldLogic(FieldRelation.AND);
		fieldLogic.addFilterWithRealValue("NAME_","NAME_1",  "%??????%", "??????", QueryOP.LIKE, FieldRelation.OR);// ??????????????????
		fieldLogic.addFilterWithRealValue("ALIAS_", "ALIAS_1", "sys", "sys", QueryOP.NOT_EQUAL, FieldRelation.AND);// ??????????????????
		queryFilter.addGroup(fieldLogic);// ??????????????????
		fieldLogic = new DefaultFieldLogic(FieldRelation.AND);
		fieldLogic.addFilterWithRealValue("NAME_", "NAME_2", "%??????%", "??????", QueryOP.LIKE, FieldRelation.OR);// ??????????????????
		fieldLogic.addFilterWithRealValue("ALIAS_", "ALIAS_2", "system", "system", QueryOP.NOT_EQUAL, FieldRelation.OR);// ??????????????????
		fieldLogic.addFilterWithRealValue("ALIAS_", null, null, QueryOP.NOTEMPTY, FieldRelation.OR);// ??????????????????
		fieldLogic.addFilterWithRealValue("ALIAS_", null, null, QueryOP.NOTNULL, FieldRelation.OR);// ??????????????????
		queryFilter.addGroup(fieldLogic);// ??????????????????
		// ??????sql
		System.out.println("sql ==> " + queryFilter.getFieldLogic().getSql());
		System.out.println("param ==> " + queryFilter.getParams());
		// ?????????((NAME_ like  #{NAME_1} AND ALIAS_ != #{ALIAS_1}) AND (NAME_ like  #{NAME_2} AND ALIAS_ != #{ALIAS_2}))
		// ?????????{NAME_1=%??????%, ALIAS_1=sys, NAME_2=%??????%, ALIAS_2=system}
		
		// ------------------------------------------
		// ??????????????????1
		DefaultFieldLogic fieldLogicOr = new DefaultFieldLogic(FieldRelation.OR);
		queryFilter = new DefaultQueryFilter();
		queryFilter.setFieldLogic(fieldLogicOr);
		queryFilter.addFilterWithRealValue("NAME_", "NAME_1", "sys", "sys", QueryOP.EQUAL, FieldRelation.OR);// ??????????????????
		queryFilter.addFilterWithRealValue("NAME_", "NAME_2", "system", "system", QueryOP.EQUAL, FieldRelation.OR);// ??????????????????
		queryFilter.addFilter("ALIAS_", QueryOP.NOTEMPTY, FieldRelation.OR);// ??????????????????
		queryFilter.addFilter("ALIAS_", QueryOP.NOTNULL, FieldRelation.OR);// ??????????????????
		// ??????sql
		System.out.println("================================> ");
		System.out.println("sql ==> " + queryFilter.getFieldLogic().getSql());
		System.out.println("param ==> " + queryFilter.getParams());
		// ?????????(NAME_ = #{NAME_1} OR NAME_ = #{NAME_2})
		// ?????????{NAME_1=sys, NAME_2=system}
		// ??????????????????2
		fieldLogicOr = new DefaultFieldLogic(FieldRelation.OR);
		queryFilter = new DefaultQueryFilter();
		queryFilter.setFieldLogic(fieldLogicOr);
		queryFilter.addFilterWithRealValue("NAME_", "sys", "sys", QueryOP.EQUAL, FieldRelation.OR);// ??????????????????
		queryFilter.addFilterWithRealValue("NAME_", "system", "system", QueryOP.EQUAL, FieldRelation.OR);// ??????????????????
		queryFilter.addFilter("ALIAS_", QueryOP.NOTEMPTY, FieldRelation.OR);// ??????????????????
		queryFilter.addFilter("ALIAS_", QueryOP.NOTNULL, FieldRelation.AND);// ??????????????????
		// ??????sql
		System.out.println("================================> ");
		System.out.println("sql ==> " + queryFilter.getFieldLogic().getSql());
		System.out.println("param ==> " + queryFilter.getParams());
		// ?????????(NAME_ = #{NAME_1} OR NAME_ = #{NAME_2})
		// ?????????{NAME_1=sys, NAME_2=system}
		
		// ------------------------------------------
		// ????????????????????????
		// QueryFilter???????????????
		// FieldLogic??????????????????????????????????????????????????????
		// ???????????????????????????
	}

}
