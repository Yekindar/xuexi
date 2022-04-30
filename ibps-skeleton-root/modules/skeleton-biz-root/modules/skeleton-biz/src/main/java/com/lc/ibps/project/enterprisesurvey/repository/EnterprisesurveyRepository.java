package com.lc.ibps.project.enterprisesurvey.repository;

import com.lc.ibps.base.framework.repository.IRepository;
import com.lc.ibps.project.enterprisesurvey.domain.Enterprisesurvey;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.EnterprisesurveyPo;
import com.lc.ibps.project.openprocessresult.persistence.entity.OpenProcessResultPo;

/**
 * t_enterprisesurvey 仓库接口
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:01
 *</pre>
 */
public interface EnterprisesurveyRepository extends IRepository<String, EnterprisesurveyPo,Enterprisesurvey>{

	/**
	 * 查询全部子表的数据，并设置到主表Po中 
	 * void
	 */
	public EnterprisesurveyPo loadCascade(String id);

	public OpenProcessResultPo enterpriseCompute(EnterprisesurveyPo enterprisesurveyPo);
}