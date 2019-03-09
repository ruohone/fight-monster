package com.cache.manage.dao;

import com.cache.manage.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IUserDao {
    @Select("select username,avatarUrl,userId,phone from `user` where `userid` =#{uid}")
    User getUserById(@Param("uid") Integer uid);
}
