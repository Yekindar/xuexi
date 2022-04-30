package com.lc.ibps.skeleton.sccs.domain;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.lc.ibps.skeleton.sccs.domain.Sccs;
import com.lc.ibps.skeleton.sccs.repository.SccsRepository;
import com.lc.ibps.skeleton.sccs.persistence.entity.SccsPo;
import com.lc.ibps.skeleton.SccsBaseTest;

/**
 * t_sccs 领域对象实体单元测试类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-03-28 23:53:13
 *</pre>
 */
public class SccsTest extends SccsBaseTest{
	 
	@Resource
	private SccsRepository sccsRepository;
	@Resource
	private Sccs sccs;
	
	@Test
	@Rollback(true)
	public void create(){
	
		List<String> ids = new ArrayList<String>();
		
		SccsPo sccsPo=new SccsPo();
		sccsPo.setId(idGenerator.getId());
		sccs.create(sccsPo);
		ids.add(sccsPo.getId());	
		
		sccsPo.setId(idGenerator.getId());
		sccs.create(sccsPo);
		ids.add(sccsPo.getId());

		List<SccsPo> sccsPoList = sccsRepository.findByIds(ids);
		Assert.assertTrue(sccsPoList.size()>=2);
		
		List<SccsPo>sccs1 = sccsRepository.findAll();
		Assert.assertTrue(sccs1.size()>=2);

	}
}