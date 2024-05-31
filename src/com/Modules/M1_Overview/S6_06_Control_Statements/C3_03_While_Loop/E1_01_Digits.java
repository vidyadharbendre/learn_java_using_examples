package com.Modules.M1_Overview.S6_06_Control_Statements.C3_03_While_Loop;
/*
The while loop runs as long as inputNumber is greater than 0. The exact number of iterations is not known upfront because it depends on the number of digits in inputNumber.
Inside the loop, the last digit of inputNumber is extracted using the modulo operator (%), added to sumOfDigits, and then removed from inputNumber by integer division by 10.
The loop continues to extract and sum each digit until all digits have been processed, at which point inputNumber becomes 0, and the loop exits.
Finally, the sum of all digits is printed.
*/

public class E1_01_Digits {
    public static void main(String[] args) {
        int inputNumber = 7865;  // Initialize the input number
        int sumOfDigits = 0;     // Variable to store the sum of digits
        int temp = 0;            // Temporary variable to store the current digit

        /*
         * While loop that runs as long as inputNumber is greater than 0.
         * The condition is not known upfront as it depends on the number of digits in inputNumber.
         */
        while (inputNumber > 0) {
            temp = inputNumber % 10; // Extract the last digit of inputNumber
            System.out.println("temp : " + temp); // Print the current digit

            sumOfDigits += temp; // Add the current digit to sumOfDigits
            System.out.println("sumOfDigits : " + sumOfDigits); // Print the current sum of digits

            inputNumber = inputNumber / 10; // Remove the last digit from inputNumber
            System.out.println("inputNumber : " + inputNumber); // Print the remaining part of inputNumber
        }

        // Print the final sum of digits after the loop ends
        System.out.println("Sum of digits are : " + sumOfDigits);
    }
}