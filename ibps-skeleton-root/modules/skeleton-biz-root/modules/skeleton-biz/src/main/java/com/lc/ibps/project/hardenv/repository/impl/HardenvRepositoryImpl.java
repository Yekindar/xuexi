package com.lc.ibps.project.hardenv.repository.impl;


import com.lc.ibps.base.core.util.AppUtil;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.base.framework.repository.AbstractRepository;
import com.lc.ibps.project.hardenv.domain.Hardenv;
import com.lc.ibps.project.hardenv.persistence.dao.HardenvQueryDao;
import com.lc.ibps.project.hardenv.persistence.entity.HardenvPo;
import com.lc.ibps.project.hardenv.repository.HardenvRepository;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

/**
 * 政务服务硬环境 仓库的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-02 13:23:57
 *</pre>
 */
@Repository
public class HardenvRepositoryImpl extends AbstractRepository<String, HardenvPo,Hardenv> implements HardenvRepository{
	  
	@Resource
	private  HardenvQueryDao hardenvQueryDao;

	@Resource
	private Hardenv domain;

	public Hardenv newInstance() {
//		HardenvPo po = new HardenvPo();
//		Hardenv hardenv = AppUtil.getBean(Hardenv.class);
//		hardenv.setData(po);
//		return hardenv;
		Hardenv hardenv = AppUtil.getBean(Hardenv.class);
		return hardenv;
	}

	public Hardenv newInstance(HardenvPo po) {
//		Hardenv hardenv = AppUtil.getBean(Hardenv.class);
//		hardenv.setData(po);
//		return hardenv;
		return newInstance();
	} 
	
	@Override
	protected IQueryDao<String, HardenvPo> getQueryDao() {
		return hardenvQueryDao;
	}


	@Override
	public Class<HardenvPo> getPoClass() {
		return HardenvPo.class;
	}

	@Override
	public String getInternalCacheName() {
		return "hardenv";
	}

	@Override
	public String getInternalElasticsearchIndex() {
		return "t_hardenv";
	}


}