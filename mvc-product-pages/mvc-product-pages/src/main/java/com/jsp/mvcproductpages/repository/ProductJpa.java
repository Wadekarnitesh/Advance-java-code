package com.jsp.mvcproductpages.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.mvcproductpages.entity.Product;

public interface ProductJpa extends JpaRepository<Product, String> {
	 Page<Product> findByNameContainingIgnoreCase(String name, Pageable pageable);

}
