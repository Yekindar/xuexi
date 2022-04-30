package com.lc.ibps.project.quota.repository.impl;


import com.lc.ibps.base.core.util.AppUtil;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.base.framework.repository.AbstractRepository;
import com.lc.ibps.project.quota.domain.Quota;
import com.lc.ibps.project.quota.persistence.dao.QuotaQueryDao;
import com.lc.ibps.project.quota.persistence.entity.QuotaPo;
import com.lc.ibps.project.quota.repository.QuotaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 指标信息 仓库的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:41:00
 *</pre>
 */
@Repository
public class QuotaRepositoryImpl extends AbstractRepository<String, QuotaPo,Quota> implements QuotaRepository{
	  
	@Resource
	private  QuotaQueryDao quotaQueryDao;

	public Quota newInstance() {
		QuotaPo po = new QuotaPo();
		Quota quota = AppUtil.getBean(Quota.class);
		quota.setData(po);
		return quota;
	}

	public Quota newInstance(QuotaPo po) {
		Quota quota = AppUtil.getBean(Quota.class);
		quota.setData(po);
		return quota;
	} 
	
	@Override
	protected IQueryDao<String, QuotaPo> getQueryDao() {
		return quotaQueryDao;
	}


	@Override
	public QuotaPo getByName(String name) {
		QuotaPo quotaPo = quotaQueryDao.getByName(name);
		return quotaPo;
	}

	@Override
	public List<QuotaPo> getByQuotaType(String quotaType) {
		List<QuotaPo> quotaPoList = quotaQueryDao.getByQuotaType(quotaType);
		return quotaPoList;
	}

	@Override
	public QuotaPo getByQuotaKey(String quotaKey) {
		QuotaPo quotaPo = quotaQueryDao.getByQuotaKey(quotaKey);
		return quotaPo;
	}

	@Override
	public String[] getInputQuotaItemByQuotaKey(String quotaKey) {


		List<QuotaPo> inputQuotaPos = new ArrayList<>();
		String[] quotaTitles = null;
		QuotaPo quotaPo = getByQuotaKey(quotaKey);
		String parentQuotaId = quotaPo.getId();

		findThirdQuotaPo(parentQuotaId,inputQuotaPos);

		if (inputQuotaPos.size() !=0){
			//问题
			quotaTitles = new String[inputQuotaPos.size()];
			for (int i=0;i<inputQuotaPos.size();i++){
				quotaTitles[i] = inputQuotaPos.get(i).getQuotaName();
			}
		}


		return quotaTitles;
	}

	@Override
	public Map<String,String> getQuotaKeysByQuotaKey(String quotaKey) {
		Map<String,String> QuotaKeys = new HashMap<>();

		QuotaPo quotaPo = getByQuotaKey(quotaKey);
		String parentQuotaId = quotaPo.getId();

		findInputQuotaKeys( parentQuotaId,  QuotaKeys);
		return QuotaKeys;
	}


	public void findThirdQuotaPo(String quotaId,List<QuotaPo> inputQuotaPos){
		List<QuotaPo> quotaPos = quotaQueryDao.getByParentQuotaId(quotaId);
		if (BeanUtils.isNotEmpty(quotaPos)){
			for (int i=0;i<quotaPos.size();i++){
				QuotaPo quotaPo = quotaPos.get(i);
				String quotaType = quotaPo.getQuotaType();
				if ("2".equals(quotaType)){
					findThirdQuotaPo(quotaPo.getId(),inputQuotaPos);
				}
				if ("3".equals(quotaType)){
					inputQuotaPos.add(quotaPo);
				}
			}
		}
	}

	public void findInputQuotaKeys(String quotaId, Map<String,String> QuotaKeys){
		List<QuotaPo> quotaPos = quotaQueryDao.getByParentQuotaId(quotaId);
		if (BeanUtils.isNotEmpty(quotaPos)){
			for (int i=0;i<quotaPos.size();i++){
				QuotaPo quotaPo = quotaPos.get(i);
				String quotaType = quotaPo.getQuotaType();
				if ("2".equals(quotaType)){
					findInputQuotaKeys(quotaPo.getId(),QuotaKeys);
				}
				if ("3".equals(quotaType)){
					String quotaKey = quotaPo.getQuotaKey();
					String quotaName  = quotaPo.getQuotaName();
					QuotaKeys.put(quotaKey,quotaName);
				}
			}
		}
	}
}