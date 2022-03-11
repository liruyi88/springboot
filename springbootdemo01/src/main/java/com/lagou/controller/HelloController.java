package com.lagou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/boot")
    public String helloBoot(String name){
        return name + ",欢迎使用springboot!!!";
    }
}
