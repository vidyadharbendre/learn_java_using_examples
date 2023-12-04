/**
 * Author: Vidyadhar Bendre
 * Email: vidyadhar.bendre@gmail.com
 * Date: 28 November, 2023
 *
 * Purpose:
 * Illustrate quantity scenarios using different data types in Java.
 *
 * Description:
 * This program demonstrates scenarios related to quantities and uses appropriate data types in Java.
 * It represents world population, product stock count, India's population, and the estimated number of stars.
 *
 * Real-time Scenarios:
 * 1. World Population - Current World Population
 * 2. Product Availability - Stock Count of a Specific Product in a Store
 * 3. India's Population - With and Without L
 * 4. Estimated Number of Stars in a Galaxy
 */

public class LongOOPsWay {
    private long worldPopulation;
    private long productStockCount;
    private long indiaPopulationWithoutL;
    private long indiaPopulationWithL;
    private long populationOfStars;

    // Constructor to initialize the quantities
    public LongOOPsWay(long worldPopulation, long productStockCount, long indiaPopulationWithoutL,
                       long indiaPopulationWithL, long populationOfStars) {
        this.worldPopulation = worldPopulation;
        this.productStockCount = productStockCount;
        this.indiaPopulationWithoutL = indiaPopulationWithoutL;
        this.indiaPopulationWithL = indiaPopulationWithL;
        this.populationOfStars = populationOfStars;
    }

    // Getter methods for accessing the quantities
    public long getWorldPopulation() {
        return worldPopulation;
    }

    public long getProductStockCount() {
        return productStockCount;
    }

    public long getIndiaPopulationWithoutL() {
        return indiaPopulationWithoutL;
    }

    public long getIndiaPopulationWithL() {
        return indiaPopulationWithL;
    }

    public long getPopulationOfStars() {
        return populationOfStars;
    }

    // Display binary representation of the quantities
    public void displayBinaryRepresentation() {
        System.out.println("Binary Representation (World Population).............: " + Long.toBinaryString(worldPopulation));
        System.out.println("Binary Representation (Product Stock Count)..........: " + Long.toBinaryString(productStockCount));
        System.out.println("Binary Representation (India Population Without L)...: " + Long.toBinaryString(indiaPopulationWithoutL));
        System.out.println("Binary Representation (India Population With L)......: " + Long.toBinaryString(indiaPopulationWithL));
        System.out.println("Binary Representation (Population of Stars)..........: " + Long.toBinaryString(populationOfStars));
    }

    // Display the size of long data type
    public void displayLongDataTypeSize() {
        System.out.println("Size of long data type in bytes......................: " + Long.BYTES + " bytes");
        System.out.println("Size of long data type in bits.......................: " + Long.SIZE + " bits");
    }

    // Main method for testing
    public static void main(String[] args) {
        LongOOPsWay quantities = new LongOOPsWay(
                7852359812L, 2000000000L, 1380004385, 1380004385L, 100000000000L);

        System.out.println("World Population: ...................................: " + quantities.getWorldPopulation());
        System.out.println("Product Stock Count: ................................: " + quantities.getProductStockCount());
        System.out.println("India Population Without L...........................: " + quantities.getIndiaPopulationWithoutL());
        System.out.println("India Population With L..............................: " + quantities.getIndiaPopulationWithL());
        System.out.println("Population of Stars..................................: " + quantities.getPopulationOfStars());

        quantities.displayBinaryRepresentation();
        quantities.displayLongDataTypeSize();
    }
}

// The output of the above program is shown as below:

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