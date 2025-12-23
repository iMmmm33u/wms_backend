package com.wms.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wcx
 * @since 2025-12-21
 */
@Getter
@Setter
@ToString
@TableName("menu")
@ApiModel(value = "Menu对象", description = "")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;

    /**
     * 菜单编码
     */
    @TableField("menuCode")
    @ApiModelProperty("菜单编码")
    private String menuCode;

    /**
     * 菜单名字
     */
    @TableField("menuName")
    @ApiModelProperty("菜单名字")
    private String menuName;

    /**
     * 菜单级别
     */
    @TableField("menuLevel")
    @ApiModelProperty("菜单级别")
    private String menuLevel;

    /**
     * 菜单的父code
     */
    @ApiModelProperty("菜单的父code")
    @TableField("menuParentCode")
    private String menuParentCode;

    /**
     * 点击触发的函数
     */
    @TableField("menuClick")
    @ApiModelProperty("点击触发的函数")
    private String menuClick;

    /**
     * 权限 0超级管理员，1表示管理员，2表示普通用户，可以用逗号组合使用
     */
    @TableField("menuRight")
    @ApiModelProperty("权限 0超级管理员，1表示管理员，2表示普通用户，可以用逗号组合使用")
    private String menuRight;

    @TableField("menuComponent")
    private String menuComponent;

    @TableField("menuIcon")
    private String menuIcon;
}
