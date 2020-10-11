package com.springboot.chapter3.pojo;

import org.springframework.stereotype.Service;

/**
 * @author KNOE
 * @date 2020-09-21 16:11
 */
@Service
public class UserService {
    public void print(User user) {
        System.out.println("user = " + user.getId());
    }
}
