package com.lc.ibps.skeleton.model;

import javax.validation.groups.Default;

import javax.validation.constraints.NotBlank;

import com.lc.ibps.skeleton.model.ValidGroup.Group1;
import com.lc.ibps.skeleton.model.ValidGroup.Group2;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "地址对象")
public class AddressVO {

	@NotBlank(message = "{com.lc.ibps.setting.address.vo.blank.country}", groups = {Group1.class, Default.class})
	private String country;
	
	@NotBlank(message = "{com.lc.ibps.setting.address.vo.blank.province}", groups = {Group1.class, Default.class})
	private String province;
	
	@NotBlank(message = "{com.lc.ibps.setting.address.vo.blank.city}", groups = {Group1.class, Default.class})
	private String city;
	
	@NotBlank(message = "{com.lc.ibps.setting.address.vo.blank.street}", groups = {Group2.class, Default.class})
	private String street;
	
	@NotBlank(message = "{com.lc.ibps.setting.address.vo.blank.address}", groups = {Default.class})
	private String detail;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
