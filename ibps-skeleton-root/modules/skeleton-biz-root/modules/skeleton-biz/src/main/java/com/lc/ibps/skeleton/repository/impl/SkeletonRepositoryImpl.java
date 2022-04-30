package com.lc.ibps.skeleton.repository.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.lc.ibps.api.base.constants.CacheKeyConstants;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.base.framework.repository.AbstractRepository;
import com.lc.ibps.skeleton.domain.Skeleton;
import com.lc.ibps.skeleton.persistence.dao.SkeletonQueryDao;
import com.lc.ibps.skeleton.persistence.entity.SkeletonPo;
import com.lc.ibps.skeleton.repository.SkeletonRepository;

/**
 * xxx 仓库的实现类
 *
 * <pre>
 *  
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：xxx
 * 邮箱地址：xxx
 * 创建时间：2016-09-19 11:50:49
 * </pre>
 */
@Repository
//@org.springframework.context.annotation.Lazy
public class SkeletonRepositoryImpl extends AbstractRepository<String, SkeletonPo, Skeleton> implements SkeletonRepository {

	@Resource
	private SkeletonQueryDao skeletonQueryDao;

	@Override
	public Class<SkeletonPo> getPoClass() {
		return SkeletonPo.class;
	}
	
	@Override
	public String getInternalCacheName() {
		return CacheKeyConstants.Region.REGION_IBPS_SYS;
	}

	@Override
	protected IQueryDao<String, SkeletonPo> getQueryDao() {
		return skeletonQueryDao;
	}

}
