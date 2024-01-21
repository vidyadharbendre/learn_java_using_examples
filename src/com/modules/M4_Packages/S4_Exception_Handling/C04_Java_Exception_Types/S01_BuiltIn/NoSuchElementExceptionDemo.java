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

// The output of the above program is shown as below
/*
NoSuchElementException caught:
java.util.NoSuchElementException
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1052)
	at com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn.NoSuchElementExceptionDemo.main(NoSuchElementExceptionDemo.java:18)
 */