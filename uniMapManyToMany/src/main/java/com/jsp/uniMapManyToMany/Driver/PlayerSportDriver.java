package com.jsp.uniMapManyToMany.Driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.uniMapManyToMany.Entity.Player;
import com.jsp.uniMapManyToMany.Entity.Sport;

public class PlayerSportDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Sport s1 = new Sport(03, "Cricket", 11);
		Sport s2 = new Sport(04, "Football", 11);
		Sport s3 = new Sport(05, "kabaddi", 7);
		
		Player p1 = new Player(11,"Avdut joshi", "MALE", List.of(s1,s2));
		Player p2 = new Player(12,"Rajesh shrma", "MALE", List.of(s1,s2,s3));
		Player p3 = new Player(13,"vidya", "FEMALE", List.of(s2,s3));
		Player p4 = new Player(14,"jay  teli", "MALE", List.of(s1));
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		et.commit();
		
	}
}
