package com.Trials;

import java.util.Scanner;

public class L18_ArrayUtils {
    private int[] arrayNumbers;

    // Default constructor with initial values
    public L18_ArrayUtils() {
        this.arrayNumbers = new int[]{1, 2, 3, 4, 5}; // Default values
    }

    public void displayArrayElements() {
        System.out.println("Array Elements");
        for (int value : arrayNumbers) {
            System.out.println(value);
        }
    }

    public void updateArrayElements() {
        Scanner getInputObj;
        getInputObj = new Scanner(System.in);

        System.out.println("Enter the new length of the array: ");
        int newLength = getInputObj.nextInt();

        int[] newArray;
        newArray = new int[newLength];

        for (int i = 0; i < newLength; i++) {
            System.out.println("Enter element " + i + ": ");
            newArray[i] = getInputObj.nextInt();
        }

        arrayNumbers = newArray;
    }

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        L18_ArrayUtils utilsObj;
        utilsObj = new L18_ArrayUtils(); // Correctly creating an object of L18_ArrayUtils using its constructor

        utilsObj.displayArrayElements(); // Display default elements

        System.out.println("Enter the length of the array: ");
        int length = scannerObj.nextInt();

        int[] initialArray = new int[length]; // Create array based on user input length

        utilsObj = new L18_ArrayUtils(); // Update object with user-defined array

        System.out.println("Original Length of the array: " + initialArray.length);

        utilsObj.updateArrayElements();

        System.out.println("Updated Array:");
        utilsObj.displayArrayElements();
    }
}

// The output of the above program is shown as below
/*
Array Elements
1
2
3
4
5
Enter the length of the array:
3
Original Length of the array: 3
Enter the new length of the array:
4
Enter element 0:
12
Enter element 1:
34
Enter element 2:
56
Enter element 3:
7
Updated Array:
Array Elements
12
34
56
7
 */