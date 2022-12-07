package com.example.demo;

public class modelLogin {
  public String email;
  public String username;
  public String katasandi;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getKatasandi() {
	return katasandi;
}
public void setKatasandi(String katasandi) {
	this.katasandi = katasandi;
}
  
public  modelLogin(){
	  
  }
public modelLogin(String email,String username, String katasandi) {
	this.email=email;
	this.username=username;
	this.katasandi=katasandi;
}
public modelLogin(String email, String katasandi) {
	this.email=email;
	this.katasandi=katasandi;	
}

}
