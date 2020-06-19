package com.tensquare.article.service.impl;

import com.tensquare.article.dao.ArticleDao;
import com.tensquare.article.pojo.Article;
import com.tensquare.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    @SuppressWarnings("all")
    private ArticleDao articleDao;


    public List<Article> findAll() {
        return articleDao.selectList(null);
    }

    public Article findById(String articleId) {
        return  articleDao.selectById(articleId);
    }
}
