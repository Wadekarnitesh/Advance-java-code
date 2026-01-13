package com.jsp.springcore.primary_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "dieasel")
@Primary
public class DieaselEngine implements Engine{

	@Override
	public void start() {

		System.out.println("Dieasel Engine Started..");		
	}
	
}
