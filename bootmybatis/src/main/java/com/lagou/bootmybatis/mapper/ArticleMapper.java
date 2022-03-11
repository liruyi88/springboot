package com.lagou.bootmybatis.mapper;

import com.lagou.bootmybatis.pojo.Article;

import java.util.List;

public interface ArticleMapper {
    List<Article> findAll();
}