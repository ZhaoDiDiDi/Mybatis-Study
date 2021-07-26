package com.it.dao;

import com.it.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {
    //根据ID查询用户
    User getUserById(@Param("id") int id);

    int upDataUser(User user);
}
