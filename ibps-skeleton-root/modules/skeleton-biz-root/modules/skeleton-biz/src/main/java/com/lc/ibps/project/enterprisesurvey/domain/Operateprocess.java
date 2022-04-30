package com.lc.ibps.project.enterprisesurvey.domain;

import java.util.List;
import java.util.ArrayList;

import javax.annotation.Resource;

import com.lc.ibps.base.core.util.BeanUtils;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.lc.ibps.base.framework.domain.AbstractDomain;
import com.lc.ibps.base.framework.persistence.dao.IDao;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.project.enterprisesurvey.persistence.dao.OperateprocessDao;
import com.lc.ibps.project.enterprisesurvey.persistence.dao.OperateprocessQueryDao;
import com.lc.ibps.project.enterprisesurvey.repository.OperateprocessRepository;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.OperateprocessPo;

/**
 * t_operateprocess 领域对象实体
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:03
 *</pre>
 */
@SuppressWarnings("serial")
@Service
@Transactional
public class Operateprocess extends AbstractDomain<String, OperateprocessPo>{
	
	@Resource
	private OperateprocessDao operateprocessDao;
	@Resource
	private OperateprocessQueryDao operateprocessQueryDao;
	@Resource
	@Lazy
	private OperateprocessRepository operateprocessRepository;


	protected void init(){
	}
	
	@Override
	protected IQueryDao<String, OperateprocessPo> getInternalQueryDao() {
		return operateprocessQueryDao;
	}
	
	@Override
	protected IDao<String, OperateprocessPo> getInternalDao() {
		return operateprocessDao;
	}
	
	@Override
	public String getInternalCacheName() {
		return "operateprocess";
	}

	@Override
	public Class<OperateprocessPo> getPoClass() {
		return OperateprocessPo.class;
	}


	@Override
	public boolean isUpdateLogOpenning() {
		return false;
	}
	
	public void deleteByMainId(String mainId) {
		List<OperateprocessPo> list = operateprocessRepository.findByMainId(mainId);
		List<String> ids = new ArrayList<>();
		for (OperateprocessPo po : list) {
			ids.add(po.getId());
		}
		if(BeanUtils.isNotEmpty(ids)){
			delete("deleteByIds", ids, b().a("ids",ids).p());
		}
	}
	
	public void deleteByMainIdNotIds(String mainId, List<String> ids0) {
    	List<OperateprocessPo> list = operateprocessRepository.findByMainId(mainId);
    	List<String> ids = new ArrayList<>();
		for (OperateprocessPo po : list) {
    		if(!ids0.contains(po.getId())) {
    			ids.add(po.getId());
    		}
    	}
    	if(BeanUtils.isNotEmpty(ids)){
    		delete("deleteByIds", ids, b().a("ids",ids).p());
    	}
    }
	
}