package com.controller;

import com.entity.Student;
import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) {

		StudentService ss = new StudentService();

		Student s = new Student(0, null, null, null);
		ss.insertData(s);
//		ss.deleteData();
//		ss.updateData();
//		ss.getSingleData();
	}
}
