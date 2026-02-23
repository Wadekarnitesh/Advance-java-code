package com.jsp.spring_web_restApi1.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring_web_restApi1.config.ResponseStructure;
import com.jsp.spring_web_restApi1.entity.Student;
import com.jsp.spring_web_restApi1.repo.StudentRepository;

@Service
public class ResponseStructureImp implements StudentResponseService {

	@Autowired
	private StudentRepository repo;

	@Override
	public ResponseStructure<Student> saveData(Student s) {

		ResponseStructure<Student> rs = new ResponseStructure<>();

		try {

			repo.save(s);
			rs.setData(s);
			rs.setStatusCode(201);
			rs.setExceptionMessage("student data save successfully");
			return rs;

		} catch (Exception e)

		{
			rs.setData(null);
			rs.setStatusCode(500);
			rs.setExceptionMessage("not found");
			return rs;

		} finally {
			rs.setDate(LocalDate.now());
		}

	}

	@Override
	public ResponseStructure<List<Student>> fetchAll() {

		ResponseStructure<List<Student>> rs = new ResponseStructure<>();

		try {
			List<Student> students = repo.findAll();

			rs.setData(students);
			rs.setStatusCode(200);
			rs.setExceptionMessage("student data fetched successfully");

		} catch (Exception e) {

			rs.setData(null);
			rs.setStatusCode(500);
			rs.setExceptionMessage("failed to fetch student data");

		} finally {
			rs.setDate(LocalDate.now());
		}

		return rs;
	}

	@Override
	public ResponseStructure<Student> fetchById(int id) {
		
		
		ResponseStructure<Student> response = new ResponseStructure<>();
		
		try {
			Student student = repo.findById(id).get();
			response.setData(student);
			response.setExceptionMessage("fetch successftully");
			response.setStatusCode(200);
			
		}
		catch(Exception e)
		{
			response.setData(null);
			response.setExceptionMessage("internal server");
			response.setStatusCode(500);
		}
		finally {
			response.setDate(LocalDate.now());
		}
		
		
		return response;
	}

}
