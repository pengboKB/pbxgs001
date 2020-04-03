package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.account;
import com.example.demo.pojo.accountExample;
@Mapper
public interface accountMapper {
    long countByExample(accountExample example);

    int deleteByExample(accountExample example);

    int deleteByPrimaryKey(String id);

    int insert(account record);

    int insertSelective(account record);

    List<account> selectByExample(accountExample example);

    account selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") account record, @Param("example") accountExample example);

    int updateByExample(@Param("record") account record, @Param("example") accountExample example);

    int updateByPrimaryKeySelective(account record);

    int updateByPrimaryKey(account record);
}