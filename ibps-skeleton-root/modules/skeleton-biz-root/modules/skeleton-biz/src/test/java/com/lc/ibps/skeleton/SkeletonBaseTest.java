package com.lc.ibps.skeleton;

import javax.annotation.Resource;

import org.springframework.test.context.ContextConfiguration;

import com.lc.ibps.base.framework.test.BaseTestCase;
import com.lc.ibps.api.base.id.IdGenerator;

/**
 * 测试基类。</br>
 * 模块其下的测试类均继承该子类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-03-06 19:19:57
 *</pre>
 */
@ContextConfiguration({"classpath:conf/skeleton-test.xml"})
public class SkeletonBaseTest extends BaseTestCase{
	
	@Resource
    protected IdGenerator idGenerator;
}