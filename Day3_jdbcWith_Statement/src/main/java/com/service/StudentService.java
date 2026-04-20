package com.service;

import com.dao.StudentDao;

public class StudentService {

	public void insertData() throws Exception {
		StudentDao sd = new StudentDao();
		sd.insertData();
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
		sd.GetAllRecord();
	}
}
