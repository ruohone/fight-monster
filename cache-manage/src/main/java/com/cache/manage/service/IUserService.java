package com.cache.manage.service;


import com.cache.manage.model.User;

public interface IUserService {
    User queryUserByUserId(int userId);
}
