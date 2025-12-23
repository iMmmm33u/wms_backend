package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wcx
 * @since 2025-12-22
 */
public interface GoodsService extends IService<Goods> {

    IPage pageCC(Page<Goods> page, LambdaQueryWrapper<Goods> lambdaQueryWrapper);
}
