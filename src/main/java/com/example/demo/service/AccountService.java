package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.accountMapper;
import com.example.demo.pojo.account;
import com.example.demo.pojo.accountExample;
import com.example.demo.pojo.accountExample.Criteria;

@Service
public class AccountService {
    @Autowired
	private accountMapper am;
    
	public List<account> getAccount(account account){
		
		accountExample example = new accountExample();
		
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(account.getUsername());
		criteria.andPasswordEqualTo(account.getPassword());
		
		List<account> lsit = am.selectByExample(example);
		
		return lsit;
		
	}
}
