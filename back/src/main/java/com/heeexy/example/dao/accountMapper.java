package com.heeexy.example.dao;

import com.usbaby.entity.account;

public interface accountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(account record);

    int insertSelective(account record);

    account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(account record);

    int updateByPrimaryKey(account record);
}