package com.lc.ibps.project.enterprisesurvey.persistence.dao.impl;


import org.springframework.stereotype.Repository;

import com.lc.ibps.base.db.ddd.dao.MyBatisQueryDaoImpl;
import com.lc.ibps.project.enterprisesurvey.persistence.dao.EnterprisesurveyQueryDao;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.EnterprisesurveyPo;

/**
 *t_enterprisesurvey 查询Dao的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:01
 *</pre>
 */
 @SuppressWarnings("serial")
@Repository
public class EnterprisesurveyQueryDaoImpl extends MyBatisQueryDaoImpl<String, EnterprisesurveyPo> implements EnterprisesurveyQueryDao{

    @Override
    public String getNamespace() {
        return EnterprisesurveyPo.class.getName();
    }
}