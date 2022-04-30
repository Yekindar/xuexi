package com.lc.ibps.project.enterprisesurvey.domain;


import javax.annotation.Resource;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.framework.domain.AbstractDomain;
import com.lc.ibps.base.framework.persistence.dao.IDao;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.project.enterprisesurvey.persistence.dao.EnterprisesurveyDao;
import com.lc.ibps.project.enterprisesurvey.persistence.dao.EnterprisesurveyQueryDao;
import com.lc.ibps.project.enterprisesurvey.repository.EnterprisesurveyRepository;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.EnterprisesurveyPo;
import com.lc.ibps.project.enterprisesurvey.repository.OperateprocessRepository;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.OperateprocessPo;

/**
 * t_enterprisesurvey 领域对象实体
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:02
 *</pre>
 */
@SuppressWarnings("serial")
@Service
@Transactional
public class Enterprisesurvey extends AbstractDomain<String, EnterprisesurveyPo>{
	
	@Resource
	private EnterprisesurveyDao enterprisesurveyDao;
	@Resource
	private EnterprisesurveyQueryDao enterprisesurveyQueryDao;
	@Resource
	@Lazy
	private EnterprisesurveyRepository enterprisesurveyRepository;

	@Resource
	@Lazy
	private Operateprocess operateprocess;
	@Resource
	@Lazy
	private OperateprocessRepository operateprocessRepository;

	protected void init(){
	}
	
	@Override
	protected IQueryDao<String, EnterprisesurveyPo> getInternalQueryDao() {
		return enterprisesurveyQueryDao;
	}
	
	@Override
	protected IDao<String, EnterprisesurveyPo> getInternalDao() {
		return enterprisesurveyDao;
	}
	
	@Override
	public String getInternalCacheName() {
		return "enterprisesurvey";
	}

	@Override
	public Class<EnterprisesurveyPo> getPoClass() {
		return EnterprisesurveyPo.class;
	}

	@Override
	protected Function<String, EnterprisesurveyPo> getInternalFunctionGet() {
		Function<String, EnterprisesurveyPo> functionGet = new Function<String, EnterprisesurveyPo>() {

			@Override
			public EnterprisesurveyPo apply(String t) {
				return enterprisesurveyRepository.loadCascade(t);
			}
			
		};
		
		setFunctionGet(functionGet);
		
		return functionGet;
	}
	
	@Override
	protected void createInternal(EnterprisesurveyPo enterprisesurveyPo) {
		super.createInternal(enterprisesurveyPo);
		List<OperateprocessPo> operateprocessPos = enterprisesurveyPo.getOperateprocess();
		if(BeanUtils.isNotEmpty(operateprocessPos)){
			operateprocess.createBatch(operateprocessPos);
		}
	}
	
	@Override
	protected void updateInternal(EnterprisesurveyPo enterprisesurveyPo) {
		super.updateInternal(enterprisesurveyPo);
		List<OperateprocessPo> operateprocessPos = enterprisesurveyPo.getOperateprocess();
		String operateprocessPoMainId = null;
		operateprocessPoMainId = enterprisesurveyPo.getId();
		if(BeanUtils.isNotEmpty(operateprocessPos)) {
			List<OperateprocessPo> addOperateprocessPos = new ArrayList<>();
			List<String> operateprocessPoIds = new ArrayList<>();
			Iterator<OperateprocessPo> operateprocessPoIt = operateprocessPos.iterator();
			for(;operateprocessPoIt.hasNext();) {
				OperateprocessPo operateprocessPo = operateprocessPoIt.next();
				// 更新
				OperateprocessPo operateprocessPo0 = operateprocessRepository.get(operateprocessPo.getId());
				if(BeanUtils.isNotEmpty(operateprocessPo0)) {
					operateprocessPoIds.add(operateprocessPo0.getId());
					continue;
				}
				
				if(com.lc.ibps.base.core.util.string.StringUtil.isBlank(operateprocessPo.getId())) {
					operateprocessPo.setId(getIdGenerator().getId());
				}
				addOperateprocessPos.add(operateprocessPo);
				operateprocessPoIds.add(operateprocessPo.getId());
			}
			
			if(BeanUtils.isNotEmpty(addOperateprocessPos)) {
				operateprocess.createBatch(addOperateprocessPos);
			}
			if(BeanUtils.isNotEmpty(operateprocessPos)) {
				operateprocess.updateBatch(operateprocessPos);
			}
			
			operateprocess.deleteByMainIdNotIds(operateprocessPoMainId, operateprocessPoIds);
		}
		else {
			operateprocess.deleteByMainId(operateprocessPoMainId);
		}
	}
	
	/**
	 * 主从表一并保存 
	 * void
	 * @exception 
	 * @since  1.0.0
	 */
	public void saveCascade(EnterprisesurveyPo enterprisesurveyPo){
		autoId(enterprisesurveyPo);
		if(BeanUtils.isNotEmpty(enterprisesurveyPo.getOperateprocess())){
			for(OperateprocessPo operateprocessPo:enterprisesurveyPo.getOperateprocess()){
				//设置外键
				operateprocessPo.setParSurId(enterprisesurveyPo.getId());
			}
		}
		save(enterprisesurveyPo);
	}
	
	/**
	 * 主从表一并删除 
	 * void
	 * @exception 
	 * @since  1.0.0
	 */
	public void deleteByIdsCascade(String[] ids){
		for(String id : ids){
			EnterprisesurveyPo po = enterprisesurveyRepository.get(id);
			if(BeanUtils.isNotEmpty(po) && BeanUtils.isNotEmpty(po.getId())){
				operateprocess.deleteByMainId(po.getId());
			}	
		}
		deleteByIds(ids);
	}
	
	
}