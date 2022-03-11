package com.lagou.bootmybatis.controller;

import com.lagou.bootmybatis.mapper.ArticleMapper;
import com.lagou.bootmybatis.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleMapper articleMapper;
    @RequestMapping("/findAll")
    public List<Article> findAll(){
        List<Article> articles = articleMapper.findAll();
        return articles;
    }
}
