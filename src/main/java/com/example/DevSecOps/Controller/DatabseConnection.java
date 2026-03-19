package com.example.DevSecOps.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabseConnection {
    public Connection getConnection() throws SQLException {
        String username = "root";  // Hardcoded credentials
        String password = "password123";  // Hardcoded credentials
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", username, password);
    }
}