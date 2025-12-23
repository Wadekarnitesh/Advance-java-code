package com.jsp.uniMapOneToOne.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.uniMapOneToOne.Entity.Passport;
import com.jsp.uniMapOneToOne.Entity.Person;

public class PersonPassportDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("pg");
		
		EntityManager em=	emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		Passport p1=new Passport(23, "PT68936738", "12/10/2025", "03/04/2026");
		
		Person p= new Person(10, "Rajesh", 24, "India", p1);
		
		et.begin();
		
		em.persist(p1);
		em.persist(p);
		et.commit();
		
		
	}
}

