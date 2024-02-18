package com.Modules.M5_MultiThreading.S13_Enumerations;

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

        // Prompt the user to enter a fruit
        System.out.println("Enter a fruit (APPLE, BANANA, ORANGE):");

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
Enter a fruit (APPLE, BANANA, ORANGE):
Orange
User selected fruit: ORANGE
 */
