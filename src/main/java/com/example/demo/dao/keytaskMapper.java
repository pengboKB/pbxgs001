package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.keytask;
import com.example.demo.pojo.keytaskExample;
@Mapper
public interface keytaskMapper {
    long countByExample(keytaskExample example);

    int deleteByExample(keytaskExample example);

    int deleteByPrimaryKey(String id);

    int insert(keytask record);

    int insertSelective(keytask record);

    List<keytask> selectByExample(keytaskExample example);

    keytask selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") keytask record, @Param("example") keytaskExample example);

    int updateByExample(@Param("record") keytask record, @Param("example") keytaskExample example);

    int updateByPrimaryKeySelective(keytask record);

    int updateByPrimaryKey(keytask record);
}