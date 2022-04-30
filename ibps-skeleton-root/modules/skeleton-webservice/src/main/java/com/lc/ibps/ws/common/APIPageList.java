package com.lc.ibps.ws.common;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

public class APIPageList<E> implements Serializable {

	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = -2031192118119239999L;

	@XmlElement
	private List<E> dataResult;
	
	@XmlElement
	private APIPageResult pageResult;
	
	@XmlTransient
	public List<E> getDataResult() {
		return dataResult;
	}
	
	public void setDataResult(List<E> dataResult) {
		this.dataResult = dataResult;
	}

	@XmlTransient
	public APIPageResult getPageResult() {
		return pageResult;
	}

	public void setPageResult(APIPageResult pageResult) {
		this.pageResult = pageResult;
	}
	
}
