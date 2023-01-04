package com.Servlet.LoginRegister;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String	confirmPassword=request.getParameter("confirmPassword");
		RequestDispatcher dispatcher=null;
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginRegister","root","0000");
			PreparedStatement pst=con.prepareStatement("insert into users(uname,email,upass) values(?,?,?)");
			pst.setString(1,username);
			pst.setString(2,email);
			pst.setString(3, password);
			
			int rowCount=pst.executeUpdate();
			dispatcher=request.getRequestDispatcher("signup.jsp");
			if(rowCount>0) {
				request.setAttribute("status","success");
			}else {
				request.setAttribute("status","failed");
			}
			dispatcher.forward(request,response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
