package com.johnyehyo.springboot.elasticsearch.samples.service;


import com.johnyehyo.springboot.elasticsearch.samples.entity.UserEntity;

import java.util.Optional;

/**
 * @author JohnYehyo
 * @date 2020-3-26
 */
public interface ElasticSearchService {

    /**
     * 查询全部记录
     * @return
     */
    Iterable<UserEntity> findAll();

    /**
     * 按索引id查询记录
     * @param id
     * @return
     */
    Optional<UserEntity> findById(String id);

    /**
     * 按传的key和value查询记录
     * @param key
     * @param value
     * @return
     */
    Iterable<UserEntity> searchByCondition(String key, String value);
}
