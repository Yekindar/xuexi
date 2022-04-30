package com.lc.ibps.project.quota.persistence.dao;

import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.project.quota.persistence.entity.QuotaPo;

import java.util.List;

/**
 * 指标信息 查询Dao接口
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:40:59
 *</pre>
 */
public interface QuotaQueryDao extends IQueryDao<String, QuotaPo> {

    QuotaPo getByName(String name);

    List<QuotaPo> getByQuotaType(String quotaType);

    QuotaPo getByQuotaKey(String quotaKey);


    List<QuotaPo> getByParentQuotaId(String parentQuotaId);
}