package com.lc.ibps.ws.common;

import java.util.Iterator;
import java.util.List;

import com.lc.ibps.api.base.constants.StateEnum;
import com.lc.ibps.base.core.util.string.StringUtil;

import cn.hutool.core.lang.Assert;

public class APIRequestParameterUtil {

	public static void addParameters(List<APIRequestParameter> parameters, String key, String value) {
		addParameters(parameters, new APIRequestParameter(key, value));
	}
	
	public static void addParameters(List<APIRequestParameter> parameters, String key, String param, String value) {
		addParameters(parameters, new APIRequestParameter(key, param, value));
	}
	
	public static void addParameters(List<APIRequestParameter> parameters, String relation, String key, String param, String value) {
		addParameters(parameters, new APIRequestParameter(relation, key, param, value));
	}
	
	public static void addParameters(List<APIRequestParameter> parameters, APIRequestParameter parameter) {
		Assert.notNull(parameters, StateEnum.ERROR_PARAMETER_PARAMTERS_NULL.getText(),StateEnum.ERROR_PARAMETER_PARAMTERS_NULL.getCode());
		// 覆盖原参数
		Iterator<APIRequestParameter> it = parameters.iterator();
		APIRequestParameter requestParameter = null;
		for(;it.hasNext();) {
			requestParameter = it.next();
			if(requestParameter.getKey().equalsIgnoreCase(parameter.getKey())
					&& ((StringUtil.isBlank(requestParameter.getParam()) && StringUtil.isBlank(parameter.getParam())) 
							|| (StringUtil.isNotBlank(requestParameter.getParam()) 
									&& StringUtil.isNotBlank(parameter.getParam()) 
									&& requestParameter.getParam().equalsIgnoreCase(parameter.getParam())))) {
				it.remove();
			}
		}
		parameters.add(parameter);
	}
	
}
