package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.User;
import com.wms.mapper.UserMapper;
import com.wms.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wcx
 * @since 2025-11-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public IPage<User> pageC(IPage<User> page) {
        return userMapper.pageC(page);
    }

    @Override
    public IPage<User> pageCC(IPage<User> page, Wrapper<User> wrapper) {
        return userMapper.pageCC(page, wrapper);
    }
}
