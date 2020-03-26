package com.johnyehyo.springboot.elasticsearch.samples.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author JohnYehyo
 * @date 2020-3-26
 */
@Data
@Document(indexName = "log_index", type = "log")
public class UserEntity {

    private int id;
    private String username;
    private String module;
    private String method;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date actionTime;
}
