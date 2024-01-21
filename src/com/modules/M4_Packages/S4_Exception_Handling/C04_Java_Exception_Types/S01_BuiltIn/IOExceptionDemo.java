package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;

import java.io.FileInputStream;
import java.io.IOException;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to create a FileInputStream for a nonexistent file
            FileInputStream fisRefObj;
            fisRefObj = new FileInputStream("nonexistent-file.txt");

            // The above line will throw an IOException,
            // and the code below this line won't be executed.
            System.out.println("FileInputStream created successfully.");
        } catch (IOException e) {
            // Catch and handle the IOException
            System.out.println("IOException caught:");
            e.printStackTrace();
        }
    }
}
