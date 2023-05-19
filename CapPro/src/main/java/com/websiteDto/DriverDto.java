package com.websiteDto;

public class DriverDto {
	private String username;
	private String password;
	
public	DriverDto(String name,String pass){
		username=name;
		password=pass;
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
