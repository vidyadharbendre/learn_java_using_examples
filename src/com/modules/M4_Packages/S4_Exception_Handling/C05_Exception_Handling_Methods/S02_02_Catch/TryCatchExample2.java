package com.modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S02_02_Catch;

import java.util.Scanner;

public class TryCatchExample2 {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int number = readInteger(); // This may cause an InputMismatchException
            System.out.println("Entered number: " + number); // This won't be executed if an exception occurs
        } catch (java.util.InputMismatchException e) {
            // Handle the exception
            System.out.println("Exception caught: Input is not an integer.");
        }

        // Rest of the program continues after the try-catch block
        System.out.println("Program continues...");
    }

    // A method that reads an integer from the user
    private static int readInteger() {
        Scanner scannerRefObj;
        scannerRefObj = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scannerRefObj.nextInt(); // This may throw an InputMismatchException
    }
}

// The output of the above program is shown as below
/*
Enter an integer: 12
Entered number: 12
Program continues...
 */

/*
Enter an integer: 56.0
Exception caught: Input is not an integer.
Program continues...
 */