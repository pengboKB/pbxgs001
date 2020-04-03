package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.keyword;
import com.example.demo.pojo.keywordExample;
@Mapper
public interface keywordMapper {
    long countByExample(keywordExample example);

    int deleteByExample(keywordExample example);

    int deleteByPrimaryKey(String id);

    int insert(keyword record);

    int insertSelective(keyword record);

    List<keyword> selectByExample(keywordExample example);

    keyword selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") keyword record, @Param("example") keywordExample example);

    int updateByExample(@Param("record") keyword record, @Param("example") keywordExample example);

    int updateByPrimaryKeySelective(keyword record);

    int updateByPrimaryKey(keyword record);
}