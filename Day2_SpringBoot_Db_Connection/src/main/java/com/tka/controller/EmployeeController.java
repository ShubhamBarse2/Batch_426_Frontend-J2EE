package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entities.Employee;
import com.tka.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/register")
	public String insertData(@RequestBody Employee e) {
		String msg = service.insertData(e);
		return msg;
	}

}
