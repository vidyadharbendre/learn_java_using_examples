package com.Modules.M5_MultiThreading.S13_Enumerations;

/*
 * This program demonstrates the usage of Java enumerations and the Enum class methods values() and valueOf().
 * Enumerations in Java provide a way to define a set of named constants.
 * Enumerations are used to represent a fixed set of constants, such as days of the week, months, or fruit types.
 * In this program, we define an enumeration called Fruit with constants APPLE, BANANA, and ORANGE.
 * We then prompt the user to enter a fruit, validate the input, and display the selected fruit.
 * The valueOf() method in the Enum class is used to convert a string representation of the enumeration constant name into the corresponding enumeration constant.
 * The values() method returns an array containing all the constants of the enumeration in the order they are declared.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Enum_Value_Of_Demo_3 {

    enum Fruit {
        APPLE,
        BANANA,
        ORANGE
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scannerRefObj;
        scannerRefObj = new Scanner(System.in);
        // Display all available fruit options
        System.out.println("Available fruits:");
        for (Fruit fruit : Fruit.values()) {
            System.out.println(fruit);
        }
        // Prompt the user to enter a fruit
        System.out.println("Enter a fruit:");

        String userInput;
        userInput = scannerRefObj.next().toUpperCase(); // Convert input to uppercase for case-insensitive comparison
        // Validate the input using valueOf() method
        try {
            Fruit selectedFruit;
            selectedFruit = Fruit.valueOf(userInput);

            System.out.println("User selected fruit: " + selectedFruit);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid fruit entered."+ Arrays.toString(e.getStackTrace()));
        }

        // Close the Scanner object
        scannerRefObj.close();
    }
}

// The output of the above program is shown as below
/*
Available fruits:
APPLE
BANANA
ORANGE
Enter a fruit:
Orange
User selected fruit: ORANGE
 */
