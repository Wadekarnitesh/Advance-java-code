package com.jsp.spring_web_restApi1.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring_web_restApi1.config.ResponseStructure;
import com.jsp.spring_web_restApi1.entity.Student;
import com.jsp.spring_web_restApi1.repo.StudentRepository;
@Service
public class StudentServiceImp implements StudentService {

	
	@Autowired
	private StudentRepository repo;
	
	
	public Student save(Student stud) {
		return repo.save(stud);
	}


	public List<Student> getAll() {
		return repo.findAll();
	}


	@Override
	public Student getById(int id) {
		return repo.findById(id).get( );
	}


	@Override
	public Student deleteFetchById(int id) {
		
		Student student = repo.findById(id).get();
		repo.deleteById(id);
		
		return student;
	}


	@Override
	public Student updateAllData(Student stu) {	
		
		return repo.save(stu);
	}


	@Override
	public Student updateNameById(int id, String name) {

		Student student = repo.findById(id).get();
		student.setName(name);
		repo.save(student);
		
		
		return student;
	}


	
	
		

		
	}


