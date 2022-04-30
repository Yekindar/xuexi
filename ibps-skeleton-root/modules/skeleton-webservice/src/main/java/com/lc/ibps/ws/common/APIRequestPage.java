package com.lc.ibps.ws.common;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/** 
 * API请求分页
 * <pre> 
 * 构建组：ibps-basic-response
 * 作者：eddy
 * 邮箱：xuq@bpmhome.cn
 * 日期：2018年4月14日-上午11:17:02
 * 版权：广州流辰信息技术有限公司版权所有
 * </pre>
 */
@ApiModel(value = "分页请求参数")
public class APIRequestPage implements Serializable {

	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = -2647543499875978629L;

	/**
	 * pageNo:页码
	 */
	@ApiModelProperty(required = true , value = "页码")
	private Integer pageNo;
	/**
	 * limit:页容量
	 */
	@ApiModelProperty(required = true , value = "页容量")
	private Integer limit;
	
	public APIRequestPage() {
		super();
	}
	public APIRequestPage(Integer pageNo, Integer limit) {
		super();
		this.pageNo = pageNo;
		this.limit = limit;
	}
	public Integer getPageNo() {
		if(null == pageNo) return 0;
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getLimit() {
		if(null == limit) return 0;
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
}
