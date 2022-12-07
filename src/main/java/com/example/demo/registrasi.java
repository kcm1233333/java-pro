package com.example.demo;

import java.util.List;

//import java.util.List;

//import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class registrasi implements regisINT{
	
	private static JdbcTemplate template;
	@Autowired
	public registrasi(DataSource dataSource) {
		template =new  JdbcTemplate(dataSource);
	}
    @Override
    public int regis(String email, String pengguna, String katasandi) {
          //modelLogin mlog=new modelLogin(modell.getEmail(),modell.getUsername(),modell.getKatasandi());
    	return template.update("insert into account values(?,?,?)", new Object[] {email, pengguna,katasandi});
    }
    
	@Override
    public modelLogin login(String email,String katasandi) {
		return template.queryForObject("SELECT * FROM account WHERE email = ? AND password = ?",
		        new rowMapper(), new Object[] { email, katasandi} );	
    }
	@Override
	public List<modelLogin> tarikSemua(){
	  return template.query("select * from account", new rowMapper());	
	}
	
}
