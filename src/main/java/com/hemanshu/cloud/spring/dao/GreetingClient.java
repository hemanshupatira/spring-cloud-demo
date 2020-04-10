package com.hemanshu.cloud.spring.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SPRING-CLOUD-DEMO-GREETING")
public interface GreetingClient {

    @GetMapping("/")
    String getGreeting();
}
