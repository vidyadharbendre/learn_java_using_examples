package com.Modules.M1_Overview.S6_06_Control_Statements.C4_04_do_While;

import java.util.Scanner;

public class E1_01_Customer {
    public static void main(String[] args) {
        Scanner scObj;
        scObj = new Scanner(System.in); // Creating a Scanner object
        int totalCost = 0;
        char wantToAddFoodItem = 'N';
        int unitPrice = 10;
        int quantity = 1;
        do {
            totalCost = totalCost + (quantity * unitPrice);
            System.out.println("Order placed successfully!");
            System.out.println("Total cost: " + totalCost);
            System.out.println("Do you want to add more food items to the order? Y or N");
            String input = scObj.next(); // Accepting input from the customer
            // Extracting first character from the input string
            wantToAddFoodItem = input.charAt(0);
        } while (wantToAddFoodItem == 'Y');
        System.out.println("Thank you for ordering the food! It will reach you shortly...");
    }
}
