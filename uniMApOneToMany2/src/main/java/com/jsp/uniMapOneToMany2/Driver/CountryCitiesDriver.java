package com.jsp.uniMapOneToMany2.Driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.uniMapOneToMany2.Entity.Citites;

import com.jsp.uniMapOneToMany2.Entity.Country;


public class CountryCitiesDriver {

	public static void main(String[] args) {
		
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Citites c1=new Citites(2, "Pune", 70000000);
		Citites c2=new Citites(3, "Pune", 150000000);
		Citites c3=new Citites(4, "Dilhi", 170000000);
	
		
		
		List<Citites>list=Arrays.asList(c1,c2,c3);
		
		Country c=new Country(10, "India", "Delhi", list);
		
		et.begin();
		em.persist(c2);
		em.persist(c3);
		em.persist(c1);
		
		em.persist(c);
		et.commit();
		
		
	}
}
