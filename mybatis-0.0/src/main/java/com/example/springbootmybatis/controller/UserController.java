package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author KNOE
 * @date 2020-10-18 15:22
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryList")
    public List<User> queryList() {
        List<User> userList = userMapper.queryList();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }

    @GetMapping("/queryUserById")
    public User queryUserById(@RequestParam(value = "id", defaultValue = "666") String str) {
        int id = Integer.parseInt(str);
        return userMapper.queryUserById(id);
    }

    @GetMapping("/addUser")
    public String addUser() {
        userMapper.addUser(new User(2020, "Knight", "123456"));
        return "ok";
    }

    @GetMapping("/updateUser")
    public String updateUser() {
        userMapper.updateUser(new User(2020, "Knight", "654321"));
        return "ok";
    }

    @GetMapping("/deleteUser")
    public String deleteUser() {
        userMapper.deleteUser(2020);
        return "ok";
    }
}
