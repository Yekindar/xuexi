package com.lc.ibps.project.quota.persistence.entity;

import com.lc.ibps.base.framework.persistence.entity.AbstractPo;

/**
 * 指标信息 表对象
 * 
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:40:59
 *</pre>
 */
 @SuppressWarnings("serial")
public class QuotaTbl extends AbstractPo<String>{
	protected String  id; 		/*主键*/
	protected String  parentQuotaId; 		/*父指标id*/
	protected String  quotaName; 		/*指标名*/
	protected String  quotaType; 		/*指标分类*/
	protected String  quotaWeight; 		/*指标权重*/
	protected String  quotaFull; 		/*指标满分*/
	protected String  standard; 		/*评分标准*/
	protected String quotaKey;

	public String getQuotaKey() {
		return quotaKey;
	}

	public void setQuotaKey(String quotaKey) {
		this.quotaKey = quotaKey;
	}

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
	public void setParentQuotaId(String parentQuotaId) 
	{
		this.parentQuotaId = parentQuotaId;
	}
	/**
	 * 返回 父指标id
	 * @return
	 */
	public String getParentQuotaId() 
	{
		return this.parentQuotaId;
	}
	public void setQuotaName(String quotaName) 
	{
		this.quotaName = quotaName;
	}
	/**
	 * 返回 指标名
	 * @return
	 */
	public String getQuotaName() 
	{
		return this.quotaName;
	}
	public void setQuotaType(String quotaType) 
	{
		this.quotaType = quotaType;
	}
	/**
	 * 返回 指标分类
	 * @return
	 */
	public String getQuotaType() 
	{
		return this.quotaType;
	}
	public void setQuotaWeight(String quotaWeight) 
	{
		this.quotaWeight = quotaWeight;
	}
	/**
	 * 返回 指标权重
	 * @return
	 */
	public String getQuotaWeight() 
	{
		return this.quotaWeight;
	}
	public void setQuotaFull(String quotaFull) 
	{
		this.quotaFull = quotaFull;
	}
	/**
	 * 返回 指标满分
	 * @return
	 */
	public String getQuotaFull() 
	{
		return this.quotaFull;
	}
	public void setStandard(String standard) 
	{
		this.standard = standard;
	}
	/**
	 * 返回 评分标准
	 * @return
	 */
	public String getStandard() 
	{
		return this.standard;
	}
	
}