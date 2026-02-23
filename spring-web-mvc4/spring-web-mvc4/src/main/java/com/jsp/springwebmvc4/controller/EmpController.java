package com.jsp.springwebmvc4.controller;

import org.springframework.ui.Model;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springwebmvc4.entity.Employee;
import com.jsp.springwebmvc4.repo.EmployeeRepo;

@Controller
public class EmpController {

	@Autowired
	private EmployeeRepo repo;

	@GetMapping("/form")
	public String get() {
		return "form";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute Employee emp) {
		System.out.println(emp);
		repo.save(emp);
		return "redirect:show";
	}
	/*
	 * @PostMapping("/save") public String save(@ModelAttribute Employee emp) {
	 * Employee employee = new Employee(emp.getName(), emp.getSalary(),
	 * emp.getSkill());
	 * 
	 * System.out.println(emp); repo.save(employee); return "redirect:show"; }
	 */

	@GetMapping("/show")
	public String show(Model model) {

		Sort by = Sort.by("id");
//		Sort by=Sort.by("name");
		Sort ascending = by.ascending();
		List<Employee> list = repo.findAll(ascending);
		model.addAttribute("list", list);
		return "show";
	}

	@GetMapping("/show2")
	public String show2(Model model) {

		PageRequest of = PageRequest.of(0, 4);
		Page<Employee> all = repo.findAll(of);
		List<Employee> content = all.getContent();
		model.addAttribute("list", content);
		return "show";
	}

	/*
	 * @GetMapping("/show") public ModelAndView show() { ModelAndView mv = new
	 * ModelAndView("show");
	 * 
	 * mv.addObject("list",repo.findAll());
	 * 
	 * return mv; }
	 */

	@GetMapping("/update")
	public String up() {
		return "update";
	}

	/*
	 * @GetMapping("/update") public String updateData(@RequestParam int id, Model
	 * model) {
	 * 
	 * Employee emp = repo.findById(id).get();
	 * 
	 * model.addAttribute("emp", emp);
	 * 
	 * return "update"; }
	 */

	@GetMapping("/delete")
	public String deleteEmp(@RequestParam int id) {
		repo.deleteById(id);
		return "redirect:/show";
	}

	@GetMapping("/display")
	public String display(@RequestParam(defaultValue = "0") int page, Model model) {

		int pageSize = 4;

		PageRequest pageable = PageRequest.of(page, pageSize, Sort.by("id").ascending());

		Page<Employee> empPage = repo.findAll(pageable);

		model.addAttribute("list", empPage.getContent());
		model.addAttribute("currentPage", page);
//		System.out.println(page+" page");
		model.addAttribute("totalPages", empPage.getTotalPages());
//		System.out.println( empPage.getTotalPages()+" gett total");
		
		
		return "display";
	}



}
