package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangrenhao
 * @date 2019/2/27
 */
@Component
@FeignClient(value = "spring-cloud-client1", fallback = SchedualServiceHiHystric.class)
public interface TestService {

    @GetMapping("test")
    String test();

    /**
     * 参数必须与接口一致，否则无效
     * @param msg
     * @return
     */
//    @GetMapping("test")
//    String test(String msg);
}
