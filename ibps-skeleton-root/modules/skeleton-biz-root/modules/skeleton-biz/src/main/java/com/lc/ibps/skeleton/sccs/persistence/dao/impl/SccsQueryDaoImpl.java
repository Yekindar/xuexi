package com.lc.ibps.skeleton.sccs.persistence.dao.impl;


import org.springframework.stereotype.Repository;

import com.lc.ibps.base.db.ddd.dao.MyBatisQueryDaoImpl;
import com.lc.ibps.skeleton.sccs.persistence.dao.SccsQueryDao;
import com.lc.ibps.skeleton.sccs.persistence.entity.SccsPo;

/**
 *t_sccs 查询Dao的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-03-28 23:53:13
 *</pre>
 */
@Repository
//@org.springframework.context.annotation.Lazy
public class SccsQueryDaoImpl extends MyBatisQueryDaoImpl<String, SccsPo> implements SccsQueryDao{
    private static final long serialVersionUID = 1L;
    @Override
    public String getNamespace() {
        return SccsPo.class.getName();
    }
}