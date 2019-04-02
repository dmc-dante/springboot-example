package com.example.springboot.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Demo1Controller {
	@Value("${spring.profiles.active}")
	private String profile;
	@Value("${values.info}")
	private String info;


	@Resource
	private LogConfig logConfig;
	@RequestMapping(method = RequestMethod.GET)
	public String hello(){
		return profile + "," + info +";"+logConfig.getLog();
	}
}
