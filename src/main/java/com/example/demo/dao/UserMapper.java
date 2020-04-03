package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.pojo.User;

@Repository
public interface UserMapper {
	User Sel(int id);
}
