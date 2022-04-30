package com.lc.ibps.project.quota.persistence.dao.impl;


import com.lc.ibps.base.core.util.BeanUtils;
import com.lc.ibps.base.db.ddd.dao.MyBatisQueryDaoImpl;
import com.lc.ibps.project.quota.persistence.dao.QuotaQueryDao;
import com.lc.ibps.project.quota.persistence.entity.QuotaPo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *指标信息 查询Dao的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:40:59
 *</pre>
 */
 @SuppressWarnings("serial")
@Repository
public class QuotaQueryDaoImpl extends MyBatisQueryDaoImpl<String, QuotaPo> implements QuotaQueryDao{

    @Override
    public String getNamespace() {
        return QuotaPo.class.getName();
    }

    @Override
    public QuotaPo getByName(String name) {
        List<QuotaPo> quotaPoList = findByKey("getByName",name);
        QuotaPo quotaPo = null;
        if (BeanUtils.isNotEmpty(quotaPoList)){
            quotaPo = quotaPoList.get(0);
        }
        return quotaPo;
    }

    @Override
    public List<QuotaPo> getByQuotaType(String quotaType) {
        List<QuotaPo> quotaPoList = findByKey("getByQuotaType",quotaType);
        return quotaPoList;
    }

    @Override
    public QuotaPo getByQuotaKey(String quotaKey) {
        List<QuotaPo> quotaPoList = findByKey("getByQuotaKey",quotaKey);
        QuotaPo quotaPo = quotaPoList.get(0);
        return quotaPo;
    }


    @Override
    public List<QuotaPo> getByParentQuotaId(String parentQuotaId) {
        List<QuotaPo> quotaPoList = findByKey("getByParentId",parentQuotaId);
        return quotaPoList;
    }




}