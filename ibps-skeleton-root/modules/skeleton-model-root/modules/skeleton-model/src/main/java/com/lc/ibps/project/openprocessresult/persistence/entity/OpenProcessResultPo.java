package com.lc.ibps.project.openprocessresult.persistence.entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import com.lc.ibps.base.core.util.JacksonUtil;
import io.swagger.annotations.ApiModel;

/**
 * t_qykbjsjg 实体对象
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
public class OpenProcessResultPo extends OpenProcessResultTbl{

	public static OpenProcessResultPo fromJsonString(String data){
		if(JacksonUtil.isNotJsonObject(data)){
			return null;
		}
		return JacksonUtil.getDTO(data, OpenProcessResultPo.class);
	}
	
	public static List<OpenProcessResultPo> fromJsonArrayString(String listData){
		if(JacksonUtil.isNotJsonArray(listData)){
			return Collections.emptyList();
		}
		return JacksonUtil.getDTOList(listData, OpenProcessResultPo.class);
	}
}