package com.springboot.chapter4.service.impl;

import com.springboot.chapter4.service.HelloService;

/**
 * @author KNOE
 * @date 2020-09-24 20:58
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if(name == null || name.trim().equals("")){
            throw new RuntimeException("para is null");
        }
        System.out.println("hello" + name);
    }
}
