package com.springbootproject.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbootproject.entity.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	SessionFactory factory;

	public String insertData(Employee e) {

		Session ss = factory.openSession();
		Transaction tx = ss.beginTransaction();

		ss.persist(e);
		tx.commit();
		ss.close();
		
		return "Data is inserted ... ! ";

	}

}
