package com.controller;

import java.util.Scanner;

import com.entity.Student;
import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) throws Exception {

		StudentService ss = new StudentService();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id name & city");
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		String city = sc.nextLine();

		Student s = new Student(id, name, city);
		ss.insertData(s);
//		ss.deleteData();
//		ss.updateData();
//		ss.getAllData();

	}

}
