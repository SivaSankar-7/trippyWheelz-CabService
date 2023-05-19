package com.websiteDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.websiteDto.SignDto;

public class SigninDao {
	 
	public void insert( SignDto obj) {
		String Query ="INSERT INTO `cap_db`.`user_info` (`Name`, `Username`, `Password`, `MobileNO`, `Email`, `Age`, `Place`) VALUES ('"+obj.getName()+"', '"+obj.getUsername()+"','"+obj.getPassword()+"', '"+obj.getMobile()+"', '"+obj.getEmail()+"', '"+obj.getAge()+"', '"+obj.getPlace()+"');";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cap_db", "root", "root");
			Statement stmt=con.createStatement();
			stmt.executeUpdate(Query);
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		
	}

}
