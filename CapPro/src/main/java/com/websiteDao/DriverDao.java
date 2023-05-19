package com.websiteDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

public class DriverDao {
	ResultSet rs;
	
	  public ResultSet  searchCab(String cab) {
		String Query = "select * from driver_info where `CarModel`='" + cab + "';";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cap_db", "root", "root");
			Statement stmt = con.createStatement();
			 rs = stmt.executeQuery(Query);	
			
			/*
			 * while (rs.next()) { String name = rs.getString("Name"); String aass =
			 * rs.getString("Age"); String place = rs.getString("Place"); String exp =
			 * rs.getString("Experience"); String email = rs.getString("Email"); String mob
			 * = rs.getString("Mobile"); String reg = rs.getString("RegisterNo"); String
			 * colour = rs.getString("Colour"); String pass = rs.getString("password"); }
			 */
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
						
		
}

	
	
}
