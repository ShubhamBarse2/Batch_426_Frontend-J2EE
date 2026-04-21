package com.service;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	public void insertData(Student s) throws Exception {
		StudentDao sd = new StudentDao();
		sd.insertData(s);
	}

	public void deleteData() throws Exception {
		StudentDao sd = new StudentDao();
		sd.deleteData();
	}

	public void updateData() throws Exception {
		StudentDao sd = new StudentDao();
		sd.updateData();
	}

	public void getAllData() throws Exception {
		StudentDao sd = new StudentDao();
		sd.getAllRecord();
	}
}
