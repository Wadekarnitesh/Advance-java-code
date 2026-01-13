package com.jsp.compositekay.driver;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.compositekay.entity.CompositeId;
import com.jsp.compositekay.entity.Employee;

public class EmployeeCompositeDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
			EntityManager em=	emf.createEntityManager();
		
		
		EntityTransaction et = em.getTransaction();
		
		
		CompositeId key = new CompositeId(101, "present");
		
		Employee e1 = new Employee("Ram", 45000, LocalDate.now(), key);
		
		et.begin();
		em.persist(e1);
		et.commit();
		
	}

}
