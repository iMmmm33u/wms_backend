package com.wms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

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
@TableName("record")
@ApiModel(value = "Record对象", description = "")
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 货品id
     */
    @TableField("goods")
    @ApiModelProperty("货品id")
    private Integer goods;

    /**
     * 取货人/补货人
     */
    @TableField("userId")
    @ApiModelProperty("取货人/补货人")
    private Integer userId;

    /**
     * 操作人id
     */
    @TableField("admin_id")
    @ApiModelProperty("操作人id")
    private Integer adminId;

    /**
     * 数量
     */
    @TableField("count")
    @ApiModelProperty("数量")
    private Integer count;

    /**
     * 操作时间
     */
    @ApiModelProperty("操作时间")
    @TableField("createtime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;

    /**
     * 备注
     */
    @TableField("remark")
    @ApiModelProperty("备注")
    private String remark;

    @TableField(exist = false)
    private String action;
}
