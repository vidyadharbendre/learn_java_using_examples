package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to establish a connection to a MySQL database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "password");

            // The above line will throw a SQLException,
            // and the code below this line won't be executed.
            System.out.println("Connection established successfully.");
        } catch (SQLException e) {
            // Catch and handle the SQLException
            System.out.println("SQLException caught:");
            e.printStackTrace();
        }
    }
}
// The output of the above program is shown as below:
/*
SQLException caught:
java.sql.SQLException: No suitable driver found for jdbc:mysql://localhost:3306/db
	at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:708)
	at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:230)
	at com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn.SQLExceptionDemo.main(SQLExceptionDemo.java:11)
 */