package com.lc.ibps.project.softenv.service.impl;


import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.core.util.string.StringUtil;
import com.lc.ibps.project.softenv.domain.Softenv;
import com.lc.ibps.project.softenv.persistence.entity.SoftenvPo;
import com.lc.ibps.project.softenv.repository.SoftenvRepository;
import com.lc.ibps.project.softenv.service.SoftenvService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 政务服务软环境 服务的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-08 16:43:21
 *</pre>
 */
@Service("softenvService")
@Transactional
public class SoftenvServiceImpl implements SoftenvService{
	  
	@Resource
	private SoftenvRepository softenvRepository;


	@Override
	public void save(String jsonData) {
		Softenv softenv = getDomain(jsonData, null);
		if(BeanUtils.isEmpty(softenv)){
			return;
		}
		softenv.save();
	}
	
	@Override
	public void deleteByIds(String[] ids) {
		Softenv softenv = softenvRepository.newInstance();
		softenv.deleteByIds(ids);
	}


	/*######################### private ###########################*/

	/**
	 * 获取领域对象
	 *
	 * @param cmd
	 * @return 
	 */
	private Softenv getDomain(String busData, String key){
		if(BeanUtils.isEmpty(busData)){
			return null;
		}
		
		SoftenvPo po = SoftenvPo.fromJsonString(busData);
		if(StringUtil.isNotEmpty(key)){
			po.setId(key);
		}
		Softenv softenv = softenvRepository.newInstance(po);
		
		return softenv;
	}
	
}