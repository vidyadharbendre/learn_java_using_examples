package com.Modules.M1_Overview.S4_04_Datatypes;

// Example demonstrating data types, variables, and arrays in Java

public class Datatypes_Main {
    public static void main(String[] args) {
        // Primitive Types
        int num = 10;
        double pi = 3.14;
        char ch = 'A';
        boolean flag = true;

        // Variables
        int x, y = 5; // Declare multiple variables

        // Type Conversion and Casting
        double d = 3.75;
        int i = (int) d; // Casting double to int

        // Automatic Type Promotion
        int a = 5;
        double result = a * 1.5; // Automatic promotion of int to double

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Element at index 2: " + numbers[2]);
    }
}
// The output of the above program is shown as below

/*
Datatypes_Main
 */