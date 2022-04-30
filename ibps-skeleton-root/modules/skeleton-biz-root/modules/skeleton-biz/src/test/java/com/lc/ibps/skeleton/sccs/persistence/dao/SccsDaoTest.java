package com.lc.ibps.skeleton.sccs.persistence.dao;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.lc.ibps.skeleton.sccs.persistence.dao.SccsDao;
import com.lc.ibps.skeleton.sccs.persistence.dao.SccsQueryDao;
import com.lc.ibps.skeleton.sccs.persistence.entity.SccsPo;
import com.lc.ibps.skeleton.SccsBaseTest;

/**
 * t_sccs dao单元测试类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-03-28 23:53:13
 *</pre>
 */
public class SccsDaoTest extends SccsBaseTest{

	@Resource
	private SccsDao sccsDao;
	
	@Resource
	private SccsQueryDao sccsQueryDao;
		
	@Test
	@Rollback(true)
	public void testCrud(){
		SccsPo sccsPo=new SccsPo();
		sccsPo.setId(idGenerator.getId());
		
		//创建一实体
		sccsDao.create(sccsPo);
        Assert.assertNotNull(sccsPo.getId());
        logger.debug("sccsPo1:"+ sccsPo.getId());
		//获取一实体
		SccsPo sccsPo2=sccsQueryDao.get(sccsPo.getId());
		Assert.assertNotNull(sccsPo2);
		logger.debug("sccsPo2:" + sccsPo2.toString());
		//更新一实体
		sccsDao.update(sccsPo2);
		
		SccsPo sccsPo3=sccsQueryDao.get(sccsPo.getId());
		Assert.assertNotNull(sccsPo3);
		logger.debug("sccsPo3:"+sccsPo3.toString());
		//删除一实体
		//sccsDao.remove(sccsPo.getId());
	}
	
}