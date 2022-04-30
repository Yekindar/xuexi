package com.lc.ibps.ws.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.core.util.string.StringUtil;

import io.swagger.annotations.ApiModelProperty;

/** 
 * API请求
 * <pre> 
 * 构建组：ibps-basic-response
 * 作者：eddy
 * 邮箱：xuq@bpmhome.cn
 * 日期：2018年4月14日-上午11:35:07
 * 版权：广州流辰信息技术有限公司版权所有
 * </pre>
 */
public class APIRequest implements Serializable {

	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = -2647543499875978629L;
	
	/**
	 * parameters:请求参数列表
	 */
	private List<APIRequestParameter> parameters;
	/**
	 * sorts:请求排序
	 */
	private List<APIRequestSort> sorts;
	/**
	 * requestPage:请求分页
	 */
	private APIRequestPage requestPage;
	
	public APIRequest() {}
	public APIRequest(int pageNo, int limit) {
		this.requestPage = new APIRequestPage(pageNo, limit);
	}
	
	public String getParameter(String key){
		if(BeanUtils.isNotEmpty(parameters))
		{
			for(APIRequestParameter parameter : parameters)
			{
				if(null != parameter.getKey() && parameter.getKey().equals(key))
				{
					return parameter.getValue();
				}
			}
		}
		
		return null;
	}
	
	public boolean containParameterKey(String key) {
		return StringUtil.isNotBlank(getParameter(key));
	}
	
	public List<APIRequestParameter> getParameters() {
		return parameters;
	}
	public void setParameters(List<APIRequestParameter> parameters) {
		this.parameters = parameters;
	}
	public void addParameters(String key, String value) {
		addParameters(new APIRequestParameter(key, value));
	}
	public void addParameters(String key, String param, String value) {
		addParameters(new APIRequestParameter(key, param, value));
	}
	public void addParameters(String relation, String key, String param, String value) {
		addParameters(new APIRequestParameter(relation, key, param, value));
	}
	public void addParameters(APIRequestParameter parameter) {
		if(BeanUtils.isEmpty(parameters)) {
			parameters = new ArrayList<APIRequestParameter>();
		}
		APIRequestParameterUtil.addParameters(parameters, parameter);
	}
	public List<APIRequestSort> getSorts() {
		return sorts;
	}
	public void setSorts(List<APIRequestSort> sorts) {
		this.sorts = sorts;
	}
	public void addSorts(String field, String order) {
		addSorts(new APIRequestSort(field, order));
	}
	public void addSorts(APIRequestSort sort) {
		if(BeanUtils.isEmpty(this.sorts)) {
			this.sorts = new ArrayList<APIRequestSort>();
			this.sorts.add(sort);
		}
		else {
			// 覆盖原参数
			Iterator<APIRequestSort> it = this.sorts.iterator();
			APIRequestSort requestSort = null;
			for(;it.hasNext();) {
				requestSort = it.next();
				if(requestSort.getField().equalsIgnoreCase(sort.getField())) {
					it.remove();
				}
			}
			this.sorts.add(sort);
		}
	}
	public APIRequestPage getRequestPage() {
		return requestPage;
	}
	public void setRequestPage(APIRequestPage requestPage) {
		this.requestPage = requestPage;
	}
	public void setRequestPage(int pageNo, int limit) {
		this.requestPage = new APIRequestPage(pageNo, limit);
	}
	
	@ApiModelProperty(hidden = true)
	public Map<String, String> getParameterMap(){
		List<APIRequestParameter> parameters = this.getParameters();
		Map<String, String> requestMap = new HashMap<>();
		if (BeanUtils.isNotEmpty(parameters)) {
			for (APIRequestParameter apiRequestParameter : parameters) {
				String key = apiRequestParameter.getKey();
				String value = apiRequestParameter.getValue();
				requestMap.put(key, value);
			}
		}
		return requestMap;
	}

	public void clear() {
		this.parameters = null;
		this.requestPage = null;
		this.sorts = null;
	}
	
}
