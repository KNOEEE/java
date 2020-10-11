package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author KNOE
 * @date 2020-09-21 22:48
 */
@Component
@Primary //当有多个同样类型的bean时 请优先使用我注入
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println(Cat.class.getSimpleName() + "抓老鼠");
    }
}
