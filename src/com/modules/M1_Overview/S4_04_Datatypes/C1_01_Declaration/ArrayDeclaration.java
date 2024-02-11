package com.modules.M1_Overview.S4_04_Datatypes.C1_01_Declaration;

public class ArrayDeclaration {
    public static void main(String[] args) {
        int[] intArray = {2, 4, 8, 9, 11};
        int lengthOfArray;
        lengthOfArray = intArray.length;
        System.out.println("The length of an array "+lengthOfArray);
        for (int index = 0; index < lengthOfArray; index++) {
            System.out.println(intArray[index]);
        }

    }

}
// The output of the above program is shown as below
/*
The length of an array 5
2
4
8
9
11
 */