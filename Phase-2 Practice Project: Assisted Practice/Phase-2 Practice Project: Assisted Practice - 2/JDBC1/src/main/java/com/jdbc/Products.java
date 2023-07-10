package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Products
 */
@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
           
           Connection con = DBConnection.getConnection();
           Statement stmt = con.createStatement();
           stmt.executeUpdate("insert into eproduct (name, price, date_added) values ('New Product', 17800.00, now())");
           ResultSet rst = stmt.executeQuery("select * from eproduct");
           
           while (rst.next()) {
                   out.println(rst.getInt("ID") + ") " + rst.getString("name") + "<Br>");
           }
           
           stmt.close();
           
           
           
           out.println("</body></html>");
           con.close();
           
        	} catch (Exception e) {
        		e.printStackTrace();
        	}
		}
	}
