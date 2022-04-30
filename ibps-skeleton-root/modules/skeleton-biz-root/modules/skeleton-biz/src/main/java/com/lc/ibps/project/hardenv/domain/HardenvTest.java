package com.lc.ibps.project.hardenv.domain;


import com.lc.ibps.project.hardenv.persistence.entity.HardenvPo;
import com.lc.ibps.project.hardenv.repository.HardenvRepository;
//import org.junit.Assert;
//import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 政务服务硬环境 领域对象实体单元测试类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-02 13:23:57
 *</pre>
 */
public class HardenvTest {
	 
	@Resource
	private HardenvRepository hardenvRepository;
	
//	@Test
	@Rollback(true)
	public void create(){				
//		Hardenv hardenv = hardenvRepository.newInstance();
//
//		HardenvPo hardenvPo=new HardenvPo();
//		hardenvPo.setId(idGenerator.getId());
//
//		hardenv.setData(hardenvPo);
//
//		List<String> ids = new ArrayList<String>();
//
//		hardenv.create();
//		ids.add(hardenv.getId());
//
//		Hardenv hardenv2 = hardenvRepository.newInstance();
//		hardenvPo.setId(idGenerator.getId());
//		hardenv2.setData(hardenvPo);
//
//		hardenv2.create();
//		ids.add(hardenv2.getId());
//
//		List<HardenvPo> hardenvPoList = hardenvRepository.findByIds(ids);
//		Assert.assertTrue(hardenvPoList.size()>=2);
//
//		List<HardenvPo>hardenv1 = hardenvRepository.findAll();
//		Assert.assertTrue(hardenv1.size()>=2);

	}
}