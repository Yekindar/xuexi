package com.lc.ibps.project.quota.persistence.dao;

import com.lc.ibps.project.QuotaBaseTest;
import com.lc.ibps.project.quota.persistence.entity.QuotaPo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;

/**
 * 指标信息 dao单元测试类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:40:59
 *</pre>
 */
public class QuotaDaoTest extends QuotaBaseTest{

	@Resource
	private QuotaDao quotaDao;
	
	@Resource
	private QuotaQueryDao quotaQueryDao;
		
	@Test
	@Rollback(true)
	public void testCrud(){
		QuotaPo quotaPo=new QuotaPo();
		quotaPo.setId(idGenerator.getId());
		
		//创建一实体
		quotaDao.create(quotaPo);
        Assert.assertNotNull(quotaPo.getId());
        logger.debug("quotaPo1:"+ quotaPo.getId());
		//获取一实体
		QuotaPo quotaPo2=quotaQueryDao.get(quotaPo.getId());
		Assert.assertNotNull(quotaPo2);
		logger.debug("quotaPo2:" + quotaPo2.toString());
		//更新一实体
		quotaDao.update(quotaPo2);
		
		QuotaPo quotaPo3=quotaQueryDao.get(quotaPo.getId());
		Assert.assertNotNull(quotaPo3);
		logger.debug("quotaPo3:"+quotaPo3.toString());
		//删除一实体
		//quotaDao.remove(quotaPo.getId());
	}
	
}