package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;

public class NullPointerException_Demo {
    public static void main(String[] args) {
        // Create a null String
        String strRefObj;
        strRefObj = null;

        try {
            // Attempt to get the length of the null String
            int length = strRefObj.length();

            // The above line will throw a NullPointerException,
            // and the code below this line won't be executed.
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            // Catch and handle the NullPointerException
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}

// The output of the above program is shown as below
/*
NullPointerException caught: Cannot invoke "String.length()" because "strRefObj" is null
 */
