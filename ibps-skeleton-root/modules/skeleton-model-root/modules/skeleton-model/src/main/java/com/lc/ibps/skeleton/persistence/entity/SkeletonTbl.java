package com.lc.ibps.skeleton.persistence.entity;

import javax.validation.constraints.NotBlank;

import com.lc.ibps.base.framework.persistence.entity.AbstractPo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 表对象
 *
 * <pre>
 *  
 * 开发公司：广州流辰信息技术有限公司
 * 开发人员：xxx
 * 邮箱地址：xxx
 * 创建时间：2016-12-14 15:30:23
 * </pre>
 */
@ApiModel(value = "骨架-表模型")
public class SkeletonTbl extends AbstractPo<String> {

    /**
     * 
     */
    private static final long serialVersionUID = -2661080121172551984L;
    @ApiModelProperty(value = "主键")
    protected String id; /* 任务ID */
    @ApiModelProperty(value = "名称")
    @NotBlank(message = "{com.lc.ibps.bpmn.persistence.entity.BpmTaskTbl.name}")
    protected String name; /* 任务名称 */
    @ApiModelProperty(value = "主题")
    @NotBlank(message = "{com.lc.ibps.bpmn.persistence.entity.BpmTaskTbl.subject}")
    protected String subject; /* 待办事项标题 */

    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 返回 任务ID
     * 
     * @return
     */
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 返回 任务名称
     * 
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * 返回 待办事项标题
     * 
     * @return
     */
    public String getSubject() {
        return this.subject;
    }

}