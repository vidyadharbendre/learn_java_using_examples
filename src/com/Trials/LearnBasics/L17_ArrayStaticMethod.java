package com.Trials.LearnBasics;

public class L17_ArrayStaticMethod {
    public static void main(String[] args) {
        int[] arrayNumbers = {11, 19, 45, 76, 99, -56};

        displayArrayElements(arrayNumbers);
    }
    public static void displayArrayElements(int[] arrayN){
        int findex;
        System.out.println("Array Elements");
        for (findex = 0; findex < arrayN.length; findex++) {
            System.out.println(arrayN[findex]);
        }
    }
}

// The output of the above program is shown as below
/*
Array Elements
11
19
45
76
99
-56
 */