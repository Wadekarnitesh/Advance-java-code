package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ConfigServletHardik extends HttpServlet{
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletConfig sf=getServletConfig();
		String wife=getInitParameter("wife");
		PrintWriter  pw=resp.getWriter();
		pw.print("<h2> Hardik wife: "+wife+"</h2>");
	}

}
