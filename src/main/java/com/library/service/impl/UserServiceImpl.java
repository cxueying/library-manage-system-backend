package com.library.service.impl;

import org.springframework.stereotype.Service;

import com.library.entity.User;
import com.library.mapper.UserMapper;
import com.library.service.IUserService;

import javax.annotation.Resource;

// 服务层实现类，实现了 IUserService 接口

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper mapper;

    @Override
    public User getUserById(Integer id) {
        return mapper.getUserById(id);
    }
}
