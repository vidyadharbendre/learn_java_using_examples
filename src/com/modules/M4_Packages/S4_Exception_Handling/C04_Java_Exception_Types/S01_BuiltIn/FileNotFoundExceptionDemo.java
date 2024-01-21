package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to create a FileInputStream for a nonexistent file
            FileInputStream fis = new FileInputStream("nonexistent-file.txt");

            // The above line will throw a FileNotFoundException,
            // and the code below this line won't be executed.
            System.out.println("FileInputStream created successfully.");
        } catch (FileNotFoundException e) {
            // Catch and handle the FileNotFoundException
            System.out.println("FileNotFoundException caught:");
            e.printStackTrace();
        }
    }
}

// The output of the above program is shown as below
/*
FileNotFoundException caught:
java.io.FileNotFoundException: nonexistent-file.txt (No such file or directory)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:106)
	at com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn.FileNotFoundExceptionDemo.main(FileNotFoundExceptionDemo.java:10)
 */