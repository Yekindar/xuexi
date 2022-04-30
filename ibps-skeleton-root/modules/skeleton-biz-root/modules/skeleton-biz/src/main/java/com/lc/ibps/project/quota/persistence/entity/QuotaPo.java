package com.lc.ibps.project.quota.persistence.entity;

import com.lc.ibps.base.core.util.JacksonUtil;

import java.util.Collections;
import java.util.List;

/**
 * 指标信息 实体对象
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:40:59
 *</pre>
 */
 @SuppressWarnings("serial")
public class QuotaPo extends QuotaTbl{

	public static QuotaPo fromJsonString(String data){
		if(JacksonUtil.isNotJsonObject(data)){
			return null;
		}
		return JacksonUtil.getDTO(data, QuotaPo.class);
	}
	
	public static List<QuotaPo> fromJsonArrayString(String listData){
		if(JacksonUtil.isNotJsonArray(listData)){
			return Collections.emptyList();
		}
		return JacksonUtil.getDTOList(listData, QuotaPo.class);
	}
}