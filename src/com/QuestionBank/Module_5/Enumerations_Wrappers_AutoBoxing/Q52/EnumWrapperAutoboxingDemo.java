package com.QuestionBank.Module_5.Enumerations_Wrappers_AutoBoxing.Q52;

/*
10 Marks Question
Write a Java program that demonstrates the usage of enumerations, type wrappers, and autoboxing in Java.
 */


// Enum for Days of the Week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumWrapperAutoboxingDemo {
    public static void main(String[] args) {
        // Enumerations Example
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        // Type Wrappers Example
        Integer intWrapper = Integer.valueOf(10); // Using valueOf() method to create Integer object
        int primitiveInt = intWrapper.intValue(); // Using intValue() method to retrieve primitive int
        System.out.println("Integer Wrapper: " + intWrapper);
        System.out.println("Primitive int: " + primitiveInt);

        // Autoboxing Example
        int primitiveNum = 20;
        Integer numWrapper = primitiveNum; // Autoboxing: converting int to Integer
        System.out.println("Autoboxing Example: " + numWrapper);
    }
}
