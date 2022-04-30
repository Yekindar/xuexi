package com.lc.ibps.skeleton.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.lc.ibps.base.db.ddd.dao.MyBatisDaoImpl;
import com.lc.ibps.skeleton.persistence.dao.SkeletonDao;
import com.lc.ibps.skeleton.persistence.entity.SkeletonPo;

/**
 * xxx Dao接口的实现类
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
public class SkeletonDaoImpl extends MyBatisDaoImpl<String, SkeletonPo> implements SkeletonDao {

    private static final long serialVersionUID = -8106086746492693288L;

    @Override
    public String getNamespace() {
        return SkeletonPo.class.getName();
    }

}
