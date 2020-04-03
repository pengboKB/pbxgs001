package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.task;
import com.example.demo.pojo.taskExample;
@Mapper
public interface taskMapper {
    long countByExample(taskExample example);

    int deleteByExample(taskExample example);

    int deleteByPrimaryKey(String id);

    int insert(task record);

    int insertSelective(task record);

    List<task> selectByExample(taskExample example);

    task selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") task record, @Param("example") taskExample example);

    int updateByExample(@Param("record") task record, @Param("example") taskExample example);

    int updateByPrimaryKeySelective(task record);

    int updateByPrimaryKey(task record);
}