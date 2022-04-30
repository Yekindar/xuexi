package com.lc.ibps.ws.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class APIPageResult implements Serializable {

	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = 657406105094323352L;
	
	public APIPageResult() {
	}
	
	public APIPageResult(int page, int limit, int totalCount) {
		this.page = page;
		this.limit = limit;
		this.totalCount = totalCount;
	}
	
	/**
	 * 分页大小
	 */
	@XmlElement
	private Integer limit;
	
	/**
	 * 页数
	 */
	@XmlElement
	private Integer page;
	
	/**
	 * 总记录数
	 */
	@XmlElement
	private Integer totalCount;
	
	@XmlTransient
	public Integer getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	@XmlTransient
	public Integer getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	@XmlTransient
	public Integer getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	@XmlTransient
	public Integer getTotalPages() {
		if (totalCount <= 0) {
			return 0;
		}
		if (limit <= 0) {
			return 0;
		}

		int count = totalCount / limit;
		if (totalCount % limit > 0) {
			count++;
		}
		return count;
	}
	
}
