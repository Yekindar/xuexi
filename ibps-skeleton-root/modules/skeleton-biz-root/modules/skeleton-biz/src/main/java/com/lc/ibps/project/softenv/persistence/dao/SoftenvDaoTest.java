package com.lc.ibps.project.softenv.persistence.dao;

import com.lc.ibps.project.SoftenvBaseTest;
import com.lc.ibps.project.softenv.persistence.entity.SoftenvPo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;

/**
 * 政务服务软环境 dao单元测试类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-08 16:43:21
 *</pre>
 */
public class SoftenvDaoTest extends SoftenvBaseTest{

	@Resource
	private SoftenvDao softenvDao;
	
	@Resource
	private SoftenvQueryDao softenvQueryDao;
		
	@Test
	@Rollback(true)
	public void testCrud(){
		SoftenvPo softenvPo=new SoftenvPo();
		softenvPo.setId(idGenerator.getId());
		
		//创建一实体
		softenvDao.create(softenvPo);
        Assert.assertNotNull(softenvPo.getId());
        logger.debug("softenvPo1:"+ softenvPo.getId());
		//获取一实体
		SoftenvPo softenvPo2=softenvQueryDao.get(softenvPo.getId());
		Assert.assertNotNull(softenvPo2);
		logger.debug("softenvPo2:" + softenvPo2.toString());
		//更新一实体
		softenvDao.update(softenvPo2);
		
		SoftenvPo softenvPo3=softenvQueryDao.get(softenvPo.getId());
		Assert.assertNotNull(softenvPo3);
		logger.debug("softenvPo3:"+softenvPo3.toString());
		//删除一实体
		//softenvDao.remove(softenvPo.getId());
	}
	
}