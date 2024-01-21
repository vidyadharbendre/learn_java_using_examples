package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class NoSuchElementExceptionDemo {
    public static void main(String[] args) {
        // Create an empty ArrayList
        List<String> list = new ArrayList<>();

        // Obtain an Iterator for the ArrayList
        Iterator<String> iterator = list.iterator();

        try {
            // Attempt to retrieve an element from the empty ArrayList
            String element = iterator.next();

            // The above line will throw a NoSuchElementException,
            // and the code below this line won't be executed.
            System.out.println("Element retrieved: " + element);
        } catch (NoSuchElementException e) {
            // Catch and handle the NoSuchElementException
            System.out.println("NoSuchElementException caught:");
            e.printStackTrace();
        }
    }
}


/*
Package Declaration:

package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;: Declares a package for the Java class.
Import Statements:

No specific import statements are needed for this program.
Class Declaration:

public class NoSuchElementExceptionDemo {: Declares a class named NoSuchElementExceptionDemo. The public keyword allows the class to be accessed from other packages.
Main Method:

public static void main(String[] args) {: Declares the main method. This method is the entry point of the program.
List Initialization:

List<String> list = new ArrayList<>();: Creates an empty ArrayList of strings.
Iterator Initialization:

Iterator<String> iterator = list.iterator();: Obtains an iterator for the created ArrayList.
Try Block:

try {: Begins a try block where potentially exception-causing code is placed.
String element = iterator.next();: Attempts to retrieve an element from the empty ArrayList using the Iterator.
Catch Block:

catch (NoSuchElementException e) {: Catches and handles a NoSuchElementException if it occurs. It prints a message with the exception details.
Print Statements:

Inside the catch block, a message is printed to the console using System.out.println() to indicate that a NoSuchElementException was caught. The e.printStackTrace() prints the stack trace of the exception, providing detailed information about the error.
Output Comments:

Below the program, there are comments representing the expected output when the program is run. This output includes the details of the caught NoSuchElementException, showing the stack trace.
In summary, this program demonstrates exception handling for attempting to retrieve an element from an empty ArrayList. If a NoSuchElementException occurs, it is caught and handled in the catch block, and relevant messages are printed to the console.
// The output of the above program is shown as below

NoSuchElementException caught:
java.util.NoSuchElementException
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1052)
	at com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn.NoSuchElementExceptionDemo.main(NoSuchElementExceptionDemo.java:18)
 */