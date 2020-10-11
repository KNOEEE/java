package com.springboot.chapter3.my;

import com.springboot.chapter3.pojo.DataBaseProperties;
import com.springboot.chapter3.pojo.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author KNOE
 * @date 2020-09-21 12:23
 */
public class IoCTest {
    private static Logger log = LogManager.getLogger(IoCTest.class);
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppInsert.class);
        //关闭ioc容器
//        ctx.close();
        DataBaseProperties dbp = ctx.getBean(DataBaseProperties.class);
        log.info(dbp.getDriverName());
        log.info(dbp.getPassword());
        log.info(dbp.getUrl());
        log.info(dbp.getUsername());
        User user = ctx.getBean(User.class);
        log.info(user.getUserName());
//        DataSource dataSource = ctx.getBean(DataSource.class);
//        log.info(dataSource.getClass());
//
//        Person person = ctx.getBean(BusinessPerson.class);
//        person.service();
    }
}
