package com.study.dao;

import com.study.pojo.Teacher;
import com.study.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherMapperTest {

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacherById(1);
        System.out.println(teacher);
        sqlSession.close();
    }

}
