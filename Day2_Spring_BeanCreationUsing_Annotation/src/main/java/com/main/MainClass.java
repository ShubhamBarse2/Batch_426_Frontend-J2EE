package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jbk.College;
import com.jbk.Student;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		College c = context.getBean("clg", College.class);
		System.out.println(c);

//		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
//		Student s = context.getBean("stud", Student.class);
//		System.out.println(s);

	}
}
