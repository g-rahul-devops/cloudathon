package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.dao.EmptyResultDataAccessException;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Method to check if user credentials are valid
    public boolean checkCredentials(String userId, String password) {
        // SQL query to check if a user exists with the provided userId and password
        String sql = "SELECT COUNT(*) FROM users WHERE user_id = ? AND password = ?";

        try {
            // Execute the query and return true if count > 0 (user found with matching credentials)
            int count = jdbcTemplate.queryForObject(sql, Integer.class, userId, password);
            return count > 0;
        } catch (EmptyResultDataAccessException e) {
            // If no user is found, return false
            return false;
        }
    }
}

