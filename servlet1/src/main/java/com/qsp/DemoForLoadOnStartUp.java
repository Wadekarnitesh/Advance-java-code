package com.qsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
@WebServlet(value = "/demoLoad1", loadOnStartup = 1)
public class DemoForLoadOnStartUp extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() 1");
	}
	

}
