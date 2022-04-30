package com.lc.ibps.project.quota.domain;

import com.lc.ibps.project.QuotaBaseTest;
import com.lc.ibps.project.quota.persistence.entity.QuotaPo;
import com.lc.ibps.project.quota.repository.QuotaRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 指标信息 领域对象实体单元测试类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:41:00
 *</pre>
 */
public class QuotaTest extends QuotaBaseTest{
	 
	@Resource
	private QuotaRepository quotaRepository;
	
	@Test
	@Rollback(true)
	public void create(){				
		Quota quota = quotaRepository.newInstance();
		
		QuotaPo quotaPo=new QuotaPo();
		quotaPo.setId(idGenerator.getId());
		
		quota.setData(quotaPo);
		
		List<String> ids = new ArrayList<String>();
		
		quota.create();	
		ids.add(quota.getId());
						
		Quota quota2 = quotaRepository.newInstance();
		quotaPo.setId(idGenerator.getId());
		quota2.setData(quotaPo);
		
		quota2.create();
		ids.add(quota2.getId());
		
		List<QuotaPo> quotaPoList = quotaRepository.findByIds(ids);
		Assert.assertTrue(quotaPoList.size()>=2);
		
		List<QuotaPo>quota1 = quotaRepository.findAll();
		Assert.assertTrue(quota1.size()>=2);

	}
}