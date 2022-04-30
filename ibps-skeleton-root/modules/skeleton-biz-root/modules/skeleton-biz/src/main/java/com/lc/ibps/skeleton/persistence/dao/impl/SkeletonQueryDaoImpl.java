package com.lc.ibps.skeleton.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.lc.ibps.base.db.ddd.dao.MyBatisQueryDaoImpl;
import com.lc.ibps.skeleton.persistence.dao.SkeletonQueryDao;
import com.lc.ibps.skeleton.persistence.entity.SkeletonPo;

/**
 *xxx 查询Dao的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：xxx
 * 邮箱地址：xxx
 * 创建时间：2016-09-26 10:36:35
 *</pre>
 */
@Repository
//@org.springframework.context.annotation.Lazy
public class SkeletonQueryDaoImpl extends MyBatisQueryDaoImpl<String, SkeletonPo> implements SkeletonQueryDao{

    private static final long serialVersionUID = 7362084497462819936L;

    @Override
    public String getNamespace() {
        return SkeletonPo.class.getName();
    }

}
