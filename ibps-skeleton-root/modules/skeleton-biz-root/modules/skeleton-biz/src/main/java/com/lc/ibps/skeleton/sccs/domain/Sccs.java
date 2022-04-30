package com.lc.ibps.skeleton.sccs.domain;


import javax.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.lc.ibps.base.framework.domain.AbstractDomain;
import com.lc.ibps.base.framework.persistence.dao.IDao;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.skeleton.sccs.persistence.dao.SccsDao;
import com.lc.ibps.skeleton.sccs.persistence.dao.SccsQueryDao;
import com.lc.ibps.skeleton.sccs.repository.SccsRepository;
import com.lc.ibps.skeleton.sccs.persistence.entity.SccsPo;

/**
 * t_sccs 领域对象实体
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-03-28 23:53:13
 *</pre>
 */
@Service
@Transactional
//@org.springframework.context.annotation.Lazy
public class Sccs extends AbstractDomain<String, SccsPo>{
	private static final long serialVersionUID = 1L;
	@Resource
	@Lazy
	private SccsDao sccsDao;
	@Resource
	@Lazy
	private SccsQueryDao sccsQueryDao;
	@Resource
	@Lazy
	private SccsRepository sccsRepository;


	protected void init(){
	}
	
	@Override
	public Class<SccsPo> getPoClass() {
		return SccsPo.class;
	}
	
	@Override
	protected IQueryDao<String, SccsPo> getInternalQueryDao() {
		return sccsQueryDao;
	}
	
	@Override
	protected IDao<String, SccsPo> getInternalDao() {
		return sccsDao;
	}
	
	@Override
	public String getInternalCacheName() {
		return "sccs";
	}
	
	
	
}