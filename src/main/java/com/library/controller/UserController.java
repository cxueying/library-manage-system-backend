package com.library.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.entity.User;
import com.library.service.IUserService;

import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
// 发送数据到前端
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/getUserById/{id}")
    public String getUserById(@PathVariable("id") Integer id) {

        User userById = userService.getUserById(id);
        Assert.notNull(userById, "用户不存在");//如果userById为空，则抛出异常

         // 准备数据
            Map<String, Object> data = new HashMap<>();
            data.put("id", 1);
            data.put("name", "John Doe");
            data.put("email", "john.doe@example.com");

            // 将数据转换为 JSON
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                String jsonString = objectMapper.writeValueAsString(userById);

                // 打印 JSON
                // System.out.println(jsonString);
                return jsonString;

            } catch (JsonProcessingException e) {
                // 处理异常，例如打印错误信息
                e.printStackTrace();
            }


        return userById.toString();
    }
}
