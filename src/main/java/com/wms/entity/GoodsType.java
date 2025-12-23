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
@TableName("goodsType")
@ApiModel(value = "GoodsType对象", description = "")
public class GoodsType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类名
     */
    @TableField("name")
    @ApiModelProperty("分类名")
    private String name;

    /**
     * 备注
     */
    @TableField("remark")
    @ApiModelProperty("备注")
    private String remark;
}
