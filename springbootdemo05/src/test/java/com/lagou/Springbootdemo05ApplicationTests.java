package com.lagou;

import com.lagou.controller.UserController;
import com.lagou.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class Springbootdemo05ApplicationTests {
    @Autowired
    private UserController userController;
    @Test
    void contextLoads() {
        List<User> users = userController.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
