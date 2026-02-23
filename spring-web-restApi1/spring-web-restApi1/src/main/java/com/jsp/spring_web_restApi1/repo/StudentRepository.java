package com.jsp.spring_web_restApi1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.spring_web_restApi1.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	
//	public  Student deleteAndFetchById(int id);

}
