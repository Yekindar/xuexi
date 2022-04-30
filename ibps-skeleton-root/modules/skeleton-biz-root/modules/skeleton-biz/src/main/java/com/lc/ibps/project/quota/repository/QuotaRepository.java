package com.lc.ibps.project.quota.repository;

import com.lc.ibps.base.framework.repository.IRepository;
import com.lc.ibps.project.quota.domain.Quota;
import com.lc.ibps.project.quota.persistence.entity.QuotaPo;

import java.util.List;
import java.util.Map;

/**
 * 指标信息 仓库接口
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:41:00
 *</pre>
 */
public interface QuotaRepository extends IRepository<String, QuotaPo,Quota>{

    QuotaPo getByName(String name);

    List<QuotaPo> getByQuotaType(String quotaType);

    QuotaPo getByQuotaKey(String quotaKey);

    String[] getInputQuotaItemByQuotaKey(String quotaKey);

    Map<String,String> getQuotaKeysByQuotaKey(String quotaKey);

}