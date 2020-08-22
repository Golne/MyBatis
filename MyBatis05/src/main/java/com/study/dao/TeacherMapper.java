package com.study.dao;

import com.study.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("id") int id);
}
