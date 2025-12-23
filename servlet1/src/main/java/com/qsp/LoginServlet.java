package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String i=req.getParameter("i");
		String pa=req.getParameter("pa");
		

		int id=Integer.parseInt(i);
		
		JdbcLogic jl=new JdbcLogic();
		
		Boolean b=  jl.verify(id, pa);
	
		
		if(b) {
//			PrintWriter pw=resp.getWriter();
//			pw.print("login successful");
			RequestDispatcher rd=req.getRequestDispatcher("home.html");
			rd.forward(req, resp);
		}
		
	
		
	}

}
