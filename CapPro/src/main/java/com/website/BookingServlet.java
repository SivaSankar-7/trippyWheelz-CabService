package com.website;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.websiteDao.BookingDao;
import com.websiteDao.DriverDao;
import com.websiteDto.BookingDto;

@WebServlet("/Booking")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String cabType;
	
	String name;
	String date;
	String time;
	String address;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		date = request.getParameter("date");
		time = request.getParameter("time");
		address = request.getParameter("desc");

		BookingDto dto = new BookingDto(name, mobile, email, date, time, address);
		BookingDao dao = new BookingDao();
		dao.insert(dto);
		// Using for ooking conformation
		cabType = request.getParameter("cabType");

		DriverDao obj = new DriverDao();
		ResultSet rs = obj.searchCab(cabType);
		try {
			while (rs.next()) {
				request.setAttribute("Name", name);
				request.setAttribute("Date", date);
				request.setAttribute("Time", time);
				request.setAttribute("Address",address);
				
				request.setAttribute("DriverName", rs.getString("Name"));
				request.setAttribute("Age", rs.getString("Age"));
				request.setAttribute("Place", rs.getString("Place"));
				request.setAttribute("Experience", rs.getString("Experience"));
				request.setAttribute("DriverEmail", rs.getString("Email"));
				request.setAttribute("Mobile", rs.getString("Mobile"));
				request.setAttribute("RegisterNo", rs.getString("RegisterNo"));
				request.setAttribute("CarColour", rs.getString("Colour"));
				request.setAttribute("Rate", rs.getString("RatePerKm"));

				RequestDispatcher rd = request.getRequestDispatcher("Confirm.jsp");
				rd.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*
 * String drivername = rs.getString("Name"); String age = rs.getString("Age");
 * String place = rs.getString("Place"); String exp =
 * rs.getString("Experience"); String driveremail = rs.getString("Email");
 * String mob = rs.getString("Mobile"); String reg = rs.getString("RegisterNo");
 * String colour = rs.getString("Colour"); String rate =
 * rs.getString("RatePerKm");
 */