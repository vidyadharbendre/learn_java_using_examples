package com.Modules.M5_MultiThreading.S13_Enumerations;

import java.util.Scanner;

public class Enum_Week_Value_Of_Values_4 {

    enum WeekDay {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a weekday
        System.out.println("Enter a weekday (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY):");
        String userInput = scanner.next().toUpperCase(); // Convert input to uppercase for case-insensitive comparison

        // Validate the input using valueOf() method
        try {
            WeekDay selectedDay = WeekDay.valueOf(userInput);
            System.out.println("Using valueOf() method, selected weekday: " + selectedDay);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid weekday entered.");
            return; // Exit the program if input is invalid
        }

        // Print all enum values using values() method
        System.out.println("\nPrinting all enum values using values() method:");
        for (WeekDay day : WeekDay.values()) {
            System.out.println(day);
        }

        // Close the Scanner object
        scanner.close();
    }
}
// The output of the above program is shown as below
/*
Enter a weekday (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY):
Friday
Using valueOf() method, selected weekday: FRIDAY

Printing all enum values using values() method:
SUNDAY
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY

 */