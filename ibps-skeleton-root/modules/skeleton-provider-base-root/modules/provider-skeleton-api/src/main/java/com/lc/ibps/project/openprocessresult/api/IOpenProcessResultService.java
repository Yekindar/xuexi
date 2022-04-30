package com.lc.ibps.project.openprocessresult.api;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lc.ibps.cloud.entity.APIPageList;
import com.lc.ibps.cloud.entity.APIRequest;
import com.lc.ibps.cloud.entity.APIResult;
import com.lc.ibps.project.openprocessresult.persistence.entity.OpenProcessResultPo;



/**
 * t_qykbjsjg 接口
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 15:53:59
 *</pre>
 */
@Validated
@RequestMapping(value = "/openProcessResult")
@RestController
public interface IOpenProcessResultService {

	/**
	 * 
	 * 【t_qykbjsjg】列表(分页条件查询)数据
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/query", method = RequestMethod.POST)
	public APIResult<APIPageList<OpenProcessResultPo>> query(
			@RequestBody(required = true) APIRequest request);
	
	/**
	 * 
	 * 根据id查询【t_qykbjsjg】
	 *
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/get", method = { RequestMethod.GET })
	public APIResult<OpenProcessResultPo> get(
//			@NotBlank(message = "{com.lc.ibps.project.provider.OpenProcessResultProvider.id}") 
			@RequestParam(name = "id", required = true) String id);
	
	/**
	 * 
	 * 批量删除【t_qykbjsjg】记录
	 *
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/remove", method = { RequestMethod.POST })
	public APIResult<Void> remove(
//			@NotEmpty(message = "{com.lc.ibps.project.provider.OpenProcessResultProvider.ids}")
			@RequestParam(name = "ids", required = true) String[] ids);
	
	/**
	 * 
	 * 保存【t_qykbjsjg】记录
	 *
	 * @param openProcessResultPo
	 * @return
	 */
	@RequestMapping(value = "/save", method = { RequestMethod.POST })
	public APIResult<Void> save(
//			@NotEmpty(message = "{com.lc.ibps.project.provider.OpenProcessResultProvider.ids}")
			@RequestParam(name = "openProcessResultPo", required = true) OpenProcessResultPo openProcessResultPo);
}