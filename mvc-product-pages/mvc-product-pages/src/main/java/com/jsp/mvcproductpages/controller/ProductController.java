package com.jsp.mvcproductpages.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.mvcproductpages.entity.Product;
import com.jsp.mvcproductpages.repository.ProductJpa;


@Controller
public class ProductController {

	@Autowired
	private ProductJpa repo;

	@GetMapping("/add")
	public String addData() {
		return "addProd";
	}

	


	@PostMapping("/save")
	public String recieve(@ModelAttribute Product prod) {

		repo.save(prod);
		return "redirect:/add";

	}

	@GetMapping("/")
	public String show(Model model) {
		model.addAttribute("product", repo.findAll());

		return "see";
	}

	@GetMapping("/update")
	public String upto() {
		return "update";

	}

	@GetMapping("/pages")
	public String pagesData(@RequestParam(defaultValue = "0") int page, Model model) {

		int pageSize = 4;

		PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.by("id").ascending());
		Page<Product> all = repo.findAll(pageRequest);
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", all.getTotalPages());
		model.addAttribute("product", all.getContent());
		System.out.println(all.getContent());
	
		return "see2";
	}

	@GetMapping("/data")
	public String serch(@RequestParam String data) {

		return "redirect:https://www.google.com/search?q=" + data;
	}

	@GetMapping("/search")
	public String searchProducts(@RequestParam String keyword, @RequestParam(defaultValue = "0") int page,
			Model model) {

		int pageSize = 3;

		PageRequest pageable = PageRequest.of(page, pageSize, Sort.by("name").ascending());

		Page<Product> result = repo.findByNameContainingIgnoreCase(keyword, pageable);

		model.addAttribute("product", result.getContent());
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", result.getTotalPages());
		model.addAttribute("keyword", keyword); // IMPORTANT

		return "see2"; // reuse same JSP
	}

}
