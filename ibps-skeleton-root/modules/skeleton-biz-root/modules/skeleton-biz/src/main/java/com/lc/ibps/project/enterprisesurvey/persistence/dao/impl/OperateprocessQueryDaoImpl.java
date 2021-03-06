package com.lc.ibps.project.enterprisesurvey.persistence.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lc.ibps.base.db.ddd.dao.MyBatisQueryDaoImpl;
import com.lc.ibps.project.enterprisesurvey.persistence.dao.OperateprocessQueryDao;
import com.lc.ibps.project.enterprisesurvey.persistence.entity.OperateprocessPo;

/**
 *t_operateprocess 查询Dao的实现类
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
public class OperateprocessQueryDaoImpl extends MyBatisQueryDaoImpl<String, OperateprocessPo> implements OperateprocessQueryDao{

    @Override
    public String getNamespace() {
        return OperateprocessPo.class.getName();
    }
	public List<OperateprocessPo> findByMainId(String mainId) {
		return findByKey("findByMainId", b().a("mainId", mainId).p());
	}
}