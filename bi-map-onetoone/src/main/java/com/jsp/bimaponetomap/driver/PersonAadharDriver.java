package com.jsp.bimaponetomap.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bimaponetomap.entity.AadharCard;
import com.jsp.bimaponetomap.entity.Person;

public class PersonAadharDriver {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		
		
		Person person = new Person();
		
		person.setId(10);
		person.setName("Ramesh Jadhav");
		person.setAge(23);
		person.setAddress("Pune,wagholi");
		
		AadharCard a1 = new AadharCard();
		
		a1.setId(10);
		a1.setAadharNumber(2267856474l);
		
		person.setAadhar(a1);
		a1.setPerson(person);
		
		et.begin();
		em.persist(a1);
		em.persist(person);
		et.commit();
		
		
		
		
	}

}
