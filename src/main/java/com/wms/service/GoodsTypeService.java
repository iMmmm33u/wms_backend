package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.entity.GoodsType;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wcx
 * @since 2025-12-22
 */
public interface GoodsTypeService extends IService<GoodsType> {

    IPage pageCC(Page<GoodsType> page, LambdaQueryWrapper<GoodsType> lambdaQueryWrapper);
}
