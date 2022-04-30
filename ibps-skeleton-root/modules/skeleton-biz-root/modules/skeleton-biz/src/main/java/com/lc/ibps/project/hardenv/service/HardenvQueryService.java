package com.lc.ibps.project.hardenv.service;

import com.lc.ibps.api.base.query.QueryFilter;

/**
 * 政务服务硬环境 查询服务接口
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-02 13:23:57
 *</pre>
 */
public interface HardenvQueryService {
	
	/**
	 * 根据主键查询业务数据
	 *
	 * @param id 
	 */
	public String get(String id);
	
	
	/**
	 * 根据过滤器查询业务数据
	 *
	 * @param filter 
	 */
	public String query(QueryFilter filter);
	
	/**
	 * 查询所有业务数据
	 *
	 */
	public String findAll();
	
}