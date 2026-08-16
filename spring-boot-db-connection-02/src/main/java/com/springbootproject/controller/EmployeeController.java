package com.springbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootproject.entity.Employee;
import com.springbootproject.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/register")
	public String insertData(@RequestBody Employee e) {

		String msg = service.insertData(e);
		return msg;

	}

	@DeleteMapping("/delete")
	public String deleteData(@RequestBody int id) {

		String msg = service.deleteData(id);
		return msg;

	}

}
