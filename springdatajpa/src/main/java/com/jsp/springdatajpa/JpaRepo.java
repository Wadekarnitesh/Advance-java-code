package com.jsp.springdatajpa;
import java.lang.annotation.Native;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.springdatajpa.entity.Mobile;

public interface JpaRepo extends JpaRepository<Mobile, Integer> {

	 // Distinct
    List<Mobile> findDistinctByBrand(String brand);

    // And
    List<Mobile> findByBrandAndPrice(String brand, double price);
    
    // Or
    List<Mobile> findByBrandOrPrice(String brand, double price);
    
    // Is / Equals
    List<Mobile> findByBrandIs(String brand);
    List<Mobile> findByBrandEquals(String brand);
    
    // Between
    List<Mobile> findByPriceBetween(double min, double max);

    // LessThan
    List<Mobile> findByPriceLessThan(double price);

    // GreaterThan
    List<Mobile> findByPriceGreaterThan(double price);

    // GreaterThanEqual
    List<Mobile> findByPriceGreaterThanEqual(double price);

 // After (used with numbers/dates)
    List<Mobile> findByPriceAfter(double price);

    // Before
    List<Mobile> findByPriceBefore(double price);

    // IsNull / Null
    List<Mobile> findByBrandIsNull();
    List<Mobile> findByBrandNull();

    // IsNotNull
    List<Mobile> findByBrandIsNotNull();

    // Like
    List<Mobile> findByBrandLike(String pattern);

    // StartingWith
    List<Mobile> findByBrandStartingWith(String prefix);

    
    // EndingWith
    List<Mobile> findByBrandEndingWith(String suffix);

//    // OrderBy
//    List<Mobile> findByBrandOrderByPriceAsc();
//    List<Mobile> findByBrandOrderByPriceDesc();
//
//    // Not
    List<Mobile> findByBrandNot(String brand);

    // In
    List<Mobile> findByBrandIn(List<String> brands);

    // True / False (boolean example – only works if field exists)
    // boolean isAvailable; we need a variable inside entity to use that 
//     List<Mobile> findByIsAvailableTrue();
//     List<Mobile> findByIsAvailableFalse();
     
     
     // IgnoreCase
     List<Mobile> findByBrandIgnoreCase(String brand);
     
     @Query(value = "FROM Mobile")
     List<Mobile> getAllMobileData();

     @Query(value = "FROM Mobile m Where m.id=?1 ")
     Mobile bringMobileById(@Param("id") int id);
     
     @NativeQuery(value = "select * from Mobile")
     List<Mobile> giveAllMobile();
     
     
     

	
}
