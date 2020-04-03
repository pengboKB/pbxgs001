package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.taskstatistics;
import com.example.demo.pojo.taskstatisticsExample;
@Mapper
public interface taskstatisticsMapper {
    long countByExample(taskstatisticsExample example);

    int deleteByExample(taskstatisticsExample example);

    int insert(taskstatistics record);

    int insertSelective(taskstatistics record);

    List<taskstatistics> selectByExample(taskstatisticsExample example);

    int updateByExampleSelective(@Param("record") taskstatistics record, @Param("example") taskstatisticsExample example);

    int updateByExample(@Param("record") taskstatistics record, @Param("example") taskstatisticsExample example);
}