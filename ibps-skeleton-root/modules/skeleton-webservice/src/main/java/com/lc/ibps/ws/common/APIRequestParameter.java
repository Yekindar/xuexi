package com.lc.ibps.ws.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.lc.ibps.base.core.util.BeanUtils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/** 
 * API请求参数
 * <pre> 
 * 构建组：ibps-basic-response
 * 作者：eddy
 * 邮箱：xuq@bpmhome.cn
 * 日期：2018年4月14日-上午11:05:09
 * 版权：广州流辰信息技术有限公司版权所有
 * </pre>
 */
@ApiModel(value = "动态查询参数")
public class APIRequestParameter implements Serializable {

	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = -2647543499875978629L;

	public APIRequestParameter() {
		super();
	}

	public APIRequestParameter(String key, String value) {
		this();
		this.key = key;
		this.value = value;
	}
	
	public APIRequestParameter(String key, String param, String value) {
		this(key, value);
		this.param = param;
	}
	
	public APIRequestParameter(String relation, String key, String param, String value) {
		this(key, param, value);
		this.relation = relation;
	}

	/**
	 * operator:运算符
	 */
	@ApiModelProperty(required = true , value = "运算符")
	private String relation = "and";
	
	/**
	 * key:参数键
	 */
	@ApiModelProperty(required = true , value = "参数键")
	private String key;
	
	/**
	 * param:参数占位符
	 */
	@ApiModelProperty(required = true , value = "参数占位符")
	private String param;
	
	/**
	 * value:参数值
	 */
	@ApiModelProperty(required = true , value = "参数值")
	private String value;
	
	/**
	 * parameters:参数分组
	 */
	@ApiModelProperty(required = true , value = "参数分组")
	private List<APIRequestParameter> parameters;

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getParam() {
		return param;//Optional.ofNullable(param).orElse(getKey());
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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
	
}
