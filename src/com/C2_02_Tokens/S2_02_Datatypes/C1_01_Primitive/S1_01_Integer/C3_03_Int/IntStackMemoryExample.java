/*
    Author:
    Vidyadhar Bendre

    Email:
    vidyadhar.bendre@gmail.com

    Date:
    28 November 2023

    Question:
    How can we represent various quantity-related scenarios using different data types in Java?

    Purpose:
    Illustrate quantity scenarios using different data types in Java.

    Description:
    This program demonstrates scenarios related to quantities and uses appropriate data types in Java.
    It represents inventory count, record count, and product stock count scenarios.

    Real-time Scenarios:
    1. Inventory Management - Quantity of Items in a Warehouse
    2. Product Availability - Stock Count of a Specific Product in a Store

*/

package com.C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C3_03_Int;
public class IntStackMemoryExample {
    public static void main(String[] args) {
        // Scenario 1: Inventory Management - Quantity of Items in a Warehouse
        int inventoryCount = 1000; // Represents the count of items in the warehouse
        System.out.println("Inventory Count: " + inventoryCount);

        // Scenario 2: Product Availability - Stock Count of a Specific Product in a Store
        int productStockCount = 500; // Represents the stock count of a specific product in a store
        System.out.println("Product Stock Count: " + productStockCount);

        // Displaying the binary representation of 100
        System.out.println("Binary Representation............: " + Integer.toBinaryString(inventoryCount & 0xFF));
        System.out.println("Binary Representation............: " + Integer.toBinaryString(productStockCount & 0xFF));

        // Displaying the size of byte data type in bytes and bits
        System.out.println("Size of byte data type in bytes..: " + Byte.BYTES + " bytes");
        System.out.println("Size of byte data type in bits...: " + (Byte.SIZE) + " bits");
    }
}


// Compiling using the command prompt:
/*
javac -d ../../../../../../../out IntStackMemoryExample.java
*/

// To execute:
// You can either click on the 'run' button (green) at the top or use the command below:
// Navigate to the compiled files in the 'out' directory by entering a space followed by
// pressing the 'tab' key.
/*
java -cp ../../../../../../../out C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C3_03_Int.IntStackMemoryExample
*/

// The output of the above program is shown below
/*

Inventory Count: 1000
Product Stock Count: 500
Binary Representation............: 11101000
Binary Representation............: 11110100
Size of byte - data type in bytes: 1 bytes
Size of byte data type in bits...: 8 bits

 */