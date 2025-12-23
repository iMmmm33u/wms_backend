package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wcx
 * @since 2025-11-26
 */
public interface UserService extends IService<User> {

    IPage<User> pageC(IPage<User> page);

    IPage<User> pageCC(IPage<User> page, Wrapper<User> wrapper);
}
