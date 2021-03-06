package com.jk.service.impl;

import com.jk.dao.UserMapper;
import com.jk.pojo.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserService implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

}
