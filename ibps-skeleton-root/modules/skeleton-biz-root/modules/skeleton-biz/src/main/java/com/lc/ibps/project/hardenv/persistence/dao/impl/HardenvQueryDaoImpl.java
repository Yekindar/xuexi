package com.lc.ibps.project.hardenv.persistence.dao.impl;


import com.lc.ibps.base.db.ddd.dao.MyBatisQueryDaoImpl;
import com.lc.ibps.project.hardenv.persistence.dao.HardenvQueryDao;
import com.lc.ibps.project.hardenv.persistence.entity.HardenvPo;
import org.springframework.stereotype.Repository;

/**
 *政务服务硬环境 查询Dao的实现类
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
public class HardenvQueryDaoImpl extends MyBatisQueryDaoImpl<String, HardenvPo> implements HardenvQueryDao{

    @Override
    public String getNamespace() {
        return HardenvPo.class.getName();
    }
}