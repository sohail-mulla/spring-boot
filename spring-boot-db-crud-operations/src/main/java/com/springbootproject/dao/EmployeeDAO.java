package com.springbootproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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

	public String updateData(Employee e, int id) {

		Session ss = factory.openSession();
		Transaction tx = ss.beginTransaction();

		Employee e1 = ss.get(Employee.class, id);

		e1.setEmpID(e.getEmpID());
		e1.setName(e.getName());
		e1.setSalary(e.getSalary());
		e1.setCity(e.getCity());

		ss.persist(e1);
		tx.commit();
		ss.close();

		return "Data is updated  ... ! ";

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

	public Employee getSingleData(int id) {

		Session ss = factory.openSession();
		Transaction tx = ss.beginTransaction();

//		Employee e1 = ss.get(Employee.class, id);              below with HQL 

		String hqlQuery = "from Employee where id=:id";

		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
		query.setParameter("id", id);
		Employee emp = query.getSingleResult();

		tx.commit();
		ss.close();

		return emp;

	}

	public List<Employee> getAllData() {

		Session ss = factory.openSession();
		Transaction tx = ss.beginTransaction();

		String hqlQuery = "from Employee";

		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
//		query.setParameter("id", id);
		List<Employee> list = query.getResultList();

		tx.commit();
		ss.close();

		return list;

	}
}
