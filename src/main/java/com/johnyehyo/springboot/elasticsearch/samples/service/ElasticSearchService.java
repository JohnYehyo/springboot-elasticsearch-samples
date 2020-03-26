package com.johnyehyo.springboot.elasticsearch.samples.service;


import com.johnyehyo.springboot.elasticsearch.samples.entity.UserEntity;

import java.util.Optional;

/**
 * @author JohnYehyo
 * @date 2020-3-26
 */
public interface ElasticSearchService {
    Optional<UserEntity> findAll();
}
