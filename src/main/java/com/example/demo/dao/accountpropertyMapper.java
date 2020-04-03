package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.accountproperty;
import com.example.demo.pojo.accountpropertyExample;
@Mapper
public interface accountpropertyMapper {
    long countByExample(accountpropertyExample example);

    int deleteByExample(accountpropertyExample example);

    int insert(accountproperty record);

    int insertSelective(accountproperty record);

    List<accountproperty> selectByExample(accountpropertyExample example);

    int updateByExampleSelective(@Param("record") accountproperty record, @Param("example") accountpropertyExample example);

    int updateByExample(@Param("record") accountproperty record, @Param("example") accountpropertyExample example);
}