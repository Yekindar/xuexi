package com.lc.ibps.project.hardenv.service.impl;

import com.lc.ibps.api.base.query.QueryFilter;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.core.util.JacksonUtil;
import com.lc.ibps.project.hardenv.persistence.entity.HardenvPo;
import com.lc.ibps.project.hardenv.repository.HardenvRepository;
import com.lc.ibps.project.hardenv.service.HardenvQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 政务服务硬环境 查询服务的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-02 13:23:57
 *</pre>
 */
@Service("hardenvQueryService")
public class HardenvQueryServiceImpl implements HardenvQueryService{
	  
	@Resource
	private HardenvRepository hardenvRepository;

	@Override
	public String get(String id) {
		HardenvPo po = hardenvRepository.get(id);
		
		return BeanUtils.isEmpty(po) ? null : po.toJsonString();
	}
	

	@Override
	public String query(QueryFilter filter) {
		List<HardenvPo> pos = hardenvRepository.query(filter);
		
		return BeanUtils.isEmpty(pos) ? null : pos.toString();
	}
	
	@Override
	public String findAll() {
		List<HardenvPo> pos = hardenvRepository.findAll();
		
		return BeanUtils.isEmpty(pos) ? null : JacksonUtil.toJsonString(pos);
	}
	
}