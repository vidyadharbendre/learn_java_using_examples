package com.modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S03_03_Finally;

import java.io.FileWriter;
import java.io.IOException;

public class FinallyExample2 {
    public static void main(String[] args) {
        FileWriter fileWriterRefObj;
        fileWriterRefObj = null;

        try {
            // Code that may cause an exception
            fileWriterRefObj = new FileWriter("example.txt");
            fileWriterRefObj.write("Hello, world!");
        } catch (IOException e) {
            // Handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code that will always be executed
            try {
                if (fileWriterRefObj != null) {
                    fileWriterRefObj.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
            System.out.println("Finally block: This code will be executed whether an exception occurs or not.");
        }

        // Rest of the program continues after the try-catch-finally block
        System.out.println("Program continues...");
    }
}

// The output of the above program is shown as below:
/*
Finally block: This code will be executed whether an exception occurs or not.
Program continues...
 */