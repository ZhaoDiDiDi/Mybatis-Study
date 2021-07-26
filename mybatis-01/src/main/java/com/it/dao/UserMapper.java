package com.it.dao;

import com.it.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //insert一个用户
    int addUser(User user);

    //修改用户
    int upDataUser(User user);

    int upDataUser2(Map<String, Object> map);

    //删除一个用户
    int deleteUser(int id);
}
