package com.study.dao;

import com.study.pojo.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有学生信息以及老师信息
    List<Student> getStudent();

    List<Student> getStudent2();


}
