package com.lc.ibps.project.softenv.service.impl;

import com.lc.ibps.api.base.query.QueryFilter;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.core.util.JacksonUtil;
import com.lc.ibps.project.softenv.persistence.entity.SoftenvPo;
import com.lc.ibps.project.softenv.repository.SoftenvRepository;
import com.lc.ibps.project.softenv.service.SoftenvQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 政务服务软环境 查询服务的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-08 16:43:21
 *</pre>
 */
@Service("softenvQueryService")
public class SoftenvQueryServiceImpl implements SoftenvQueryService{
	  
	@Resource
	private SoftenvRepository softenvRepository;

	@Override
	public String get(String id) {
		SoftenvPo po = softenvRepository.get(id);
		
		return BeanUtils.isEmpty(po) ? null : po.toJsonString();
	}
	

	@Override
	public String query(QueryFilter filter) {
		List<SoftenvPo> pos = softenvRepository.query(filter);
		
		return BeanUtils.isEmpty(pos) ? null : pos.toString();
	}
	
	@Override
	public String findAll() {
		List<SoftenvPo> pos = softenvRepository.findAll();
		
		return BeanUtils.isEmpty(pos) ? null : JacksonUtil.toJsonString(pos);
	}
	
}