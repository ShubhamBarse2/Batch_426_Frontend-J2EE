package com.service;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	public void insertData(Student s) {
		StudentDao sd = new StudentDao();
		sd.insertData(s);
	}

	public void deleteData() {
		StudentDao sd = new StudentDao();
		sd.deleteData();
	}

	public void updateData() {
		StudentDao sd = new StudentDao();
		sd.updateData();
	}

	public void getSingleData() {
		StudentDao sd = new StudentDao();
		sd.getSingleRecord();
	}

}
