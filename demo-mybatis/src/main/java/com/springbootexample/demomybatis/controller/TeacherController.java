package com.springbootexample.demomybatis.controller;

import com.springbootexample.demomybatis.mapper.TeacherMapper;
import com.springbootexample.demomybatis.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	@Autowired
	private TeacherMapper teacherMapper;

	@RequestMapping("get")
	public Teacher get(){
		return teacherMapper.selectByPrimaryKey(1);
	}
}
