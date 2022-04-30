package com.lc.ibps.ws;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.lc.ibps.ws.biz.HelloImpl;
import com.lc.ibps.ws.biz.IHello;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import cn.hutool.setting.Setting;

public class WebServiceApplication {

	private final static Log log = LogFactory.get();
	
	public static void main(String[] args) {
		Setting setting = new Setting("ws.setting");
		String wsBaseUrl = setting.getStr("ws.base.url", "http://127.0.0.1:18888/ws");
		String wsApi = setting.getStr("ws.api", "/demo");
		String address = wsBaseUrl + wsApi;
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		factoryBean.setAddress(address); // 设置暴露地址
		factoryBean.setServiceClass(IHello.class); // 接口类
		factoryBean.setServiceBean(new HelloImpl()); // 设置实现类
		factoryBean.create();
		
		log.debug("url: {}?wsdl", address);
	}

}
