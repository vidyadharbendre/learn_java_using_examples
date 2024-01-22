package com.modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S01_01_Try;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block starts");

            // Some code that may cause an exception
            int[] numbers = {1, 2, 3};
            System.out.println("Outer try: Accessing numbers[5] - " + numbers[5]); // This may cause an ArrayIndexOutOfBoundsException

            try {
                // Inner try block
                System.out.println("Inner try block starts");

                // Some code that may cause another exception
                String str = null;
                System.out.println("Inner try: Length of str - " + str.length()); // This may cause a NullPointerException

                System.out.println("Inner try block ends");
            } catch (NullPointerException innerException) {
                // Handle the exception thrown in the inner try block
                System.out.println("Inner catch block: " + innerException.getMessage());
            }

            System.out.println("Outer try block ends");
        } catch (ArrayIndexOutOfBoundsException outerException) {
            // Handle the exception thrown in the outer try block
            System.out.println("Outer catch block: " + outerException.getMessage());
        }
    }
}

// The output of the above program is shown as below
/*
Outer try block starts
Outer catch block: Index 5 out of bounds for length 3
 */