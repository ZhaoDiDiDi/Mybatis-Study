package com.it.dao;

import com.it.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //根据ID查询用户
    User getUserById(int id);
}
