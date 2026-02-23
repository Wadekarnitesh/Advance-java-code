package com.jsp.spring_web_respApi2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring_web_respApi2.entity.Employee;
import com.jsp.spring_web_respApi2.repository.EmployeeRepo;

@Service
public class EmpServiceImplement implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public Employee save(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public List<Employee> getAll() {
		return repo.findAll();
	}

	@Override
	public List<Employee> saveAll(Iterable<Employee> iterable) {
		return repo.saveAll(iterable);
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		return repo.getById(id);
	}

	@Override
	public Employee updateEmployeePatch(Employee emp) {

		Employee existing = repo.findById(emp.getId()).get();

		if (existing != null) {

			if (emp.getName() != null)
				existing.setName(emp.getName());

			if (emp.getSkill() != null)
				existing.setSkill(emp.getSkill());

			if (emp.getSalary() != null) {
				existing.setSalary(emp.getSalary());
			}

			if (emp.getYoe() != null) {
				existing.setYoe(emp.getYoe());
			}
			if (emp.getDesignation() != null)
				existing.setDesignation(emp.getDesignation());

			return repo.save(existing);
		} else {
			return null;
		}

	}

	@Override
	public void deleteEmployeeById(Integer id) {

		repo.deleteById(id);
	}

	@Override
	public Employee updateEmp(Employee emp) {
		
		return repo.save(emp);
	}
	
	

}
