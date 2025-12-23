package com.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * @since 2025-12-22
 */
@Getter
@Setter
@ToString
@TableName("goods")
@ApiModel(value = "Goods对象", description = "")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 货名
     */
    @TableField("name")
    @ApiModelProperty("货名")
    private String name;

    /**
     * 仓库
     */
    @TableField("storage")
    @ApiModelProperty("仓库")
    private Integer storage;

    /**
     * 分类
     */
    @ApiModelProperty("分类")
    @TableField("goodsType")
    private Integer goodsType;

    /**
     * 数量
     */
    @TableField("count")
    @ApiModelProperty("数量")
    private Integer count;

    /**
     * 备注
     */
    @TableField("remark")
    @ApiModelProperty("备注")
    private String remark;
}
