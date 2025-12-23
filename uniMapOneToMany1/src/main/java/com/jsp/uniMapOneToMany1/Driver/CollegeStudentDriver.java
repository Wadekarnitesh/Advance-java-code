package com.jsp.uniMapOneToMany1.Driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.uniMapOneToMany1.Entity.College;
import com.jsp.uniMapOneToMany1.Entity.Student;

public class CollegeStudentDriver {

	public static void main(String[] args) {
		
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		
		Student s1=new Student(11, "Rahul", "CSE");
		Student s2=new Student(12, "shiv", "cs");
		Student s3=new Student(13, "uday", "IT");
		Student s4=new Student(14, "tushar", "E&TC");
		
		List<Student>list=Arrays.asList(s1,s2,s3);
		
		College c1= new College(1, "Dhole Patil College Of Engg","SPPU", list);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(c1);
		
		et.commit();
		
		
	}
}
