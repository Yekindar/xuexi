package com.lc.ibps.ws.biz;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.lc.ibps.ws.common.APIPageList;
import com.lc.ibps.ws.common.APIResult;
import com.lc.ibps.ws.common.Result;

@WebService(targetNamespace = "http://biz.ws.ibps.lc.com/")
public interface IHello {

	@WebMethod
	public void helloVoid();
	
	@WebMethod
	public String helloNoParam();
	
	@WebMethod
	public void helloUser(@WebParam(name = "user") User user);
	
	@WebMethod
	public void helloUsers(@WebParam(name = "users") List<User> users);
	
	@WebMethod
	public String helloStrParam(@WebParam(name = "name") String name);
	
	@WebMethod
	public String helloStrIntParam(@WebParam(name = "name") String name, @WebParam(name = "age") int age);
	
	@WebMethod
	public User helloObject(@WebParam(name = "username") String username);
	
	@WebMethod
	public List<User> helloList(@WebParam(name = "cnt") int cnt);
	
	@WebMethod
	public Result<User> helloCustomResult(@WebParam(name = "type") int type);
	
	@WebMethod
	public APIResult<APIPageList<User>> helloIbpsResult(@WebParam(name = "type") int type);
	
}
