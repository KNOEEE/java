package com.spring.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author KNOE
 * @date 2020-09-20 21:38
 */
@Controller
@EnableAutoConfiguration //自动装配
public class Chapter1Main {
    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        return map;
    }

    public static void main(String[] args) {
        SpringApplication.run(Chapter1Main.class, args);
    }
}
