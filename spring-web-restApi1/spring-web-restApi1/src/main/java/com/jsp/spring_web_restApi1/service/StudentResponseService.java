package com.jsp.spring_web_restApi1.service;

import java.util.List;

import com.jsp.spring_web_restApi1.config.ResponseStructure;
import com.jsp.spring_web_restApi1.entity.Student;

public interface StudentResponseService {
	
	ResponseStructure<Student> saveData(Student s);
	
	ResponseStructure<List<Student>> fetchAll();
	
	ResponseStructure<Student> fetchById(int id);
	

}
