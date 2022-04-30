package com.lc.ibps.skeleton.sccs.persistence.entity;

import java.util.Date;

import com.lc.ibps.base.framework.persistence.entity.AbstractPo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * t_sccs 表对象
 * 
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-03-28 23:53:13
 *</pre>
 */
@ApiModel(value = "t_sccs对象")
public class SccsTbl extends AbstractPo<String>{
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "主键")
	protected String  id; 		/*主键*/
	@ApiModelProperty(value = "租户ID")
	protected String  tenantId; 		/*租户ID*/
	@ApiModelProperty(value = "IP地址")
	protected String  ip; 		/*IP地址*/
	@ApiModelProperty(value = "数据删除状态")
	protected String  deleted; 		/*数据删除状态*/
	@ApiModelProperty(value = "版本")
	protected Long  version; 		/*版本*/
	@ApiModelProperty(value = "姓名")
	protected String  name; 		/*姓名*/

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
	public void setTenantId(String tenantId) 
	{
		this.tenantId = tenantId;
	}
	/**
	 * 返回 租户ID
	 * @return
	 */
	public String getTenantId() 
	{
		return this.tenantId;
	}
	public void setIp(String ip) 
	{
		this.ip = ip;
	}
	/**
	 * 返回 IP地址
	 * @return
	 */
	public String getIp() 
	{
		return this.ip;
	}
	public void setDeleted(String deleted) 
	{
		this.deleted = deleted;
	}
	/**
	 * 返回 数据删除状态
	 * @return
	 */
	public String getDeleted() 
	{
		return this.deleted;
	}
	public void setVersion(Long version) 
	{
		this.version = version;
	}
	/**
	 * 返回 版本
	 * @return
	 */
	public Long getVersion() 
	{
		return this.version;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	/**
	 * 返回 姓名
	 * @return
	 */
	public String getName() 
	{
		return this.name;
	}
	
}