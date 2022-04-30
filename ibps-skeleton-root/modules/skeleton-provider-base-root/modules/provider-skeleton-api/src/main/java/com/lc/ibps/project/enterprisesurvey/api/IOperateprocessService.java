package com.lc.ibps.project.enterprisesurvey.api;

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
import com.lc.ibps.project.enterprisesurvey.persistence.entity.OperateprocessPo;



/**
 * t_operateprocess 接口
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:03
 *</pre>
 */
@Validated
@RequestMapping(value = "/operateprocess")
@RestController
public interface IOperateprocessService {

	/**
	 * 
	 * 【t_operateprocess】列表(分页条件查询)数据
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/query", method = RequestMethod.POST)
	public APIResult<APIPageList<OperateprocessPo>> query(
			@RequestBody(required = true) APIRequest request);
	
	/**
	 * 
	 * 根据id查询【t_operateprocess】
	 *
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/get", method = { RequestMethod.GET })
	public APIResult<OperateprocessPo> get(
//			@NotBlank(message = "{com.lc.ibps.project.provider.OperateprocessProvider.id}") 
			@RequestParam(name = "id", required = true) String id);
	
	/**
	 * 
	 * 批量删除【t_operateprocess】记录
	 *
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/remove", method = { RequestMethod.POST })
	public APIResult<Void> remove(
//			@NotEmpty(message = "{com.lc.ibps.project.provider.OperateprocessProvider.ids}")
			@RequestParam(name = "ids", required = true) String[] ids);
	
	/**
	 * 
	 * 保存【t_operateprocess】记录
	 *
	 * @param operateprocessPo
	 * @return
	 */
	@RequestMapping(value = "/save", method = { RequestMethod.POST })
	public APIResult<Void> save(
//			@NotEmpty(message = "{com.lc.ibps.project.provider.OperateprocessProvider.ids}")
			@RequestParam(name = "operateprocessPo", required = true) OperateprocessPo operateprocessPo);
}