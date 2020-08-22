package com.study.dao;

import com.study.pojo.User;
import com.study.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    @Test
    public void testGetAllUser() {
        //获得sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSession();
        //执行SQL
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserById(2));
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testGetUserByNameAndPwd_Param() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserByNameAndPwd("fang", "888888"));
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testGetUserByNameAndPwd_Map() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "fang");
        map.put("pwd", "888888");
        System.out.println(userMapper.getUserByNameAndPwd_Map(map));
        //关闭SqlSession
        sqlSession.close();
    }

    //增删改需要提交事务
    @Test
    public void testAddUser() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int res = userMapper.addUser(new User(2, "zhong", "asofdhs"));
        if (res > 0) {
            System.out.println("插入成功！");
        }
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testUpdateUser() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int res = userMapper.updateUser(new User(1, "fang", "888888"));
        if (res > 0) {
            System.out.println("修改成功！");
        }
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();

    }

    @Test
    public void testDeleteUserById() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int res = userMapper.deleteUserById(2);
        if (res > 0) {
            System.out.println("删除成功！");
        }
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
    }

}
