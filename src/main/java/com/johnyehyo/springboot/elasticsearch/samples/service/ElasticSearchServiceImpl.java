package com.johnyehyo.springboot.elasticsearch.samples.service;

import com.johnyehyo.springboot.elasticsearch.samples.dal.ElasticSearchDal;
import com.johnyehyo.springboot.elasticsearch.samples.entity.UserEntity;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
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

    /**
     * 查询全部记录
     * @return
     */
    @Override
    public Iterable<UserEntity> findAll() {
        Iterable<UserEntity> result = elasticSearchDal.findAll();
        return result;
    }

    /**
     * 按索引id查询记录
     * @param id
     * @return
     */
    @Override
    public Optional<UserEntity> findById(String id) {
        Optional<UserEntity> optional = elasticSearchDal.findById(id);
        return optional;
    }

    /**
     * 按传的key和value查询记录
     * @param key
     * @param value
     * @return
     */
    @Override
    public Iterable<UserEntity> searchByCondition(String key, String value) {
        MatchQueryBuilder matchQueryBuilder = new MatchQueryBuilder(key, value);
        matchQueryBuilder.fuzziness(Fuzziness.AUTO);

//        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        Iterable<UserEntity> result = elasticSearchDal.search(matchQueryBuilder);
        return result;
    }
}
