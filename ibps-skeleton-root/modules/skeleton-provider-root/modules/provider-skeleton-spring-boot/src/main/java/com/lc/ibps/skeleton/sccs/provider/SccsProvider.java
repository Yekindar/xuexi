package com.lc.ibps.skeleton.sccs.provider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Lazy;
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
import com.lc.ibps.skeleton.sccs.api.ISccsService;
import com.lc.ibps.skeleton.sccs.domain.Sccs;
import com.lc.ibps.skeleton.sccs.persistence.entity.SccsPo;
import com.lc.ibps.skeleton.sccs.repository.SccsRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExtensionProperty;

/**
 * t_sccs 服务类
 * <pre>
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-03-28 23:53:13
 *</pre>
 */
@Api(tags = "t_sccs管理", value = "t_sccs数据")
@Service
//@org.springframework.context.annotation.Lazy
public class SccsProvider extends GenericProvider implements ISccsService{

	@Resource
	private SccsRepository sccsRepository;
	@Resource
	private Sccs domain;

	@ApiOperation(value = "t_sccs列表(分页条件查询)数据", notes = "t_sccs列表(分页条件查询)数据")
	@Override
	public APIResult<APIPageList<SccsPo>> query(
			@ApiParam(name = "request", value = "传入查询请求json字符串", required = true) 
			@RequestBody(required = true) APIRequest request) {
		APIResult<APIPageList<SccsPo>> result = new APIResult<>();
		try {
			QueryFilter queryFilter = getQueryFilter(request);
			List<SccsPo> data = sccsRepository.query(queryFilter);
			APIPageList<SccsPo> apiPageData = getAPIPageList(data);
			result.setData(apiPageData);
		} catch (Exception e) {
			// TODO ERROR => other error message
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}

	@ApiOperation(value = "根据id查询t_sccs", notes = "根据id查询t_sccs")
	@Override
	public APIResult<SccsPo> get(
			@ApiParam(name = "id", value = "查询id", required = true) 
			@RequestParam(name = "id", required = true) String id) {
		APIResult<SccsPo> result = new APIResult<>();
		try {
			SccsPo sccsPo = sccsRepository.get(id);
			result.setData(sccsPo);
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}
	
	@ApiOperation(value = "保存", notes = "保存t_sccs信息", 
			extensions = {
					@Extension(properties = {
							@ExtensionProperty(name = "submitCtrl", value = StringPool.Y)
					})
			})
	@Override
	public APIResult<Void> save(
			@ApiParam(name = "sccsPo", value = "t_sccs对象", required = true)  
			@RequestBody(required = true) SccsPo sccsPo) {
		APIResult<Void> result = new APIResult<Void>();
		try {
			logger.info(" com.lc.ibps.skeleton.provider.SccsProvider.save()--->sccsPo: {}", sccsPo.toString());
			domain.save(sccsPo);
			result.setMessage("保存t_sccs成功");
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}

	@ApiOperation(value = "删除", notes = "删除t_sccs", 
			extensions = {
					@Extension(properties = {
							@ExtensionProperty(name = "submitCtrl", value = StringPool.Y)
					})
			})
	@Override
	public APIResult<Void> remove(
			@ApiParam(name = "ids", value = "t_sccsID数组", required = true)  
			@RequestParam(name = "ids", required = true) String[] ids) {
		APIResult<Void> result = new APIResult<Void>();
		try {
			domain.deleteByIds(ids);
			result.setMessage("删除t_sccs成功");
		} catch (Exception e) {
			setExceptionResult(result, StateEnum.ERROR.getCode(), StateEnum.ERROR.getText(), e);
		}
		return result;
	}
	
}