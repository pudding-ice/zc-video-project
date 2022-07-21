package com.myjava.service_video.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 *
 * </p>
 *
 * @author guochun
 * @since 2022-07-21 03:34:43
 */
@Getter
@Setter
@TableName("video_author")
@ApiModel(value = "Author对象", description = "")
public class Author {

    @ApiModelProperty("创作者id")
    @TableId("id")
    private String id;

    @ApiModelProperty("创作者姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("创作者简介")
    @TableField("introduction")
    private String introduction;

    @ApiModelProperty("创作者经历介绍")
    @TableField("career")
    private String career;

    @ApiModelProperty("创作者级别 0 : 普通创作者  1: 管理员创作者")
    @TableField("level")
    private Integer level;

    @ApiModelProperty("创作者头像")
    @TableField("avatar")
    private String avatar;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("逻辑删除 1 : 已删除 0: 未删除")
    @TableField("is_deleted")
    private Integer isDeleted;

    @ApiModelProperty("创建时间")
    @TableField(value = "gmt_create", fill = FieldFill.INSERT)
    private LocalDateTime gmtCreate;

    @ApiModelProperty("修改时间")
    @TableField(value = "gmt_modified", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime gmtModified;


}
