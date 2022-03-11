package com.lagou.springdemo02;

import com.lagou.springdemo02.controller.HelloController;
import com.lagou.springdemo02.pojo.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springdemo02ApplicationTests {
    @Autowired
    private HelloController helloController;
    @Test
    void contextLoads() {
        Person person = helloController.getPerson();
        System.out.println(person);
    }

}
