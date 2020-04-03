package com.example.demo.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter{
     
	
	  @Override public void addViewControllers(ViewControllerRegistry registry) {
	  // TODO Auto-generated method stub
	  registry.addViewController("/").setViewName("login");
	  registry.addViewController("/index").setViewName("login"); }
	 
}
