package com.lc.ibps.project.enterprisesurvey.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.lc.ibps.base.db.ddd.dao.MyBatisDaoImpl;
import com.lc.ibps.project.enterprisesurvey.persistence.dao.OperateprocessDao;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.OperateprocessPo;

/**
 * t_operateprocess Dao接口的实现类
 *
 *<pre> 
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：eddy
 * 邮箱地址：1546077710@qq.com
 * 创建时间：2022-01-19 14:12:03
 *</pre>
 */
@SuppressWarnings("serial")
@Repository
public class OperateprocessDaoImpl extends MyBatisDaoImpl<String, OperateprocessPo> implements OperateprocessDao{

    @Override
    public String getNamespace() {
        return OperateprocessPo.class.getName();
    }
	public void deleteByMainId(String mainId) {
		deleteByKey("deleteByMainId", b().a("mainId", mainId).p());		
	}
}