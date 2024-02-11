package com.modules.M1_Overview.S6_06_Control_Statements;

// Example demonstrating control statements in Java

public class Control_Statements {
    public static void main(String[] args) {
        // Selection Statements: if
        int num = 10;
        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        // Traditional switch
        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("Option 1");
                break;
            case 2:
                System.out.println("Option 2");
                break;
            default:
                System.out.println("Invalid option");
        }

        // Iteration Statements: while
        int i = 0;
        while (i < 5) {
            System.out.println("Iteration " + (i + 1));
            i++;
        }

        // Nested Loops
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 2; k++) {
                System.out.println("Nested loop: " + j + ", " + k);
            }
        }

        // Jump Statements: break
        for (int m = 0; m < 5; m++) {
            if (m == 3) {
                break; // Exit loop when m equals 3
            }
            System.out.println("Iteration " + (m + 1));
        }
    }
}
// The output of the above program is shown as below
/*
Positive number
Option 2
Iteration 1
Iteration 2
Iteration 3
Iteration 4
Iteration 5
Nested loop: 0, 0
Nested loop: 0, 1
Nested loop: 1, 0
Nested loop: 1, 1
Nested loop: 2, 0
Nested loop: 2, 1
Iteration 1
Iteration 2
Iteration 3
 */
