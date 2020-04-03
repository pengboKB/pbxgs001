package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.rescpath;
import com.example.demo.pojo.rescpathExample;
@Mapper
public interface rescpathMapper {
    long countByExample(rescpathExample example);

    int deleteByExample(rescpathExample example);

    int deleteByPrimaryKey(String id);

    int insert(rescpath record);

    int insertSelective(rescpath record);

    List<rescpath> selectByExample(rescpathExample example);

    rescpath selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") rescpath record, @Param("example") rescpathExample example);

    int updateByExample(@Param("record") rescpath record, @Param("example") rescpathExample example);

    int updateByPrimaryKeySelective(rescpath record);

    int updateByPrimaryKey(rescpath record);
}