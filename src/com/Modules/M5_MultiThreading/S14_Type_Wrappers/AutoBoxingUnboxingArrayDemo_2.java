package com.Modules.M5_MultiThreading.S14_Type_Wrappers;

public class AutoBoxingUnboxingArrayDemo_2 {
    public static void main(String[] args) {
        // Array of Integer objects (auto boxing)
        Integer[] numbersAutoBox = {1, 2, 3, 4, 5}; // Auto boxing: primitive integers are automatically boxed into Integer objects

        // Summing elements of the array (auto unboxing)
        int sum = calculateSum(numbersAutoBox);
        System.out.println("Sum of integers: " + sum);
    }

    // Method to calculate sum of integers in an array
    public static int calculateSum(Integer[] numbersAutoBox) {
        int sum = 0;
        for (Integer num : numbersAutoBox) {
            // Auto unboxing: converting Integer object to int primitive type
            sum += num; // Auto unboxing: Integer object is automatically unboxed to int primitive type
        }
        return sum;
    }
}

/*
n the main() method, an array numbers of type Integer[] is declared and initialized with primitive integers 1, 2, 3, 4, and 5.
This demonstrates auto boxing, where primitive integers are automatically boxed into Integer objects when assigned to an array of Integer objects.
In the calculateSum() method, each element of the numbers array is iterated over using a for-each loop.
Inside the loop, auto unboxing occurs when converting each Integer object back to a primitive int value in order to calculate the sum.
 */