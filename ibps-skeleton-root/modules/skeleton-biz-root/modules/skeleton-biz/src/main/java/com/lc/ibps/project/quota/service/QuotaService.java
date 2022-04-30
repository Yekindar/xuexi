package com.lc.ibps.project.quota.service;


/**
 * 指标信息 服务接口
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:41:00
 *</pre>
 */
public interface QuotaService {
	
	
	/**
	 * 保存业务数据
	 *
	 * @param jsonData 
	 */
	public void save(String jsonData);
	
	/**
	 * 根据主键数组删除业务数据
	 *
	 * @param ids 
	 */
	public void deleteByIds(String[] ids);
	
	
}