package com.example.springboot.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:log-${spring.profiles.active}.properties")
public class LogConfig {

	@Value("${log}")
	private String log;
	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

}
