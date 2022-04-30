package com.lc.ibps.project.enterprisesurvey.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.lc.ibps.cloud.client.provider.ProviderConstants;
import com.lc.ibps.project.enterprisesurvey.api.IEnterprisesurveyService;

/**
 * t_enterprisesurvey 接口
 *
 * <pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:02
 * </pre>
 */
@FeignClient(name = ProviderConstants.ProviderId.PROVIDER_ID_BUSINESS)
public interface IEnterprisesurveyServiceClient extends IEnterprisesurveyService{

}