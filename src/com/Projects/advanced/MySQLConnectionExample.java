package com.Projects.advanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String password = "Akshara1@3";

        // Establish a connection to MySQL server
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the MySQL server successfully!");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query
            String query = "USE mysql";
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to the MySQL server!");
            e.printStackTrace();
        }
    }
}
