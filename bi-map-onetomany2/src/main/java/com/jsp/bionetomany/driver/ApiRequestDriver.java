package com.jsp.bionetomany.driver;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.bionetomany.entity.Api;
import com.jsp.bionetomany.entity.Request;

public class ApiRequestDriver {

	public static void main(String[] args) {

		EntityManager em = Persistence.createEntityManagerFactory("pg").createEntityManager();

		EntityTransaction et = em.getTransaction();

		
		Request r1 = new Request();

		r1.setRid(11);
		r1.setMethod("post");
		r1.setIp("192.156.4.89");
		r1.setClientId("R6");
		r1.setStatusCode(200);
		
		Request r2 = new Request();
		
		r2.setRid(12);
		r2.setMethod("put");
		r2.setIp("192.1.4.19");
		r2.setClientId("R3");
		r2.setStatusCode(201);
		
		Request r3= new Request();
		
		r3.setRid(13);
		r3.setMethod("post");
		r3.setIp("192.168.1.90");
		r3.setClientId("R6");
		r3.setStatusCode(300);
		
		Api a1 = new Api();
		a1.setAid(10);
		a1.setApiName("text To Speech Api");
		a1.setEndPoint("/user/profile");
		a1.setVersion("v2");
		r1.setApi(a1);
		r2.setApi(a1);
		r3.setApi(a1);
		
		a1.setList(List.of(r1,r2,r3));
		
		et.begin();
		em.persist(a1);
		et.commit();
	}
}
