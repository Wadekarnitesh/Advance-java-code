package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class ShowInfoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String i=req.getParameter("I");
		int id=Integer.parseInt(i);
		JdbcLogic jl=new JdbcLogic();
		
		ResultSet rs=jl.showData(id);
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
		
		try {
			while(rs.next()) {
				 pw.println("<h3>ID: " + rs.getInt("id") + "</h3>");
			        pw.println("<h3>Name: " + rs.getString("name") + "</h3>");
			        pw.println("<h3>Phone: " + rs.getLong("phone") + "</h3>");
			        pw.println("<h3>Password: " + rs.getString("password") + "</h3>");
			        pw.println("<hr>"); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		jl.closeConn();
		
	}
	
	
	

}
