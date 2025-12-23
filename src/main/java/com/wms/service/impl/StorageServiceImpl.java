package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wms.entity.Storage;
import com.wms.mapper.StorageMapper;
import com.wms.service.StorageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wcx
 * @since 2025-12-21
 */
@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

    @Resource
    private StorageMapper storageMapper;

    @Override
    public IPage<Storage> pageCC(IPage<Storage> page, Wrapper<Storage> wrapper) {
        return storageMapper.pageCC(page, wrapper);
    }
}
