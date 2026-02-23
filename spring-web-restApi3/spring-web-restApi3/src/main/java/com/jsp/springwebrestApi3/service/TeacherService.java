package com.jsp.springwebrestApi3.service;

import java.util.List;

import com.jsp.springwebrestApi3.entity.Teacher;

public interface TeacherService {
	
	public Teacher save(Teacher tea);
	
	public List<Teacher> fetchAll();
	
	

}
