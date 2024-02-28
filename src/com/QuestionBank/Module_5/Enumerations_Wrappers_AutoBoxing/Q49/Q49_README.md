# 3 Marks Question
# Explain the concept of enumerations in Java. Provide examples demonstrating the usage of enum constants.

# Enumerations in Java

## Overview
Enumerations in Java provide a way to define a set of named constants. Enums are like classes in that they can have constructors, methods, and fields. They offer a type-safe alternative to traditional integer constants or strings.

## Concept
1. **Definition**: Enums are declared using the `enum` keyword.
2. **Constants**: Enum constants are implicitly `public`, `static`, and `final`. They can be accessed using the enum type name.
3. **Methods**: You can define methods, constructors, and fields inside enums.
4. **Type Safety**: Enums provide type safety, preventing you from passing an incorrect value to a method or a variable.

## Example
```java
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

public class Main {
    public static void main(String[] args) {
        // Access enum constants and methods
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);
        today.printAbbreviation();
    }
}
```
## In this example:

We define an enum Day representing the days of the week.
Each day is an enum constant.
We define a method printAbbreviation() inside the enum to print the abbreviation of each day.
In the main method, we access enum constants and invoke the printAbbreviation() method.