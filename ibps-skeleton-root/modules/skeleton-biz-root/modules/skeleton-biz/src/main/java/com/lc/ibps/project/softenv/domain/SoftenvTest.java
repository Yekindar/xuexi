package com.lc.ibps.project.softenv.domain;

import com.lc.ibps.project.SoftenvBaseTest;
import com.lc.ibps.project.softenv.persistence.entity.SoftenvPo;
import com.lc.ibps.project.softenv.repository.SoftenvRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 政务服务软环境 领域对象实体单元测试类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-08 16:43:21
 *</pre>
 */
public class SoftenvTest extends SoftenvBaseTest{
	 
	@Resource
	private SoftenvRepository softenvRepository;
	
	@Test
	@Rollback(true)
	public void create(){				
		Softenv softenv = softenvRepository.newInstance();
		
		SoftenvPo softenvPo=new SoftenvPo();
		softenvPo.setId(idGenerator.getId());
		
		softenv.setData(softenvPo);
		
		List<String> ids = new ArrayList<String>();
		
		softenv.create();	
		ids.add(softenv.getId());
						
		Softenv softenv2 = softenvRepository.newInstance();
		softenvPo.setId(idGenerator.getId());
		softenv2.setData(softenvPo);
		
		softenv2.create();
		ids.add(softenv2.getId());
		
		List<SoftenvPo> softenvPoList = softenvRepository.findByIds(ids);
		Assert.assertTrue(softenvPoList.size()>=2);
		
		List<SoftenvPo>softenv1 = softenvRepository.findAll();
		Assert.assertTrue(softenv1.size()>=2);

	}
}