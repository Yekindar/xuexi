package com.lc.ibps.project.quota.service.impl;


import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.core.util.string.StringUtil;
import com.lc.ibps.project.quota.domain.Quota;
import com.lc.ibps.project.quota.persistence.entity.QuotaPo;
import com.lc.ibps.project.quota.repository.QuotaRepository;
import com.lc.ibps.project.quota.service.QuotaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 指标信息 服务的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:41:00
 *</pre>
 */
@Service("quotaService")
@Transactional
public class QuotaServiceImpl implements QuotaService{
	  
	@Resource
	private QuotaRepository quotaRepository;


	@Override
	public void save(String jsonData) {
		Quota quota = getDomain(jsonData, null);
		if(BeanUtils.isEmpty(quota)){
			return;
		}
		quota.save();
	}
	
	@Override
	public void deleteByIds(String[] ids) {
		Quota quota = quotaRepository.newInstance();
		quota.deleteByIds(ids);
	}


	/*######################### private ###########################*/

	/**
	 * 获取领域对象
	 *
	 * @param cmd
	 * @return 
	 */
	private Quota getDomain(String busData, String key){
		if(BeanUtils.isEmpty(busData)){
			return null;
		}
		
		QuotaPo po = QuotaPo.fromJsonString(busData);
		if(StringUtil.isNotEmpty(key)){
			po.setId(key);
		}
		Quota quota = quotaRepository.newInstance(po);
		
		return quota;
	}
	
}