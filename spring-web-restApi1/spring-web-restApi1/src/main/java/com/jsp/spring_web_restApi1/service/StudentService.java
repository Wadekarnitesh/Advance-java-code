package com.jsp.spring_web_restApi1.service;


import java.util.List;

import com.jsp.spring_web_restApi1.entity.Student;
public interface StudentService   {
	
	public Student save(Student stud);
	
	List<Student> getAll();
	
	Student getById(int id);
	
	Student deleteFetchById(int id);
	
	Student updateAllData(Student stu);
	
	Student updateNameById(int id, String name);
	

}
