package com.jsp.unimapOneToMAny.Driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimapOneToMAny.Entity.Company;
import com.jsp.unimapOneToMAny.Entity.Employee;

public class CompanyEmployeeDriver {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pg");
		
	 
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Employee e1=new Employee(10,"shiv", 50000.0);
		Employee e2=new Employee(11,"kamlesh", 60000.0);
		Employee e3=new Employee(12,"vijay", 70000.0);
//		
		List<Employee> list=Arrays.asList(e1,e2,e3);
//		
//		Company c=new Company(201, "TCS", "Pune", list);
//		
		Company c2=new Company(202,"INFOYSIS","Pune",list);
		
		et.begin();
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
	
		em.persist(c2);
		et.commit();
		
		
		
		
	}
}
