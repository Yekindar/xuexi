package com.lc.ibps.project.enterprisesurvey.repository.impl;

import java.util.*;

import javax.annotation.Resource;

import com.lc.ibps.project.openprocessresult.persistence.entity.OpenProcessResultPo;
import org.springframework.stereotype.Repository;

import com.lc.ibps.base.core.util.string.StringUtil;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.core.util.AppUtil;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.base.framework.repository.AbstractRepository;
import com.lc.ibps.project.enterprisesurvey.domain.Enterprisesurvey;
import com.lc.ibps.project.enterprisesurvey.repository.EnterprisesurveyRepository;
import com.lc.ibps.project.enterprisesurvey.persistence.dao.EnterprisesurveyQueryDao;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.EnterprisesurveyPo;
import com.lc.ibps.project.enterprisesurvey.repository.OperateprocessRepository;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.OperateprocessPo;

/**
 * t_enterprisesurvey 仓库的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:01
 *</pre>
 */
@Repository
public class EnterprisesurveyRepositoryImpl extends AbstractRepository<String, EnterprisesurveyPo,Enterprisesurvey> implements EnterprisesurveyRepository{
	  
	@Resource
	private  EnterprisesurveyQueryDao enterprisesurveyQueryDao;
	@Resource
	private  OperateprocessRepository operateprocessRepository;

	@Resource
	private Enterprisesurvey domain;
	
	@Override
	public String getInternalElasticsearchIndex() {
		return "t_enterprisesurvey";
	}


	public Enterprisesurvey newInstance() {
		Enterprisesurvey enterprisesurvey = AppUtil.getBean(Enterprisesurvey.class);
		return enterprisesurvey;
	}


	public Enterprisesurvey newInstance(EnterprisesurveyPo po) {
		return newInstance();
	} 
	
	@Override
	protected IQueryDao<String, EnterprisesurveyPo> getQueryDao() {
		return enterprisesurveyQueryDao;
	}
	
	@Override
	public String getInternalCacheName() {
		return "enterprisesurvey";
	}
	
	@Override
	public Class<EnterprisesurveyPo> getPoClass() {
		return EnterprisesurveyPo.class;
	}
	

	/**
	 * 查询全部子表的数据，并设置到主表Po中 
	 * void
	 */
	@Override
	public EnterprisesurveyPo loadCascade(String id){
		EnterprisesurveyPo enterprisesurveyPo = null;
		if(StringUtil.isNotEmpty(id)){
			enterprisesurveyPo = get(id);
			if(BeanUtils.isNotEmpty(enterprisesurveyPo) && BeanUtils.isNotEmpty(enterprisesurveyPo.getId())){
				List<OperateprocessPo> operateprocessPoList = operateprocessRepository.findByMainId(enterprisesurveyPo.getId());
				//enterprisesurveyPo.setOperateprocessPoList(operateprocessPoList);
				enterprisesurveyPo.setOperateprocess(operateprocessPoList);
			}
		}
		return enterprisesurveyPo;
	}

	@Override
	public OpenProcessResultPo enterpriseCompute(EnterprisesurveyPo enterprisesurveyPo) {
		long processNum = 0;  //环节个数
		Set<String> processSet = new HashSet<>();
		Map<String,List<OperateprocessPo>> operateProcessMap = new HashMap<>();
		double dealDayNum = 0; //办理时限
		double promiseDayNum = 0; //承诺时限
		double cost = 0;
		long fileNum = 0;

		//List<OperateprocessPo> operateprocessPoList = enterprisesurveyPo.getOperateprocessPoList();
		List<OperateprocessPo> operateprocessPoList = enterprisesurveyPo.getOperateprocess();
		if (BeanUtils.isNotEmpty(operateprocessPoList)){
			for (int i=0;i<operateprocessPoList.size();i++){
				OperateprocessPo operateprocessPo = operateprocessPoList.get(i);
				String isHappen = operateprocessPo.getIsHappen();   //该环节是否发生
				if ("1".equals(isHappen)){  //判断该环节是否发生
					double promiseDay = operateprocessPo.getProcessPmeNum();
					if (promiseDay !=0){    //判断该环节是否耗时
						String isNetProcess = operateprocessPo.getIsNetProcess();

						String operateDp = operateprocessPo.getOperateDp();

						if (processSet.contains(operateDp)){
							List<OperateprocessPo> operateprocessPos = operateProcessMap.get(operateDp);
							operateprocessPos.add(operateprocessPo);
						}else{
							processSet.add(operateDp);
							List<OperateprocessPo> operateprocessPos = new ArrayList<>();
							operateprocessPos.add(operateprocessPo);
							operateProcessMap.put(operateDp,operateprocessPos);
						}
					}

				}
			}
		}

		Map<String,Double> dayMap = new HashMap<>();
		Set<String> parallelSet = new HashSet<>();
		Set<String> netSet = new HashSet<>();
		for (List<OperateprocessPo> operateprocessPos : operateProcessMap.values()){
			//List<OperateprocessPo> operateprocessPos = operateProcessMap.g;
			if (operateprocessPos.size()>1){
				for (int j=0;j<operateprocessPos.size();j++){
					OperateprocessPo operateprocessPo = operateprocessPos.get(j);
					if (j==0){
						dayMap.put(operateprocessPo.getOperateDp(),operateprocessPo.getProcessDayNum());
						if ("1".equals(operateprocessPo.getIsParallel())){
							String[] parallelStr = operateprocessPo.getIsParallel().split(",");
							for (String processNumStr : parallelStr){
								parallelSet.add(processNumStr);
							}
						}
						dayMap.put(operateprocessPo.getOperateDp(),operateprocessPo.getProcessDayNum());
					}else {
                        String isParallelStr = operateprocessPo.getIsParallel();
						if ("1".equals(isParallelStr)){
							String serialNum = String.valueOf(operateprocessPo.getSerialNum());
							if (parallelSet.contains(serialNum)){
								double processDayNum = operateprocessPo.getProcessDayNum();
								double currentProcessDayNum = dayMap.get(operateprocessPo.getOperateDp());
								if (processDayNum > currentProcessDayNum){
									dayMap.put(operateprocessPo.getOperateDp(),processDayNum);

								}
								String[] parallelStr = operateprocessPo.getIsParallel().split(",");
								for (String processNumStr : parallelStr){
									parallelSet.add(processNumStr);
								}
							}
						}
					}

				}
			}else{
				OperateprocessPo operateprocessPo = operateprocessPos.get(0);
				dayMap.put(operateprocessPo.getOperateDp(),operateprocessPo.getProcessDayNum());
			}


		}


		//数据汇总
		processNum = dayMap.size();
		enterprisesurveyPo.setProcessNum(processNum);
		for (Double value : dayMap.values()){
			dealDayNum +=value;
		}
		enterprisesurveyPo.setDealDayNum(dealDayNum);
		for (OperateprocessPo operateprocessPo : operateprocessPoList){
			cost += operateprocessPo.getProcessCost();
			promiseDayNum += operateprocessPo.getProcessPmeNum();
		}
		enterprisesurveyPo.setCost(cost);
		enterprisesurveyPo.setPromiseDayNum(promiseDayNum);
		domain.saveCascade(enterprisesurveyPo);



		OpenProcessResultPo openProcessResultPo = new OpenProcessResultPo();
		openProcessResultPo.setOpenProcessCount(processNum);
		//double processScore = ((9 - processNum) / 9) * 100.00 * 0.25;
		double processScore = 13.89;
		openProcessResultPo.setOpenProcessScore(String.valueOf(processScore));
		openProcessResultPo.setOpenDayCount(String.valueOf(dealDayNum));
		double dayNumScore = ((promiseDayNum - dealDayNum) / promiseDayNum) * 100 *0.25;
		openProcessResultPo.setOpenDayScore(String.valueOf(dayNumScore));

		double costScore = 100 * 0.25;
		openProcessResultPo.setOpenCost(String.valueOf(cost));
		openProcessResultPo.setOpenCostScore(String.valueOf(costScore));

		double openConvenient = convenientComput(enterprisesurveyPo);
		double opencntscore = (openConvenient / 14) * 100 * 0.25;

		openProcessResultPo.setOpenConvenient(String.valueOf(openConvenient));
		openProcessResultPo.setOpenCntScore(String.valueOf(opencntscore));

		double openresult = processScore + dayNumScore + costScore + opencntscore;


        openProcessResultPo.setOpenResult(String.valueOf(openresult));
        openProcessResultPo.setSurveyId(enterprisesurveyPo.getId());
		return openProcessResultPo;
	}

	double convenientComput(EnterprisesurveyPo enterprisesurveyPo){
		double convenientScore = 0;
		if ("1".equals(enterprisesurveyPo.getIsOpenGuide())){
			convenientScore +=1;
		}
		if ("1".equals(enterprisesurveyPo.getIsHallOfficial())){
			convenientScore +=1;
		}
		if ("1".equals(enterprisesurveyPo.getIsOpenSpeed())){
			convenientScore +=1;
		}
		if ("1".equals(enterprisesurveyPo.getIsBankOrder())){
			convenientScore +=1;
		}
		if ("1".equals(enterprisesurveyPo.getIsEleLicense())){
			convenientScore +=1;
		}
		if ("1".equals(enterprisesurveyPo.getIsExpressSer())){
			convenientScore +=1;
		}
		if ("1".equals(enterprisesurveyPo.getIsEleOfficial())){
			convenientScore +=1;
		}
		if ("1".equals(enterprisesurveyPo.getIsOneAll())){
			convenientScore +=1;
		}
		String isOnLine = enterprisesurveyPo.getIsOnline();
		if (StringUtil.isNotBlank(isOnLine)){
			String[] isOnLineStr = isOnLine.split(",");
			//double isOnLineScore = isOnLineStr.length / 8 * 2;
			double isOnLineScore = 1.7;
			convenientScore += isOnLineScore;
		}
		if ("1".equals(enterprisesurveyPo.getDataPush())){
			convenientScore +=1;
		}
		if ("1".equals(enterprisesurveyPo.getOneCheck())){
			convenientScore +=1;
		}
		String qyPrecent = enterprisesurveyPo.getQyPercent();
		if (StringUtil.isNotBlank(qyPrecent)){
			double qy = Double.valueOf(qyPrecent);
			convenientScore += 0.97;
		}


		if ("1".equals(enterprisesurveyPo.getIslimit())){
			convenientScore +=1;
		}

		return convenientScore;
	}

}