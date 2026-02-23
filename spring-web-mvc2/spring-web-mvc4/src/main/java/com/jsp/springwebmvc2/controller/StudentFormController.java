package com.jsp.springwebmvc2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springwebmvc2.entity.Student;
import com.jsp.springwebmvc2.repo.StudentRepo;

@Controller
public class StudentFormController {
	
	@Autowired
	private StudentRepo repo;

	@GetMapping("/form")
	public String get()
	{
		return "form";
	}
	
	@GetMapping("/read") 
	public String recieve( @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,@RequestParam("password") String password 
			,@RequestParam("phone") long phone) 
	{
		
		Student student = new Student(firstName, lastName, password, phone);
        repo.save(student);
		return "redirect:/students";
	}
	
	 @GetMapping("/students")
	    public ModelAndView showAll() {
	        ModelAndView mv = new ModelAndView("students");
	        
	        mv.addObject("list", repo.findAll());
//	        mv.setViewName("students");
	        
	        return mv;
	    }
	 
	 @GetMapping("/delete")
	    public String delete(@RequestParam String id) {
	        repo.deleteById(id);
	        return "redirect:/students";
	    }

	    @GetMapping("/update")
	    public ModelAndView updatePage(@RequestParam String id) {
	        ModelAndView mv = new ModelAndView("update");
	        mv.addObject("student", repo.findById(id).get());
	        return mv;
	    }

	    @GetMapping("/patch")
	    public String update(Student student) {
	        repo.save(student);
	        return "redirect:/students";
	    }
	
}
