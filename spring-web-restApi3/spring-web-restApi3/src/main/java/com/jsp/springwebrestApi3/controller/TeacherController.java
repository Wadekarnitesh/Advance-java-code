package com.jsp.springwebrestApi3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.springwebrestApi3.entity.Teacher;
import com.jsp.springwebrestApi3.service.TeacherServiceImp;

@Controller
@ResponseBody
public class TeacherController {
	
	@Autowired
	private TeacherServiceImp service;

	@PostMapping("/save")
	public Teacher insert(@RequestBody Teacher tea)
	{
		return service.save(tea);
	}
	
	@GetMapping("/fetchAll")
	public List<Teacher> fetch()
	{
		return service.fetchAll();
	}
}
