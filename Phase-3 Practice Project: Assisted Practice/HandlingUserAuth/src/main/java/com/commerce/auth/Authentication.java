package com.commerce.auth;

import java.util.HashMap;
import java.util.Map;

public class Authentication {


    private Map<String, String> users = new HashMap<>();

    public Authentication() {
        // Initialize the user database with some users (username, password)
        users.put("Sathwik", "Sathwik@123");
        users.put("Rajesh", "Rajesh@123");
        users.put("Bharagav", "Bhargav@123");
    }

    // Method to authenticate a user
    public boolean login(String username, String password) {
        // Check if the provided username exists in the user database
        if (users.containsKey(username)) {
            // Check if the provided password matches the stored password for the given username
            String storedPassword = users.get(username);
            if (password.equals(storedPassword)) {
                return true; // Authentication successful
            }
        }
        return false; // Authentication failed
    }

    // Method to log out a user (currently a placeholder, no specific logic implemented)
    public boolean logout(String username) {
        return true; // Logout successful 
    }

    // Method to change a user's password
    public boolean changePassword(String username, String oldPassword, String newPassword) {
        // Check if the provided username exists in the user database
        if (users.containsKey(username)) {
            // Check if the provided old password matches the stored password for the given username
            String storedPassword = users.get(username);
            if (oldPassword.equals(storedPassword)) {
                // Update the stored password with the new password
                users.put(username, newPassword);
                return true; // Password change successful
            }
        }
        return false; // Password change failed
    }
}
