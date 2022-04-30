package com.lc.ibps.project.enterprisesurvey.repository.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.lc.ibps.base.core.util.AppUtil;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.base.framework.repository.AbstractRepository;
import com.lc.ibps.project.enterprisesurvey.domain.Operateprocess;
import com.lc.ibps.project.enterprisesurvey.repository.OperateprocessRepository;
import com.lc.ibps.project.enterprisesurvey.persistence.dao.OperateprocessQueryDao;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.OperateprocessPo;

/**
 * t_operateprocess 仓库的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:03
 *</pre>
 */
@Repository
public class OperateprocessRepositoryImpl extends AbstractRepository<String, OperateprocessPo,Operateprocess> implements OperateprocessRepository{
	  
	@Resource
	private  OperateprocessQueryDao operateprocessQueryDao;
	
	@Override
	public String getInternalElasticsearchIndex() {
		return "t_operateprocess";
	}


	public Operateprocess newInstance() {
		Operateprocess operateprocess = AppUtil.getBean(Operateprocess.class);
		return operateprocess;
	}


	public Operateprocess newInstance(OperateprocessPo po) {
		return newInstance();
	} 
	
	@Override
	protected IQueryDao<String, OperateprocessPo> getQueryDao() {
		return operateprocessQueryDao;
	}
	
	@Override
	public String getInternalCacheName() {
		return "operateprocess";
	}
	
	@Override
	public Class<OperateprocessPo> getPoClass() {
		return OperateprocessPo.class;
	}
	
	@Override
	public List<OperateprocessPo> findByMainId(String mainId) {
		List<OperateprocessPo> list = findByKey("findByMainId", "findIdsByMainId",
				b().a("mainId", mainId).p());
		return list;
	}

	
}