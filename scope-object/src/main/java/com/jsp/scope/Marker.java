package com.jsp.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Marker {
	public Marker() {

		System.out.println("Marker Object is creted..");
	}

}
