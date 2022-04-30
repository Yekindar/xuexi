package com.lc.ibps.project.enterprisesurvey.persistence.entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.lc.ibps.base.core.util.JacksonUtil;
import io.swagger.annotations.ApiModel;

/**
 * t_enterprisesurvey 实体对象
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
public class EnterprisesurveyPo extends EnterprisesurveyTbl{
	private boolean delBeforeSave = true;
	public boolean isDelBeforeSave() {
		return delBeforeSave;
	}
	public void setDelBeforeSave(boolean delBeforeSave) {
		this.delBeforeSave = delBeforeSave;
	}
	private List<OperateprocessPo> operateprocess = new ArrayList<OperateprocessPo>();

	public List<OperateprocessPo> getOperateprocess() {
		return operateprocess;
	}

	public void setOperateprocess(List<OperateprocessPo> operateprocess) {
		this.operateprocess = operateprocess;
	}


	//private List<OperateprocessPo> operateprocessPoList = new ArrayList<OperateprocessPo>();
	/*public List<OperateprocessPo> getOperateprocessPoList() {
		return operateprocessPoList;
	}
	public void setOperateprocessPoList(List<OperateprocessPo> operateprocessPoList) {
		this.operateprocessPoList = operateprocessPoList;
	}*/

	public static EnterprisesurveyPo fromJsonString(String data){
		if(JacksonUtil.isNotJsonObject(data)){
			return null;
		}
		return JacksonUtil.getDTO(data, EnterprisesurveyPo.class);
	}
	
	public static List<EnterprisesurveyPo> fromJsonArrayString(String listData){
		if(JacksonUtil.isNotJsonArray(listData)){
			return Collections.emptyList();
		}
		return JacksonUtil.getDTOList(listData, EnterprisesurveyPo.class);
	}
}