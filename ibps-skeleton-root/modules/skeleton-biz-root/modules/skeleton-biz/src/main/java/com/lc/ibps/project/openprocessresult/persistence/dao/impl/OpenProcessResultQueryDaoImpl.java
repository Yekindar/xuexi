package com.lc.ibps.project.openprocessresult.persistence.dao.impl;


import org.springframework.stereotype.Repository;

import com.lc.ibps.base.db.ddd.dao.MyBatisQueryDaoImpl;
import com.lc.ibps.project.openprocessresult.persistence.dao.OpenProcessResultQueryDao;
import com.lc.ibps.project.openprocessresult.persistence.entity.OpenProcessResultPo;

/**
 *t_qykbjsjg 查询Dao的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 15:53:58
 *</pre>
 */
 @SuppressWarnings("serial")
@Repository
public class OpenProcessResultQueryDaoImpl extends MyBatisQueryDaoImpl<String, OpenProcessResultPo> implements OpenProcessResultQueryDao{

    @Override
    public String getNamespace() {
        return OpenProcessResultPo.class.getName();
    }
}