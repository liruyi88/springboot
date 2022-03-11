package com.lagou.bootmybatis;

import com.lagou.bootmybatis.controller.ArticleController;
import com.lagou.bootmybatis.pojo.Article;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class BootmybatisApplicationTests {
    @Autowired
    private ArticleController articleController;
    @Test
    void contextLoads() {
        for (Article article : articleController.findAll()) {
            System.out.println(article);
        }

    }

}
