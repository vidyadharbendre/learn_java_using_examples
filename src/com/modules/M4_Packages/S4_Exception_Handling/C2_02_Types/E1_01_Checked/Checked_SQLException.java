package com.modules.M4_Packages.S4_Exception_Handling.C2_02_Types.E1_01_Checked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Checked_SQLException {
    public static void main(String[] args) {
        try {
            // Registering the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating a connection
            Connection connectionRefObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "username", "password");

            // Do something with the connection if needed

            // Closing the connection
            connectionRefObj.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); // You might want to handle the exception appropriately
        }
    }
}
