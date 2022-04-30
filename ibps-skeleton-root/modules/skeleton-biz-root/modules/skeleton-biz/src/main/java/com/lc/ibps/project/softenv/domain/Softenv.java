package com.lc.ibps.project.softenv.domain;

import com.lc.ibps.base.core.util.AppUtil;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.framework.domain.AbstractDomain;
import com.lc.ibps.project.softenv.persistence.dao.SoftenvDao;
import com.lc.ibps.project.softenv.persistence.dao.SoftenvQueryDao;
import com.lc.ibps.project.softenv.persistence.entity.SoftenvPo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 政务服务软环境 领域对象实体
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-08 16:43:21
 *</pre>
 */
@SuppressWarnings("serial")
@Service
@Transactional
@Scope("prototype")
public class Softenv extends AbstractDomain<String, SoftenvPo>{
	 
	private SoftenvDao softenvDao = null;
	private SoftenvQueryDao softenvQueryDao = null;


	protected void init(){
		softenvDao = AppUtil.getBean(SoftenvDao.class);
		softenvQueryDao = AppUtil.getBean(SoftenvQueryDao.class);
		this.setDao(softenvDao);
	}
	
	@Override
	protected void onSave() {
		if(BeanUtils.isNotEmpty(getId()))
			setNewFlag(BeanUtils.isEmpty(softenvQueryDao.get(getId())));
	}
	
	
}