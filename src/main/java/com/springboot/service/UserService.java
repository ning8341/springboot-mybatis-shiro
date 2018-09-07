package com.springboot.service;

import com.springboot.entity.User;

public interface UserService {
    User findUserByName(String name);
}
