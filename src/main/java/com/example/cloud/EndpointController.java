package com.example.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class EndpointController {
	
    @Autowired
    private DataSource dataSource;

    @GetMapping("/api")
    public String sayHello() {
        return "Hello, World!";
    }
    
    @GetMapping("/checkDB")
    public String checkDbConnection() throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            if (connection != null) {
                return "Database connected!";
            } else {
                return "Database connection failed!";
            }
        }
    }
}
