package com.johnyehyo.springboot.elasticsearch.samples.dal;

import com.johnyehyo.springboot.elasticsearch.samples.entity.UserEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author JohnYehyo
 * @date 2020-3-26
 */
public interface ElasticSearchDal extends ElasticsearchRepository<UserEntity, String> {
}
