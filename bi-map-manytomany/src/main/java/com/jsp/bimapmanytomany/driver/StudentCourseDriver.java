
package com.jsp.bimapmanytomany.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.bimapmanytomany.entity.Course;
import com.jsp.bimapmanytomany.entity.Student;

public class StudentCourseDriver {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("pg").createEntityManager();
		EntityTransaction et = em.getTransaction();

		Course c1 = new Course();
		c1.setId(201);
		c1.setName("JAVA");
		c1.setFees(15000);
		c1.setDuration(8);
		
		
		Course c2= new Course();
		c2.setId(202);
		c2.setFees(15000);
		c2.setName("J2EE");
		c2.setDuration(3);
		
		Course c3 = new Course();
		c3.setId(203);
		c3.setFees(5000);
		c3.setName("SQL");
		c3.setDuration(2);
		
		List<Course> course1=Arrays.asList(c1,c2);
		List<Course> course2=Arrays.asList(c1,c3);
		List<Course> course3=Arrays.asList(c1,c2,c3);
		
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Nikhil");
		s1.setAge(22);
		Student s2= new Student();
		s2.setId(102);
		s2.setName("laxmi");
		s2.setAge(23);
		Student s3 = new Student();
		s3.setId(103);
		s3.setName("Anjali");
		s3.setAge(22);
		
		
		s1.setCourse(course1);
		s2.setCourse(course2);
		s3.setCourse(course3);
		
		c1.setStudent(List.of(s1,s2,s3));
		c2.setStudent(List.of(s1,s3));
		c3.setStudent(List.of(s2,s3));
		
		et.begin();
		em.persist(s3);
		em.persist(s2);
		em.persist(s1);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		et.commit();
	
		
	}
}
