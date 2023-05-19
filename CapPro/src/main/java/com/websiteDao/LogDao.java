package com.websiteDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.website.Loginservlet;
import com.websiteDto.DriverDto;

public class LogDao {
	public String name,mobile,email;

	public Boolean search(DriverDto obj) throws SQLException, ClassNotFoundException {

		String Query = "select * from user_info where `username`='" + obj.getUsername() + "'&&`password`='"
				+ obj.getPassword() + "';";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cap_db", "root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(Query);
		boolean opt = false;
		while (rs.next()) {
			String name = rs.getString("username");
			String Pass = rs.getString("password");
		

			if (obj.getUsername().equals(name) && obj.getPassword().equals(Pass)) {
				
				 userinfo(rs.getString("name"), rs.getString("mobileNO"), rs.getString("email")); 

				return true;
			} else {
				opt = false;
			}
		}
		return opt;
	}
					

	public void userinfo(String n, String m, String e) {
		this. name=n;
		this.mobile=m;
		this.email=e;			
	}
	
		
	


}
