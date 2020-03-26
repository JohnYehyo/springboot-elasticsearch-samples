package com.johnyehyo.springboot.elasticsearch.samples.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author JohnYehyo
 * @date 2020-3-26
 */
@Data
public class UserEntity {

    private int id;
    private String username;
    private String module;
    private String method;
    private Date actionTime;
}
