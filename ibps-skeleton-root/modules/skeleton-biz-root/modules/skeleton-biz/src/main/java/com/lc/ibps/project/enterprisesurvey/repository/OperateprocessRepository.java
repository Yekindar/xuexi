package com.lc.ibps.project.enterprisesurvey.repository;

import java.util.List;
import com.lc.ibps.base.framework.repository.IRepository;
import com.lc.ibps.project.enterprisesurvey.domain.Operateprocess;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.OperateprocessPo;

/**
 * t_operateprocess 仓库接口
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:03
 *</pre>
 */
public interface OperateprocessRepository extends IRepository<String, OperateprocessPo,Operateprocess>{
	 /**
	 * 根据主表ID查询 t_operateprocess 列表
	 * @param mainId
	 * @return 
	 * List<OperateprocessPo>
	 */
	public List<OperateprocessPo> findByMainId(String mainId);

}