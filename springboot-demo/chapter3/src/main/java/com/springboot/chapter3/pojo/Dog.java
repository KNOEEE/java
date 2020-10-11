package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import org.springframework.stereotype.Component;

/**
 * @author KNOE
 * @date 2020-09-21 22:10
 */
//狗 动物的实现类
@Component
public class Dog implements Animal {
    @Override
    public void use() {
        System.out.println(Dog.class.getSimpleName() + "是看门用的");
    }
}
