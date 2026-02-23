package com.jsp.springwebrestApi3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springwebrestApi3.entity.Teacher;
import com.jsp.springwebrestApi3.repo.TeacherRepo;

@Service
public class TeacherServiceImp implements TeacherService {

	
	@Autowired
	private TeacherRepo repo;
	
	@Override
	public Teacher save(Teacher tea) {
		return repo.save( tea);
	}

	@Override
	public List<Teacher> fetchAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
