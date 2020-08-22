package com.study.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名和数据库字段名不一致
    private int views;
}
