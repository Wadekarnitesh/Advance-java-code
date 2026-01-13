package com.jsp.hql_query.driver;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hql_query.entity.Mobile;

public class MobileDynamicPositionDriver {
	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("pg").createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		
		Query query = em.createQuery("from Mobile");
//		
		java.util.List<Mobile> list= query.getResultList();
//		
//		System.out.println(list);
		list.forEach(System.out :: println);
		
		Scanner sc = new Scanner(System.in);
		// fetch dymanic
		
		System.out.println("Enter a id to fetch: ");
		Query query1 = em.createQuery("from Mobile e  WHERE e.id=?1");
		
		query1.setParameter(1, sc.nextInt());
		
		Object singleResult = query1.getSingleResult();
		System.out.println(singleResult);
		et.begin();
		
		// TO delete 
//		System.out.println("Enter a id to delete it: ");
		
//		Query query2= em.createQuery("delete from  Mobile e  WHERE e.id=?1");
//		query2.setParameter(1, sc.nextInt());
//		 query2.executeUpdate();
//		 System.out.println("delete succcess");
//		
		
		// TO Update 
		
		Query query3= em.createQuery("Update Mobile e  set e.brand=?1 WHERE e.id=?2");
		System.out.println("Enter a name to upadate it: ");
		query3.setParameter(1, sc.next());
		System.out.println("Enter a id to update it: ");
		query3.setParameter(2, sc.nextInt());
		
		 query3.executeUpdate();
		et.commit();
	}

}
