package com.lc.ibps.project.softenv.persistence.dao.impl;

import com.lc.ibps.base.db.ddd.dao.MyBatisDaoImpl;
import com.lc.ibps.project.softenv.persistence.dao.SoftenvDao;
import com.lc.ibps.project.softenv.persistence.entity.SoftenvPo;
import org.springframework.stereotype.Repository;

/**
 * 政务服务软环境 Dao接口的实现类
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
public class SoftenvDaoImpl extends MyBatisDaoImpl<String, SoftenvPo> implements SoftenvDao{

    @Override
    public String getNamespace() {
        return SoftenvPo.class.getName();
    }
}