package com.lc.ibps.skeleton.model;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

/** 
 * 用于数据校验分组
 * <pre> 
 * 构建组：ibps-provider-portal
 * 作者：eddy
 * 邮箱：xuq@bpmhome.cn
 * 日期：2018年5月25日-上午9:33:26
 * 版权：广州流辰信息技术有限公司版权所有
 * </pre>
 */
public interface ValidGroup {

	public interface Group1{}
	
	public interface Group2{}
	
	public interface Group3{}
	
	public interface Group4{}
	
	public interface Group5{}
	
	public interface Group6{}
	
	/** 
	 * <pre>
	 * 上一组校验器只有有一个校验不通过，则不会校验后续组；
	 * 级联对象也不例外；
	 * </pre>
	 * <pre> 
	 * 构建组：ibps-provider-portal
	 * 作者：eddy
	 * 邮箱：xuq@bpmhome.cn
	 * 日期：2018年5月25日-上午9:26:13
	 * 版权：广州流辰信息技术有限公司版权所有
	 * </pre>
	 */
	@GroupSequence(value = {Group1.class, Group2.class, Group3.class, Default.class})
	public interface GroupOrder1{}
	
}
