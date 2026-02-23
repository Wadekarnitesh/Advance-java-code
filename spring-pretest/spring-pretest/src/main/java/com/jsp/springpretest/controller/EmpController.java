package com.jsp.springpretest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.springpretest.entity.Employee;
import com.jsp.springpretest.repo.EmpRepo;

@Controller
public class EmpController {

	@Autowired
	private EmpRepo repo;

	@GetMapping("/home")
	public String addData() {
		return "home";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/save")
	public String recieve(@ModelAttribute Employee emp) {
	repo.save(emp);
		return "redirect:/home";

	}

	@GetMapping("/update")
	public String updateData(@RequestParam String id, Model model) {

		Employee emp = repo.findById(id).get();

		model.addAttribute("emp", emp);

		return "update";

	}


	@GetMapping("/delete")
	public String delete(@RequestParam String id)
	{
		repo.deleteById(id);
		return "redirect:display";
	}
	
	

	@GetMapping("search")
	public String search(@RequestParam String data) {
		return "redirect:https://www.google.com/search?q=" + data;
	}

	@GetMapping("/display")
	public String diaplayData(@RequestParam(defaultValue = "0") int page, Model model) {

		int pageSize = 2;

		PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.by("id").descending());
		Page<Employee> all = repo.findAll(pageRequest);
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", all.getTotalPages());
		model.addAttribute("list", all.getContent());

		return "display";
	}

}
