package com.website;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.websiteDao.SigninDao;
import com.websiteDto.SignDto;

@WebServlet("/Singin")
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String name=request.getParameter("name");
		String mobile=request.getParameter("mobile");
		String email=request.getParameter("email");
		String age=request.getParameter("age");
		String place=request.getParameter("place");
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("confirmPassword");
		
	//	System.out.println("Name"+name +"UserName"+userName +"PAssword 1"+password+"Mobile"+ mobile +"Email"+email+ "Age"+age +"Place"+place+"Password2"+confirmpassword);
		if(password.equals(confirmpassword)) {
			SignDto dto =new SignDto(name,userName,password,mobile,email,age,place);
			SigninDao dao=new SigninDao();
			dao.insert(dto);		
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.forward(request, response);									
		}else {			 
			RequestDispatcher rd=request.getRequestDispatcher("signin2.html");
			rd.forward(request, response);					
		}					
	}
}
