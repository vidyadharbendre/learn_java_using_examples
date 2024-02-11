package com.Modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to create a FileInputStream for a nonexistent file
            FileInputStream fisRefObj;
            fisRefObj = new FileInputStream("nonexistent-file.txt");

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

/*
Package Declaration:

package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;: Declares a package for the Java class.
Import Statements:

import java.io.FileInputStream;: Imports the FileInputStream class from the java.io package.
import java.io.FileNotFoundException;: Imports the FileNotFoundException class from the java.io package.
Class Declaration:

public class FileNotFoundExceptionDemo {: Declares a class named FileNotFoundExceptionDemo. The public keyword allows the class to be accessed from other packages.
Main Method:

public static void main(String[] args) {: Declares the main method. This method is the entry point of the program.
Try Block:

try {: Begins a try block where potentially exception-causing code is placed.
FileInputStream fisRefObj = new FileInputStream("nonexistent-file.txt");: Attempts to create a FileInputStream object for a nonexistent file ("nonexistent-file.txt").
Catch Block:

catch (FileNotFoundException e) {: Catches and handles a FileNotFoundException if it occurs. It prints a message with the exception details.
Print Statements:

Inside the catch block, a message is printed to the console using System.out.println() to indicate that a FileNotFoundException was caught. The e.printStackTrace() prints the stack trace of the exception, providing detailed information about the error.
Output Comments:

Below the program, there are comments representing the expected output when the program is run. This output includes the details of the caught FileNotFoundException, showing the file path and the error message.
In summary, this program demonstrates exception handling for creating a
FileInputStream object for a nonexistent file.
If a FileNotFoundException occurs, it is caught and handled in the catch block, and
relevant messages are printed to the console.

The output of the above program is shown as below

FileNotFoundException caught:
java.io.FileNotFoundException: nonexistent-file.txt (No such file or directory)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:106)
	at com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn.FileNotFoundExceptionDemo.main(FileNotFoundExceptionDemo.java:10)
 */