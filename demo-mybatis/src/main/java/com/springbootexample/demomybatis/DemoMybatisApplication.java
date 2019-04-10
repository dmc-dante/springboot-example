package com.springbootexample.demomybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springbootexample.demomybatis.mapper")
public class DemoMybatisApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoMybatisApplication.class, args);
	}
}
