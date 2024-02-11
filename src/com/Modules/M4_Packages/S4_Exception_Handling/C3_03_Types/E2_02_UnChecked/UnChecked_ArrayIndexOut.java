package com.Modules.M4_Packages.S4_Exception_Handling.C3_03_Types.E2_02_UnChecked;

public class UnChecked_ArrayIndexOut {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int value;
        try{
            value = array[5];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound Exception : "+e.getMessage());
        }
    }
}
// The output of the above program is shown as below
/*
Array Index Out Of Bound Exception : Index 5 out of bounds for length 3
 */