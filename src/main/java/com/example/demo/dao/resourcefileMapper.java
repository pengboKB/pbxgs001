package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.resourcefile;
import com.example.demo.pojo.resourcefileExample;
@Mapper
public interface resourcefileMapper {
    long countByExample(resourcefileExample example);

    int deleteByExample(resourcefileExample example);

    int deleteByPrimaryKey(String id);

    int insert(resourcefile record);

    int insertSelective(resourcefile record);

    List<resourcefile> selectByExample(resourcefileExample example);

    resourcefile selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") resourcefile record, @Param("example") resourcefileExample example);

    int updateByExample(@Param("record") resourcefile record, @Param("example") resourcefileExample example);

    int updateByPrimaryKeySelective(resourcefile record);

    int updateByPrimaryKey(resourcefile record);
}