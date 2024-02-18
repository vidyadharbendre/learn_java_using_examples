package com.Modules.M5_MultiThreading.S13_Enumerations;

import java.util.Scanner;

public class Enum_Switch_Demo_5 {

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

        // Validate the input using a switch statement
        WeekDay selectedDay;
        switch (userInput) {
            case "SUNDAY":
                selectedDay = WeekDay.SUNDAY;
                break;
            case "MONDAY":
                selectedDay = WeekDay.MONDAY;
                break;
            case "TUESDAY":
                selectedDay = WeekDay.TUESDAY;
                break;
            case "WEDNESDAY":
                selectedDay = WeekDay.WEDNESDAY;
                break;
            case "THURSDAY":
                selectedDay = WeekDay.THURSDAY;
                break;
            case "FRIDAY":
                selectedDay = WeekDay.FRIDAY;
                break;
            case "SATURDAY":
                selectedDay = WeekDay.SATURDAY;
                break;
            default:
                System.out.println("Invalid weekday entered.");
                return; // Exit the program if input is invalid
        }

        // Print the selected weekday
        System.out.println("User selected weekday: " + selectedDay);

        // Close the Scanner object
        scanner.close();
    }
}

// The output of the above program is shown as below
/*
Enter a weekday (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY):
saturday
User selected weekday: SATURDAY
 */