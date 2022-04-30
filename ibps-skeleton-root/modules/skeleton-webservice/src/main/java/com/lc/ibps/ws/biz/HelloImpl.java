package com.lc.ibps.ws.biz;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;

import com.lc.ibps.ws.common.APIPageList;
import com.lc.ibps.ws.common.APIPageResult;
import com.lc.ibps.ws.common.APIResult;
import com.lc.ibps.ws.common.Result;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

public class HelloImpl implements IHello {

	private final static Log log = LogFactory.get();
	
	@WebMethod
	@Override
	public void helloVoid() {
		log.debug("Hello ...");
	}
	
	@WebMethod
	@Override
	public String helloNoParam() {
		return "Hello!";
	}
	
	@WebMethod
	@Override
	public void helloUser(@WebParam(name = "user") User user) {
		log.debug("Hello {} ...", user);
	}
	
	@WebMethod
	@Override
	public void helloUsers(@WebParam(name = "users") List<User> users) {
		log.debug("Hello {} ...", users);
	}
	
	@WebMethod
	@Override
	public String helloStrParam(@WebParam(name = "name") String name) {
		return "Hello, my name is " + name + ".";
	}
	
	@WebMethod
	@Override
	public String helloStrIntParam(@WebParam(name = "name") String name, @WebParam(name = "age") int age) {
		return "Hello, my name is " + name + " and age is " + age + ".";
	}

	@WebMethod
	@Override
	public User helloObject(@WebParam(name = "username") String username) {
		User u = new User();
		u.setId(IdUtil.fastSimpleUUID());
		u.setUsername(username);
		u.setPassword(IdUtil.fastSimpleUUID());
		u.setName(username + RandomUtil.randomStringUpper(5));
		u.setAge(RandomUtil.randomInt(1, 100));
		
		return u;
	}

	@WebMethod
	@Override
	public List<User> helloList(@WebParam(name = "cnt") int cnt) {
		if(cnt < 0) {
			cnt = 1;
		}
		
		List<User> us = new ArrayList<>();
		for(int i = 0; i < cnt; i++) {
			us.add(helloObject("Hello4"));
		}
		
		return us;
	}

	@WebMethod
	@Override
	public Result<User> helloCustomResult(@WebParam(name = "type") int type) {
		if(type < 0) {
			type = 0;
		}
		
		Result<User> result = new Result<>();
		result.setState(200);
		
		List<User> us = null;
		if(type == 0) {
			result.setSize(1);
			us = helloList(1);
		}
		else {
			result.setSize(type);
			us = helloList(type);
		}
		
		result.setData(us);
		
		return result;
	}

	@WebMethod
	@Override
	public APIResult<APIPageList<User>> helloIbpsResult(@WebParam(name = "type") int type) {
		if(type < 0) {
			type = 0;
		}
		
		APIResult<APIPageList<User>> result = new APIResult<>();
		result.setState(200);
		
		APIPageList<User> us = new APIPageList<>();
		if(type == 0) {
			List<User> us0 = helloList(1);
			us.setDataResult(us0);
			APIPageResult pageResult = new APIPageResult(1, 20, 1);
			us.setPageResult(pageResult);
		}
		else {
			List<User> us0 = helloList(type);
			us.setDataResult(us0);
			APIPageResult pageResult = new APIPageResult(1, type, type);
			us.setPageResult(pageResult);
		}
		
		result.setData(us);
		
		return result;
	}

}
