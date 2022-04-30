package com.lc.ibps.skeleton.sccs.persistence.entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import com.lc.ibps.base.core.util.JacksonUtil;
import io.swagger.annotations.ApiModel;

/**
 * t_sccs 实体对象
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-03-28 23:53:12
 *</pre>
 */
@ApiModel(value = "t_sccs对象")
public class SccsPo extends SccsTbl{
	private static final long serialVersionUID = 1L;

	public static SccsPo fromJsonString(String data){
		if(JacksonUtil.isNotJsonObject(data)){
			return null;
		}
		return JacksonUtil.getDTO(data, SccsPo.class);
	}
	
	public static List<SccsPo> fromJsonArrayString(String listData){
		if(JacksonUtil.isNotJsonArray(listData)){
			return Collections.emptyList();
		}
		return JacksonUtil.getDTOList(listData, SccsPo.class);
	}
}