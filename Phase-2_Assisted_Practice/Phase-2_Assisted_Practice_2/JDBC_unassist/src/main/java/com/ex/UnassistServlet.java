package com.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UnassistServlet")
public class UnassistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			
			Connection con = DBConnection.getConnection();
			out.println("DataBase connection initialized.<br>");
			
			con.close();
			out.println("DataBase Connection closed.<br>");
			
			out.println("</body></html>");
		}
		catch (Exception e) {
		    e.printStackTrace();
		    }
		 }
	}
	
