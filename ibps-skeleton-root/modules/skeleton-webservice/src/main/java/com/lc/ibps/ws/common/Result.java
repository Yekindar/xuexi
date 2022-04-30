package com.lc.ibps.ws.common;

import java.io.Serializable;
import java.util.List;

public class Result<E> implements Serializable {

	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = 1L;
	private int state;
	private int size;
	private List<E> data;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<E> getData() {
		return data;
	}
	public void setData(List<E> data) {
		this.data = data;
	}
	
}
