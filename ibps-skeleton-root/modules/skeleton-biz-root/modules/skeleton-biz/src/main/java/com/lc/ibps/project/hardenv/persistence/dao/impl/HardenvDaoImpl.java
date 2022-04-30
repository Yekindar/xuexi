package com.lc.ibps.project.hardenv.persistence.dao.impl;

import com.lc.ibps.base.db.ddd.dao.MyBatisDaoImpl;
import com.lc.ibps.project.hardenv.persistence.dao.HardenvDao;
import com.lc.ibps.project.hardenv.persistence.entity.HardenvPo;
import org.springframework.stereotype.Repository;

/**
 * 政务服务硬环境 Dao接口的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2021-11-02 13:23:57
 *</pre>
 */
@SuppressWarnings("serial")
@Repository
public class HardenvDaoImpl extends MyBatisDaoImpl<String, HardenvPo> implements HardenvDao{

    @Override
    public String getNamespace() {
        return HardenvPo.class.getName();
    }
}