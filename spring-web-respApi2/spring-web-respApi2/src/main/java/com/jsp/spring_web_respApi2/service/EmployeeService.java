package com.jsp.spring_web_respApi2.service;

import java.util.List;

import com.jsp.spring_web_respApi2.entity.Employee;

public interface EmployeeService {

	public Employee save(Employee emp);
	
	public List<Employee> getAll();
	
	public  List<Employee>  saveAll(Iterable<Employee> iterable);
	
	public Employee getEmployeeById(Integer id);
	
	public Employee updateEmployeePatch(Employee emp);
	
	public void deleteEmployeeById(Integer id);
	
	public Employee updateEmp(Employee emp);
	
	

}
