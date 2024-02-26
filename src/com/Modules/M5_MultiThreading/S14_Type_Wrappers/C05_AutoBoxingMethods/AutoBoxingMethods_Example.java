package com.Modules.M5_MultiThreading.S14_Type_Wrappers.C05_AutoBoxingMethods;


/*
Autoboxing Methods:
Autoboxing methods refer to the automatic conversion of primitive data types to their corresponding wrapper classes when passed as arguments to methods. In Java, primitive data types like int, double, float, etc., have wrapper classes such as Integer, Double, Float, etc. When you pass a primitive value to a method that expects an object of its corresponding wrapper class, Java automatically converts the primitive value to an object of the wrapper class. This process is known as autoboxing.

Let's illustrate this with an example using enum constants:

 */
enum Numbers {
    ONE(1), TWO(2), THREE(3);

    private final int value;

    Numbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class AutoBoxingMethods_Example {
    // Method expecting Numbers enum object
    public static void printValue(Numbers num) {
        System.out.println("Value: " + num.getValue());
    }

    public static void main(String[] args) {
        // Autoboxing: primitive int to Numbers enum constant
        int num = 2;
        printValue(Numbers.TWO);
    }
}

// The output of the above program is shown as below
/*
Value: 2
 */
/*
In this example, the printValue method expects a Numbers enum object, but we're passing an int primitive value 2. Java automatically converts the int value to a Numbers enum object (autoboxing) when calling the method.
 */
