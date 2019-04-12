package com.example.mybatis.sys.controller;


import com.example.mybatis.sys.entity.User;
import com.example.mybatis.sys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author duke
 * @since 2019-04-12
 */
@Controller
@RequestMapping("/sys/user")
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("get")
	@ResponseBody
	public User get(){
		return userMapper.selectById(1	);
	}
	@RequestMapping("save")
	@ResponseBody
	public User save(){
		User user = new User();
		user.setBirthday(  LocalDate.now());
		user.setName("陈月");
		userMapper.insert(user);
		return user;
	}
}
