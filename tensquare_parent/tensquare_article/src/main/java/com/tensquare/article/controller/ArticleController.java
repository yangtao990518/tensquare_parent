package com.tensquare.article.controller;


import com.tensquare.article.pojo.Article;
import com.tensquare.article.service.impl.ArticleServiceImpl;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleServiceImpl articleServiceimpl;

    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        List<Article> articleslist =articleServiceimpl.findAll();
        return  new Result(true, StatusCode.OK,"查询成功",articleslist);
    }

    @RequestMapping(value = "{articleId}",method = RequestMethod.GET)
    public Result findById(@PathVariable String articleId){
        Article article =articleServiceimpl.findById(articleId);
        return  new Result(true, StatusCode.OK,"查询成功",article);
    }
}
