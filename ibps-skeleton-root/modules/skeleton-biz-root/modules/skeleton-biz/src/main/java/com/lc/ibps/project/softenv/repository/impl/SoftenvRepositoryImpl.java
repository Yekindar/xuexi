package com.lc.ibps.project.softenv.repository.impl;


import com.lc.ibps.base.core.util.AppUtil;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.base.framework.repository.AbstractRepository;
import com.lc.ibps.project.softenv.domain.Softenv;
import com.lc.ibps.project.softenv.persistence.dao.SoftenvQueryDao;
import com.lc.ibps.project.softenv.persistence.entity.SoftenvPo;
import com.lc.ibps.project.softenv.repository.SoftenvRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 政务服务软环境 仓库的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-08 16:43:21
 *</pre>
 */
@Repository
public class SoftenvRepositoryImpl extends AbstractRepository<String, SoftenvPo,Softenv> implements SoftenvRepository{
	  
	@Resource
	private  SoftenvQueryDao softenvQueryDao;

	public Softenv newInstance() {
		SoftenvPo po = new SoftenvPo();
		Softenv softenv = AppUtil.getBean(Softenv.class);
		softenv.setData(po);
		return softenv;
	}

	public Softenv newInstance(SoftenvPo po) {
		Softenv softenv = AppUtil.getBean(Softenv.class);
		softenv.setData(po);
		return softenv;
	} 
	
	@Override
	protected IQueryDao<String, SoftenvPo> getQueryDao() {
		return softenvQueryDao;
	}
	

	
}