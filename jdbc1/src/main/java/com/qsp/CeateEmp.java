package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class CeateEmp {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			
			Statement stm=con.createStatement();
			
//			int rs1=stm.executeUpdate("drop table emp");
//			System.out.println(rs1);
			int rs=stm.executeUpdate("create table emp (id integer, name character varying, sal double precision, phno bigint)");
			
					System.out.println(rs);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
