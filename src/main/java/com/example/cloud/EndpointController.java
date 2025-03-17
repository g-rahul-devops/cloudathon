package com.example.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Portfolio;

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
    
    @GetMapping("/dummyResponse")
    public Portfolio getDummyResponse() {
    	Portfolio portfolio = new Portfolio();
    	portfolio.setPortfolio_id(0);
    	portfolio.setUserid(0);
    	portfolio.setScripname("dd");
    	portfolio.setQuantities(0);
    	portfolio.setBuyavg(1.2);
    	portfolio.setInvstamt(1.4);
    	portfolio.setLtp(1.5);
    	portfolio.setCurramt(6.8);
    	portfolio.setP_and_l(2.4);
    	portfolio.setP_and_l_percentage(7.6);
    	return portfolio;
    }
}
