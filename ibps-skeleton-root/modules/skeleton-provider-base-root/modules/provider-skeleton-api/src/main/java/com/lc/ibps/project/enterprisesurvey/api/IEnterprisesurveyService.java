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
import com.lc.ibps.project.enterprisesurvey.persistence.entity.EnterprisesurveyPo;



/**
 * t_enterprisesurvey 接口
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:02
 *</pre>
 */
@Validated
@RequestMapping(value = "/enterprisesurvey")
@RestController
public interface IEnterprisesurveyService {

	/**
	 * 
	 * 【t_enterprisesurvey】列表(分页条件查询)数据
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/query", method = RequestMethod.POST)
	public APIResult<APIPageList<EnterprisesurveyPo>> query(
			@RequestBody(required = true) APIRequest request);
	
	/**
	 * 
	 * 根据id查询【t_enterprisesurvey】
	 *
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/get", method = { RequestMethod.GET })
	public APIResult<EnterprisesurveyPo> get(
//			@NotBlank(message = "{com.lc.ibps.project.provider.EnterprisesurveyProvider.id}") 
			@RequestParam(name = "id", required = true) String id);
	
	/**
	 * 
	 * 批量删除【t_enterprisesurvey】记录
	 *
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/remove", method = { RequestMethod.POST })
	public APIResult<Void> remove(
//			@NotEmpty(message = "{com.lc.ibps.project.provider.EnterprisesurveyProvider.ids}")
			@RequestParam(name = "ids", required = true) String[] ids);
	
	/**
	 * 
	 * 保存【t_enterprisesurvey】记录
	 *
	 * @param enterprisesurveyPo
	 * @return
	 */
	@RequestMapping(value = "/save", method = { RequestMethod.POST })
	public APIResult<Void> save(
//			@NotEmpty(message = "{com.lc.ibps.project.provider.EnterprisesurveyProvider.ids}")
			@RequestParam(name = "enterprisesurveyPo", required = true) EnterprisesurveyPo enterprisesurveyPo);


	/**
	 *
	 * 企业问卷计算【t_enterprisesurvey】记录
	 *
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/compute", method = { RequestMethod.POST })
	public APIResult<Void> compute(
//			@NotEmpty(message = "{com.lc.ibps.project.provider.EnterprisesurveyProvider.ids}")
			@RequestParam(name = "ids", required = true) String[] ids);
}