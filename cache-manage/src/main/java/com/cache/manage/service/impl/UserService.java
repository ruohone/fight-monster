package com.cache.manage.service.impl;

import com.cache.manage.dao.IUserDao;
import com.cache.manage.model.User;
import com.cache.manage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = {"userCachce"})
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Cacheable(keyGenerator = "wiselyKeyGenerator",unless = "#result == null")
    public User queryUserByUserId(int userId) {
        return userDao.getUserById(userId);
    }

}
