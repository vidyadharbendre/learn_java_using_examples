package com.Modules.M5_MultiThreading.S14_Type_Wrappers;

public class WrapperExample_1 {
    public static void main(String[] args) {
        // Creating a wrapper object for an int
        Integer wrappedInt;
        wrappedInt = new Integer(10);

        // Using methods of the Integer wrapper class
        System.out.println("Wrapped Integer value: " + wrappedInt);
        System.out.println("Max value of Integer: " + Integer.MAX_VALUE);
        System.out.println("Min value of Integer: " + Integer.MIN_VALUE);

        // Unboxing - Converting wrapper object to primitive type
        int primitiveInt = wrappedInt.intValue();
        System.out.println("Unboxed Integer value: " + primitiveInt);

        // Autoboxing - Automatically converting primitive type to wrapper object
        Integer autoBoxedInt = 20;
        System.out.println("Autoboxed Integer value: " + autoBoxedInt);

        // Using wrapper class in a scenario where object is required
        Integer[] intArray = new Integer[3];
        intArray[0] = 30;
        intArray[1] = new Integer(40);
        intArray[2] = Integer.valueOf("50");

        for (Integer num : intArray) {
            System.out.println("Array value: " + num);
        }
    }
}

// The output of the above program is shown as below
/*
Wrapped Integer value: 10
Max value of Integer: 2147483647
Min value of Integer: -2147483648
Unboxed Integer value: 10
Autoboxed Integer value: 20
Array value: 30
Array value: 40
Array value: 50
 */