package com.jyyh.springboot_quick_start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/testHello")
    public String testHello(){
        return "hello SpringBoot";
    }
}
