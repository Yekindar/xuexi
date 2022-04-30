package com.lc.ibps.project.openprocessresult.repository.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.lc.ibps.base.core.util.AppUtil;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.base.framework.repository.AbstractRepository;
import com.lc.ibps.project.openprocessresult.domain.OpenProcessResult;
import com.lc.ibps.project.openprocessresult.repository.OpenProcessResultRepository;
import com.lc.ibps.project.openprocessresult.persistence.dao.OpenProcessResultQueryDao;
import com.lc.ibps.project.openprocessresult.persistence.entity.OpenProcessResultPo;

/**
 * t_qykbjsjg 仓库的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 15:53:59
 *</pre>
 */
@Repository
public class OpenProcessResultRepositoryImpl extends AbstractRepository<String, OpenProcessResultPo,OpenProcessResult> implements OpenProcessResultRepository{
	  
	@Resource
	private  OpenProcessResultQueryDao openProcessResultQueryDao;
	
	@Override
	public String getInternalElasticsearchIndex() {
		return "t_qykbjsjg";
	}


	public OpenProcessResult newInstance() {
		OpenProcessResult openProcessResult = AppUtil.getBean(OpenProcessResult.class);
		return openProcessResult;
	}


	public OpenProcessResult newInstance(OpenProcessResultPo po) {
		return newInstance();
	} 
	
	@Override
	protected IQueryDao<String, OpenProcessResultPo> getQueryDao() {
		return openProcessResultQueryDao;
	}
	
	@Override
	public String getInternalCacheName() {
		return "openProcessResult";
	}
	
	@Override
	public Class<OpenProcessResultPo> getPoClass() {
		return OpenProcessResultPo.class;
	}
	

	
}