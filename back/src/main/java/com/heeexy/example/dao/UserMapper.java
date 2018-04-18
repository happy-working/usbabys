package com.heeexy.example.dao;

import com.usbaby.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String worknumber);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String worknumber);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}