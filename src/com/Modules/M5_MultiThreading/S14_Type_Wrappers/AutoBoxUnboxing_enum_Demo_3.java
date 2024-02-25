package com.Modules.M5_MultiThreading.S14_Type_Wrappers;


// Define an enum to represent days of the week
enum DayOfWeek {
    MONDAY(1),      // Enum constant MONDAY with associated day number 1
    TUESDAY(2),     // Enum constant TUESDAY with associated day number 2
    WEDNESDAY(3),   // Enum constant WEDNESDAY with associated day number 3
    THURSDAY(4),    // Enum constant THURSDAY with associated day number 4
    FRIDAY(5),      // Enum constant FRIDAY with associated day number 5
    SATURDAY(6),    // Enum constant SATURDAY with associated day number 6
    SUNDAY(7);      // Enum constant SUNDAY with associated day number 7

    // Private field to store the day number associated with each enum constant
    private final int dayNumber;

    // Constructor to initialize the day number for each enum constant
    DayOfWeek(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    // Getter method to retrieve the day number associated with an enum constant
    public int getDayNumber() {
        return dayNumber;
    }
}

// Class to demonstrate auto boxing and auto unboxing with enums
public class AutoBoxUnboxing_enum_Demo_3 {
    public static void main(String[] args) {
        // Using enums to represent days of the week
        DayOfWeek[] days = {DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY}; // Auto boxing: primitive int values associated with enum constants are automatically boxed into corresponding DayOfWeek enum constants

        // Displaying day numbers (auto unboxing)
        for (DayOfWeek day : days) {
            // Auto unboxing: int value associated with enum constant is automatically unboxed to int primitive type
            System.out.println(day.name() + " - Day number: " + day.getDayNumber());
        }
    }
}
// The output of the above program is shown as below
/*
MONDAY - Day number: 1
TUESDAY - Day number: 2
WEDNESDAY - Day number: 3
 */


/*
An enum DayOfWeek is defined to represent the days of the week, where each enum constant is associated with a day number (e.g., MONDAY is associated with 1, TUESDAY with 2, and so on).
The DayOfWeek enum has a private field dayNumber to store the day number associated with each enum constant.
A constructor DayOfWeek(int dayNumber) is defined to initialize the day number for each enum constant.
A getter method getDayNumber() is provided to retrieve the day number associated with an enum constant.
In the AutoBoxingUnboxingEnumExample class:
An array days is declared and initialized with enum constants MONDAY, TUESDAY, and WEDNESDAY.
During initialization, auto boxing occurs, where primitive int values associated with enum constants are automatically boxed into corresponding DayOfWeek enum constants.
Inside the loop, auto unboxing occurs when accessing the day number associated with each enum constant using the getDayNumber() method. The int value associated with the enum constant is automatically unboxed to int primitive type.
 */