package com.jsp.custom_id_generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jsp.custom_id_generator.Entity.Employee;
import com.jsp.custom_id_generator.repo.EmployeeRepo;

@SpringBootApplication
public class CustomIdGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CustomIdGeneratorApplication.class, args);
		
		EmployeeRepo repo = run.getBean(EmployeeRepo.class);
		
		
//		Employee e1 = new Employee(23, "Sham");
//		repo.save(e1);
		repo.findAll().forEach(System.out::println);
		
	}

}
