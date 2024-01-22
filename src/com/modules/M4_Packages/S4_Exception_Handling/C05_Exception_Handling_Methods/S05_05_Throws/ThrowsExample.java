package com.modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S05_05_Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            processFile("nonexistent-file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that declares it 'throws' a checked exception
    static void processFile(String filename) throws FileNotFoundException {
        // Code that might throw a checked exception
        FileInputStream fis = new FileInputStream(filename);
        // Additional processing...
    }
}

// The output of the above program is shown as below
/*
Exception caught: nonexistent-file.txt (No such file or directory)
 */