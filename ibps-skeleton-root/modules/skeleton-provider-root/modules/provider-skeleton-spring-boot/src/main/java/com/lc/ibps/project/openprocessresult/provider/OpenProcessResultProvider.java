package com.lc.ibps.project.openprocessresult.provider;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

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
import com.lc.ibps.project.openprocessresult.api.IOpenProcessResultService;
import com.lc.ibps.project.openprocessresult.domain.OpenProcessResult;
import com.lc.ibps.project.openprocessresult.persistence.entity.OpenProcessResultPo;
import com.lc.ibps.project.openprocessresult.repository.OpenProcessResultRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExtensionProperty;

/**
 * t_qykbjsjg 服务类
 * <pre>
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 15:53:59
 *</pre>
 */
@Api(tags = "t_qykbjsjg管理", value = "t_qykbjsjg数据")
@Service
public class OpenProcessResultProvider extends GenericProvider implements IOpenProcessResultService{

	@Resource
	private OpenProcessResultRepository openProcessResultRepository;
	@Resource
	private OpenProcessResult domain;

	@ApiOperation(value = "t_qykbjsjg列表(分页条件查询)数据", notes = "t_qykbjsjg列表(分页条件查询)数据")
	@Override
	public APIResult<APIPageList<OpenProcessResultPo>> query(
			@ApiParam(name = "request", value = "传入查询请求json字符串", required = true) 
			@RequestBody(required = true) APIRequest request) {
		APIResult<APIPageList<OpenProcessResultPo>> result = new APIResult<>();
		try {
			QueryFilter queryFilter = getQueryFilter(request);
			List<OpenProcessResultPo> data = openProcessResultRepository.query(queryFilter);
			APIPageList<OpenProcessResultPo> apiPageData = getAPIPageList(data);
			result.setData(apiPageData);
		} catch (Exception e) {
			// TODO ERROR => other error message
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}

	@ApiOperation(value = "根据id查询t_qykbjsjg", notes = "根据id查询t_qykbjsjg")
	@Override
	public APIResult<OpenProcessResultPo> get(
			@ApiParam(name = "id", value = "查询id", required = true) 
			@RequestParam(name = "id", required = true) String id) {
		APIResult<OpenProcessResultPo> result = new APIResult<>();
		try {
			OpenProcessResultPo openProcessResultPo = openProcessResultRepository.get(id);
			result.setData(openProcessResultPo);
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}
	
	@ApiOperation(value = "保存", notes = "保存t_qykbjsjg信息", 
			extensions = {
					@Extension(properties = {
							@ExtensionProperty(name = "submitCtrl", value = StringPool.Y)
					})
			})
	@Override
	public APIResult<Void> save(
			@ApiParam(name = "openProcessResultPo", value = "t_qykbjsjg对象", required = true)  
			@RequestBody(required = true) OpenProcessResultPo openProcessResultPo) {
		APIResult<Void> result = new APIResult<Void>();
		try {
			logger.info(" com.lc.ibps.project.provider.OpenProcessResultProvider.save()--->openProcessResultPo: {}", openProcessResultPo.toString());
			domain.save(openProcessResultPo);
			result.setMessage("保存t_qykbjsjg成功");
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}

	@ApiOperation(value = "删除", notes = "删除t_qykbjsjg", 
			extensions = {
					@Extension(properties = {
							@ExtensionProperty(name = "submitCtrl", value = StringPool.Y)
					})
			})
	@Override
	public APIResult<Void> remove(
			@ApiParam(name = "ids", value = "t_qykbjsjgID数组", required = true)  
			@RequestParam(name = "ids", required = true) String[] ids) {
		APIResult<Void> result = new APIResult<Void>();
		try {
			domain.deleteByIds(ids);
			result.setMessage("删除t_qykbjsjg成功");
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}
	
}