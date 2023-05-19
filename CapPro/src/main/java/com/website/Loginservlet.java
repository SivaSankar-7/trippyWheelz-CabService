package com.website;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.websiteDao.LogDao;
import com.websiteDto.DriverDto;


@WebServlet("/Login")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String[] user=new String[3];

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username =request.getParameter("username");
		String password =request.getParameter("password");		
			
		DriverDto dto=new DriverDto(username,password);		
		LogDao dao=new LogDao();
			
		try {
			Boolean op=dao.search(dto);	
			
			if (op) {
				request.setAttribute("name", dao.name);
				request.setAttribute("mobile", dao.mobile);
				request.setAttribute("email", dao.email);
				RequestDispatcher rd=request.getRequestDispatcher("Booking.jsp");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd=request.getRequestDispatcher("Login2.html");
				rd.forward(request, response);
			}			
			
		} catch (SQLException | ClassNotFoundException e) {			
			e.printStackTrace();
		}					
}
	
}


