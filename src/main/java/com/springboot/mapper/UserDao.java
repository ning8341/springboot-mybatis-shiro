package com.springboot.mapper;

import com.springboot.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {

    public User findByUserName(String username);
}
