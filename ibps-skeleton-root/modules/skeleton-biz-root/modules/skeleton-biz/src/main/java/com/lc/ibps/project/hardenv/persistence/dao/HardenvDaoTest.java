package com.lc.ibps.project.hardenv.persistence.dao;

//import com.lc.ibps.project.HardenvBaseTest;
import com.lc.ibps.project.hardenv.persistence.entity.HardenvPo;
//import org.junit.Assert;
//import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;

/**
 * 政务服务硬环境 dao单元测试类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-02 13:23:57
 *</pre>
 */
public class HardenvDaoTest{

	@Resource
	private HardenvDao hardenvDao;
	
	@Resource
	private HardenvQueryDao hardenvQueryDao;
		
//	@Test
//	@Rollback(true)
//	public void testCrud(){
//		HardenvPo hardenvPo=new HardenvPo();
//		hardenvPo.setId(idGenerator.getId());
//
//		//创建一实体
//		hardenvDao.create(hardenvPo);
//        Assert.assertNotNull(hardenvPo.getId());
//        logger.debug("hardenvPo1:"+ hardenvPo.getId());
//		//获取一实体
//		HardenvPo hardenvPo2=hardenvQueryDao.get(hardenvPo.getId());
//		Assert.assertNotNull(hardenvPo2);
//		logger.debug("hardenvPo2:" + hardenvPo2.toString());
//		//更新一实体
//		hardenvDao.update(hardenvPo2);
//
//		HardenvPo hardenvPo3=hardenvQueryDao.get(hardenvPo.getId());
//		Assert.assertNotNull(hardenvPo3);
//		logger.debug("hardenvPo3:"+hardenvPo3.toString());
//		//删除一实体
//		//hardenvDao.remove(hardenvPo.getId());
//	}
	
}