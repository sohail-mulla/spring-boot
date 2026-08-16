package com.springbootproject.service;

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

	public String deleteData(int id) {
		
		String msg = dao.deleteData(id);
		return msg;
		
	}

}
