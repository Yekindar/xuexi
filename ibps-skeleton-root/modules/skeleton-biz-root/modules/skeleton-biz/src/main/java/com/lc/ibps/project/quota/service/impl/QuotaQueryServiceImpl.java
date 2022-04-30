package com.lc.ibps.project.quota.service.impl;

import com.lc.ibps.api.base.query.QueryFilter;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.core.util.JacksonUtil;
import com.lc.ibps.project.quota.persistence.entity.QuotaPo;
import com.lc.ibps.project.quota.repository.QuotaRepository;
import com.lc.ibps.project.quota.service.QuotaQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 指标信息 查询服务的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:41:00
 *</pre>
 */
@Service("quotaQueryService")
public class QuotaQueryServiceImpl implements QuotaQueryService{
	  
	@Resource
	private QuotaRepository quotaRepository;

	@Override
	public String get(String id) {
		QuotaPo po = quotaRepository.get(id);
		
		return BeanUtils.isEmpty(po) ? null : po.toJsonString();
	}
	

	@Override
	public String query(QueryFilter filter) {
		List<QuotaPo> pos = quotaRepository.query(filter);
		
		return BeanUtils.isEmpty(pos) ? null : pos.toString();
	}
	
	@Override
	public String findAll() {
		List<QuotaPo> pos = quotaRepository.findAll();
		
		return BeanUtils.isEmpty(pos) ? null : JacksonUtil.toJsonString(pos);
	}
	
}