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

	public String deleteData(int empID) {

		Session ss = factory.openSession();
		Transaction tx = ss.beginTransaction();

		Employee e = ss.get(Employee.class, empID);
		

	    if (e == null) {
	        tx.rollback();
	        ss.close();
	        return "Invalid ID or ID not found, please enter correct ID.";
	    }
		
		
		ss.remove(e);
		tx.commit();
		ss.close();

		return "Data is deleted ... ! ";

	}

}
