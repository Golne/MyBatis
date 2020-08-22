package com.study.dao;

import com.study.pojo.Blog;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    Blog getBlogById(@Param("id") int id);

}
