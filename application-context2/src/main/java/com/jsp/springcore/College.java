package com.jsp.springcore;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class College {
	public College() {
		System.out.println("College Obj created..");
	}

}
