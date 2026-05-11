package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jbk.Student;

@Configuration
public class MyConfig {

	@Bean("std")
	public Student objStd() {
		return new Student();
	}
}
