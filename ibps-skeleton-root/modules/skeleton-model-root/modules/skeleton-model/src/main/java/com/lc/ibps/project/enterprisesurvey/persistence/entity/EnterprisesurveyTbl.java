package com.lc.ibps.project.enterprisesurvey.persistence.entity;

import java.util.Date;

import com.lc.ibps.base.framework.persistence.entity.AbstractPo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * t_enterprisesurvey 表对象
 * 
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:01
 *</pre>
 */
@SuppressWarnings("serial")
@ApiModel(value = "t_enterprisesurvey对象")
public class EnterprisesurveyTbl extends AbstractPo<String>{
	@ApiModelProperty(value = "主键")
	protected String  id; 		/*主键*/
	@ApiModelProperty(value = "IP地址")
	protected String  ip; 		/*IP地址*/
	@ApiModelProperty(value = "填表类型")
	protected String  fileType; 		/*填表类型*/
	@ApiModelProperty(value = "开发区、县（市）区")
	protected String  dependency; 		/*开发区、县（市）区*/
	@ApiModelProperty(value = "牵头部门")
	protected String  headDp; 		/*牵头部门*/
	@ApiModelProperty(value = "联 系 人")
	protected String  liaison; 		/*联 系 人*/
	@ApiModelProperty(value = "配合部门")
	protected String  cooperateDp; 		/*配合部门*/
	@ApiModelProperty(value = "业务科室")
	protected String  businessRoom; 		/*业务科室*/
	@ApiModelProperty(value = "联系电话")
	protected String  phone; 		/*联系电话*/
	@com.fasterxml.jackson.annotation.JsonFormat(pattern = com.lc.ibps.base.core.constants.StringPool.DATE_FORMAT_DATETIME, timezone = "GMT+8")
	@ApiModelProperty(value = "填表时间")
	protected Date  fillDate; 		/*填表时间*/
	@ApiModelProperty(value = "环节个数")
	protected Long  processNum; 		/*环节个数*/
	@ApiModelProperty(value = "办理时限(日历日)")
	protected Double  dealDayNum; 		/*办理时限(日历日)*/
	@ApiModelProperty(value = "承诺时限(日历日)")
	protected Double  promiseDayNum; 		/*承诺时限(日历日)*/
	@ApiModelProperty(value = "办理成本（元）")
	protected Double  cost; 		/*办理成本（元）*/
	@ApiModelProperty(value = "申请材料（件）")
	protected Long  fileNum; 		/*申请材料（件）*/
	@ApiModelProperty(value = "网上办理环节")
	protected Long  netOperateNum; 		/*网上办理环节*/
	@ApiModelProperty(value = "互联网在线办理部门")
	protected String  netOperateDp; 		/*互联网在线办理部门*/
	@ApiModelProperty(value = "部门附件")
	protected String  dpAttachmt; 		/*部门附件*/
	@ApiModelProperty(value = "数据共享水平(是否推送数据)")
	protected String  isDataShare; 		/*数据共享水平(是否推送数据)*/
	@ApiModelProperty(value = "共享水平附件")
	protected String  shareAttachmt; 		/*共享水平附件*/
	@ApiModelProperty(value = "综合办理")
	protected String  isSynthetical; 		/*综合办理*/
	@ApiModelProperty(value = "综合办理附件")
	protected String  syncAttachmt; 		/*综合办理附件*/
	@ApiModelProperty(value = "电子化办理水平(数量)")
	protected Long  electronicNum; 		/*电子化办理水平(数量)*/
	@ApiModelProperty(value = "电子化办理水平(百分比)")
	protected Double  electronicPrecent; 		/*电子化办理水平(百分比)*/
	@ApiModelProperty(value = "电子化办理附件")
	protected String  elcAttachmt; 		/*电子化办理附件*/
	@ApiModelProperty(value = "放宽准入")
	protected String  isOpenSlim; 		/*放宽准入*/
	@ApiModelProperty(value = "放宽准入附件")
	protected String  slimAttachmt; 		/*放宽准入附件*/
	@ApiModelProperty(value = "填写状态")
	protected String  fillState; 		/*填写状态*/
	@ApiModelProperty(value = "保留1")
	protected String  retain1; 		/*保留1*/
	@ApiModelProperty(value = "保留2")
	protected String  retain; 		/*保留2*/
	@ApiModelProperty(value = "本地区是否有企业开办办事指南")
	protected String  isOpenGuide; 		/*本地区是否有企业开办办事指南*/
	@ApiModelProperty(value = "本地区是否可在政务大厅领取公章")
	protected String  isHallOfficial; 		/*本地区是否可在政务大厅领取公章*/
	@ApiModelProperty(value = "本地区是否公示企业开办业务办理进度")
	protected String  isOpenSpeed; 		/*本地区是否公示企业开办业务办理进度*/
	@ApiModelProperty(value = "本地区是否实现银行预约开户")
	protected String  isBankOrder; 		/*本地区是否实现银行预约开户*/
	@ApiModelProperty(value = "本地区是否推广并鼓励使用电子营业执照")
	protected String  isEleLicense; 		/*本地区是否推广并鼓励使用电子营业执照*/
	@ApiModelProperty(value = "本地区是否提供证照的快递服务")
	protected String  isExpressSer; 		/*本地区是否提供证照的快递服务*/
	@ApiModelProperty(value = "本地区是否认可电子签章")
	protected String  isEleOfficial; 		/*本地区是否认可电子签章*/
	@ApiModelProperty(value = "企业开办是否纳入一件事一次办")
	protected String  isOneAll; 		/*企业开办是否纳入一件事一次办*/
	@ApiModelProperty(value = "本地区企业开办涉及哪些部门可以实现互联网在线办理")
	protected String  isOnline; 		/*本地区企业开办涉及哪些部门可以实现互联网在线办理*/
	@ApiModelProperty(value = "指标id")
	protected String  quotaId; 		/*指标id*/
	@ApiModelProperty(value = "组织id")
	protected String  orgId; 		/*组织id*/
	@ApiModelProperty(value = "年份")
	protected String  year; 		/*年份*/
	@ApiModelProperty(value = "部门之间是否实现时时数据推送")
	protected String  dataPush; 		/*部门之间是否实现时时数据推送*/
	@ApiModelProperty(value = "是否推行开办企业全流程综合受理审批")
	protected String  oneCheck; 		/*是否推行开办企业全流程综合受理审批*/
	@ApiModelProperty(value = "本地区通过线上系统完成新设企业的数量")
	protected String  finishCount; 		/*本地区通过线上系统完成新设企业的数量*/
	@ApiModelProperty(value = "本地区通过线上系统完成新设企业的数量占所有新设企业数量的比例")
	protected String  qyPercent; 		/*本地区通过线上系统完成新设企业的数量占所有新设企业数量的比例*/
	@ApiModelProperty(value = "是否放开对小微企业的驻所限制")
	protected String  islimit; 		/*是否放开对小微企业的驻所限制*/
	@ApiModelProperty(value = "企业开办办事指南附件")
	protected String  qyOpenAttachment; 		/*企业开办办事指南附件*/
	@ApiModelProperty(value = "可在政务大厅领取公章附件")
	protected String  hallGzAttachment; 		/*可在政务大厅领取公章附件*/
	@ApiModelProperty(value = "公示企业开办业务办理进度附件")
	protected String  openProAttachment; 		/*公示企业开办业务办理进度附件*/
	@ApiModelProperty(value = "银行预约开户附件")
	protected String  bankOrderAtt; 		/*银行预约开户附件*/
	@ApiModelProperty(value = "推广并鼓励使用电子营业执照附件")
	protected String  eleLicenseAtt; 		/*推广并鼓励使用电子营业执照附件*/
	@ApiModelProperty(value = "提供证照的快递服务附件")
	protected String  expressSerAtt; 		/*提供证照的快递服务附件*/
	@ApiModelProperty(value = "认可电子签章附件")
	protected String  eleOfficialAtt; 		/*认可电子签章附件*/
	@ApiModelProperty(value = "纳入一件事一次办附件")
	protected String  oneAllAtt; 		/*纳入一件事一次办附件*/
	@ApiModelProperty(value = "时数据推送附件")
	protected String  dataPushAtt; 		/*时数据推送附件*/
	@ApiModelProperty(value = "推行开办企业全流程综合受理审批附件")
	protected String  oneCheckAtt; 		/*推行开办企业全流程综合受理审批附件*/
	@ApiModelProperty(value = "放开对小微企业的驻所限制附件")
	protected String  limitAtt; 		/*放开对小微企业的驻所限制附件*/
	@ApiModelProperty(value = "本地区企业开办涉及部门可以实现互联网在线附件")
	protected String  isOnlineAtt; 		/*本地区企业开办涉及部门可以实现互联网在线附件*/
	@ApiModelProperty(value = "企业开办办事指南备注")
	protected String  openGuideRemark; 		/*企业开办办事指南备注*/
	@ApiModelProperty(value = "政务大厅领取公章备注")
	protected String  hallOfficalRemark; 		/*政务大厅领取公章备注*/
	@ApiModelProperty(value = "公示企业开办业务办理进度备注")
	protected String  openSpeedRemark; 		/*公示企业开办业务办理进度备注*/
	@ApiModelProperty(value = "实现银行预约开户备注")
	protected String  bankOrderRemark; 		/*实现银行预约开户备注*/
	@ApiModelProperty(value = "推广并鼓励使用电子营业执照备注")
	protected String  eleLicenseRemark; 		/*推广并鼓励使用电子营业执照备注*/
	@ApiModelProperty(value = "提供证照的快递服务备注")
	protected String  expressSerRemark; 		/*提供证照的快递服务备注*/
	@ApiModelProperty(value = "认可电子签章备注")
	protected String  eleOfficalRemark; 		/*认可电子签章备注*/
	@ApiModelProperty(value = "纳入一件事一次办备注")
	protected String  oneAllRemark; 		/*纳入一件事一次办备注*/
	@ApiModelProperty(value = "企业开办涉及哪些部门可以实现互联网在线办理备注")
	protected String  onlineRemark; 		/*企业开办涉及哪些部门可以实现互联网在线办理备注*/
	@ApiModelProperty(value = "实现时时数据推送备注")
	protected String  dataPushRemark; 		/*实现时时数据推送备注*/
	@ApiModelProperty(value = "推行开办企业全流程综合受理审批备注")
	protected String  oneCheckRemark; 		/*推行开办企业全流程综合受理审批备注*/
	@ApiModelProperty(value = "放开对小微企业的驻所限制备注")
	protected String  isLimitRemark; 		/*放开对小微企业的驻所限制备注*/
	@ApiModelProperty(value = "通过线上系统完成新设企业的数量附件")
	protected String  finishCountAtt; 		/*通过线上系统完成新设企业的数量附件*/
	@ApiModelProperty(value = "通过线上系统完成新设企业的数量备注")
	protected String  finishCountRemark; 		/*通过线上系统完成新设企业的数量备注*/
	@ApiModelProperty(value = "通过线上系统完成新设企业的数量占所有新设企业数量的比例备注")
	protected String  qyPercentRemark; 		/*通过线上系统完成新设企业的数量占所有新设企业数量的比例备注*/
	@ApiModelProperty(value = "通过线上系统完成新设企业的数量占所有新设企业数量的比例附件")
	protected String  qyPercentAtt; 		/*通过线上系统完成新设企业的数量占所有新设企业数量的比例附件*/
	@ApiModelProperty(value = "本地区企业开办涉及哪些部门可以实现互联网在线办理")
	protected String  isOnlineOther; 		/*本地区企业开办涉及哪些部门可以实现互联网在线办理*/
	@ApiModelProperty(value = "本地企业开办部门互联网其他")
	protected String  localOnlineOther; 		/*本地企业开办部门互联网其他*/

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
	public void setFileType(String fileType) 
	{
		this.fileType = fileType;
	}
	/**
	 * 返回 填表类型
	 * @return
	 */
	public String getFileType() 
	{
		return this.fileType;
	}
	public void setDependency(String dependency) 
	{
		this.dependency = dependency;
	}
	/**
	 * 返回 开发区、县（市）区
	 * @return
	 */
	public String getDependency() 
	{
		return this.dependency;
	}
	public void setHeadDp(String headDp) 
	{
		this.headDp = headDp;
	}
	/**
	 * 返回 牵头部门
	 * @return
	 */
	public String getHeadDp() 
	{
		return this.headDp;
	}
	public void setLiaison(String liaison) 
	{
		this.liaison = liaison;
	}
	/**
	 * 返回 联 系 人
	 * @return
	 */
	public String getLiaison() 
	{
		return this.liaison;
	}
	public void setCooperateDp(String cooperateDp) 
	{
		this.cooperateDp = cooperateDp;
	}
	/**
	 * 返回 配合部门
	 * @return
	 */
	public String getCooperateDp() 
	{
		return this.cooperateDp;
	}
	public void setBusinessRoom(String businessRoom) 
	{
		this.businessRoom = businessRoom;
	}
	/**
	 * 返回 业务科室
	 * @return
	 */
	public String getBusinessRoom() 
	{
		return this.businessRoom;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	/**
	 * 返回 联系电话
	 * @return
	 */
	public String getPhone() 
	{
		return this.phone;
	}
	public void setFillDate(Date fillDate) 
	{
		this.fillDate = fillDate;
	}
	/**
	 * 返回 填表时间
	 * @return
	 */
	public Date getFillDate() 
	{
		return this.fillDate;
	}
	public void setProcessNum(Long processNum) 
	{
		this.processNum = processNum;
	}
	/**
	 * 返回 环节个数
	 * @return
	 */
	public Long getProcessNum() 
	{
		return this.processNum;
	}
	public void setDealDayNum(Double dealDayNum) 
	{
		this.dealDayNum = dealDayNum;
	}
	/**
	 * 返回 办理时限(日历日)
	 * @return
	 */
	public Double getDealDayNum() 
	{
		return this.dealDayNum;
	}
	public void setPromiseDayNum(Double promiseDayNum) 
	{
		this.promiseDayNum = promiseDayNum;
	}
	/**
	 * 返回 承诺时限(日历日)
	 * @return
	 */
	public Double getPromiseDayNum() 
	{
		return this.promiseDayNum;
	}
	public void setCost(Double cost) 
	{
		this.cost = cost;
	}
	/**
	 * 返回 办理成本（元）
	 * @return
	 */
	public Double getCost() 
	{
		return this.cost;
	}
	public void setFileNum(Long fileNum) 
	{
		this.fileNum = fileNum;
	}
	/**
	 * 返回 申请材料（件）
	 * @return
	 */
	public Long getFileNum() 
	{
		return this.fileNum;
	}
	public void setNetOperateNum(Long netOperateNum) 
	{
		this.netOperateNum = netOperateNum;
	}
	/**
	 * 返回 网上办理环节
	 * @return
	 */
	public Long getNetOperateNum() 
	{
		return this.netOperateNum;
	}
	public void setNetOperateDp(String netOperateDp) 
	{
		this.netOperateDp = netOperateDp;
	}
	/**
	 * 返回 互联网在线办理部门
	 * @return
	 */
	public String getNetOperateDp() 
	{
		return this.netOperateDp;
	}
	public void setDpAttachmt(String dpAttachmt) 
	{
		this.dpAttachmt = dpAttachmt;
	}
	/**
	 * 返回 部门附件
	 * @return
	 */
	public String getDpAttachmt() 
	{
		return this.dpAttachmt;
	}
	public void setIsDataShare(String isDataShare) 
	{
		this.isDataShare = isDataShare;
	}
	/**
	 * 返回 数据共享水平(是否推送数据)
	 * @return
	 */
	public String getIsDataShare() 
	{
		return this.isDataShare;
	}
	public void setShareAttachmt(String shareAttachmt) 
	{
		this.shareAttachmt = shareAttachmt;
	}
	/**
	 * 返回 共享水平附件
	 * @return
	 */
	public String getShareAttachmt() 
	{
		return this.shareAttachmt;
	}
	public void setIsSynthetical(String isSynthetical) 
	{
		this.isSynthetical = isSynthetical;
	}
	/**
	 * 返回 综合办理
	 * @return
	 */
	public String getIsSynthetical() 
	{
		return this.isSynthetical;
	}
	public void setSyncAttachmt(String syncAttachmt) 
	{
		this.syncAttachmt = syncAttachmt;
	}
	/**
	 * 返回 综合办理附件
	 * @return
	 */
	public String getSyncAttachmt() 
	{
		return this.syncAttachmt;
	}
	public void setElectronicNum(Long electronicNum) 
	{
		this.electronicNum = electronicNum;
	}
	/**
	 * 返回 电子化办理水平(数量)
	 * @return
	 */
	public Long getElectronicNum() 
	{
		return this.electronicNum;
	}
	public void setElectronicPrecent(Double electronicPrecent) 
	{
		this.electronicPrecent = electronicPrecent;
	}
	/**
	 * 返回 电子化办理水平(百分比)
	 * @return
	 */
	public Double getElectronicPrecent() 
	{
		return this.electronicPrecent;
	}
	public void setElcAttachmt(String elcAttachmt) 
	{
		this.elcAttachmt = elcAttachmt;
	}
	/**
	 * 返回 电子化办理附件
	 * @return
	 */
	public String getElcAttachmt() 
	{
		return this.elcAttachmt;
	}
	public void setIsOpenSlim(String isOpenSlim) 
	{
		this.isOpenSlim = isOpenSlim;
	}
	/**
	 * 返回 放宽准入
	 * @return
	 */
	public String getIsOpenSlim() 
	{
		return this.isOpenSlim;
	}
	public void setSlimAttachmt(String slimAttachmt) 
	{
		this.slimAttachmt = slimAttachmt;
	}
	/**
	 * 返回 放宽准入附件
	 * @return
	 */
	public String getSlimAttachmt() 
	{
		return this.slimAttachmt;
	}
	public void setFillState(String fillState) 
	{
		this.fillState = fillState;
	}
	/**
	 * 返回 填写状态
	 * @return
	 */
	public String getFillState() 
	{
		return this.fillState;
	}
	public void setRetain1(String retain1) 
	{
		this.retain1 = retain1;
	}
	/**
	 * 返回 保留1
	 * @return
	 */
	public String getRetain1() 
	{
		return this.retain1;
	}
	public void setRetain(String retain) 
	{
		this.retain = retain;
	}
	/**
	 * 返回 保留2
	 * @return
	 */
	public String getRetain() 
	{
		return this.retain;
	}
	public void setIsOpenGuide(String isOpenGuide) 
	{
		this.isOpenGuide = isOpenGuide;
	}
	/**
	 * 返回 本地区是否有企业开办办事指南
	 * @return
	 */
	public String getIsOpenGuide() 
	{
		return this.isOpenGuide;
	}
	public void setIsHallOfficial(String isHallOfficial) 
	{
		this.isHallOfficial = isHallOfficial;
	}
	/**
	 * 返回 本地区是否可在政务大厅领取公章
	 * @return
	 */
	public String getIsHallOfficial() 
	{
		return this.isHallOfficial;
	}
	public void setIsOpenSpeed(String isOpenSpeed) 
	{
		this.isOpenSpeed = isOpenSpeed;
	}
	/**
	 * 返回 本地区是否公示企业开办业务办理进度
	 * @return
	 */
	public String getIsOpenSpeed() 
	{
		return this.isOpenSpeed;
	}
	public void setIsBankOrder(String isBankOrder) 
	{
		this.isBankOrder = isBankOrder;
	}
	/**
	 * 返回 本地区是否实现银行预约开户
	 * @return
	 */
	public String getIsBankOrder() 
	{
		return this.isBankOrder;
	}
	public void setIsEleLicense(String isEleLicense) 
	{
		this.isEleLicense = isEleLicense;
	}
	/**
	 * 返回 本地区是否推广并鼓励使用电子营业执照
	 * @return
	 */
	public String getIsEleLicense() 
	{
		return this.isEleLicense;
	}
	public void setIsExpressSer(String isExpressSer) 
	{
		this.isExpressSer = isExpressSer;
	}
	/**
	 * 返回 本地区是否提供证照的快递服务
	 * @return
	 */
	public String getIsExpressSer() 
	{
		return this.isExpressSer;
	}
	public void setIsEleOfficial(String isEleOfficial) 
	{
		this.isEleOfficial = isEleOfficial;
	}
	/**
	 * 返回 本地区是否认可电子签章
	 * @return
	 */
	public String getIsEleOfficial() 
	{
		return this.isEleOfficial;
	}
	public void setIsOneAll(String isOneAll) 
	{
		this.isOneAll = isOneAll;
	}
	/**
	 * 返回 企业开办是否纳入一件事一次办
	 * @return
	 */
	public String getIsOneAll() 
	{
		return this.isOneAll;
	}
	public void setIsOnline(String isOnline) 
	{
		this.isOnline = isOnline;
	}
	/**
	 * 返回 本地区企业开办涉及哪些部门可以实现互联网在线办理
	 * @return
	 */
	public String getIsOnline() 
	{
		return this.isOnline;
	}
	public void setQuotaId(String quotaId) 
	{
		this.quotaId = quotaId;
	}
	/**
	 * 返回 指标id
	 * @return
	 */
	public String getQuotaId() 
	{
		return this.quotaId;
	}
	public void setOrgId(String orgId) 
	{
		this.orgId = orgId;
	}
	/**
	 * 返回 组织id
	 * @return
	 */
	public String getOrgId() 
	{
		return this.orgId;
	}
	public void setYear(String year) 
	{
		this.year = year;
	}
	/**
	 * 返回 年份
	 * @return
	 */
	public String getYear() 
	{
		return this.year;
	}
	public void setDataPush(String dataPush) 
	{
		this.dataPush = dataPush;
	}
	/**
	 * 返回 部门之间是否实现时时数据推送
	 * @return
	 */
	public String getDataPush() 
	{
		return this.dataPush;
	}
	public void setOneCheck(String oneCheck) 
	{
		this.oneCheck = oneCheck;
	}
	/**
	 * 返回 是否推行开办企业全流程综合受理审批
	 * @return
	 */
	public String getOneCheck() 
	{
		return this.oneCheck;
	}
	public void setFinishCount(String finishCount) 
	{
		this.finishCount = finishCount;
	}
	/**
	 * 返回 本地区通过线上系统完成新设企业的数量
	 * @return
	 */
	public String getFinishCount() 
	{
		return this.finishCount;
	}
	public void setQyPercent(String qyPercent) 
	{
		this.qyPercent = qyPercent;
	}
	/**
	 * 返回 本地区通过线上系统完成新设企业的数量占所有新设企业数量的比例
	 * @return
	 */
	public String getQyPercent() 
	{
		return this.qyPercent;
	}
	public void setIslimit(String islimit) 
	{
		this.islimit = islimit;
	}
	/**
	 * 返回 是否放开对小微企业的驻所限制
	 * @return
	 */
	public String getIslimit() 
	{
		return this.islimit;
	}
	public void setQyOpenAttachment(String qyOpenAttachment) 
	{
		this.qyOpenAttachment = qyOpenAttachment;
	}
	/**
	 * 返回 企业开办办事指南附件
	 * @return
	 */
	public String getQyOpenAttachment() 
	{
		return this.qyOpenAttachment;
	}
	public void setHallGzAttachment(String hallGzAttachment) 
	{
		this.hallGzAttachment = hallGzAttachment;
	}
	/**
	 * 返回 可在政务大厅领取公章附件
	 * @return
	 */
	public String getHallGzAttachment() 
	{
		return this.hallGzAttachment;
	}
	public void setOpenProAttachment(String openProAttachment) 
	{
		this.openProAttachment = openProAttachment;
	}
	/**
	 * 返回 公示企业开办业务办理进度附件
	 * @return
	 */
	public String getOpenProAttachment() 
	{
		return this.openProAttachment;
	}
	public void setBankOrderAtt(String bankOrderAtt) 
	{
		this.bankOrderAtt = bankOrderAtt;
	}
	/**
	 * 返回 银行预约开户附件
	 * @return
	 */
	public String getBankOrderAtt() 
	{
		return this.bankOrderAtt;
	}
	public void setEleLicenseAtt(String eleLicenseAtt) 
	{
		this.eleLicenseAtt = eleLicenseAtt;
	}
	/**
	 * 返回 推广并鼓励使用电子营业执照附件
	 * @return
	 */
	public String getEleLicenseAtt() 
	{
		return this.eleLicenseAtt;
	}
	public void setExpressSerAtt(String expressSerAtt) 
	{
		this.expressSerAtt = expressSerAtt;
	}
	/**
	 * 返回 提供证照的快递服务附件
	 * @return
	 */
	public String getExpressSerAtt() 
	{
		return this.expressSerAtt;
	}
	public void setEleOfficialAtt(String eleOfficialAtt) 
	{
		this.eleOfficialAtt = eleOfficialAtt;
	}
	/**
	 * 返回 认可电子签章附件
	 * @return
	 */
	public String getEleOfficialAtt() 
	{
		return this.eleOfficialAtt;
	}
	public void setOneAllAtt(String oneAllAtt) 
	{
		this.oneAllAtt = oneAllAtt;
	}
	/**
	 * 返回 纳入一件事一次办附件
	 * @return
	 */
	public String getOneAllAtt() 
	{
		return this.oneAllAtt;
	}
	public void setDataPushAtt(String dataPushAtt) 
	{
		this.dataPushAtt = dataPushAtt;
	}
	/**
	 * 返回 时数据推送附件
	 * @return
	 */
	public String getDataPushAtt() 
	{
		return this.dataPushAtt;
	}
	public void setOneCheckAtt(String oneCheckAtt) 
	{
		this.oneCheckAtt = oneCheckAtt;
	}
	/**
	 * 返回 推行开办企业全流程综合受理审批附件
	 * @return
	 */
	public String getOneCheckAtt() 
	{
		return this.oneCheckAtt;
	}
	public void setLimitAtt(String limitAtt) 
	{
		this.limitAtt = limitAtt;
	}
	/**
	 * 返回 放开对小微企业的驻所限制附件
	 * @return
	 */
	public String getLimitAtt() 
	{
		return this.limitAtt;
	}
	public void setIsOnlineAtt(String isOnlineAtt) 
	{
		this.isOnlineAtt = isOnlineAtt;
	}
	/**
	 * 返回 本地区企业开办涉及部门可以实现互联网在线附件
	 * @return
	 */
	public String getIsOnlineAtt() 
	{
		return this.isOnlineAtt;
	}
	public void setOpenGuideRemark(String openGuideRemark) 
	{
		this.openGuideRemark = openGuideRemark;
	}
	/**
	 * 返回 企业开办办事指南备注
	 * @return
	 */
	public String getOpenGuideRemark() 
	{
		return this.openGuideRemark;
	}
	public void setHallOfficalRemark(String hallOfficalRemark) 
	{
		this.hallOfficalRemark = hallOfficalRemark;
	}
	/**
	 * 返回 政务大厅领取公章备注
	 * @return
	 */
	public String getHallOfficalRemark() 
	{
		return this.hallOfficalRemark;
	}
	public void setOpenSpeedRemark(String openSpeedRemark) 
	{
		this.openSpeedRemark = openSpeedRemark;
	}
	/**
	 * 返回 公示企业开办业务办理进度备注
	 * @return
	 */
	public String getOpenSpeedRemark() 
	{
		return this.openSpeedRemark;
	}
	public void setBankOrderRemark(String bankOrderRemark) 
	{
		this.bankOrderRemark = bankOrderRemark;
	}
	/**
	 * 返回 实现银行预约开户备注
	 * @return
	 */
	public String getBankOrderRemark() 
	{
		return this.bankOrderRemark;
	}
	public void setEleLicenseRemark(String eleLicenseRemark) 
	{
		this.eleLicenseRemark = eleLicenseRemark;
	}
	/**
	 * 返回 推广并鼓励使用电子营业执照备注
	 * @return
	 */
	public String getEleLicenseRemark() 
	{
		return this.eleLicenseRemark;
	}
	public void setExpressSerRemark(String expressSerRemark) 
	{
		this.expressSerRemark = expressSerRemark;
	}
	/**
	 * 返回 提供证照的快递服务备注
	 * @return
	 */
	public String getExpressSerRemark() 
	{
		return this.expressSerRemark;
	}
	public void setEleOfficalRemark(String eleOfficalRemark) 
	{
		this.eleOfficalRemark = eleOfficalRemark;
	}
	/**
	 * 返回 认可电子签章备注
	 * @return
	 */
	public String getEleOfficalRemark() 
	{
		return this.eleOfficalRemark;
	}
	public void setOneAllRemark(String oneAllRemark) 
	{
		this.oneAllRemark = oneAllRemark;
	}
	/**
	 * 返回 纳入一件事一次办备注
	 * @return
	 */
	public String getOneAllRemark() 
	{
		return this.oneAllRemark;
	}
	public void setOnlineRemark(String onlineRemark) 
	{
		this.onlineRemark = onlineRemark;
	}
	/**
	 * 返回 企业开办涉及哪些部门可以实现互联网在线办理备注
	 * @return
	 */
	public String getOnlineRemark() 
	{
		return this.onlineRemark;
	}
	public void setDataPushRemark(String dataPushRemark) 
	{
		this.dataPushRemark = dataPushRemark;
	}
	/**
	 * 返回 实现时时数据推送备注
	 * @return
	 */
	public String getDataPushRemark() 
	{
		return this.dataPushRemark;
	}
	public void setOneCheckRemark(String oneCheckRemark) 
	{
		this.oneCheckRemark = oneCheckRemark;
	}
	/**
	 * 返回 推行开办企业全流程综合受理审批备注
	 * @return
	 */
	public String getOneCheckRemark() 
	{
		return this.oneCheckRemark;
	}
	public void setIsLimitRemark(String isLimitRemark) 
	{
		this.isLimitRemark = isLimitRemark;
	}
	/**
	 * 返回 放开对小微企业的驻所限制备注
	 * @return
	 */
	public String getIsLimitRemark() 
	{
		return this.isLimitRemark;
	}
	public void setFinishCountAtt(String finishCountAtt) 
	{
		this.finishCountAtt = finishCountAtt;
	}
	/**
	 * 返回 通过线上系统完成新设企业的数量附件
	 * @return
	 */
	public String getFinishCountAtt() 
	{
		return this.finishCountAtt;
	}
	public void setFinishCountRemark(String finishCountRemark) 
	{
		this.finishCountRemark = finishCountRemark;
	}
	/**
	 * 返回 通过线上系统完成新设企业的数量备注
	 * @return
	 */
	public String getFinishCountRemark() 
	{
		return this.finishCountRemark;
	}
	public void setQyPercentRemark(String qyPercentRemark) 
	{
		this.qyPercentRemark = qyPercentRemark;
	}
	/**
	 * 返回 通过线上系统完成新设企业的数量占所有新设企业数量的比例备注
	 * @return
	 */
	public String getQyPercentRemark() 
	{
		return this.qyPercentRemark;
	}
	public void setQyPercentAtt(String qyPercentAtt) 
	{
		this.qyPercentAtt = qyPercentAtt;
	}
	/**
	 * 返回 通过线上系统完成新设企业的数量占所有新设企业数量的比例附件
	 * @return
	 */
	public String getQyPercentAtt() 
	{
		return this.qyPercentAtt;
	}
	public void setIsOnlineOther(String isOnlineOther) 
	{
		this.isOnlineOther = isOnlineOther;
	}
	/**
	 * 返回 本地区企业开办涉及哪些部门可以实现互联网在线办理
	 * @return
	 */
	public String getIsOnlineOther() 
	{
		return this.isOnlineOther;
	}
	public void setLocalOnlineOther(String localOnlineOther) 
	{
		this.localOnlineOther = localOnlineOther;
	}
	/**
	 * 返回 本地企业开办部门互联网其他
	 * @return
	 */
	public String getLocalOnlineOther() 
	{
		return this.localOnlineOther;
	}
	
}