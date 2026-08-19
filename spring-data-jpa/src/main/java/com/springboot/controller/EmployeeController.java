package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Employee;
import com.springboot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/register")
	public String insertData(@RequestBody Employee e) {

		return service.insertData(e);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {

		return service.deleteData(id);
	}

	@PutMapping("/edit/{id}")
	public String updateData(@PathVariable int id, @RequestBody Employee e) {

		return service.updateData(e, id);
	}

	@GetMapping("/getAll")
	public List<Employee> fetchAllData() {

		return service.fetchAllData();
	}

	@GetMapping("/getSingleData")
	public Optional<Employee> getSingleData(@RequestParam int id) {

		return service.fetchSingleData(id);
	}

}
