package com.jsp.springdatajpa;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.jsp.springdatajpa.entity.Mobile;
import com.jsp.springdatajpa.repo.MobileRepo;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringdatajpaApplication.class, args);
//		MobileRepo repo = run.getBean(MobileRepo.class);
//		System.out.println(repo.getClass().getName());

		// 1 save(): is perfrom insert + Update
//		Mobile mobile = new Mobile(9,"One plus", 12000);
//		repo.save(mobile);

		// 2 saveAll():- TO save More Object
//		Mobile mobile1 = new Mobile(2, "MI", 10000);
//		Mobile mobile2 = new Mobile(3, "OPPO", 9000);
//		
//
//		Iterable<Mobile> it=Arrays.asList(mobile1,mobile2);
//		
//		repo.saveAll(it);

		// 3 findById()
		// Optional is a finalclass is present in java.util package in version 1.8
		// to overcome proble of NullPointerException.
//		

//		Optional<Mobile> byId = repo.findById(3);
//		System.out.println(byId);
//		
//		

		// 4 existById() :- TO return true or false if id object exist or not

//		boolean b = repo.existsById(3);
//		System.out.println(b);
//		
		// 5 findAll() :- it return type is iterable (interface) in that have method
		// iterator() and
//		forEach() is default method take consumer interface argument

//		Iterable<Mobile> all = repo.findAll();
//		all.forEach(System.out::println);

		// 6 findAllById(ListOf Id): take a list of id

//		List<Integer> asList = Arrays.asList(1,2,3);

//		Iterable<Integer> itr= Arrays.asList(2,3);
//		
//		Iterable<Mobile> allById = repo.findAllById(itr);
//		System.out.println(allById);
//		

		// 7 count ():return count

//		long count = repo.count();
//		System.out.println(count);

		// 8 deleteById(id)

//		repo.deleteById(3);

		// 9 delete(Object )

//		repo.delete(new Mobile(2,"MI",10000));

		// 10 deleteAllById( list id )

//		repo.deleteAllById(Arrays.asList(1,2));

		//

		// 12 deleteAll()
//		repo.deleteAll();

		// Pagination And Sorting

//		List<Mobile> all = jpaRepo.findAll();
//		all.forEach(System.out::println);
//		 Sort by=Sort.by("name");
//		
//		
//		JpaRepo bean = run.getBean(JpaRepo.class);
//		
//		Sort by = Sort.by("price");
//		Sort ascending = by.ascending();
//		List<Mobile> all = bean.findAll(ascending);
//		all.forEach(System.out:: println);
		
//		Sort by1 = Sort.by("price");
//		Sort descending = by1.descending();
//		List<Mobile> all2 = bean.findAll(descending);
//		all2.forEach(System.out:: println);
		
//		List<Mobile> all = jpaRepo.findAll(by);
//		all.forEach(System.out:: println);
//		

		// Pagination

//		PageRequest of = PageRequest.of(0,3);
//		jpaRepo.findAll(of).forEach(System.out:: println);

		// USer Defind Method/ Spring Query

//		
//		jpaRepo.findAll().forEach(System.out::println);

		// Distinct
		// List<Mobile> findDistinctByBrand(String brand);
//		jpaRepo.findDistinctByBrand("Apple").forEach(System.out::print);

		// And
		// List<Mobile> findByBrandAndPrice(String brand, double price);
//		jpaRepo.findByBrandAndPrice("One plus", 12000).forEach(System.out::print);

		// Or
//	    List<Mobile> findByBrandOrPrice(String brand, double price);

//		jpaRepo.findByBrandOrPrice("Apple", 12000).forEach(System.out::print);

		// Is/Equals
//		jpaRepo.findByBrandIs("VIVO").forEach(System.out::print);
//		jpaRepo.findByBrandEquals("Apple").forEach(System.out::print);
//		

		// Between
//	    List<Mobile> findByPriceBetween(double min, double max);
//		jpaRepo.findByPriceBetween(9000, 50000).forEach(System.out::println);
//		System.out.println("Between");

		// LessThan
//	    List<Mobile> findByPriceLessThan(double price);
//		jpaRepo.findByPriceLessThan(10000).forEach(System.out::println);
//		System.out.println("Less than");

		// GreaterThan
//	    List<Mobile> findByPriceGreaterThan(double price);
//		jpaRepo.findByPriceGreaterThan(50000).forEach(System.out ::println);
//		System.out.println("Grater than");

		// GreaterThanEqual
//	    List<Mobile> findByPriceGreaterThanEqual(double price);
//		jpaRepo.findByPriceGreaterThanEqual(50000).forEach(System.out ::println);
//		System.out.println("Grater than equal");

		// After (used with numbers/dates)
//	    List<Mobile> findByPriceAfter(double price);
//		jpaRepo.findByPriceAfter(19000).forEach(System.out::print);
//		System.out.println("After");

		// Before
//	    List<Mobile> findByPriceBefore(double price);
//		jpaRepo.findByPriceBefore(9000).forEach(System.out::print);
//		System.out.println("Before");

		// IsNull / Null
//	    List<Mobile> findByBrandIsNull();
//		jpaRepo.findByBrandIsNull().forEach(System.out::print);

//		System.out.println("IS null");
//	    List<Mobile> findByBrandNull();
//		jpaRepo.findByBrandNull().forEach(System.out::print);
//		System.out.println(" null");
		
		
		  // IsNotNull
//	    List<Mobile> findByBrandIsNotNull();
//		jpaRepo.findByBrandIsNotNull().forEach(System.out::print);
//		System.out.println("Not null");
	    

	    // Like
//	    List<Mobile> findByBrandLike(String pattern);
//		jpaRepo.findByBrandLike("A%l").forEach(System.out::print);
//		System.out.println(" like");
	    

	    // StartingWith
//    List<Mobile> findByBrandStartingWith(String prefix);
//	    jpaRepo.findByBrandStartingWith("Mo").forEach(System.out::print);
//		System.out.println("StartingWith ");

		
	    // EndingWith
//	    List<Mobile> findByBrandEndingWith(String suffix);
//		jpaRepo.findByBrandEndingWith("us").forEach(System.out::print);
//		System.out.println("EndingWith ");

	    // OrderBy
//	    List<Mobile> findByBrandOrderByPriceAsc();
//		jpaRepo.findByBrandOrderByPriceAsc().forEach(System.out::print);
	    
//	    List<Mobile> findByBrandOrderByPriceDesc();
//		jpaRepo.findByBrandOrderByPriceDesc().forEach(System.out::print);

	    
	    // Not
//	    List<Mobile> findByBrandNot(String brand);
//	    jpaRepo.findByBrandNot("Apple").forEach(System.out::print);
		
		
		 // In
//	    List<Mobile> findByBrandIn(List<String> brands);
//		jpaRepo.findByBrandIn(Arrays.asList("Moto","Apple","Vivo")).forEach(System.out:: println);

	    // True / False (boolean example – only works if field exists)
	    // boolean isAvailable;
	    // List<Mobile> findByIsAvailableTrue();
		
	    // List<Mobile> findByIsAvailableFalse();


		   
	    // IgnoreCase
//	    List<Mobile> findByBrandIgnoreCase(String brand);
//		jpaRepo.findByBrandIgnoreCase("vivo").forEach(System.out::println);
		
		
		JpaRepo jpaRepo = run.getBean(JpaRepo.class);
//		jpaRepo.giveAllMobile().forEach(System.out::println);
		
//		System.out.println(jpaRepo.bringMobileById(9).toString());
		
//		jpaRepo.getAllMobileData().forEach(System.out::print);
		
//		jpaRepo.deleteById(1);
		
		Mobile mobile = new Mobile();
		mobile.setBrand("Apple");
		mobile.setPrice(12000);
		jpaRepo.save(mobile);
		
		

	}

	

}
