package com.QuestionBank.Module_5.Enumerations_Wrappers_AutoBoxing.Q49;

/*
# 3 Marks Question
# Explain the concept of enumerations in Java. Provide examples demonstrating the usage of enum constants.
 */

// Define an enum for days of the week
enum Day {
    // Enum constants
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Method to print day abbreviation
    public void printAbbreviation() {
        switch (this) {
            case SUNDAY:
                System.out.println("Sun");
                break;
            case MONDAY:
                System.out.println("Mon");
                break;
            case TUESDAY:
                System.out.println("Tue");
                break;
            case WEDNESDAY:
                System.out.println("Wed");
                break;
            case THURSDAY:
                System.out.println("Thu");
                break;
            case FRIDAY:
                System.out.println("Fri");
                break;
            case SATURDAY:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}

public class EnumerationsDemo {
    public static void main(String[] args) {
        // Access enum constants and methods
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);
        today.printAbbreviation();
    }
}

// The output of the above program is shown as below
/*
Today is MONDAY
Mon
 */