package com.Modules.M1_Overview.S1_01_Tokens.C2_02_Datatypes;

/**
 * Program: javaDataTypes
 *
 * Purpose:
 * This program demonstrates various data types available in Java.
 * It showcases the declaration and usage of different data types.
 */

public class javaDatatypes {

    public static void main(String[] args) {
        // Primitive Data Types
        byte myByte = 10;
        short myShort = 100;
        int myInt = 1000;
        long myLong = 1000000L; // Note the 'L' suffix for long values

        float myFloat = 3.14f; // Note the 'f' suffix for float values
        double myDouble = 3.14159265359;

        char myChar = 'A';
        boolean myBoolean = true;

        // Displaying values
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

        // Non-Primitive Data Type - String
        String myString = "Hello, Java!";
        System.out.println("String: " + myString);
    }
}
// The output of the above program is shown as below
/*
byte: 10
short: 100
int: 1000
long: 1000000
float: 3.14
double: 3.14159265359
char: A
boolean: true
String: Hello, Java!
 */