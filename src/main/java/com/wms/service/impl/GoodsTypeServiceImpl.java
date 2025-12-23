package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.entity.GoodsType;
import com.wms.mapper.GoodsTypeMapper;
import com.wms.service.GoodsTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wcx
 * @since 2025-12-22
 */
@Service
public class GoodsTypeServiceImpl extends ServiceImpl<GoodsTypeMapper, GoodsType> implements GoodsTypeService {

    @Resource
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public IPage pageCC(Page<GoodsType> page, LambdaQueryWrapper<GoodsType> lambdaQueryWrapper) {
        return goodsTypeMapper.pageCC(page, lambdaQueryWrapper);
    }
}
