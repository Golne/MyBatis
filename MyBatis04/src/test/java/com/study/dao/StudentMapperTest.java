package com.study.dao;

import com.study.pojo.Student;
import com.study.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {

    @Test
    public void test1() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudent();
        for(Student student:studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudent2();
        for(Student student:studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

}
