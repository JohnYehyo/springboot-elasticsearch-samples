package com.johnyehyo.springboot.elasticsearch.samples.service;

import com.johnyehyo.springboot.elasticsearch.samples.entity.UserEntity;
import org.springframework.data.domain.Page;

/**
 * @author JohnYehyo
 * @date 2020-3-26
 */
public interface ElasticSearchService {
    Page<UserEntity> searchAll();
}
