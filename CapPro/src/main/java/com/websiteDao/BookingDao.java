package com.websiteDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.websiteDto.BookingDto;

public class BookingDao {
	
	
	public void insert( BookingDto obj) {
		
		String Query ="INSERT INTO`cap_db`.`booking_info` (`name`, `mobile`, `email`, `date`, `time`, `describe`) VALUES ('"+obj.getName()+"', '"+obj.getMobile()+"','"+obj.getEmail()+"', '"+obj.getDate()+"', '"+obj.getTime()+"', '"+obj.getDescribe()+"');";
	
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
