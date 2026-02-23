package com.jsp.springpretest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springpretest.entity.Employee;

public interface EmpRepo  extends JpaRepository<Employee, String>{

}
