package com.lc.ibps.project.openprocessresult.domain;


import javax.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.lc.ibps.base.framework.domain.AbstractDomain;
import com.lc.ibps.base.framework.persistence.dao.IDao;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.project.openprocessresult.persistence.dao.OpenProcessResultDao;
import com.lc.ibps.project.openprocessresult.persistence.dao.OpenProcessResultQueryDao;
import com.lc.ibps.project.openprocessresult.repository.OpenProcessResultRepository;
import com.lc.ibps.project.openprocessresult.persistence.entity.OpenProcessResultPo;

/**
 * t_qykbjsjg 领域对象实体
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 15:53:59
 *</pre>
 */
@SuppressWarnings("serial")
@Service
@Transactional
public class OpenProcessResult extends AbstractDomain<String, OpenProcessResultPo>{
	
	@Resource
	private OpenProcessResultDao openProcessResultDao;
	@Resource
	private OpenProcessResultQueryDao openProcessResultQueryDao;
	@Resource
	@Lazy
	private OpenProcessResultRepository openProcessResultRepository;


	protected void init(){
	}
	
	@Override
	protected IQueryDao<String, OpenProcessResultPo> getInternalQueryDao() {
		return openProcessResultQueryDao;
	}
	
	@Override
	protected IDao<String, OpenProcessResultPo> getInternalDao() {
		return openProcessResultDao;
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