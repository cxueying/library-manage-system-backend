package com.library.mapper;

import org.springframework.stereotype.Repository;

import com.library.entity.User;


// MyBatis 的 Mapper 接口，定义了对 user 表的操作
@Repository
public interface UserMapper {

    User getUserById(Integer id);
}
