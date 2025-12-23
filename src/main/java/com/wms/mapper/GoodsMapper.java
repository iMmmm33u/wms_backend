package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wcx
 * @since 2025-12-22
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

    IPage pageCC(Page<Goods> page, @Param(Constants.WRAPPER) LambdaQueryWrapper<Goods> lambdaQueryWrapper);
}
