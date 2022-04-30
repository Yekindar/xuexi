package com.lc.ibps.project.enterprisesurvey.persistence.entity;

import java.util.Date;

import com.lc.ibps.base.framework.persistence.entity.AbstractPo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * t_operateprocess 表对象
 * 
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:02
 *</pre>
 */
@SuppressWarnings("serial")
@ApiModel(value = "t_operateprocess对象")
public class OperateprocessTbl extends AbstractPo<String>{
	@ApiModelProperty(value = "主键")
	protected String  id; 		/*主键*/
	@ApiModelProperty(value = "环节所属调查表")
	protected String  parSurId; 		/*环节所属调查表*/
	@ApiModelProperty(value = "IP地址")
	protected String  ip; 		/*IP地址*/
	@ApiModelProperty(value = "开办企业环节序号")
	protected Long  serialNum; 		/*开办企业环节序号*/
	@ApiModelProperty(value = "环节名称")
	protected String  processName; 		/*环节名称*/
	@ApiModelProperty(value = "办理机构")
	protected String  operateDp; 		/*办理机构*/
	@ApiModelProperty(value = "该环节是否发生")
	protected String  isHappen; 		/*该环节是否发生*/
	@ApiModelProperty(value = "环节办理时限")
	protected Double  processDayNum; 		/*环节办理时限*/
	@ApiModelProperty(value = "环节承诺时限")
	protected Double  processPmeNum; 		/*环节承诺时限*/
	@ApiModelProperty(value = "办理成本（元）")
	protected Double  processCost; 		/*办理成本（元）*/
	@ApiModelProperty(value = "申请材料（件）")
	protected Long  processFileNum; 		/*申请材料（件）*/
	@ApiModelProperty(value = "该环节是否可以并联办理")
	protected String  isParallel; 		/*该环节是否可以并联办理*/
	@ApiModelProperty(value = "该环节与哪些环节并联办理")
	protected String  parallelProcess; 		/*该环节与哪些环节并联办理*/
	@ApiModelProperty(value = "该环节是否可以同时办理")
	protected String  isMeantime; 		/*该环节是否可以同时办理*/
	@ApiModelProperty(value = "该环节与哪些环节同时办理")
	protected String  meantimeProcess; 		/*该环节与哪些环节同时办理*/
	@ApiModelProperty(value = "该环节是否可以网上办理")
	protected String  isNetProcess; 		/*该环节是否可以网上办理*/
	@ApiModelProperty(value = "该环节与哪些环节“一网”办理")
	protected String  netProcess; 		/*该环节与哪些环节“一网”办理*/
	@ApiModelProperty(value = "证明材料")
	protected String  proveAttachmet; 		/*证明材料*/
	@ApiModelProperty(value = "环节填写状态")
	protected String  prcessState; 		/*环节填写状态*/
	@ApiModelProperty(value = " 保留1")
	protected String  retain1; 		/* 保留1*/
	@ApiModelProperty(value = "保留2")
	protected String  retain2; 		/*保留2*/

	public void setId(String id) 
	{
		this.id = id;
	}
	/**
	 * 返回 主键
	 * @return
	 */
	public String getId() 
	{
		return this.id;
	}
	public void setParSurId(String parSurId) 
	{
		this.parSurId = parSurId;
	}
	/**
	 * 返回 环节所属调查表
	 * @return
	 */
	public String getParSurId() 
	{
		return this.parSurId;
	}
	public void setIp(String ip) 
	{
		this.ip = ip;
	}
	/**
	 * 返回 IP地址
	 * @return
	 */
	public String getIp() 
	{
		return this.ip;
	}
	public void setSerialNum(Long serialNum) 
	{
		this.serialNum = serialNum;
	}
	/**
	 * 返回 开办企业环节序号
	 * @return
	 */
	public Long getSerialNum() 
	{
		return this.serialNum;
	}
	public void setProcessName(String processName) 
	{
		this.processName = processName;
	}
	/**
	 * 返回 环节名称
	 * @return
	 */
	public String getProcessName() 
	{
		return this.processName;
	}
	public void setOperateDp(String operateDp) 
	{
		this.operateDp = operateDp;
	}
	/**
	 * 返回 办理机构
	 * @return
	 */
	public String getOperateDp() 
	{
		return this.operateDp;
	}
	public void setIsHappen(String isHappen) 
	{
		this.isHappen = isHappen;
	}
	/**
	 * 返回 该环节是否发生
	 * @return
	 */
	public String getIsHappen() 
	{
		return this.isHappen;
	}
	public void setProcessDayNum(Double processDayNum) 
	{
		this.processDayNum = processDayNum;
	}
	/**
	 * 返回 环节办理时限
	 * @return
	 */
	public Double getProcessDayNum() 
	{
		return this.processDayNum;
	}
	public void setProcessPmeNum(Double processPmeNum) 
	{
		this.processPmeNum = processPmeNum;
	}
	/**
	 * 返回 环节承诺时限
	 * @return
	 */
	public Double getProcessPmeNum() 
	{
		return this.processPmeNum;
	}
	public void setProcessCost(Double processCost) 
	{
		this.processCost = processCost;
	}
	/**
	 * 返回 办理成本（元）
	 * @return
	 */
	public Double getProcessCost() 
	{
		return this.processCost;
	}
	public void setProcessFileNum(Long processFileNum) 
	{
		this.processFileNum = processFileNum;
	}
	/**
	 * 返回 申请材料（件）
	 * @return
	 */
	public Long getProcessFileNum() 
	{
		return this.processFileNum;
	}
	public void setIsParallel(String isParallel) 
	{
		this.isParallel = isParallel;
	}
	/**
	 * 返回 该环节是否可以并联办理
	 * @return
	 */
	public String getIsParallel() 
	{
		return this.isParallel;
	}
	public void setParallelProcess(String parallelProcess) 
	{
		this.parallelProcess = parallelProcess;
	}
	/**
	 * 返回 该环节与哪些环节并联办理
	 * @return
	 */
	public String getParallelProcess() 
	{
		return this.parallelProcess;
	}
	public void setIsMeantime(String isMeantime) 
	{
		this.isMeantime = isMeantime;
	}
	/**
	 * 返回 该环节是否可以同时办理
	 * @return
	 */
	public String getIsMeantime() 
	{
		return this.isMeantime;
	}
	public void setMeantimeProcess(String meantimeProcess) 
	{
		this.meantimeProcess = meantimeProcess;
	}
	/**
	 * 返回 该环节与哪些环节同时办理
	 * @return
	 */
	public String getMeantimeProcess() 
	{
		return this.meantimeProcess;
	}
	public void setIsNetProcess(String isNetProcess) 
	{
		this.isNetProcess = isNetProcess;
	}
	/**
	 * 返回 该环节是否可以网上办理
	 * @return
	 */
	public String getIsNetProcess() 
	{
		return this.isNetProcess;
	}
	public void setNetProcess(String netProcess) 
	{
		this.netProcess = netProcess;
	}
	/**
	 * 返回 该环节与哪些环节“一网”办理
	 * @return
	 */
	public String getNetProcess() 
	{
		return this.netProcess;
	}
	public void setProveAttachmet(String proveAttachmet) 
	{
		this.proveAttachmet = proveAttachmet;
	}
	/**
	 * 返回 证明材料
	 * @return
	 */
	public String getProveAttachmet() 
	{
		return this.proveAttachmet;
	}
	public void setPrcessState(String prcessState) 
	{
		this.prcessState = prcessState;
	}
	/**
	 * 返回 环节填写状态
	 * @return
	 */
	public String getPrcessState() 
	{
		return this.prcessState;
	}
	public void setRetain1(String retain1) 
	{
		this.retain1 = retain1;
	}
	/**
	 * 返回  保留1
	 * @return
	 */
	public String getRetain1() 
	{
		return this.retain1;
	}
	public void setRetain2(String retain2) 
	{
		this.retain2 = retain2;
	}
	/**
	 * 返回 保留2
	 * @return
	 */
	public String getRetain2() 
	{
		return this.retain2;
	}
	
}