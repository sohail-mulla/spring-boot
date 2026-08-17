package com.springbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootproject.entity.Employee;
import com.springbootproject.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/register")
	public String insertData(@RequestBody Employee e) {

		String msg = service.insertData(e);
		return msg;

	}

	@PutMapping("update/{id}")
	public String updateData(@RequestBody Employee e, @PathVariable int id) {

		String msg = service.updateData(e, id);
		return msg;

	}

	@DeleteMapping("delete/{id}")
	public String deleteData(@PathVariable int id) {

		String msg = service.deleteData(id);
		return msg;

	}

	@GetMapping("getSingleData/{id}")
	public Employee getSingleData(@PathVariable int id) {

		Employee msg = service.getSingleData(id);
		return msg;

	}

	@GetMapping("/getAllData")
	public List<Employee> getAllData() {

		List<Employee> empList = service.getAllData();
		return empList;

	}

}
