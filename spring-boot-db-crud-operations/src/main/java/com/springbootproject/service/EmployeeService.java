package com.springbootproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootproject.dao.EmployeeDAO;
import com.springbootproject.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO dao;

	public String insertData(Employee e) {

		String msg = dao.insertData(e);
		return msg;

	}

	public String updateData(Employee e, int id) {

		String msg = dao.updateData(e, id);
		return msg;

	}

	public Employee getSingleData(int id) {

		Employee msg = dao.getSingleData(id);
		return msg;

	}

	public List<Employee> getAllData() {
		
		List<Employee> myList = dao.getAllData();
		return myList;
		
	}

	public String deleteData(int id) {

		String msg = dao.deleteData(id);
		return msg;

	}

}
