package com.jsp.springcore.Driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jsp.springcore.Computer;

public class ComputerDriver {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("myConfig.xml");
		
		BeanFactory bf=new XmlBeanFactory(resource);
		
		Computer bean = bf.getBean(Computer.class);
	}
	
}
