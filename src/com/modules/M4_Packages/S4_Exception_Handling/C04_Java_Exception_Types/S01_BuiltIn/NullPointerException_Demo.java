package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;

public class NullPointerException_Demo {
    public static void main(String[] args) {
        // Create a null String
        String strRefObj;
        strRefObj = null;

        try {
            // Attempt to get the length of the null String
            int length = strRefObj.length();

            // The above line will throw a NullPointerException,
            // and the code below this line won't be executed.
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            // Catch and handle the NullPointerException
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}

/*
Package Declaration:

package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;: Declares a package for the Java class.
Class Declaration:

public class NullPointerException_Demo {: Declares a class named NullPointerException_Demo. The public keyword allows the class to be accessed from other packages.
Main Method:

public static void main(String[] args) {: Declares the main method. This method is the entry point of the program.
Null String Initialization:

String strRefObj;: Declares a String reference variable.
strRefObj = null;: Assigns null to the String reference variable, creating a null String.
Try Block:

try {: Begins a try block where potentially exception-causing code is placed.
int length = strRefObj.length();: Attempts to get the length of the null String.
Catch Block:

catch (NullPointerException e) {: Catches and handles a NullPointerException if it occurs. It prints a message with the exception details.
Print Statements:

Inside the catch block, a message is printed to the console using System.out.println() to indicate that a NullPointerException was caught. The e.getMessage() prints the specific error message associated with the exception.
Output Comments:

Below the program, there are comments representing the expected output when the program is run. This output includes the details of the caught NullPointerException, showing the error message.
In summary, this program demonstrates exception handling for attempting to get the length of a null String. If a NullPointerException occurs, it is caught and handled in the catch block, and relevant messages are printed to the console.

// The output of the above program is shown as below

NullPointerException caught: Cannot invoke "String.length()" because "strRefObj" is null
 */
