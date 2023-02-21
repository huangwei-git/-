package com.songlian.logistics.dao;

import com.songlian.logistics.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 黄玮
 * @since 2023-02-17
 */
public interface UserDao extends BaseMapper<User> {
    public List<HashMap> exportUserInfo();
}
