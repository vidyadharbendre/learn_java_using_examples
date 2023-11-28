/*
    Author:
    Vidyadhar Bendre

    Email:
    vidyadhar.bendre@gmail.com

    Date:
    28 November, 2023

    Question:
    How can we represent various quantity-related scenarios using different data types in Java?

    Purpose:
    Illustrate quantity scenarios using different data types in Java.

    Description:
    This program demonstrates scenarios related to quantities and uses appropriate data types in Java.
    It represents world population and product stock count scenarios.

    Real-time Scenarios:
    1. World Population - Current World Population
    2. Product Availability - Stock Count of a Specific Product in a Store

*/

public class LongStackMemoryExample {
    public static void main(String[] args) {
        // Scenario 1: World Population - Current World Population
        long worldPopulation = 7852359812L; // Represents the current world population
        System.out.println("World Population: " + worldPopulation);

        // Scenario 2: Product Availability - Stock Count of a Specific Product in a Store
        long productStockCount = 2000000000L; // Represents the stock count of a specific product in a store
        System.out.println("Product Stock Count: " + productStockCount);

        // Displaying the binary representation of values
        System.out.println("Binary Representation (World Population): " + Long.toBinaryString(worldPopulation));
        System.out.println("Binary Representation (Product Stock Count): " + Long.toBinaryString(productStockCount));

        // Displaying the size of long data type in bytes and bits
        System.out.println("Size of long data type in bytes: " + Long.BYTES + " bytes");
        System.out.println("Size of long data type in bits: " + (Long.SIZE) + " bits");
    }
}


// The output of the above program is

/*

World Population: 7852359812
Product Stock Count: 2000000000
Binary Representation (World Population): 111010100000010011000000010000100
Binary Representation (Product Stock Count): 1110111001101011001010000000000
Size of long data type in bytes: 8 bytes
Size of long data type in bits: 64 bits

 */