package com.qsp_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudent {
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  try {
		Class.forName("org.postgresql.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","root");
		
		PreparedStatement ps=con.prepareStatement("update student set name=? where id=?");
		System.out.println("enter a name:- ");
		ps.setString(1, sc.next());
		System.out.println("Enter a id:- ");
		ps.setInt(2,sc.nextInt());
	
		ps.execute();
		System.out.println("update successfull.........");
		
		con.close();
		
	  } catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	  }
}
}
