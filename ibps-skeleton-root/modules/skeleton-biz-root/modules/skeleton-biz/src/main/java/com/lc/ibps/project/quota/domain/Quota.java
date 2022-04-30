package com.lc.ibps.project.quota.domain;

import com.lc.ibps.base.core.util.AppUtil;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.framework.domain.AbstractDomain;
import com.lc.ibps.project.quota.persistence.dao.QuotaDao;
import com.lc.ibps.project.quota.persistence.dao.QuotaQueryDao;
import com.lc.ibps.project.quota.persistence.entity.QuotaPo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 指标信息 领域对象实体
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:41:00
 *</pre>
 */
@SuppressWarnings("serial")
@Service
@Transactional
@Scope("prototype")
public class Quota extends AbstractDomain<String, QuotaPo>{
	 
	private QuotaDao quotaDao = null;
	private QuotaQueryDao quotaQueryDao = null;


	protected void init(){
		quotaDao = AppUtil.getBean(QuotaDao.class);
		quotaQueryDao = AppUtil.getBean(QuotaQueryDao.class);
		this.setDao(quotaDao);
	}
	
	@Override
	protected void onSave() {
		if(BeanUtils.isNotEmpty(getId()))
			setNewFlag(BeanUtils.isEmpty(quotaQueryDao.get(getId())));
	}
	
	
}