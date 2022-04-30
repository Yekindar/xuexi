package com.lc.ibps.project.hardenv.persistence.entity;

import com.lc.ibps.base.core.util.JacksonUtil;

import java.util.Collections;
import java.util.List;

/**
 * 政务服务硬环境 实体对象
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-02 13:23:56
 *</pre>
 */
 @SuppressWarnings("serial")
public class HardenvPo extends HardenvTbl{

	public static HardenvPo fromJsonString(String data){
		if(JacksonUtil.isNotJsonObject(data)){
			return null;
		}
		return JacksonUtil.getDTO(data, HardenvPo.class);
	}
	
	public static List<HardenvPo> fromJsonArrayString(String listData){
		if(JacksonUtil.isNotJsonArray(listData)){
			return Collections.emptyList();
		}
		return JacksonUtil.getDTOList(listData, HardenvPo.class);
	}
}