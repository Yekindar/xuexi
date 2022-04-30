package com.lc.ibps.skeleton.model;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import com.lc.ibps.base.framework.constraint.checkcase.CaseMode;
import com.lc.ibps.base.framework.constraint.checkcase.CheckCase;
import com.lc.ibps.base.framework.constraint.mobile.Mobile;
import com.lc.ibps.base.framework.constraint.phone.Phone;
import com.lc.ibps.base.framework.constraint.telephone.TelePhone;
import com.lc.ibps.skeleton.model.ValidGroup.Group1;
import com.lc.ibps.skeleton.model.ValidGroup.Group2;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "校验对象")
public class ValidatorVO implements Serializable {

	private static final long serialVersionUID = 4995962693046094796L;

	@NotBlank(message = "{validator.demo.vo.blank.name}", groups = {Group1.class, Default.class})
	@Length(min = 2, max = 64, message = "{validator.demo.vo.length.between.name}", groups = {Group1.class, Default.class})
	private String name;
	
	@NotNull(message = "{validator.demo.vo.blank.name}", groups = {Group1.class, Default.class})
	@CheckCase(value = CaseMode.LOWER, message = "{validator.demo.vo.lower.case.name}", groups = {Group1.class, Default.class})
	private String userName;
	
	@NotNull(message = "{validator.demo.vo.blank.age}", groups = {Group1.class, Default.class})
	@Range(min = 1, max = 100, message = "{validator.demo.vo.range.age}", groups = {Group1.class, Default.class})
	private Integer age;
	
	@NotNull(message = "{validator.demo.vo.blank.address}", groups = {Group2.class, Default.class})
	@Valid
	private AddressVO addr;
	
	@NotBlank(message = "{validator.demo.vo.blank.mobile.phone.number}", groups = {Group2.class, Default.class})
	@Length(min = 11, max = 15, message = "{validator.demo.vo.error.mobile.phone.length}", groups = {Group2.class, Default.class})
	@Mobile(message="{validator.demo.vo.error.mobile.phone}", groups = {Group2.class, Default.class})
	private String mobile;
	
	@NotBlank(message = "{validator.demo.vo.blank.phone.number}", groups = {Group2.class, Default.class})
	@Phone(message="{validator.demo.vo.error.phone}", groups = {Group2.class, Default.class})
	private String phone;
	
	@NotBlank(message = "{validator.demo.vo.blank.telephone.number}", groups = {Group2.class, Default.class})
	@TelePhone(message="{validator.demo.vo.error.telephone}", groups = {Group2.class, Default.class})
	private String telephone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public AddressVO getAddr() {
		return addr;
	}
	public void setAddr(AddressVO addr) {
		this.addr = addr;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
