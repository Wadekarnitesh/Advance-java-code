package com.jsp.springwebrestApi3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springwebrestApi3.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer>{
	

}
