package com.commerce.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.commerce.auth.Authentication;

public class AuthenticationTest {

    private Authentication authentication;

    @BeforeEach
    public void setUp() {
        // Create a new instance of Authentication before each test
        authentication = new Authentication();
    }

    @Test
    public void testLogin_ValidCredentials_ShouldReturnTrue() {
        // Test login with valid credentials
        assertTrue(authentication.login("Sathwik", "Sathwik@123"));
    }

    @Test
    public void testLogin_InvalidUsername_ShouldReturnFalse() {
        // Test login with invalid username
        assertFalse(authentication.login("invalidUser", "Sathwik@123"));
    }

    @Test
    public void testLogin_InvalidPassword_ShouldReturnFalse() {
        // Test login with invalid password
        assertFalse(authentication.login("Sathwik", "invalidPassword"));
    }

    @Test
    public void testLogout_ShouldReturnTrue() {
        // Test logout (placeholder, no specific logic implemented)
        assertTrue(authentication.logout("Sathwik"));
    }

    @Test
    public void testChangePassword_ValidCredentials_ShouldReturnTrue() {
        // Test changing password with valid credentials
        assertTrue(authentication.changePassword("Sathwik", "Sathwik@123", "newPassword"));
    }

    @Test
    public void testChangePassword_InvalidUsername_ShouldReturnFalse() {
        // Test changing password with invalid username
        assertFalse(authentication.changePassword("invalidUser", "Sathwik@123", "newPassword"));
    }

    @Test
    public void testChangePassword_InvalidOldPassword_ShouldReturnFalse() {
        // Test changing password with invalid old password
        assertFalse(authentication.changePassword("Sathwik", "invalidPassword", "newPassword"));
    }
}
