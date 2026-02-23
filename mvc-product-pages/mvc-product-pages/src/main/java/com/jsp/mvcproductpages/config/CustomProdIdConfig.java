package com.jsp.mvcproductpages.config;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomProdIdConfig implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		// TODO Auto-generated method stub
		
		
		String pref="PRD";
		int suff=0;
		
		JdbcConnectionAccess access = session.getJdbcConnectionAccess();
		
		try {
			Connection connection = access.obtainConnection();
			
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery("select nextval('prod_seq')");
			if(set.next()) {
				suff=set.getInt(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pref+suff;
	}

}
