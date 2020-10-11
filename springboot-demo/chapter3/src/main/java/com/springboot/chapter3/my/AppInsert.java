package com.springboot.chapter3.my;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * @author KNOE
 * @date 2020-09-21 12:20
 */
@Configuration
@ComponentScan(basePackages = "com.springboot.chapter3.*",
    excludeFilters = {@ComponentScan.Filter(classes = {Service.class})},
    lazyInit = true) //加入lazyInit就不会马上实例化
public class AppInsert {
//    @Bean(name = "dataSource")
//    public DataSource getDataSource() {
//        Properties props = new Properties();
//        props.setProperty("driver", "com.driver.jdbc.Driver");
//        props.setProperty("url", "jdbc:mysql://localhost:3306/testdb");
//        props.setProperty("username", "root");
//        props.setProperty("password", "123456");
//        DataSource dataSource = null;
//        try{
//            dataSource = BasicDataSourceFactory.createDataSource(props);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        return dataSource;
//    }
}
