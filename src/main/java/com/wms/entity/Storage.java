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
 * @since 2025-12-21
 */
@Getter
@Setter
@ToString
@TableName("storage")
@ApiModel(value = "Storage对象", description = "")
public class Storage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 仓库名
     */
    @TableField("name")
    @ApiModelProperty("仓库名")
    private String name;

    /**
     * 备注
     */
    @TableField("remark")
    @ApiModelProperty("备注")
    private String remark;
}
