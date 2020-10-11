package com.springboot.chapter4;

import com.springboot.chapter4.service.HelloService;
import com.springboot.chapter4.service.impl.HelloServiceImpl;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * @author KNOE
 * @date 2020-09-24 21:12
 */
public class go {
    private static void testProxy() {
        HelloServiceImpl helloService = new HelloServiceImpl();
    }
}
