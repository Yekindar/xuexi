package com.lc.ibps.project.enterprisesurvey.provider;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.lc.ibps.project.openprocessresult.domain.OpenProcessResult;
import com.lc.ibps.project.openprocessresult.persistence.entity.OpenProcessResultPo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.lc.ibps.api.base.constants.StateEnum;
import com.lc.ibps.api.base.query.QueryFilter;
import com.lc.ibps.base.core.constants.StringPool;
import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.cloud.entity.APIPageList;
import com.lc.ibps.cloud.entity.APIRequest;
import com.lc.ibps.cloud.entity.APIResult;
import com.lc.ibps.cloud.provider.GenericProvider;
import com.lc.ibps.project.enterprisesurvey.api.IEnterprisesurveyService;
import com.lc.ibps.project.enterprisesurvey.domain.Enterprisesurvey;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.EnterprisesurveyPo;
import com.lc.ibps.project.enterprisesurvey.repository.EnterprisesurveyRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExtensionProperty;

/**
 * t_enterprisesurvey 服务类
 * <pre>
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:02
 *</pre>
 */
@Api(tags = "t_enterprisesurvey管理", value = "t_enterprisesurvey数据")
@Service
public class EnterprisesurveyProvider extends GenericProvider implements IEnterprisesurveyService{

	@Resource
	private EnterprisesurveyRepository enterprisesurveyRepository;
	@Resource
	private Enterprisesurvey domain;
	@Resource
	private OpenProcessResult openProcessResult;

	@ApiOperation(value = "t_enterprisesurvey列表(分页条件查询)数据", notes = "t_enterprisesurvey列表(分页条件查询)数据")
	@Override
	public APIResult<APIPageList<EnterprisesurveyPo>> query(
			@ApiParam(name = "request", value = "传入查询请求json字符串", required = true) 
			@RequestBody(required = true) APIRequest request) {
		APIResult<APIPageList<EnterprisesurveyPo>> result = new APIResult<>();
		try {
			QueryFilter queryFilter = getQueryFilter(request);
			List<EnterprisesurveyPo> data = enterprisesurveyRepository.query(queryFilter);
			APIPageList<EnterprisesurveyPo> apiPageData = getAPIPageList(data);
			result.setData(apiPageData);
		} catch (Exception e) {
			// TODO ERROR => other error message
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}

	@ApiOperation(value = "根据id查询t_enterprisesurvey", notes = "根据id查询t_enterprisesurvey")
	@Override
	public APIResult<EnterprisesurveyPo> get(
			@ApiParam(name = "id", value = "查询id", required = true) 
			@RequestParam(name = "id", required = true) String id) {
		APIResult<EnterprisesurveyPo> result = new APIResult<>();
		try {
			EnterprisesurveyPo enterprisesurveyPo = enterprisesurveyRepository.loadCascade(id);
			result.setData(enterprisesurveyPo);
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}
	
	@ApiOperation(value = "保存", notes = "保存t_enterprisesurvey信息", 
			extensions = {
					@Extension(properties = {
							@ExtensionProperty(name = "submitCtrl", value = StringPool.Y)
					})
			})
	@Override
	public APIResult<Void> save(
			@ApiParam(name = "enterprisesurveyPo", value = "t_enterprisesurvey对象", required = true)  
			@RequestBody(required = true) EnterprisesurveyPo enterprisesurveyPo) {
		APIResult<Void> result = new APIResult<Void>();
		try {
			logger.info(" com.lc.ibps.project.provider.EnterprisesurveyProvider.save()--->enterprisesurveyPo: {}", enterprisesurveyPo.toString());
			domain.saveCascade(enterprisesurveyPo);
			result.setMessage("保存t_enterprisesurvey成功");
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}

	@ApiOperation(value = "删除", notes = "删除t_enterprisesurvey", 
			extensions = {
					@Extension(properties = {
							@ExtensionProperty(name = "submitCtrl", value = StringPool.Y)
					})
			})
	@Override
	public APIResult<Void> remove(
			@ApiParam(name = "ids", value = "t_enterprisesurveyID数组", required = true)  
			@RequestParam(name = "ids", required = true) String[] ids) {
		APIResult<Void> result = new APIResult<Void>();
		try {
			domain.deleteByIdsCascade(ids);
			result.setMessage("删除t_enterprisesurvey成功");
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}

	@ApiOperation(value = "企业问卷计算", notes = "计算t_enterprisesurvey",
			extensions = {
					@Extension(properties = {
							@ExtensionProperty(name = "submitCtrl", value = StringPool.Y)
					})
			})
	@Override
	public APIResult<Void> compute(
			@ApiParam(name = "ids", value = "t_enterprisesurveyID数组", required = true)
			@RequestParam(name = "ids", required = true) String[] ids) {
		APIResult<Void> result = new APIResult<Void>();
		try {

			//domain.deleteByIdsCascade(ids);
			for(int i=0;i<ids.length;i++){
				EnterprisesurveyPo enterprisesurveyPo = enterprisesurveyRepository.loadCascade(ids[i]);
				OpenProcessResultPo openProcessResultPo = enterprisesurveyRepository.enterpriseCompute(enterprisesurveyPo);
				openProcessResult.save(openProcessResultPo);
			}
			result.setMessage("计算企业问卷数据成功");
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}
	
}