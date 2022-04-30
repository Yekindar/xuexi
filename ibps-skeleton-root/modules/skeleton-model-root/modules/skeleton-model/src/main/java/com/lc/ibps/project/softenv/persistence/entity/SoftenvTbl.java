package com.lc.ibps.project.softenv.persistence.entity;

import com.lc.ibps.base.framework.persistence.entity.AbstractPo;

import java.util.Date;

/**
 * 政务服务软环境 表对象
 * 
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-08 16:43:21
 *</pre>
 */
 @SuppressWarnings("serial")
public class SoftenvTbl extends AbstractPo<String>{
	protected String  id; 		/*主键*/
	protected String  dependency; 		/*开发区、县（市）区*/
	protected String  headDp; 		/*牵头部门*/
	protected String  person; 		/*联 系 人*/
	protected String  cooperateDp; 		/*配合部门*/
	protected String  businessRoom; 		/*业务科室*/
	protected String  phone; 		/*联系电话*/
	@com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd")
	protected Date  fillDate; 		/*填表时间*/
	protected String  serLocalItems; 		/*本地区审批服务事项总数(行政权力事项数)*/
	protected String  serLocalPbItems; 		/*本地区审批服务事项总数(公共服务事项数)*/
	protected String  serRegimeItems; 		/*网上可办事项数(行政权力事项数)*/
	protected String  serPbItems; 		/*网上可办程度(公共服务事项数)*/
	protected String  serOlDegree; 		/*网上可办程度*/
	protected String  serOlAllRgIts; 		/*实现一网通办事项总数(行政权力事项数)*/
	protected String  serOlAllPbIts; 		/*实现一网通办事项总数(公共服务事项数)*/
	protected String  serOlAlDeg; 		/*一网通办程度*/
	protected String  serIsAppCheck; 		/*是否实现本区掌上审批小程序进行政务事项审批*/
	protected String  serIsScCk; 		/*是否设立政务服务秒批事项*/
	protected String  serIsScList; 		/*是否发布政务服务秒批办理事项清单*/
	protected String  serIsShortPm; 		/*是否通过互联网等新闻媒体方式推广最简告知承诺审批事项、窗口即时办结等事项*/
	protected String  serIsIpShPm; 		/*是否在城市排水许可、出版物批发单位设立、文艺表演团设立等领域实行最简告知承诺审批*/
	protected String  conIsOneWin; 		/*一窗受理*/
	protected String  conIsWinAcy; 		/*窗口设置准确性*/
	protected String  conIsHpSer; 		/*本地区政务服务中心是否提供帮办服务*/
	protected String  conIsGuide; 		/*本地区政务服务中心服务部门是否设置绿色通道的宣传、指引*/
	protected String  conIsThSer; 		/*是否有中介等第三方服务*/
	protected String  conIsSelfPsn; 		/*现场是否设置自助服务专区是否配备辅导咨询人员*/
	protected String  conIsOrder; 		/*大厅办理事项是否有完善并有效的预约功能*/
	protected String  conIsGuideSer; 		/*本地区政务服务实体中心是否提供分类导引服务*/
	protected String  conIsCoachPsn; 		/*本地区政务服务中心是否设置综合辅导服务人员*/
	protected String  conIsPsnEgh; 		/*本地区政务服务中心现场的各类型咨询辅导人员是否充裕*/
	protected String  ocRushCount; 		/*公布最多跑一次事项的数量*/
	protected String  ocPercent; 		/*公布最多跑一次事项数量占政务服务事项数量的比例*/
	protected String  ocIsOnePlan; 		/*是否出台关于建设最多跑一次规划或规定*/
	protected String  ocIsOneList; 		/*是否公开最多跑一次事项清单*/
	protected String  ocIsOnDiff; 		/*公开最多跑一次事项清单是否与政务网一致*/
	protected String  ocIsModelHall; 		/*最多跑一次事项的公开方式(是否政务服务大厅)*/
	protected String  ocIsModelNet; 		/*最多跑一次事项的公开方式(是否政务服务网)*/
	protected String  ocIsOpenOne; 		/*企业开办是否能实现最多跑一次*/
	protected String  ocIsLogoutOne; 		/*企业注销是否能实现最多跑一次*/
	protected String  ocIsRegister; 		/*不动产登记是否能实现最多跑一次*/
	protected String  ocIsTjOne; 		/*天津港保税区进出口通关业务是否能实现最多跑一次*/
	protected String  acyIsWin; 		/*大厅窗口指示是否准确标准*/
	protected String  acyIsAptWin; 		/*是否有综合受理窗*/
	protected String  acyIsAskWin; 		/*是否有综合咨询窗*/
	protected String  acyIsOutWin; 		/*是否有综合出件窗*/
	protected String  acyIsWinEnough; 		/*办事窗口是否充裕*/
	protected String  acyIsExpress; 		/*窗口服务区是否提供收件、发件等快递服务*/
	protected String  acyIsGreenCl_; 		/*服务窗口是否设定绿色通道*/
	protected String  acyIsFrontBack; 		/*办事窗口是否实现前台受理后台集成服务设立商事登记投资项目、人力社保等综合受理窗口*/
	protected String  speIsCtg; 		/*工作人员着装是否规范*/
	protected String  speIsAtd; 		/*工作人员态度*/
	protected String  speIsSameAn; 		/*不同工作人员提供的咨询回复是否一致*/
	protected String  speIsSamePoy; 		/*工作人员提供的咨询回复与政策规定是否完全一致*/
	protected String  speIsSameGud; 		/*办事指南等是否与办事人员答复一致*/
	protected String  cpnIsComplain; 		/*政务大厅是否设置投诉或者意见反馈渠道*/
	protected String  cpnIsCpEffect; 		/*政务大厅投诉是否能有效落实*/
	protected String  satIsCsltCon; 		/*大厅总咨询台，该咨询渠道是否便捷*/
	protected String  satIschlCon; 		/*各部门咨询台/窗口，该咨询渠道是否便捷*/
	protected String  satIsVolCon; 		/*志愿者，该咨询渠道是否便捷*/
	protected String  satIsCoaPsn; 		/*是否设置综合咨询辅导服务人员*/
	protected String  satIsAkSer; 		/*窗口服务区是否提供业务咨询等服务*/
	protected String  satIsAcy; 		/*办理事项准确性如何*/
	protected String  satIsNoPsn; 		/*现场公布的咨询电话是否无人接听或者长期占线*/
	protected String  ordIsOrderSer; 		/*大厅是否有提供预约服务的事项*/
	protected String  ordIsOlSer; 		/*大厅办理事项预约渠道是否网上政府服务平台*/
	protected String  ordIsAppSer; 		/*大厅办理事项预约渠道政务APP天津税务公众号可以预约线下服务*/
	protected String  ordIsHallSer; 		/*大厅办理事项预约渠道电话预约政务大厅办*/
	protected String  ordIsSceSer; 		/*大厅办理事项预约渠道现场*/
	protected String  ordIsHallWa; 		/*大厅提供预约服务事项是否落实*/
	protected String  ordIsTakeState; 		/*网上预约取号功能是否完善*/
	protected String  staIsHallSign; 		/*大厅各类服务标识是否准确标准*/
	protected String  staIsSignDeg; 		/*窗口标识是否规范标准*/
	protected String  staIsClear; 		/*服务引导标识是否清晰显著*/
	protected String  staIsWhole; 		/*服务引导标识是否完备*/
	protected String  effIsHallpub; 		/*大厅公布各类权力清单和责任清单是否准确标准*/
	protected String  effIsUnanimous; 		/*办事指南是否与实际与须提交资料一致*/
	protected String  effIsFlowGuide; 		/*是否制定政务服务事项标准化工作流程规程和办事指南*/
	protected String  effIsNoMoreTo; 		/*行政许可事项承诺办理时限是否不超过3个工作日平均实际办结时限是否不超过2个工作日*/
	protected String  effIsPubNet; 		/*该大厅中心通过以下哪些渠道对相关业务信息和政策进行宣传(政府网站)*/
	protected String  effIsPubApp; 		/*该大厅/中心通过以下哪些渠道对相关业务信息和政策进行宣传(APP)*/
	protected String  effIsPubStuff; 		/*该大厅/中心通过以下哪些渠道对相关业务信息和政策进行宣传(现场获取纸质材料)*/
	protected String  effIsPubCst; 		/*该大厅/中心通过以下哪些渠道对相关业务信息和政策进行宣传(现场咨询工作人员)*/
	protected String  serResult; 		/*网上政务服务能力*/
	protected String  conResult; 		/*政务服务事项便利度*/
	protected String  ocResult; 		/*最多跑一次*/
	protected String  acyResult; 		/*窗口设置准确性*/
	protected String  speResult; 		/*办事人员专业程度*/
	protected String  cpnResult; 		/*投诉渠道有效落实*/
	protected String  satResult; 		/*咨询服务满意度*/
	protected String  ordResult; 		/*预约服务及落实情况*/
	protected String  staResult; 		/*标准化程度*/
	protected String  effResult; 		/*宣传有效性*/
	protected String  quotaResult_; 		/*指标计算结果*/
	protected String  organizationId; 		/*组织ID*/
	protected String  year; 		/*年份*/
	protected String  quotaId; 		/*指标ID*/

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
	public void setPerson(String person) 
	{
		this.person = person;
	}
	/**
	 * 返回 联 系 人
	 * @return
	 */
	public String getPerson() 
	{
		return this.person;
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
	public void setSerLocalItems(String serLocalItems) 
	{
		this.serLocalItems = serLocalItems;
	}
	/**
	 * 返回 本地区审批服务事项总数(行政权力事项数)
	 * @return
	 */
	public String getSerLocalItems() 
	{
		return this.serLocalItems;
	}
	public void setSerLocalPbItems(String serLocalPbItems) 
	{
		this.serLocalPbItems = serLocalPbItems;
	}
	/**
	 * 返回 本地区审批服务事项总数(公共服务事项数)
	 * @return
	 */
	public String getSerLocalPbItems() 
	{
		return this.serLocalPbItems;
	}
	public void setSerRegimeItems(String serRegimeItems) 
	{
		this.serRegimeItems = serRegimeItems;
	}
	/**
	 * 返回 网上可办事项数(行政权力事项数)
	 * @return
	 */
	public String getSerRegimeItems() 
	{
		return this.serRegimeItems;
	}
	public void setSerPbItems(String serPbItems) 
	{
		this.serPbItems = serPbItems;
	}
	/**
	 * 返回 网上可办程度(公共服务事项数)
	 * @return
	 */
	public String getSerPbItems() 
	{
		return this.serPbItems;
	}
	public void setSerOlDegree(String serOlDegree) 
	{
		this.serOlDegree = serOlDegree;
	}
	/**
	 * 返回 网上可办程度
	 * @return
	 */
	public String getSerOlDegree() 
	{
		return this.serOlDegree;
	}
	public void setSerOlAllRgIts(String serOlAllRgIts) 
	{
		this.serOlAllRgIts = serOlAllRgIts;
	}
	/**
	 * 返回 实现一网通办事项总数(行政权力事项数)
	 * @return
	 */
	public String getSerOlAllRgIts() 
	{
		return this.serOlAllRgIts;
	}
	public void setSerOlAllPbIts(String serOlAllPbIts) 
	{
		this.serOlAllPbIts = serOlAllPbIts;
	}
	/**
	 * 返回 实现一网通办事项总数(公共服务事项数)
	 * @return
	 */
	public String getSerOlAllPbIts() 
	{
		return this.serOlAllPbIts;
	}
	public void setSerOlAlDeg(String serOlAlDeg) 
	{
		this.serOlAlDeg = serOlAlDeg;
	}
	/**
	 * 返回 一网通办程度
	 * @return
	 */
	public String getSerOlAlDeg() 
	{
		return this.serOlAlDeg;
	}
	public void setSerIsAppCheck(String serIsAppCheck) 
	{
		this.serIsAppCheck = serIsAppCheck;
	}
	/**
	 * 返回 是否实现本区掌上审批小程序进行政务事项审批
	 * @return
	 */
	public String getSerIsAppCheck() 
	{
		return this.serIsAppCheck;
	}
	public void setSerIsScCk(String serIsScCk) 
	{
		this.serIsScCk = serIsScCk;
	}
	/**
	 * 返回 是否设立政务服务秒批事项
	 * @return
	 */
	public String getSerIsScCk() 
	{
		return this.serIsScCk;
	}
	public void setSerIsScList(String serIsScList) 
	{
		this.serIsScList = serIsScList;
	}
	/**
	 * 返回 是否发布政务服务秒批办理事项清单
	 * @return
	 */
	public String getSerIsScList() 
	{
		return this.serIsScList;
	}
	public void setSerIsShortPm(String serIsShortPm) 
	{
		this.serIsShortPm = serIsShortPm;
	}
	/**
	 * 返回 是否通过互联网等新闻媒体方式推广最简告知承诺审批事项、窗口即时办结等事项
	 * @return
	 */
	public String getSerIsShortPm() 
	{
		return this.serIsShortPm;
	}
	public void setSerIsIpShPm(String serIsIpShPm) 
	{
		this.serIsIpShPm = serIsIpShPm;
	}
	/**
	 * 返回 是否在城市排水许可、出版物批发单位设立、文艺表演团设立等领域实行最简告知承诺审批
	 * @return
	 */
	public String getSerIsIpShPm() 
	{
		return this.serIsIpShPm;
	}
	public void setConIsOneWin(String conIsOneWin) 
	{
		this.conIsOneWin = conIsOneWin;
	}
	/**
	 * 返回 一窗受理
	 * @return
	 */
	public String getConIsOneWin() 
	{
		return this.conIsOneWin;
	}
	public void setConIsWinAcy(String conIsWinAcy) 
	{
		this.conIsWinAcy = conIsWinAcy;
	}
	/**
	 * 返回 窗口设置准确性
	 * @return
	 */
	public String getConIsWinAcy() 
	{
		return this.conIsWinAcy;
	}
	public void setConIsHpSer(String conIsHpSer) 
	{
		this.conIsHpSer = conIsHpSer;
	}
	/**
	 * 返回 本地区政务服务中心是否提供帮办服务
	 * @return
	 */
	public String getConIsHpSer() 
	{
		return this.conIsHpSer;
	}
	public void setConIsGuide(String conIsGuide) 
	{
		this.conIsGuide = conIsGuide;
	}
	/**
	 * 返回 本地区政务服务中心服务部门是否设置绿色通道的宣传、指引
	 * @return
	 */
	public String getConIsGuide() 
	{
		return this.conIsGuide;
	}
	public void setConIsThSer(String conIsThSer) 
	{
		this.conIsThSer = conIsThSer;
	}
	/**
	 * 返回 是否有中介等第三方服务
	 * @return
	 */
	public String getConIsThSer() 
	{
		return this.conIsThSer;
	}
	public void setConIsSelfPsn(String conIsSelfPsn) 
	{
		this.conIsSelfPsn = conIsSelfPsn;
	}
	/**
	 * 返回 现场是否设置自助服务专区是否配备辅导咨询人员
	 * @return
	 */
	public String getConIsSelfPsn() 
	{
		return this.conIsSelfPsn;
	}
	public void setConIsOrder(String conIsOrder) 
	{
		this.conIsOrder = conIsOrder;
	}
	/**
	 * 返回 大厅办理事项是否有完善并有效的预约功能
	 * @return
	 */
	public String getConIsOrder() 
	{
		return this.conIsOrder;
	}
	public void setConIsGuideSer(String conIsGuideSer) 
	{
		this.conIsGuideSer = conIsGuideSer;
	}
	/**
	 * 返回 本地区政务服务实体中心是否提供分类导引服务
	 * @return
	 */
	public String getConIsGuideSer() 
	{
		return this.conIsGuideSer;
	}
	public void setConIsCoachPsn(String conIsCoachPsn) 
	{
		this.conIsCoachPsn = conIsCoachPsn;
	}
	/**
	 * 返回 本地区政务服务中心是否设置综合辅导服务人员
	 * @return
	 */
	public String getConIsCoachPsn() 
	{
		return this.conIsCoachPsn;
	}
	public void setConIsPsnEgh(String conIsPsnEgh) 
	{
		this.conIsPsnEgh = conIsPsnEgh;
	}
	/**
	 * 返回 本地区政务服务中心现场的各类型咨询辅导人员是否充裕
	 * @return
	 */
	public String getConIsPsnEgh() 
	{
		return this.conIsPsnEgh;
	}
	public void setOcRushCount(String ocRushCount) 
	{
		this.ocRushCount = ocRushCount;
	}
	/**
	 * 返回 公布最多跑一次事项的数量
	 * @return
	 */
	public String getOcRushCount() 
	{
		return this.ocRushCount;
	}
	public void setOcPercent(String ocPercent) 
	{
		this.ocPercent = ocPercent;
	}
	/**
	 * 返回 公布最多跑一次事项数量占政务服务事项数量的比例
	 * @return
	 */
	public String getOcPercent() 
	{
		return this.ocPercent;
	}
	public void setOcIsOnePlan(String ocIsOnePlan) 
	{
		this.ocIsOnePlan = ocIsOnePlan;
	}
	/**
	 * 返回 是否出台关于建设最多跑一次规划或规定
	 * @return
	 */
	public String getOcIsOnePlan() 
	{
		return this.ocIsOnePlan;
	}
	public void setOcIsOneList(String ocIsOneList) 
	{
		this.ocIsOneList = ocIsOneList;
	}
	/**
	 * 返回 是否公开最多跑一次事项清单
	 * @return
	 */
	public String getOcIsOneList() 
	{
		return this.ocIsOneList;
	}
	public void setOcIsOnDiff(String ocIsOnDiff) 
	{
		this.ocIsOnDiff = ocIsOnDiff;
	}
	/**
	 * 返回 公开最多跑一次事项清单是否与政务网一致
	 * @return
	 */
	public String getOcIsOnDiff() 
	{
		return this.ocIsOnDiff;
	}
	public void setOcIsModelHall(String ocIsModelHall) 
	{
		this.ocIsModelHall = ocIsModelHall;
	}
	/**
	 * 返回 最多跑一次事项的公开方式(是否政务服务大厅)
	 * @return
	 */
	public String getOcIsModelHall() 
	{
		return this.ocIsModelHall;
	}
	public void setOcIsModelNet(String ocIsModelNet) 
	{
		this.ocIsModelNet = ocIsModelNet;
	}
	/**
	 * 返回 最多跑一次事项的公开方式(是否政务服务网)
	 * @return
	 */
	public String getOcIsModelNet() 
	{
		return this.ocIsModelNet;
	}
	public void setOcIsOpenOne(String ocIsOpenOne) 
	{
		this.ocIsOpenOne = ocIsOpenOne;
	}
	/**
	 * 返回 企业开办是否能实现最多跑一次
	 * @return
	 */
	public String getOcIsOpenOne() 
	{
		return this.ocIsOpenOne;
	}
	public void setOcIsLogoutOne(String ocIsLogoutOne) 
	{
		this.ocIsLogoutOne = ocIsLogoutOne;
	}
	/**
	 * 返回 企业注销是否能实现最多跑一次
	 * @return
	 */
	public String getOcIsLogoutOne() 
	{
		return this.ocIsLogoutOne;
	}
	public void setOcIsRegister(String ocIsRegister) 
	{
		this.ocIsRegister = ocIsRegister;
	}
	/**
	 * 返回 不动产登记是否能实现最多跑一次
	 * @return
	 */
	public String getOcIsRegister() 
	{
		return this.ocIsRegister;
	}
	public void setOcIsTjOne(String ocIsTjOne) 
	{
		this.ocIsTjOne = ocIsTjOne;
	}
	/**
	 * 返回 天津港保税区进出口通关业务是否能实现最多跑一次
	 * @return
	 */
	public String getOcIsTjOne() 
	{
		return this.ocIsTjOne;
	}
	public void setAcyIsWin(String acyIsWin) 
	{
		this.acyIsWin = acyIsWin;
	}
	/**
	 * 返回 大厅窗口指示是否准确标准
	 * @return
	 */
	public String getAcyIsWin() 
	{
		return this.acyIsWin;
	}
	public void setAcyIsAptWin(String acyIsAptWin) 
	{
		this.acyIsAptWin = acyIsAptWin;
	}
	/**
	 * 返回 是否有综合受理窗
	 * @return
	 */
	public String getAcyIsAptWin() 
	{
		return this.acyIsAptWin;
	}
	public void setAcyIsAskWin(String acyIsAskWin) 
	{
		this.acyIsAskWin = acyIsAskWin;
	}
	/**
	 * 返回 是否有综合咨询窗
	 * @return
	 */
	public String getAcyIsAskWin() 
	{
		return this.acyIsAskWin;
	}
	public void setAcyIsOutWin(String acyIsOutWin) 
	{
		this.acyIsOutWin = acyIsOutWin;
	}
	/**
	 * 返回 是否有综合出件窗
	 * @return
	 */
	public String getAcyIsOutWin() 
	{
		return this.acyIsOutWin;
	}
	public void setAcyIsWinEnough(String acyIsWinEnough) 
	{
		this.acyIsWinEnough = acyIsWinEnough;
	}
	/**
	 * 返回 办事窗口是否充裕
	 * @return
	 */
	public String getAcyIsWinEnough() 
	{
		return this.acyIsWinEnough;
	}
	public void setAcyIsExpress(String acyIsExpress) 
	{
		this.acyIsExpress = acyIsExpress;
	}
	/**
	 * 返回 窗口服务区是否提供收件、发件等快递服务
	 * @return
	 */
	public String getAcyIsExpress() 
	{
		return this.acyIsExpress;
	}
	public void setAcyIsGreenCl_(String acyIsGreenCl_) 
	{
		this.acyIsGreenCl_ = acyIsGreenCl_;
	}
	/**
	 * 返回 服务窗口是否设定绿色通道
	 * @return
	 */
	public String getAcyIsGreenCl_() 
	{
		return this.acyIsGreenCl_;
	}
	public void setAcyIsFrontBack(String acyIsFrontBack) 
	{
		this.acyIsFrontBack = acyIsFrontBack;
	}
	/**
	 * 返回 办事窗口是否实现前台受理后台集成服务设立商事登记投资项目、人力社保等综合受理窗口
	 * @return
	 */
	public String getAcyIsFrontBack() 
	{
		return this.acyIsFrontBack;
	}
	public void setSpeIsCtg(String speIsCtg) 
	{
		this.speIsCtg = speIsCtg;
	}
	/**
	 * 返回 工作人员着装是否规范
	 * @return
	 */
	public String getSpeIsCtg() 
	{
		return this.speIsCtg;
	}
	public void setSpeIsAtd(String speIsAtd) 
	{
		this.speIsAtd = speIsAtd;
	}
	/**
	 * 返回 工作人员态度
	 * @return
	 */
	public String getSpeIsAtd() 
	{
		return this.speIsAtd;
	}
	public void setSpeIsSameAn(String speIsSameAn) 
	{
		this.speIsSameAn = speIsSameAn;
	}
	/**
	 * 返回 不同工作人员提供的咨询回复是否一致
	 * @return
	 */
	public String getSpeIsSameAn() 
	{
		return this.speIsSameAn;
	}
	public void setSpeIsSamePoy(String speIsSamePoy) 
	{
		this.speIsSamePoy = speIsSamePoy;
	}
	/**
	 * 返回 工作人员提供的咨询回复与政策规定是否完全一致
	 * @return
	 */
	public String getSpeIsSamePoy() 
	{
		return this.speIsSamePoy;
	}
	public void setSpeIsSameGud(String speIsSameGud) 
	{
		this.speIsSameGud = speIsSameGud;
	}
	/**
	 * 返回 办事指南等是否与办事人员答复一致
	 * @return
	 */
	public String getSpeIsSameGud() 
	{
		return this.speIsSameGud;
	}
	public void setCpnIsComplain(String cpnIsComplain) 
	{
		this.cpnIsComplain = cpnIsComplain;
	}
	/**
	 * 返回 政务大厅是否设置投诉或者意见反馈渠道
	 * @return
	 */
	public String getCpnIsComplain() 
	{
		return this.cpnIsComplain;
	}
	public void setCpnIsCpEffect(String cpnIsCpEffect) 
	{
		this.cpnIsCpEffect = cpnIsCpEffect;
	}
	/**
	 * 返回 政务大厅投诉是否能有效落实
	 * @return
	 */
	public String getCpnIsCpEffect() 
	{
		return this.cpnIsCpEffect;
	}
	public void setSatIsCsltCon(String satIsCsltCon) 
	{
		this.satIsCsltCon = satIsCsltCon;
	}
	/**
	 * 返回 大厅总咨询台，该咨询渠道是否便捷
	 * @return
	 */
	public String getSatIsCsltCon() 
	{
		return this.satIsCsltCon;
	}
	public void setSatIschlCon(String satIschlCon) 
	{
		this.satIschlCon = satIschlCon;
	}
	/**
	 * 返回 各部门咨询台/窗口，该咨询渠道是否便捷
	 * @return
	 */
	public String getSatIschlCon() 
	{
		return this.satIschlCon;
	}
	public void setSatIsVolCon(String satIsVolCon) 
	{
		this.satIsVolCon = satIsVolCon;
	}
	/**
	 * 返回 志愿者，该咨询渠道是否便捷
	 * @return
	 */
	public String getSatIsVolCon() 
	{
		return this.satIsVolCon;
	}
	public void setSatIsCoaPsn(String satIsCoaPsn) 
	{
		this.satIsCoaPsn = satIsCoaPsn;
	}
	/**
	 * 返回 是否设置综合咨询辅导服务人员
	 * @return
	 */
	public String getSatIsCoaPsn() 
	{
		return this.satIsCoaPsn;
	}
	public void setSatIsAkSer(String satIsAkSer) 
	{
		this.satIsAkSer = satIsAkSer;
	}
	/**
	 * 返回 窗口服务区是否提供业务咨询等服务
	 * @return
	 */
	public String getSatIsAkSer() 
	{
		return this.satIsAkSer;
	}
	public void setSatIsAcy(String satIsAcy) 
	{
		this.satIsAcy = satIsAcy;
	}
	/**
	 * 返回 办理事项准确性如何
	 * @return
	 */
	public String getSatIsAcy() 
	{
		return this.satIsAcy;
	}
	public void setSatIsNoPsn(String satIsNoPsn) 
	{
		this.satIsNoPsn = satIsNoPsn;
	}
	/**
	 * 返回 现场公布的咨询电话是否无人接听或者长期占线
	 * @return
	 */
	public String getSatIsNoPsn() 
	{
		return this.satIsNoPsn;
	}
	public void setOrdIsOrderSer(String ordIsOrderSer) 
	{
		this.ordIsOrderSer = ordIsOrderSer;
	}
	/**
	 * 返回 大厅是否有提供预约服务的事项
	 * @return
	 */
	public String getOrdIsOrderSer() 
	{
		return this.ordIsOrderSer;
	}
	public void setOrdIsOlSer(String ordIsOlSer) 
	{
		this.ordIsOlSer = ordIsOlSer;
	}
	/**
	 * 返回 大厅办理事项预约渠道是否网上政府服务平台
	 * @return
	 */
	public String getOrdIsOlSer() 
	{
		return this.ordIsOlSer;
	}
	public void setOrdIsAppSer(String ordIsAppSer) 
	{
		this.ordIsAppSer = ordIsAppSer;
	}
	/**
	 * 返回 大厅办理事项预约渠道政务APP天津税务公众号可以预约线下服务
	 * @return
	 */
	public String getOrdIsAppSer() 
	{
		return this.ordIsAppSer;
	}
	public void setOrdIsHallSer(String ordIsHallSer) 
	{
		this.ordIsHallSer = ordIsHallSer;
	}
	/**
	 * 返回 大厅办理事项预约渠道电话预约政务大厅办
	 * @return
	 */
	public String getOrdIsHallSer() 
	{
		return this.ordIsHallSer;
	}
	public void setOrdIsSceSer(String ordIsSceSer) 
	{
		this.ordIsSceSer = ordIsSceSer;
	}
	/**
	 * 返回 大厅办理事项预约渠道现场
	 * @return
	 */
	public String getOrdIsSceSer() 
	{
		return this.ordIsSceSer;
	}
	public void setOrdIsHallWa(String ordIsHallWa) 
	{
		this.ordIsHallWa = ordIsHallWa;
	}
	/**
	 * 返回 大厅提供预约服务事项是否落实
	 * @return
	 */
	public String getOrdIsHallWa() 
	{
		return this.ordIsHallWa;
	}
	public void setOrdIsTakeState(String ordIsTakeState) 
	{
		this.ordIsTakeState = ordIsTakeState;
	}
	/**
	 * 返回 网上预约取号功能是否完善
	 * @return
	 */
	public String getOrdIsTakeState() 
	{
		return this.ordIsTakeState;
	}
	public void setStaIsHallSign(String staIsHallSign) 
	{
		this.staIsHallSign = staIsHallSign;
	}
	/**
	 * 返回 大厅各类服务标识是否准确标准
	 * @return
	 */
	public String getStaIsHallSign() 
	{
		return this.staIsHallSign;
	}
	public void setStaIsSignDeg(String staIsSignDeg) 
	{
		this.staIsSignDeg = staIsSignDeg;
	}
	/**
	 * 返回 窗口标识是否规范标准
	 * @return
	 */
	public String getStaIsSignDeg() 
	{
		return this.staIsSignDeg;
	}
	public void setStaIsClear(String staIsClear) 
	{
		this.staIsClear = staIsClear;
	}
	/**
	 * 返回 服务引导标识是否清晰显著
	 * @return
	 */
	public String getStaIsClear() 
	{
		return this.staIsClear;
	}
	public void setStaIsWhole(String staIsWhole) 
	{
		this.staIsWhole = staIsWhole;
	}
	/**
	 * 返回 服务引导标识是否完备
	 * @return
	 */
	public String getStaIsWhole() 
	{
		return this.staIsWhole;
	}
	public void setEffIsHallpub(String effIsHallpub) 
	{
		this.effIsHallpub = effIsHallpub;
	}
	/**
	 * 返回 大厅公布各类权力清单和责任清单是否准确标准
	 * @return
	 */
	public String getEffIsHallpub() 
	{
		return this.effIsHallpub;
	}
	public void setEffIsUnanimous(String effIsUnanimous) 
	{
		this.effIsUnanimous = effIsUnanimous;
	}
	/**
	 * 返回 办事指南是否与实际与须提交资料一致
	 * @return
	 */
	public String getEffIsUnanimous() 
	{
		return this.effIsUnanimous;
	}
	public void setEffIsFlowGuide(String effIsFlowGuide) 
	{
		this.effIsFlowGuide = effIsFlowGuide;
	}
	/**
	 * 返回 是否制定政务服务事项标准化工作流程规程和办事指南
	 * @return
	 */
	public String getEffIsFlowGuide() 
	{
		return this.effIsFlowGuide;
	}
	public void setEffIsNoMoreTo(String effIsNoMoreTo) 
	{
		this.effIsNoMoreTo = effIsNoMoreTo;
	}
	/**
	 * 返回 行政许可事项承诺办理时限是否不超过3个工作日平均实际办结时限是否不超过2个工作日
	 * @return
	 */
	public String getEffIsNoMoreTo() 
	{
		return this.effIsNoMoreTo;
	}
	public void setEffIsPubNet(String effIsPubNet) 
	{
		this.effIsPubNet = effIsPubNet;
	}
	/**
	 * 返回 该大厅中心通过以下哪些渠道对相关业务信息和政策进行宣传(政府网站)
	 * @return
	 */
	public String getEffIsPubNet() 
	{
		return this.effIsPubNet;
	}
	public void setEffIsPubApp(String effIsPubApp) 
	{
		this.effIsPubApp = effIsPubApp;
	}
	/**
	 * 返回 该大厅/中心通过以下哪些渠道对相关业务信息和政策进行宣传(APP)
	 * @return
	 */
	public String getEffIsPubApp() 
	{
		return this.effIsPubApp;
	}
	public void setEffIsPubStuff(String effIsPubStuff) 
	{
		this.effIsPubStuff = effIsPubStuff;
	}
	/**
	 * 返回 该大厅/中心通过以下哪些渠道对相关业务信息和政策进行宣传(现场获取纸质材料)
	 * @return
	 */
	public String getEffIsPubStuff() 
	{
		return this.effIsPubStuff;
	}
	public void setEffIsPubCst(String effIsPubCst) 
	{
		this.effIsPubCst = effIsPubCst;
	}
	/**
	 * 返回 该大厅/中心通过以下哪些渠道对相关业务信息和政策进行宣传(现场咨询工作人员)
	 * @return
	 */
	public String getEffIsPubCst() 
	{
		return this.effIsPubCst;
	}
	public void setSerResult(String serResult) 
	{
		this.serResult = serResult;
	}
	/**
	 * 返回 网上政务服务能力
	 * @return
	 */
	public String getSerResult() 
	{
		return this.serResult;
	}
	public void setConResult(String conResult) 
	{
		this.conResult = conResult;
	}
	/**
	 * 返回 政务服务事项便利度
	 * @return
	 */
	public String getConResult() 
	{
		return this.conResult;
	}
	public void setOcResult(String ocResult) 
	{
		this.ocResult = ocResult;
	}
	/**
	 * 返回 最多跑一次
	 * @return
	 */
	public String getOcResult() 
	{
		return this.ocResult;
	}
	public void setAcyResult(String acyResult) 
	{
		this.acyResult = acyResult;
	}
	/**
	 * 返回 窗口设置准确性
	 * @return
	 */
	public String getAcyResult() 
	{
		return this.acyResult;
	}
	public void setSpeResult(String speResult) 
	{
		this.speResult = speResult;
	}
	/**
	 * 返回 办事人员专业程度
	 * @return
	 */
	public String getSpeResult() 
	{
		return this.speResult;
	}
	public void setCpnResult(String cpnResult) 
	{
		this.cpnResult = cpnResult;
	}
	/**
	 * 返回 投诉渠道有效落实
	 * @return
	 */
	public String getCpnResult() 
	{
		return this.cpnResult;
	}
	public void setSatResult(String satResult) 
	{
		this.satResult = satResult;
	}
	/**
	 * 返回 咨询服务满意度
	 * @return
	 */
	public String getSatResult() 
	{
		return this.satResult;
	}
	public void setOrdResult(String ordResult) 
	{
		this.ordResult = ordResult;
	}
	/**
	 * 返回 预约服务及落实情况
	 * @return
	 */
	public String getOrdResult() 
	{
		return this.ordResult;
	}
	public void setStaResult(String staResult) 
	{
		this.staResult = staResult;
	}
	/**
	 * 返回 标准化程度
	 * @return
	 */
	public String getStaResult() 
	{
		return this.staResult;
	}
	public void setEffResult(String effResult) 
	{
		this.effResult = effResult;
	}
	/**
	 * 返回 宣传有效性
	 * @return
	 */
	public String getEffResult() 
	{
		return this.effResult;
	}
	public void setQuotaResult_(String quotaResult_) 
	{
		this.quotaResult_ = quotaResult_;
	}
	/**
	 * 返回 指标计算结果
	 * @return
	 */
	public String getQuotaResult_() 
	{
		return this.quotaResult_;
	}
	public void setOrganizationId(String organizationId) 
	{
		this.organizationId = organizationId;
	}
	/**
	 * 返回 组织ID
	 * @return
	 */
	public String getOrganizationId() 
	{
		return this.organizationId;
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
	public void setQuotaId(String quotaId) 
	{
		this.quotaId = quotaId;
	}
	/**
	 * 返回 指标ID
	 * @return
	 */
	public String getQuotaId() 
	{
		return this.quotaId;
	}
	
}