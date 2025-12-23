package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Try {

	public static void main(String[] args) {
		
		
		try(Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root"); Statement stm=con.createStatement())
		{
			stm.execute("Query");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
