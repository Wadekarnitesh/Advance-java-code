package com.jsp.hql_query.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hql_query.entity.Mobile;

public class MobileDriver {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("pg").createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
//		Mobile m1 = new Mobile(101, "vivo", 25000.0);
//		Mobile m2 = new Mobile(102, "SAMSUNG", 17000.0);
//		Mobile m3 = new Mobile(103, "MI", 28999.0);
//		
//
//		et.begin();
//		
//		em.persist(m3);
//		em.persist(m2);
//		em.persist(m1);
//		et.commit();
		
		
		
		//to fetch all data
//		Query query = em.createQuery("from Mobile");
//		
//		java.util.List<Mobile> list= query.getResultList();
//		
//		System.out.println(list);
//		list.forEach(System.out :: println);
		
		
		// to fetch single result 
////		
//		Query rs = em.createQuery(" from Mobile e where e.id=102");
//		Mobile r2 =(Mobile) rs.getSingleResult();
//		System.out.println(r2);
		
		
		//  USING HQL query we cannot insert data 
		
		// delete query SQL:-  delete from Mobile where id=101;
		// delete query from HQL:- delete from (Entity class) where (variable)=value; 
		et.begin();
		
//		Query rs2 = em.createQuery("delete from Mobile where id=103");
//		
//		int executeUpdate = rs2.executeUpdate();
//		
//		if(executeUpdate>0)
//			System.out.println("HQL query executed ");
//		else
//			System.out.println("HQL query not executed");
		
		
		//UPDATE  sql query :- update Mobile set name="" where id=value;
		// HQL:- UPDATE Mobile e set e.brand="REALME" where e.id=102;
		
//		Query query = em.createQuery("UPDATE Mobile e set e.brand = 'REALME' where e.id=102");
		
//		int executeUpdate = query.executeUpdate();
//		if(executeUpdate>0)
//			if(executeUpdate>0)
//				System.out.println("HQL query executed ");
//			else
//				System.out.println("HQL query not executed");
//		
		et.commit();
		
	}
}
