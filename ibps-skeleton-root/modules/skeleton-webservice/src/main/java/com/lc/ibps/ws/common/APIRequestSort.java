package com.lc.ibps.ws.common;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/** 
 * API请求排序
 * <pre> 
 * 构建组：ibps-basic-response
 * 作者：eddy
 * 邮箱：xuq@bpmhome.cn
 * 日期：2018年4月14日-上午11:17:31
 * 版权：广州流辰信息技术有限公司版权所有
 * </pre>
 */
@ApiModel(value = "排序参数")
public class APIRequestSort implements Serializable {

	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = -6217331156187087489L;
	
	public APIRequestSort() {
		super();
	}
	public APIRequestSort(String field, String order) {
		super();
		this.field = field;
		this.order = order;
	}
	/**
	 * field:字段名
	 */
	@ApiModelProperty(required = true , value = "字段名")
	private String field;
	/**
	 * {@link com.lc.ibps.api.base.query.Direction}
	 * order:排序方向
	 */
	@ApiModelProperty(required = true , value = "排序方向")
	private String order;
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	
}
