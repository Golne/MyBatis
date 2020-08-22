package com.study.dao;

import com.study.pojo.Teacher;
import com.study.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherMapperTest {
    @Test
    public void getTeacher() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacher2(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
