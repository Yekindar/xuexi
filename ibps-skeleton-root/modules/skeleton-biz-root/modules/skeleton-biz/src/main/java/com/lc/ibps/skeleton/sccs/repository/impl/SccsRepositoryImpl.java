package com.lc.ibps.skeleton.sccs.repository.impl;


import javax.annotation.Resource;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.lc.ibps.base.core.util.AppUtil;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.base.framework.repository.AbstractRepository;
import com.lc.ibps.skeleton.sccs.domain.Sccs;
import com.lc.ibps.skeleton.sccs.repository.SccsRepository;
import com.lc.ibps.skeleton.sccs.persistence.dao.SccsQueryDao;
import com.lc.ibps.skeleton.sccs.persistence.entity.SccsPo;

/**
 * t_sccs 仓库的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-03-28 23:53:13
 *</pre>
 */
@Repository
//@org.springframework.context.annotation.Lazy
public class SccsRepositoryImpl extends AbstractRepository<String, SccsPo,Sccs> implements SccsRepository{
	  
	@Resource
	@Lazy
	private  SccsQueryDao sccsQueryDao;
	
	@Override
	public String getInternalElasticsearchIndex() {
		return "t_sccs";
	}
	
	@Override
	protected IQueryDao<String, SccsPo> getQueryDao() {
		return sccsQueryDao;
	}
	
	@Override
	public String getInternalCacheName() {
		return "sccs";
	}
	
	@Override
	public Class<SccsPo> getPoClass() {
		return SccsPo.class;
	}
	

	
}