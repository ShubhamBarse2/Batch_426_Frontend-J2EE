package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jbk.Student;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Student s = context.getBean("std",Student.class);
		s.setId(123);
		s.setName("Ram");
		s.setCity("pune");
		System.out.println(s);

	}
}
