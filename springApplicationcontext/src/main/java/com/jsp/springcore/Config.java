package com.jsp.springcore;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan  When we use this it use current package for scanx 
@ComponentScan("com.jsp.springcore,com.qsp.springcore")
public class Config {

}

