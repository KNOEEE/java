package com.springboot.chapter3.pojo.definition;

/**
 * @author KNOE
 * @date 2020-09-21 22:01
 */
//定义人类接口
public interface Person {
    //使用动物服务
    public void service();

    //设置动物
    public void setAnimal(Animal animal);
}
