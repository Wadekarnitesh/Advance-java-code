package com.jsp.uniOneToOne.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.OneToOne.Entity.Countrys;
import com.jsp.OneToOne.Entity.PrimeMinister;

public class CountrysPrimeMinister {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		
		PrimeMinister p=new PrimeMinister(14, "Naredra Modi");
		
		Countrys c1 = new Countrys(11, "India", p);
		
		et.begin();
		em.persist(p);
		em.persist(c1);
		et.commit();
		
	}
	
}

