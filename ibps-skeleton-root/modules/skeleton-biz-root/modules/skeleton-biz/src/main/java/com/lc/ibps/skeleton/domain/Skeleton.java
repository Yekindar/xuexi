package com.lc.ibps.skeleton.domain;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.lc.ibps.api.base.constants.CacheKeyConstants;
import com.lc.ibps.base.framework.domain.AbstractDomain;
import com.lc.ibps.base.framework.persistence.dao.IDao;
import com.lc.ibps.base.framework.persistence.dao.IQueryDao;
import com.lc.ibps.skeleton.persistence.dao.SkeletonDao;
import com.lc.ibps.skeleton.persistence.dao.SkeletonQueryDao;
import com.lc.ibps.skeleton.persistence.entity.SkeletonPo;

/**
 * xxx 领域对象实体
 *
 * <pre>
 *  
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：xxx
 * 邮箱地址：xxx
 * 创建时间：2016-09-19 11:50:49
 * </pre>
 */
@Service
// @org.springframework.context.annotation.Lazy
public class Skeleton extends AbstractDomain<String, SkeletonPo> {

    private final static Logger LOGGER = LoggerFactory.getLogger(Skeleton.class);
    private static final long serialVersionUID = 8167684648827367L;

    @Resource
    @Lazy
    private SkeletonDao skeletonDao;
    @Resource
    @Lazy
    private SkeletonQueryDao skeletonQueryDao;

    @Override
    protected void init() {}

    @Override
    public Class<SkeletonPo> getPoClass() {
        return SkeletonPo.class;
    }

    @Override
    protected IQueryDao<String, SkeletonPo> getInternalQueryDao() {
        return skeletonQueryDao;
    }

    @Override
    protected IDao<String, SkeletonPo> getInternalDao() {
        return skeletonDao;
    }

    @Override
    public String getInternalCacheName() {
        return CacheKeyConstants.Region.REGION_IBPS_SYS;
    }

    @Override
    protected void preDelete(String id) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("前置业务切入逻辑");
        }
    }

    @Override
    protected void preDelete(String sqlKey, List<String> ids, Object params) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("前置业务切入逻辑");
        }
    }

    @Override
    protected void preDelete(String sqlKey, String[] ids, Object params) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("前置业务切入逻辑");
        }
    }

    @Override
    protected void preDeleteByIds(String... ids) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("前置业务切入逻辑");
        }
    }

    @Override
    protected void preSave(SkeletonPo p) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("前置业务切入逻辑");
        }
    }

    @Override
    protected void preUpdate(String sqlKey, List<String> ids, Object params) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("前置业务切入逻辑");
        }
    }

    @Override
    protected void preUpdate(String sqlKey, String id, Object params) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("前置业务切入逻辑");
        }
    }

    @Override
    protected void preUpdate(String sqlKey, String[] ids, Object params) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("前置业务切入逻辑");
        }
    }

    @Override
    protected void postDelete(String id) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("后置业务切入逻辑");
        }
    }

    @Override
    protected void postDelete(String sqlKey, List<String> ids, Object params) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("后置业务切入逻辑");
        }
    }

    @Override
    protected void postDelete(String sqlKey, String[] ids, Object params) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("后置业务切入逻辑");
        }
    }

    @Override
    protected void postDeleteByIds(String... ids) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("后置业务切入逻辑");
        }
    }

    @Override
    protected void postSave(SkeletonPo p) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("后置业务切入逻辑");
        }
    }

    @Override
    protected void postUpdate(String sqlKey, List<String> ids, Object params) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("后置业务切入逻辑");
        }
    }

    @Override
    protected void postUpdate(String sqlKey, String id, Object params) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("后置业务切入逻辑");
        }
    }

    @Override
    protected void postUpdate(String sqlKey, String[] ids, Object params) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("后置业务切入逻辑");
        }
    }

}
