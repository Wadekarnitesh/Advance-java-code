package com.qsp_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	try {
		Class.forName("org.postgresql.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
		
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
		
		System.out.println("Enter a id");
		ps.setInt(1,sc.nextInt());
		System.out.println("Enter a name");
		ps.setString(2,sc.next());
		
		System.out.println("Enter a phno");
		ps.setLong(3, sc.nextLong());
		
		ps.execute();
		System.out.println("inserted");
		
		PreparedStatement ps2=con.prepareStatement("select * from student");
		ResultSet rs=ps2.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getLong(3));
		}
		
		con.close();		
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}


}
