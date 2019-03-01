package com.example.demo.service;

import org.springframework.stereotype.Component;

/**
 * @author huangrenhao
 * @date 2019/2/27
 */
@Component
public class SchedualServiceHiHystric implements TestService {
    @Override
    public String test() {
        return "启用熔断器。。。。";
    }
}
