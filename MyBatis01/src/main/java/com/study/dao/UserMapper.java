package com.study.dao;

import com.study.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //根据name和pwd查询用户,使用@Param方式
    User getUserByNameAndPwd(@Param("name") String name, @Param("pwd") String pwd);
    //根据name和pwd查询用户,使用Map方式
    User getUserByNameAndPwd_Map(Map<String,Object> map);

    //添加用户
    int addUser(User user);

    //修改用户信息
    int updateUser(User user);

    //删除用户
    int deleteUserById(int id);
}
