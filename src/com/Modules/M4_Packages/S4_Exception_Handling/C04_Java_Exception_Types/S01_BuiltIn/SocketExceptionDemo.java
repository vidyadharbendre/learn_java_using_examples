package com.Modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;

/*
Author:
Vidyadhar Bendre

Email:
vidyadhar.bendre@gmail.com
 */
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class SocketExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to create a socket with an invalid host and port
            Socket socketRefObj = new Socket("invalid-host", 8080);

            // The above line will throw a SocketException,
            // and the code below this line won't be executed.
            System.out.println("Socket created successfully.");
        } catch (SocketException e1) {
            // Catch and handle the SocketException
            System.out.println("SocketException caught: " + e1.getMessage());
        } catch (IOException e2) {
            // Catch and handle more general IOException
            System.out.println("IOException caught: " + e2.getMessage());
        }
    }
}
/*
Package Declaration:

package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;: Declares a package for the Java class. Packages help organize and structure code.
Import Statements:

import java.io.IOException;: Imports the IOException class from the java.io package.
import java.net.Socket;: Imports the Socket class from the java.net package.
import java.net.SocketException;: Imports the SocketException class from the java.net package.
Class Declaration:

public class SocketExceptionDemo {: Declares a class named SocketExceptionDemo. The public keyword allows the class to be accessed from other packages.
Main Method:

public static void main(String[] args) {: Declares the main method. This method is the entry point of the program.
Try Block:

try {: Begins a try block where potentially exception-causing code is placed.
Socket socketRefObj = new Socket("invalid-host", 8080);: Attempts to create a Socket object with an invalid host and port (simulating a connection to an invalid server).
Catch Blocks:

catch (SocketException e1) {: Catches and handles a SocketException if it occurs. It prints a message with the exception details.
catch (IOException e2) {: Catches and handles a more general IOException if it occurs. It prints a message with the exception details.
Print Statements:

Inside the catch blocks, messages are printed to the console using System.out.println() to indicate which exception was caught and display the exception message.
In summary, this program demonstrates exception handling for creating a Socket object with an invalid host and port. If a SocketException occurs, it is caught and handled specifically. If a more general IOException occurs, it is caught and handled in a separate catch block.
The program prints relevant messages to the console based on the caught exception.
 */
// The output of the above program is shown as below
/*
IOException caught: invalid-host
 */