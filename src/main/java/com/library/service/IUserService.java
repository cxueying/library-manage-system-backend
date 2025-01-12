package com.library.service;

import com.library.entity.User;

// 服务层接口，定义了对 user 表的操作，如查询用户信息

public interface IUserService {
    /**
     * 在接口中默认的访问修饰符jdk8是public，所以可以省略
     * @param id
     * @return
     */
    User getUserById(Integer id);
}
