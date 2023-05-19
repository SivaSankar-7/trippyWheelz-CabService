package com.websiteDto;

public class SignDto {
	private String name;
	private String username;
	private String password;
	private String mobile;

	private String email;
	private String age;
	private String place;
	
	public SignDto(String name, String username, String password, String mobile, String email, String age,
			String place) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.age = age;
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}	

}
