package com.lc.ibps.project.softenv.persistence.dao.impl;


import com.lc.ibps.base.db.ddd.dao.MyBatisQueryDaoImpl;
import com.lc.ibps.project.softenv.persistence.dao.SoftenvQueryDao;
import com.lc.ibps.project.softenv.persistence.entity.SoftenvPo;
import org.springframework.stereotype.Repository;

/**
 *政务服务软环境 查询Dao的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-08 16:43:21
 *</pre>
 */
 @SuppressWarnings("serial")
@Repository
public class SoftenvQueryDaoImpl extends MyBatisQueryDaoImpl<String, SoftenvPo> implements SoftenvQueryDao{

    @Override
    public String getNamespace() {
        return SoftenvPo.class.getName();
    }
}