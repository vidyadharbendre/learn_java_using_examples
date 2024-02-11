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
    It represents world population, product stock count, and other quantity-related scenarios.

    Real-time Scenarios:
    1. World Population - Current World Population
    2. Product Availability - Stock Count of a Specific Product in a Store
    3. India's Population - With and Without L
    4. Estimated Number of Stars in a Galaxy

*/
package com.C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C4_04_Long;
public class LongStackMemoryExample {
    public static void main(String[] args) {
        // Scenario 1: World Population - Current World Population
        long worldPopulation = 7852359812L; // Represents the current world population
        System.out.println("World Population: ...................................: " + worldPopulation);

        // Scenario 2: Product Availability - Stock Count of a Specific Product in a Store
        long productStockCount = 2000000000L; // Represents the stock count of a specific product in a store
        System.out.println("Product Stock Count: ................................: " + productStockCount);

        // Scenario 3: India's Population - With and Without L
        long indiaPopulationWithoutL = 1380004385; // India's population without using L
        long indiaPopulationWithL = 1380004385L;   // India's population with using L
        System.out.println("India Population Without L...........................: " + indiaPopulationWithoutL);
        System.out.println("India Population With L..............................: " + indiaPopulationWithL);

        // Scenario 4: Estimated Number of Stars in a Galaxy
        long populationOfStars = 100000000000L;   // Estimated number of stars in a galaxy
        System.out.println("Population of Stars..................................: " + populationOfStars);

        // Displaying the binary representation of values
        System.out.println("Binary Representation (World Population).............: " + Long.toBinaryString(worldPopulation));
        System.out.println("Binary Representation (Product Stock Count)..........: " + Long.toBinaryString(productStockCount));
        System.out.println("Binary Representation (India Population Without L)...: " + Long.toBinaryString(indiaPopulationWithoutL));
        System.out.println("Binary Representation (India Population With L)......: " + Long.toBinaryString(indiaPopulationWithL));
        System.out.println("Binary Representation (Population of Stars)..........: " + Long.toBinaryString(populationOfStars));

        // Displaying the size of long data type in bytes and bits
        System.out.println("Size of long data type in bytes......................: " + Long.BYTES + " bytes");
        System.out.println("Size of long data type in bits.......................: " + (Long.SIZE) + " bits");
    }
}


// Compiling using the command prompt:
/*
javac -d ../../../../../../../out LongStackMemoryExample.java
*/

// To execute:
// You can either click on the 'run' button (green) at the top or use the command below:
// Navigate to the compiled files in the 'out' directory by entering a space followed by
// pressing the 'tab' key.
/*
java -cp ../../../../../../../out C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C4_04_Long.LongStackMemoryExample
*/


// The output of the above program is

/*

World Population: ...................................: 7852359812
Product Stock Count: ................................: 2000000000
India Population Without L...........................: 1380004385
India Population With L..............................: 1380004385
Population of Stars..................................: 100000000000
Binary Representation (World Population).............: 111010100000010011000000010000100
Binary Representation (Product Stock Count)..........: 1110111001101011001010000000000
Binary Representation (India Population Without L)...: 1010010010000010011001000100001
Binary Representation (India Population With L)......: 1010010010000010011001000100001
Binary Representation (Population of Stars)..........: 1011101001000011101101110100000000000
Size of long data type in bytes......................: 8 bytes
Size of long data type in bits.......................: 64 bits

 */

/*

The above code is the representation of various quantity-related scenarios using the
long data type in Java. It includes examples such as world population, product stock count,
India's population with and without the L suffix, and the estimated number of stars in a
galaxy.
The code prints their values, binary representations, and the size of the long data type
in bytes and bits.

*/