package com.websiteDto;

public class BookingDto {
	private String name;
	private String mobile;
	private String email;
	private String date;
	private String time;
	private String describe;
	
	public BookingDto(String name, String mobile, String email, String date, String time,String describe) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.date = date;
		this.time = time;
		this.describe=describe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public void setDescribe(String describe) {
		this.describe=describe;
	}
	public String getDescribe() {
		return describe;
	}

}
