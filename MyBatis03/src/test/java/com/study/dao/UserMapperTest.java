package com.study.dao;

import com.study.pojo.User;
import com.study.utils.MyBatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void testGetAllUser() {
        //获得sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSession();
        //执行SQL
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(2);

        System.out.println(user);

        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testRowBounds() {
        //获得sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSession();

        int currentPage = 2;
        int pageSize = 2;
        RowBounds rowBounds = new RowBounds((currentPage - 1) * pageSize, pageSize);
        List<User> userList = sqlSession.selectList("com.study.dao.UserMapper.getUserByRowBounds", null, rowBounds);

        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testLog4j() {
        logger.info("info：进入testLog4j方法了");
        logger.debug("debug:进入testLog4j方法");
        logger.error("error:进入testLog4j方法");
    }


}
