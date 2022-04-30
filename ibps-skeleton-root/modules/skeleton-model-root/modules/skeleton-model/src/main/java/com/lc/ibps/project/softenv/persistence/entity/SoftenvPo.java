package com.lc.ibps.project.softenv.persistence.entity;

import com.lc.ibps.base.core.util.JacksonUtil;

import java.util.Collections;
import java.util.List;

/**
 * 政务服务软环境 实体对象
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-08 16:43:21
 *</pre>
 */
 @SuppressWarnings("serial")
public class SoftenvPo extends SoftenvTbl{

	public static SoftenvPo fromJsonString(String data){
		if(JacksonUtil.isNotJsonObject(data)){
			return null;
		}
		return JacksonUtil.getDTO(data, SoftenvPo.class);
	}
	
	public static List<SoftenvPo> fromJsonArrayString(String listData){
		if(JacksonUtil.isNotJsonArray(listData)){
			return Collections.emptyList();
		}
		return JacksonUtil.getDTOList(listData, SoftenvPo.class);
	}
}