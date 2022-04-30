package com.lc.ibps.project.openprocessresult.persistence.entity;

import java.util.Date;

import com.lc.ibps.base.framework.persistence.entity.AbstractPo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * t_qykbjsjg 表对象
 * 
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 15:53:58
 *</pre>
 */
@SuppressWarnings("serial")
@ApiModel(value = "t_qykbjsjg对象")
public class OpenProcessResultTbl extends AbstractPo<String>{
	@ApiModelProperty(value = "主键")
	protected String  id; 		/*主键*/
	@ApiModelProperty(value = "数据删除状态")
	protected String  deleted; 		/*数据删除状态*/
	@ApiModelProperty(value = "版本")
	protected Long  version; 		/*版本*/
	@ApiModelProperty(value = "企业开办流程")
	protected Long  openProcessCount; 		/*企业开办流程*/
	@ApiModelProperty(value = "企业开办流程(得分)")
	protected String  openProcessScore; 		/*企业开办流程(得分)*/
	@ApiModelProperty(value = "企业开办耗时")
	protected String  openDayCount; 		/*企业开办耗时*/
	@ApiModelProperty(value = "企业开办耗时(得分)")
	protected String  openDayScore; 		/*企业开办耗时(得分)*/
	@ApiModelProperty(value = "企业开办费用")
	protected String  openCost; 		/*企业开办费用*/
	@ApiModelProperty(value = "企业开办费用(得分)")
	protected String  openCostScore; 		/*企业开办费用(得分)*/
	@ApiModelProperty(value = "企业开办便利度")
	protected String  openConvenient; 		/*企业开办便利度*/
	@ApiModelProperty(value = "企业开办便利度(得分)")
	protected String  openCntScore; 		/*企业开办便利度(得分)*/
	@ApiModelProperty(value = "企业开办总得分")
	protected String  openResult; 		/*企业开办总得分*/
	@ApiModelProperty(value = "年份")
	protected String  year; 		/*年份*/
	@ApiModelProperty(value = "阶段")
	protected String  stage; 		/*阶段*/
	@ApiModelProperty(value = "单位")
	protected String  unite; 		/*单位*/
	@ApiModelProperty(value = "问卷ID")
	protected String  surveyId; 		/*问卷ID*/
	@ApiModelProperty(value = "排名")
	protected String  rank; 		/*排名*/

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
	public void setDeleted(String deleted) 
	{
		this.deleted = deleted;
	}
	/**
	 * 返回 数据删除状态
	 * @return
	 */
	public String getDeleted() 
	{
		return this.deleted;
	}
	public void setVersion(Long version) 
	{
		this.version = version;
	}
	/**
	 * 返回 版本
	 * @return
	 */
	public Long getVersion() 
	{
		return this.version;
	}
	public void setOpenProcessCount(Long openProcessCount) 
	{
		this.openProcessCount = openProcessCount;
	}
	/**
	 * 返回 企业开办流程
	 * @return
	 */
	public Long getOpenProcessCount() 
	{
		return this.openProcessCount;
	}
	public void setOpenProcessScore(String openProcessScore) 
	{
		this.openProcessScore = openProcessScore;
	}
	/**
	 * 返回 企业开办流程(得分)
	 * @return
	 */
	public String getOpenProcessScore() 
	{
		return this.openProcessScore;
	}
	public void setOpenDayCount(String openDayCount)
	{
		this.openDayCount = openDayCount;
	}
	/**
	 * 返回 企业开办耗时
	 * @return
	 */
	public String getOpenDayCount()
	{
		return this.openDayCount;
	}
	public void setOpenDayScore(String openDayScore) 
	{
		this.openDayScore = openDayScore;
	}
	/**
	 * 返回 企业开办耗时(得分)
	 * @return
	 */
	public String getOpenDayScore() 
	{
		return this.openDayScore;
	}
	public void setOpenCost(String openCost) 
	{
		this.openCost = openCost;
	}
	/**
	 * 返回 企业开办费用
	 * @return
	 */
	public String getOpenCost() 
	{
		return this.openCost;
	}
	public void setOpenCostScore(String openCostScore) 
	{
		this.openCostScore = openCostScore;
	}
	/**
	 * 返回 企业开办费用(得分)
	 * @return
	 */
	public String getOpenCostScore() 
	{
		return this.openCostScore;
	}
	public void setOpenConvenient(String openConvenient) 
	{
		this.openConvenient = openConvenient;
	}
	/**
	 * 返回 企业开办便利度
	 * @return
	 */
	public String getOpenConvenient() 
	{
		return this.openConvenient;
	}
	public void setOpenCntScore(String openCntScore) 
	{
		this.openCntScore = openCntScore;
	}
	/**
	 * 返回 企业开办便利度(得分)
	 * @return
	 */
	public String getOpenCntScore() 
	{
		return this.openCntScore;
	}
	public void setOpenResult(String openResult) 
	{
		this.openResult = openResult;
	}
	/**
	 * 返回 企业开办总得分
	 * @return
	 */
	public String getOpenResult() 
	{
		return this.openResult;
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
	public void setStage(String stage) 
	{
		this.stage = stage;
	}
	/**
	 * 返回 阶段
	 * @return
	 */
	public String getStage() 
	{
		return this.stage;
	}
	public void setUnite(String unite) 
	{
		this.unite = unite;
	}
	/**
	 * 返回 单位
	 * @return
	 */
	public String getUnite() 
	{
		return this.unite;
	}
	public void setSurveyId(String surveyId) 
	{
		this.surveyId = surveyId;
	}
	/**
	 * 返回 问卷ID
	 * @return
	 */
	public String getSurveyId() 
	{
		return this.surveyId;
	}
	public void setRank(String rank) 
	{
		this.rank = rank;
	}
	/**
	 * 返回 排名
	 * @return
	 */
	public String getRank() 
	{
		return this.rank;
	}
	
}