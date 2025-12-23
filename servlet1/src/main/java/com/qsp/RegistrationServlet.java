package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("i");
		String name=req.getParameter("n");
		String ph=req.getParameter("ph");
		String pass=req.getParameter("pa");
		
		int id1=Integer.parseInt(id);
		long phn=Long.parseLong(ph);
		
		JdbcLogic jl=new JdbcLogic();
		
		jl.save(id1, name, phn, pass);
		
		PrintWriter pw=resp.getWriter();
		pw.print("<h1> id: "+id+"</h1>");
		pw.print("<h1> name: "+name+"</h1>");
		pw.print("<h1> password: "+pass+"</h1>");
		pw.print("<h1> phone: "+ph+"</h1");
	}

	
}
