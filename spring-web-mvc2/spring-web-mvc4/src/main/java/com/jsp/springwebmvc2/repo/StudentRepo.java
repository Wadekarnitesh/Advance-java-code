package com.jsp.springwebmvc2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springwebmvc2.entity.Student;


public interface StudentRepo extends JpaRepository<Student, String> {

}
