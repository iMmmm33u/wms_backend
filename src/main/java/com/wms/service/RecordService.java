package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.entity.Record;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wcx
 * @since 2025-12-22
 */
public interface RecordService extends IService<Record> {

    IPage pageCC(Page<Record> page, QueryWrapper<Record> lambdaQueryWrapper);
}
