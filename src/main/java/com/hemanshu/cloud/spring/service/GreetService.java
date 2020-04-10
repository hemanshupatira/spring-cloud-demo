package com.hemanshu.cloud.spring.service;

import com.hemanshu.cloud.spring.dao.GreetingClient;
import com.hemanshu.cloud.spring.dao.NameClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class GreetService {

    private final GreetingClient greetingClient;
    private final NameClient nameClient;

    public GreetService(GreetingClient greetingClient, NameClient nameClient) {
        this.greetingClient = greetingClient;
        this.nameClient = nameClient;
    }

    @HystrixCommand(fallbackMethod = "getFallbackGreeting")
    public String getGreeting() {
        return greetingClient.getGreeting();
    }

    @HystrixCommand(fallbackMethod = "getFallbackName")
    public String getName() {
        return nameClient.getName();
    }

    public String getFallbackGreeting() {
        return "Hello";
    }

    public String getFallbackName() {
        return "Anonymous";
    }
}
