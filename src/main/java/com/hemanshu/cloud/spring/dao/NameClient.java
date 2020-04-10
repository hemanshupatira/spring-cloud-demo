package com.hemanshu.cloud.spring.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SPRING-CLOUD-DEMO-NAME")
public interface NameClient {

    @GetMapping("/")
    String getName();
}
