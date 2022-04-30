package com.lc.ibps.project.hardenv.domain;

import com.lc.ibps.base.core.util.AppUtil;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.framework.domain.AbstractDomain;
import com.lc.ibps.base.framework.persistence.dao.IDao;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.project.hardenv.persistence.dao.HardenvDao;
import com.lc.ibps.project.hardenv.persistence.dao.HardenvQueryDao;
import com.lc.ibps.project.hardenv.persistence.entity.HardenvPo;
import com.lc.ibps.project.hardenv.persistence.entity.HardenvTbl;
import com.lc.ibps.project.hardenv.persistence.dao.HardenvDao;
import com.lc.ibps.project.hardenv.repository.HardenvRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 政务服务硬环境 领域对象实体
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-02 13:23:57
 *</pre>
 */
@SuppressWarnings("serial")
@Service
@Transactional
@Scope("prototype")
public class Hardenv extends AbstractDomain<String, HardenvPo>{

	@Resource
	private HardenvDao hardenvDao;

	@Resource
	private HardenvQueryDao hardenvQueryDao;

	@Resource
	@Lazy
	private HardenvRepository hardenvRepository;




	protected void init(){
		hardenvDao = AppUtil.getBean(HardenvDao.class);
		hardenvQueryDao = AppUtil.getBean(HardenvQueryDao.class);
		this.setDao(hardenvDao);
	}

	@Override
	protected IQueryDao<String, HardenvPo> getInternalQueryDao() {
		return hardenvQueryDao;
	}

	@Override
	protected IDao<String, HardenvPo> getInternalDao() {
		return hardenvDao;
	}

	//	@Override
//	protected void onSave() {
//		if(BeanUtils.isNotEmpty(getId()))
//			setNewFlag(BeanUtils.isEmpty(hardenvQueryDao.get(getId())));
//	}


	@Override
	public String getCacheName() {
		return super.getCacheName();
	}

	@Override
	public String getInternalCacheName() {
		return "hardenv";
	}

	@Override
	public Class<HardenvPo> getPoClass() {
		return HardenvPo.class;
	}
}