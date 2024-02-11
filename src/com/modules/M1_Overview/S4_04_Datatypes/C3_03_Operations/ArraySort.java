package com.modules.M1_Overview.S4_04_Datatypes.C3_03_Operations;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int marksStudents[] = {50, 77, 43, 25, 61, 88, 93, 42};
        System.out.println("Displaying the given Array");
        String marksStu = Arrays.toString(marksStudents);
        System.out.println(marksStu);

        System.out.println("Displaying the sorted Array");
        Arrays.sort(marksStudents);
        String marksStuSort = Arrays.toString(marksStudents);
        System.out.println(marksStuSort);

    }
}
// The output of the above program is shown as below
/*
Displaying the given Array
[50, 77, 43, 25, 61, 88, 93, 42]
Displaying the sorted Array
[25, 42, 43, 50, 61, 77, 88, 93]
 */