package com.Modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;

import java.net.MalformedURLException;
import java.net.URL;

public class MailFormedURLExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to create a URL with an invalid URL string
            URL url = new URL("invalid-url");

            // The above line will throw a MalformedURLException,
            // and the code below this line won't be executed.
            System.out.println("URL created successfully.");
        } catch (MalformedURLException e) {
            // Catch and handle the MalformedURLException
            System.out.println("MalformedURLException caught:");
            e.printStackTrace();
        }
    }
}

/*
Package Declaration:

package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;: Declares a package for the Java class.
Import Statements:

import java.net.MalformedURLException;: Imports the MalformedURLException class from the java.net package.
import java.net.URL;: Imports the URL class from the java.net package.
Class Declaration:

public class MailFormedURLExceptionDemo {: Declares a class named MailFormedURLExceptionDemo. The public keyword allows the class to be accessed from other packages.
Main Method:

public static void main(String[] args) {: Declares the main method. This method is the entry point of the program.
Try Block:

try {: Begins a try block where potentially exception-causing code is placed.
URL url = new URL("invalid-url");: Attempts to create a URL object with an invalid URL string ("invalid-url").
Catch Block:

catch (MalformedURLException e) {: Catches and handles a MalformedURLException if it occurs. It prints a message with the exception details.
Print Statements:

Inside the catch block, a message is printed to the console using System.out.println() to indicate that a MalformedURLException was caught. The e.printStackTrace() prints the stack trace of the exception, providing detailed information about the error.
In summary, this program demonstrates exception handling for creating a URL object with an invalid URL string. If a MalformedURLException occurs, it is caught and handled in the catch block, and relevant messages are printed to the console.

// The output of the above program is shown as below:

In this program:

We attempt to create a URL object with the string "invalid-url," which is an invalid URL.
The attempt to create the URL will throw a MalformedURLException.
We use a try-catch block to catch the MalformedURLException and print a message indicating that the exception was caught. The e.printStackTrace() prints the stack trace of the exception, providing detailed information about the error.

When you run this program, the output of the above program is shown as below:

MalformedURLException caught:
java.net.MalformedURLException: no protocol: invalid-url
	at java.base/java.net.URL.<init>(URL.java:772)
	at java.base/java.net.URL.<init>(URL.java:654)
	at java.base/java.net.URL.<init>(URL.java:590)
	at com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn.MailFormedURLExceptionDemo.main(MailFormedURLExceptionDemo.java:10)

 */