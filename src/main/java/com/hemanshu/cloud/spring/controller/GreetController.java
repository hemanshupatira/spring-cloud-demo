package com.hemanshu.cloud.spring.controller;

import com.hemanshu.cloud.spring.service.GreetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetController {

    private final RestTemplate template;
    private final GreetService greetService;

    public GreetController(RestTemplate template, GreetService greetService) {
        this.template = template;
        this.greetService = greetService;
    }

    @GetMapping("/greet")
    public @ResponseBody
    String greet() {
        return getGreetingMessage();
    }

    private String getGreetingMessage() {
        return greetService.getGreeting() + " " + greetService.getName() + "!";
    }

}
