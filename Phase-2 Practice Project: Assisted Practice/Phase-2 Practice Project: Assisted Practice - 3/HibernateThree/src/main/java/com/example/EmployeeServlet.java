package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        // Activate Connection with database
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Open session
        Session session = sessionFactory.openSession();

        // Fetch all employees from the database
        List<Employee> employees = session.createQuery("FROM Employee", Employee.class).list();

        // Print employee details
        for (Employee employee : employees) {
            out.println("ID: " + employee.getId());
            out.println("Name: " + employee.getName());
            out.println("Salary: " + employee.getSalary());
            out.println();
        }

        // Close session and session factory
        session.close();
        sessionFactory.close();
    }
}
