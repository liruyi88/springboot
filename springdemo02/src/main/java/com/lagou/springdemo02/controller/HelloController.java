package com.lagou.springdemo02.controller;

import com.lagou.springdemo02.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private Person person;
    @RequestMapping("/person")
    public Person getPerson(){
        return person;
    }
}
