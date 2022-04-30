package com.lc.ibps.project.enterprisesurvey.provider;

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
import com.lc.ibps.project.enterprisesurvey.api.IOperateprocessService;
import com.lc.ibps.project.enterprisesurvey.domain.Operateprocess;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.OperateprocessPo;
import com.lc.ibps.project.enterprisesurvey.repository.OperateprocessRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExtensionProperty;

/**
 * t_operateprocess 服务类
 * <pre>
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:03
 *</pre>
 */
@Api(tags = "t_operateprocess管理", value = "t_operateprocess数据")
@Service
public class OperateprocessProvider extends GenericProvider implements IOperateprocessService{

	@Resource
	private OperateprocessRepository operateprocessRepository;
	@Resource
	private Operateprocess domain;

	@ApiOperation(value = "t_operateprocess列表(分页条件查询)数据", notes = "t_operateprocess列表(分页条件查询)数据")
	@Override
	public APIResult<APIPageList<OperateprocessPo>> query(
			@ApiParam(name = "request", value = "传入查询请求json字符串", required = true) 
			@RequestBody(required = true) APIRequest request) {
		APIResult<APIPageList<OperateprocessPo>> result = new APIResult<>();
		try {
			QueryFilter queryFilter = getQueryFilter(request);
			List<OperateprocessPo> data = operateprocessRepository.query(queryFilter);
			APIPageList<OperateprocessPo> apiPageData = getAPIPageList(data);
			result.setData(apiPageData);
		} catch (Exception e) {
			// TODO ERROR => other error message
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}

	@ApiOperation(value = "根据id查询t_operateprocess", notes = "根据id查询t_operateprocess")
	@Override
	public APIResult<OperateprocessPo> get(
			@ApiParam(name = "id", value = "查询id", required = true) 
			@RequestParam(name = "id", required = true) String id) {
		APIResult<OperateprocessPo> result = new APIResult<>();
		try {
			OperateprocessPo operateprocessPo = operateprocessRepository.get(id);
			result.setData(operateprocessPo);
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}
	
	@ApiOperation(value = "保存", notes = "保存t_operateprocess信息", 
			extensions = {
					@Extension(properties = {
							@ExtensionProperty(name = "submitCtrl", value = StringPool.Y)
					})
			})
	@Override
	public APIResult<Void> save(
			@ApiParam(name = "operateprocessPo", value = "t_operateprocess对象", required = true)  
			@RequestBody(required = true) OperateprocessPo operateprocessPo) {
		APIResult<Void> result = new APIResult<Void>();
		try {
			logger.info(" com.lc.ibps.project.provider.OperateprocessProvider.save()--->operateprocessPo: {}", operateprocessPo.toString());
			domain.save(operateprocessPo);
			result.setMessage("保存t_operateprocess成功");
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}

	@ApiOperation(value = "删除", notes = "删除t_operateprocess", 
			extensions = {
					@Extension(properties = {
							@ExtensionProperty(name = "submitCtrl", value = StringPool.Y)
					})
			})
	@Override
	public APIResult<Void> remove(
			@ApiParam(name = "ids", value = "t_operateprocessID数组", required = true)  
			@RequestParam(name = "ids", required = true) String[] ids) {
		APIResult<Void> result = new APIResult<Void>();
		try {
			domain.deleteByIds(ids);
			result.setMessage("删除t_operateprocess成功");
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}
	
}