package com.Trials.LearnBasics;

public class L16_ArrayMainAssignment {
    public static void main(String[] args) {
        int[] arrayNumbers = {11, 86, 90, -67, 45, 87, 38};
        int lengthArray;

        lengthArray = arrayNumbers.length;
        System.out.println(lengthArray);

        System.out.println("Array Elements");

        for (int index = 0; index < lengthArray; index++) {
            System.out.println(arrayNumbers[index]);
        }

    }

}
// The output of the above program is shown as below
/*
7
Array Elements
11
86
90
-67
45
87
38
 */