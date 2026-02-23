package com.jsp.custom_id_generator.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.custom_id_generator.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String> {

}
