package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfig;
import com.jbk.Student;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Student s = context.getBean("std", Student.class);
		System.out.println(s);

	}
}
