package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wcx
 * @since 2025-11-26
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    IPage<User> pageC(IPage<User> page);

    IPage<User> pageCC(IPage<User> page, @Param(Constants.WRAPPER) Wrapper<User> wrapper);
}
