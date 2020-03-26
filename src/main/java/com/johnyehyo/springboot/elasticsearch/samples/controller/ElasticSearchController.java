package com.johnyehyo.springboot.elasticsearch.samples.controller;

import com.johnyehyo.springboot.elasticsearch.samples.dal.ElasticSearchDal;
import com.johnyehyo.springboot.elasticsearch.samples.entity.UserEntity;
import com.johnyehyo.springboot.elasticsearch.samples.service.ElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Optional;

/**
 * @author JohnYehyo
 * @date 2020-3-26
 */
@RestController
@RequestMapping(value = "elasticSearch")
public class ElasticSearchController {


    @Autowired
    private ElasticSearchDal elasticSearchDal;

    @Autowired
    private ElasticSearchService elasticSearchService;

    @GetMapping(value = "searchAll")
    public Object searchAll(){
        Optional<UserEntity> result = elasticSearchService.findAll();
        UserEntity userEntity = result.get();
        return userEntity;
    }
}
