package com.springboot.service.impl;

import com.springboot.entity.User;
import com.springboot.mapper.UserDao;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findUserByName(String name) {

        return userDao.findByUserName(name);
    }
}
