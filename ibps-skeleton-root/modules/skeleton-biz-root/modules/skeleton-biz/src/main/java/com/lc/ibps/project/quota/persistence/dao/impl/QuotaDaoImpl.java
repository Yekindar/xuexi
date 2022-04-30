package com.lc.ibps.project.quota.persistence.dao.impl;

import com.lc.ibps.base.db.ddd.dao.MyBatisDaoImpl;
import com.lc.ibps.project.quota.persistence.dao.QuotaDao;
import com.lc.ibps.project.quota.persistence.entity.QuotaPo;
import org.springframework.stereotype.Repository;

/**
 * 指标信息 Dao接口的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-01 16:41:00
 *</pre>
 */
@SuppressWarnings("serial")
@Repository
public class QuotaDaoImpl extends MyBatisDaoImpl<String, QuotaPo> implements QuotaDao{

    @Override
    public String getNamespace() {
        return QuotaPo.class.getName();
    }
}