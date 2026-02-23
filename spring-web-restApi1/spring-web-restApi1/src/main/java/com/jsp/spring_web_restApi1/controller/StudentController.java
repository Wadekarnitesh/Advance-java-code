package com.jsp.spring_web_restApi1.controller;

import java.time.chrono.JapaneseEra;
import java.util.List;

import javax.sound.sampled.ReverbType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.spring_web_restApi1.config.ResponseStructure;
import com.jsp.spring_web_restApi1.entity.Student;
import com.jsp.spring_web_restApi1.service.ResponseStructureImp;
import com.jsp.spring_web_restApi1.service.StudentServiceImp;

@Controller
@ResponseBody
public class StudentController {

	@Autowired
	private StudentServiceImp service;

	@Autowired
	private ResponseStructureImp repo2;
//	 constuctor level autowiring
//	public StudentController(StudentService service) {
//		this.service = service;
//	}

	@PostMapping("/save")
	public Student insert(@RequestBody Student stud) {
		return service.save(stud);
	}

	@GetMapping("/all")
	public List<Student> get() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Student getById(@PathVariable("id") int id) {
		return service.getById(id);
	}

	@PostMapping("/save2")
	public ResponseStructure<Student> save2(@RequestBody Student s) {
		return repo2.saveData(s);
	}

	@GetMapping("/fetchall")
	public ResponseStructure<List<Student>> fetch2() {
		return repo2.fetchAll();
	}

	@DeleteMapping("/{id}")
	public Student deleteById(@PathVariable int id) {
		return service.deleteFetchById(id);
	}

	@PutMapping("/update")
	public Student updateData(@RequestBody Student stu) {
		return service.updateAllData(stu);
	}

	@PatchMapping("/{id}/{name}")
	public Student updateNameById(@PathVariable int id, @PathVariable String name) {
		return service.updateNameById(id, name);
	}

	@GetMapping("/student/{id}")
	public ResponseStructure<Student> getById2(@PathVariable int id) {
		return repo2.fetchById(id);
	}

}
