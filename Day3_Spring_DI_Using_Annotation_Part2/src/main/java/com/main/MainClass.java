package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfig;
import com.jbk.College;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		College clg = context.getBean("clg",College.class);

		System.out.println(clg);

	}
}
