package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataManipulationServlet")
public class DataManipulationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        performDataManipulation(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        performDataManipulation(request, response);
    }

    private void performDataManipulation(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Connection conn = null;
        try {
            conn = DBConnection.getConnection();

            // Perform data manipulation operations
         // Insert data
            String insertQuery = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
            insertStmt.setString(1, "John Doe");
            insertStmt.setString(2, "johndoe@example.com");
            int insertResult = insertStmt.executeUpdate();
            if (insertResult > 0) {
                out.println("Data inserted successfully.<br>");
            }

            // Update data
            String updateQuery = "UPDATE users SET email = ? WHERE id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
            updateStmt.setString(1, "newemail@example.com");
            updateStmt.setInt(2, 1);
            int updateResult = updateStmt.executeUpdate();
            if (updateResult > 0) {
                out.println("Data updated successfully.<br>");
            }

            // Delete data
            String deleteQuery = "DELETE FROM users WHERE id = ?";
            PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery);
            deleteStmt.setInt(1, 2);
            int deleteResult = deleteStmt.executeUpdate();
            if (deleteResult > 0) {
                out.println("Data deleted successfully.<br>");
            }

            out.println("Data manipulation operations completed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(conn);
        }
    }
}
