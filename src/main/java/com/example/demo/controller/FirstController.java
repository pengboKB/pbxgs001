package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.AccountService;
import com.example.demo.service.UserService;



@Controller
public class FirstController {
	
	@Autowired
	private AccountService Accountservice;
  
    
	
	/*
	 * @RequestMapping("/login") public String getAccount() {
	 * 
	 * return "login";
	 * 
	 * }
	 */
	 
	
	
	    @Autowired
	    private UserService userService;
	    @ResponseBody
	    @RequestMapping("test/{id}")
	    public String GetUser(@PathVariable int id){
	        return userService.Sel(id).toString();
	    }
	    
	    @RequestMapping("/test")
	    public String GetUser(){
	        return "index";
	    }
}
