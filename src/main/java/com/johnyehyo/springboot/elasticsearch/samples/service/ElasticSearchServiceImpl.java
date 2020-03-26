package com.johnyehyo.springboot.elasticsearch.samples.service;

import com.johnyehyo.springboot.elasticsearch.samples.dal.ElasticSearchDal;
import com.johnyehyo.springboot.elasticsearch.samples.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author JohnYehyo
 * @date 2020-3-26
 */
@Service
public class ElasticSearchServiceImpl implements ElasticSearchService {

    @Autowired
    private ElasticSearchDal elasticSearchDal;

    @Override
    public Optional<UserEntity> findAll() {
        Optional<UserEntity> optional = elasticSearchDal.findById("wZ1d1G4BkQ79OmEIITBH");
        return optional;
    }
}
