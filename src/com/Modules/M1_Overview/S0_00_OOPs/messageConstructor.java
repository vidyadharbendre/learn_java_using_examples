
/*

    Author  : Vidyadhar Bendre

    Email   : vidyadhar.bendre@gmail.com

    Date    : 14 November, 2023

    Purpose:
    Demonstrate the use of a simple class with a constructor and a method.

    Description:
    This Java class, named 'messageConstructor', serves as a basic example of a class with a constructor
    and a method. It showcases the fundamental structure of a class in Java and how to encapsulate data
    and behavior within it.

    The class includes a private member variable 'message' to store a greeting message.
    The constructor 'messageConstructor' is responsible for initializing the 'message' variable during the
    object's creation. The class also contains a public method 'displayMessage' that prints a greeting message using the stored 'message'.


 */
package com.Modules.M1_Overview.S0_00_OOPs;
public class messageConstructor {

    // Private member variable to store the message
    private String message;

    // Constructor method that initializes the 'message' variable with a provided greeting message.
    public messageConstructor(String greet_message) {
        // Initialize the 'message' variable with the provided message during object creation.
        this.message = greet_message;
    }

    // Public method named 'displayMessage' to showcase the stored message.
    public void displayMessage() {
        // Print a greeting message using the stored 'message' variable.
        System.out.println("Hello! How are you doing " + this.message);
    }
}
