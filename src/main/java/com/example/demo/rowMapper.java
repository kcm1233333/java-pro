package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class rowMapper implements RowMapper<modelLogin >{

	@Override
	public modelLogin mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		modelLogin modelLogin=new modelLogin();
		modelLogin.setEmail(rs.getString("email"));
		modelLogin.setUsername(rs.getString("username"));
		modelLogin.setKatasandi(rs.getString("password"));
		return modelLogin;
	}
    
	
}
