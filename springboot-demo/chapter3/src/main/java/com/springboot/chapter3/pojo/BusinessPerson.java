package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import com.springboot.chapter3.pojo.definition.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author KNOE
 * @date 2020-09-21 22:04
 */
//人类实现类
@Component
public class BusinessPerson implements Person {
//    @Autowired //把dog的实例注入BusinessPerson中
//    @Qualifier("dog")
    private Animal animal = null;

    //如果构造方法里面有参数 上面的方法就不能用了
    //要在参数前加注解
//    public BusinessPerson(@Autowired @Qualifier("dog") Animal animal) {
//        this.animal = animal;
//    }

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    @Autowired @Qualifier("dog")
    public void setAnimal(Animal animal) {
        System.out.println("延迟依赖注入");
        this.animal = animal;
    }

//    @Override
//    public void setBeanName(String beanName) {
//        System.out.println(this.getClass().getSimpleName()
//            + "调用BeanFactoryAware的setBeanFactory");
//    }
//
//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws
//            BeansException {
//        System.out.println(this.getClass().getSimpleName()
//            + "调用 BeanFactoryAware setBeanFactory");
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws
//            BeansException {
//        System.out.println(this.getClass().getSimpleName()
//            + "调用ApplicationContextAware的setApplicationContext");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println(this.getClass().getSimpleName()
//            + "call InitializingBean的afterPropertiesSet");
//    }
//
//    @PostConstruct
//    public void init() {
//        System.out.println(this.getClass().getSimpleName()
//            + "调用@PostConstruct的自定义初始化方法");
//    }
//
//    @PreDestroy
//    public void destroy1() {
//        System.out.println(this.getClass().getSimpleName()
//            + " @PreDestroy定义的自定义销毁方法");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println(this.getClass().getSimpleName()
//            + "DisposableBean method");
//    }
    //这个bean实现了声明周期中单个bean可以实现的所有接口
}
