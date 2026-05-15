package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.EmployeeDao;
import com.tka.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public String insertData(Employee e) {
		String msg = dao.insertData(e);
		return msg;

	}

}
