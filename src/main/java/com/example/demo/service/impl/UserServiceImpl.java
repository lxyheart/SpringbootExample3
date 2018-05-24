package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lixingyuan on 2018/5/9.
 */
@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public User userLogin(String sql) {
        User user = userMapper.userLogin(sql);
        return user;
    }
}
