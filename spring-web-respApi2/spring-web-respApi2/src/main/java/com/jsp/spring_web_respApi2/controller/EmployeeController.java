package com.jsp.spring_web_respApi2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.spring_web_respApi2.entity.Employee;
import com.jsp.spring_web_respApi2.service.EmployeeService;

@Controller
@ResponseBody
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public Employee insert(@RequestBody Employee emp)
	{
		return service.save(emp);
	}
	
	@GetMapping("/getAll")
	public List<Employee> all()
	{
		return service.getAll();
	}
	
	@PostMapping("/saveAll")
	public List<Employee> insertAll(@RequestBody Iterable<Employee> iterable)
	{
		return service.saveAll(iterable);
	}
	
	@GetMapping("/fetchById")
	public Employee fetchById(@RequestParam Integer id) {
		return service.getEmployeeById(id);
	}
	
	@PatchMapping("/upadateEmp")
	public Employee updateEmp(@RequestBody Employee emp)
	{
		return service.updateEmployeePatch(emp);
	}
	
	@DeleteMapping("/deleteEmpById")
	public void deleteEmpById(@RequestParam Integer id)
	{
		service.deleteEmployeeById(id);
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee emp)
	{
		return service.updateEmp(emp);
	}
	
	
}
