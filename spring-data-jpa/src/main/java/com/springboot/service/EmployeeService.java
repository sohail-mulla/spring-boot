package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.EmployeeRepository;
import com.springboot.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;

	public String insertData(Employee e) {

		repo.save(e);
		return "Data inserted ....!";

	}

	public List<Employee> fetchAllData() {

		return repo.findAll();

	}

	public Optional<Employee> fetchSingleData(int id) { // Optional - after Java 8

		return repo.findById(id);

	}

	public String deleteData(int id) {

		repo.deleteById(id);
		return "Data deleted...!";

	}

	public String updateData(Employee emp, int id) {

		Employee e = repo.getById(id);
		e.setName(emp.getName());
		e.setCity(emp.getCity());
		e.setSalary(emp.getSalary());
		repo.save(e);

		return "Data updated....!";
	}

}
