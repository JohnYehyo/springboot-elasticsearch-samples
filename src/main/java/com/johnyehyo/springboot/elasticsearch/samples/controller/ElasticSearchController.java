package com.johnyehyo.springboot.elasticsearch.samples.controller;

import com.johnyehyo.springboot.elasticsearch.samples.entity.UserEntity;
import com.johnyehyo.springboot.elasticsearch.samples.service.ElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JohnYehyo
 * @date 2020-3-26
 */
@RestController
@RequestMapping(value = "elasticSearch")
public class ElasticSearchController {

    @Autowired
    private ElasticSearchService elasticSearchService;

    @GetMapping(value = "searchAll")
    public Object searchAll(){
        Page<UserEntity> list = elasticSearchService.searchAll();
    }
}
