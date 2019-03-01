package com.example.demo.controllers;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangrenhao
 * @date 2019/2/27
 */
@RestController
public class TestController {


    @Value("${spring.application.name}")
    private String appName;
    @Autowired
    private TestService testService;

    @GetMapping("test-client1")
    public String test2() {
        return appName + ":" + System.currentTimeMillis() + "\n" + testService.test();
    }



    @RequestMapping("test")
    public String test() {
        return appName + ":" + System.currentTimeMillis();
    }

    @RequestMapping("exception")
    public String testException() {
//        throw new RuntimeException("发生异常啦！");
        return appName + ":" + System.currentTimeMillis();
    }

}