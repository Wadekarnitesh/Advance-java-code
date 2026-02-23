package com.jsp.springwebmvc4.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springwebmvc4.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{


}
