package com.library.entity;

import lombok.Data;
import lombok.ToString;

// 对应数据库中的 user 表
@Data
@ToString
public class User {
    private String username;
    private String password;
}
