package com.lc.ibps.project.enterprisesurvey.persistence.dao;

import com.lc.ibps.base.framework.persistence.dao.IDao;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.OperateprocessPo;

/**
 * t_operateprocess Dao接口
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:03
 *</pre>
 */
public interface OperateprocessDao extends IDao<String, OperateprocessPo> {
	/**
	 * 根据主表id删除 t_operateprocess 记录
	 * @param mainId 
	 * void
	 */
	public void deleteByMainId(String mainId);
}