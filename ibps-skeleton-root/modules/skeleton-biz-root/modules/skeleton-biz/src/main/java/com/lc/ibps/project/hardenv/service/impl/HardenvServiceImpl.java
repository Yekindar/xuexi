package com.lc.ibps.project.hardenv.service.impl;


import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.core.util.string.StringUtil;
import com.lc.ibps.project.hardenv.domain.Hardenv;
import com.lc.ibps.project.hardenv.persistence.entity.HardenvPo;
import com.lc.ibps.project.hardenv.repository.HardenvRepository;
import com.lc.ibps.project.hardenv.service.HardenvService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 政务服务硬环境 服务的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-02 13:23:57
 *</pre>
 */
@Service("hardenvService")
@Transactional
public class HardenvServiceImpl implements HardenvService{
	  
	@Resource
	private HardenvRepository hardenvRepository;


	@Override
	public void save(String jsonData) {
		Hardenv hardenv = getDomain(jsonData, null);
		if(BeanUtils.isEmpty(hardenv)){
			return;
		}
		hardenv.save();
	}
	
	@Override
	public void deleteByIds(String[] ids) {
		Hardenv hardenv = hardenvRepository.newInstance();
		hardenv.deleteByIds(ids);
	}


	/*######################### private ###########################*/

	/**
	 * 获取领域对象
	 *
	 * @param cmd
	 * @return 
	 */
	private Hardenv getDomain(String busData, String key){
		if(BeanUtils.isEmpty(busData)){
			return null;
		}
		
		HardenvPo po = HardenvPo.fromJsonString(busData);
		if(StringUtil.isNotEmpty(key)){
			po.setId(key);
		}
		Hardenv hardenv = hardenvRepository.newInstance(po);
		
		return hardenv;
	}
	
}