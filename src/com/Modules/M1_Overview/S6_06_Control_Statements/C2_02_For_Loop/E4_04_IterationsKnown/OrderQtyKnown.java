package com.Modules.M1_Overview.S6_06_Control_Statements.C2_02_For_Loop.E4_04_IterationsKnown;

//Importing the Scanner class
import java.util.Scanner;
public class OrderQtyKnown {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        int totalCost = 0;
        int unitPrice = 10;
        System.out.println("Enter the number of food items to be ordered");
        int noFoodItemsToBeOrdered = sc.nextInt();
        for (int counter = 1; counter <= noFoodItemsToBeOrdered; counter++) {
            System.out.println("Enter the food item");
            String foodItem = sc.next();
            System.out.println("Enter the quantity");
            int quantity = sc.nextInt();
            System.out.println("You have ordered: " + foodItem);
            totalCost += unitPrice * quantity;
            System.out.println("Order placed successfully!");
            System.out.println("Total cost of the order: " + totalCost);
        }
    }
}
