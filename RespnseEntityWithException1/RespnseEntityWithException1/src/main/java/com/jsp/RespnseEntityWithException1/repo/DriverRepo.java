package com.jsp.RespnseEntityWithException1.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.RespnseEntityWithException1.entity.DriverData;

public interface DriverRepo extends JpaRepository<DriverData, Integer>{

}
