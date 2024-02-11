/*
    Author  :
    Vidyadhar Bendre

    Email   :
    vidyadhar.bendre@gmail.com

    Date    : 14th November, 2023
    Purpose :
    Demonstrate the usage of the 'messageConstructor' class by creating instances and calling the 'displayMessage' method.

    Description:
    This Java class, named 'MainProgram', provides a main method to demonstrate the usage of the 'messageConstructor' class.
    It creates multiple instances of 'messageConstructor' with different greeting messages and calls the
    'displayMessage' method to print the greetings.
    This serves as an example of how to interact with a class by creating objects and invoking methods.

*/
package com.modules.M1_Overview.S0_00_OOPs;

public class MainProgram {
    public static void main(String[] args) {
        // Creating an instance of messageConstructor
        messageConstructor myMessage;
        myMessage = new messageConstructor("Vidyadhar");
        // Calling the displayMessage method to see the output
        myMessage.displayMessage();

        // Creating another instance of messageConstructor with a different greeting message
        messageConstructor myMessage1;
        myMessage1 = new messageConstructor("Mr. Bendre");
        // Calling the displayMessage method for the second instance
        myMessage1.displayMessage();

        // Creating yet another instance of messageConstructor with a different greeting message
        messageConstructor myMessage2;
        myMessage2 = new messageConstructor("Mr. Atharva");
        // Calling the displayMessage method for the third instance
        myMessage2.displayMessage();
    }
}

// The output of the above program is shown as below

/*

Hello! How are you doing Vidyadhar
Hello! How are you doing Mr. Bendre
Hello! How are you doing Mr. Atharva

 */
