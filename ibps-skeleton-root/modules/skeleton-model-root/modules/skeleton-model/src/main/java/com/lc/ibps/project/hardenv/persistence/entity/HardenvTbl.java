package com.lc.ibps.project.hardenv.persistence.entity;

import com.lc.ibps.base.framework.persistence.entity.AbstractPo;

import java.util.Date;

/**
 * 政务服务硬环境 表对象
 * 
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-02 13:23:56
 *</pre>
 */
 @SuppressWarnings("serial")
public class HardenvTbl extends AbstractPo<String>{
	protected String  id; 		/*主键*/
	protected String  dependency; 		/*开发区、县（市）区*/
	protected String  headDp; 		/*牵头部门*/
	protected String  person; 		/*联 系 人*/
	protected String  cooperateDp; 		/*配合部门*/
	protected String  businessRoom; 		/*业务科室*/
	protected String  phone; 		/*联系电话*/
	@com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd")
	protected Date  fillDate; 		/*填表时间*/
	protected Double  isConsultSerAe; 		/*是否设置咨询服务专区*/
	protected Double  isSelfSerAe; 		/*是否提供自助服务区*/
	protected Double  isIntermediary; 		/*服务大厅是否设有中介机构区域*/
	protected Double  isRestAe; 		/*是否提供休息等候区*/
	protected Double  isConvenient; 		/*硬件设备操作使用是否便利*/
	protected Double  isFunHave; 		/*硬件设备功能是否齐全*/
	protected Double  isEffect; 		/*硬件设备操作使用是否能够有效使用*/
	protected Double  isSltSys; 		/*大厅是否设置综合查询系统*/
	protected Double  isSltCvt; 		/*办事大厅相关业务办理信息查询是否便利*/
	protected Double  hallOmeLev; 		/*政务服务大厅布局优化程度*/
	protected Double  hardCvt; 		/*硬件设施便利性*/
	protected Double  hardEffective; 		/*硬件设施有效性*/
	protected Double  accuracy; 		/*综合查询系统，现场办理事项指南准确性及标准化*/
	protected Double  quotaResult; 		/*政务服务硬环境*/
	protected String  organizationId; 		/*组织ID*/
	protected String  quotaId; 		/*指标ID*/
	protected String  year; 		/*年份*/

	public void setId(String id) 
	{
		this.id = id;
	}
	/**
	 * 返回 主键
	 * @return
	 */
	public String getId() 
	{
		return this.id;
	}
	public void setDependency(String dependency) 
	{
		this.dependency = dependency;
	}
	/**
	 * 返回 开发区、县（市）区
	 * @return
	 */
	public String getDependency() 
	{
		return this.dependency;
	}
	public void setHeadDp(String headDp) 
	{
		this.headDp = headDp;
	}
	/**
	 * 返回 牵头部门
	 * @return
	 */
	public String getHeadDp() 
	{
		return this.headDp;
	}
	public void setPerson(String person) 
	{
		this.person = person;
	}
	/**
	 * 返回 联 系 人
	 * @return
	 */
	public String getPerson() 
	{
		return this.person;
	}
	public void setCooperateDp(String cooperateDp) 
	{
		this.cooperateDp = cooperateDp;
	}
	/**
	 * 返回 配合部门
	 * @return
	 */
	public String getCooperateDp() 
	{
		return this.cooperateDp;
	}
	public void setBusinessRoom(String businessRoom) 
	{
		this.businessRoom = businessRoom;
	}
	/**
	 * 返回 业务科室
	 * @return
	 */
	public String getBusinessRoom() 
	{
		return this.businessRoom;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	/**
	 * 返回 联系电话
	 * @return
	 */
	public String getPhone() 
	{
		return this.phone;
	}
	public void setFillDate(Date fillDate) 
	{
		this.fillDate = fillDate;
	}
	/**
	 * 返回 填表时间
	 * @return
	 */
	public Date getFillDate() 
	{
		return this.fillDate;
	}
	public void setIsConsultSerAe(Double isConsultSerAe) 
	{
		this.isConsultSerAe = isConsultSerAe;
	}
	/**
	 * 返回 是否设置咨询服务专区
	 * @return
	 */
	public Double getIsConsultSerAe() 
	{
		return this.isConsultSerAe;
	}
	public void setIsSelfSerAe(Double isSelfSerAe) 
	{
		this.isSelfSerAe = isSelfSerAe;
	}
	/**
	 * 返回 是否提供自助服务区
	 * @return
	 */
	public Double getIsSelfSerAe() 
	{
		return this.isSelfSerAe;
	}
	public void setIsIntermediary(Double isIntermediary) 
	{
		this.isIntermediary = isIntermediary;
	}
	/**
	 * 返回 服务大厅是否设有中介机构区域
	 * @return
	 */
	public Double getIsIntermediary() 
	{
		return this.isIntermediary;
	}
	public void setIsRestAe(Double isRestAe) 
	{
		this.isRestAe = isRestAe;
	}
	/**
	 * 返回 是否提供休息等候区
	 * @return
	 */
	public Double getIsRestAe() 
	{
		return this.isRestAe;
	}
	public void setIsConvenient(Double isConvenient) 
	{
		this.isConvenient = isConvenient;
	}
	/**
	 * 返回 硬件设备操作使用是否便利
	 * @return
	 */
	public Double getIsConvenient() 
	{
		return this.isConvenient;
	}
	public void setIsFunHave(Double isFunHave) 
	{
		this.isFunHave = isFunHave;
	}
	/**
	 * 返回 硬件设备功能是否齐全
	 * @return
	 */
	public Double getIsFunHave() 
	{
		return this.isFunHave;
	}
	public void setIsEffect(Double isEffect) 
	{
		this.isEffect = isEffect;
	}
	/**
	 * 返回 硬件设备操作使用是否能够有效使用
	 * @return
	 */
	public Double getIsEffect() 
	{
		return this.isEffect;
	}
	public void setIsSltSys(Double isSltSys) 
	{
		this.isSltSys = isSltSys;
	}
	/**
	 * 返回 大厅是否设置综合查询系统
	 * @return
	 */
	public Double getIsSltSys() 
	{
		return this.isSltSys;
	}
	public void setIsSltCvt(Double isSltCvt)
	{
		this.isSltCvt = isSltCvt;
	}
	/**
	 * 返回 办事大厅相关业务办理信息查询是否便利
	 * @return
	 */
	public Double getIsSltCvt()
	{
		return this.isSltCvt;
	}
	public void setHallOmeLev(Double hallOmeLev) 
	{
		this.hallOmeLev = hallOmeLev;
	}
	/**
	 * 返回 政务服务大厅布局优化程度
	 * @return
	 */
	public Double getHallOmeLev() 
	{
		return this.hallOmeLev;
	}
	public void setHardCvt(Double hardCvt) 
	{
		this.hardCvt = hardCvt;
	}
	/**
	 * 返回 硬件设施便利性
	 * @return
	 */
	public Double getHardCvt() 
	{
		return this.hardCvt;
	}
	public void setHardEffective(Double hardEffective) 
	{
		this.hardEffective = hardEffective;
	}
	/**
	 * 返回 硬件设施有效性
	 * @return
	 */
	public Double getHardEffective() 
	{
		return this.hardEffective;
	}
	public void setAccuracy(Double accuracy) 
	{
		this.accuracy = accuracy;
	}
	/**
	 * 返回 综合查询系统，现场办理事项指南准确性及标准化
	 * @return
	 */
	public Double getAccuracy() 
	{
		return this.accuracy;
	}
	public void setQuotaResult(Double quotaResult) 
	{
		this.quotaResult = quotaResult;
	}
	/**
	 * 返回 政务服务硬环境
	 * @return
	 */
	public Double getQuotaResult() 
	{
		return this.quotaResult;
	}
	public void setOrganizationId(String organizationId) 
	{
		this.organizationId = organizationId;
	}
	/**
	 * 返回 组织ID
	 * @return
	 */
	public String getOrganizationId() 
	{
		return this.organizationId;
	}
	public void setQuotaId(String quotaId) 
	{
		this.quotaId = quotaId;
	}
	/**
	 * 返回 指标ID
	 * @return
	 */
	public String getQuotaId() 
	{
		return this.quotaId;
	}
	public void setYear(String year) 
	{
		this.year = year;
	}
	/**
	 * 返回 年份
	 * @return
	 */
	public String getYear() 
	{
		return this.year;
	}
	
}