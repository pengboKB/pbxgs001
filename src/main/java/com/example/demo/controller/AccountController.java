package com.example.demo.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.account;
import com.example.demo.service.AccountService;

@Controller
public class AccountController {
   
	
	@Autowired
	private AccountService Accountservice;
	@RequestMapping("/AccountLogin")
	public String login(account account) {
		List<account> alist = Accountservice.getAccount(account);
	    System.out.println("账号值："+ alist.get(0).getUsername() + "---" + alist.get(0).getPassword());
		if(alist.size()==0) {
			return "test";
		}
		return "index";
		
		
	}
	
}
