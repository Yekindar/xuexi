package com.lc.ibps.project.enterprisesurvey.persistence.entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import com.lc.ibps.base.core.util.JacksonUtil;
import io.swagger.annotations.ApiModel;

/**
 * t_operateprocess 实体对象
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
public class OperateprocessPo extends OperateprocessTbl{

	public static OperateprocessPo fromJsonString(String data){
		if(JacksonUtil.isNotJsonObject(data)){
			return null;
		}
		return JacksonUtil.getDTO(data, OperateprocessPo.class);
	}
	
	public static List<OperateprocessPo> fromJsonArrayString(String listData){
		if(JacksonUtil.isNotJsonArray(listData)){
			return Collections.emptyList();
		}
		return JacksonUtil.getDTOList(listData, OperateprocessPo.class);
	}
}