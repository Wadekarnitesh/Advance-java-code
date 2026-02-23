package com.jsp.spring_web_respApi2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.spring_web_respApi2.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
