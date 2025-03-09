package com.Trials.LearnBasics;
import java.util.Scanner;

public class SumConditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User inputs for k and m
        System.out.print("Enter the target sum (k): ");
        int k = scanner.nextInt();

        System.out.print("Enter the partial sum condition (m): ");
        int m = scanner.nextInt();

        scanner.close();

        int count = 0;

        System.out.println("\nAll possible sets (a, b, c, d) such that:");
        System.out.println("1. a + b + c + d = " + k);
        System.out.println("2. a + b >= " + m);
        System.out.println("3. b + c >= " + m);
        System.out.println("4. c + d >= " + m + "\n");

        // Finding all possible sets
        for (int a = 0; a <= k; a++) {
            for (int b = 0; b <= k; b++) {
                for (int c = 0; c <= k; c++) {
                    for (int d = 0; d <= k; d++) {
                        if ((a + b + c + d == k) && (a + b >= m) && (b + c >= m) && (c + d >= m)) {
                            // Dynamically exclude cases like (0,10,0,10) and (10,0,10,0)
                            if (!((a == 0 && c == 0 && b == m && d == m) ||
                                    (a == m && c == m && b == 0 && d == 0))) {
                                System.out.println("(" + a + ", " + b + ", " + c + ", " + d + ")");
                                count++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("\nTotal number of possible sets: " + count);
    }
}