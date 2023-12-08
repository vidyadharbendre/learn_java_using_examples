/**
 * Author: Vidyadhar Bendre
 * Email: vidyadhar.bendre@gmail.com
 * Date: 28 November, 2023

 * Purpose:
 * Illustrate quantity scenarios using different data types in Java.

 * Description:
 * This program demonstrates scenarios related to quantities and uses appropriate data types in Java.
 * It represents world population, product stock count, India's population, and the estimated number of stars.

 * Real-time Scenarios:
 * 1. World Population - Current World Population
 * 2. Product Availability - Stock Count of a Specific Product in a Store
 * 3. India's Population - With and Without L
 * 4. Estimated Number of Stars in a Galaxy
 */
package C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C4_04_Long;
public class LongOOPsWay {
    private long worldPopulation;
    private long productStockCount;
    private long indiaPopulationWithoutL;
    private long indiaPopulationWithL;
    private long populationOfStars;

    // Constructor to initialize the quantities
    public LongOOPsWay(long initWorldPopulation, long initProductStockCount, long initIndiaPopulationWithoutL,
                       long initIndiaPopulationWithL, long initPopulationOfStars) {
        this.worldPopulation = initWorldPopulation;
        this.productStockCount = initProductStockCount;
        this.indiaPopulationWithoutL = initIndiaPopulationWithoutL;
        this.indiaPopulationWithL = initIndiaPopulationWithL;
        this.populationOfStars = initPopulationOfStars;


    }

    // Getter methods for accessing the quantities
    public long getWorldPopulation() {
        return worldPopulation;
    }
    public void setWorldPopulation(long newWorldPopulation) {
        worldPopulation = newWorldPopulation;
    }

    public long getProductStockCount() {
        return productStockCount;
    }

    public void setProductStockCount(long newWorldPopulation) {
        worldPopulation = newWorldPopulation;
    }
    public long getIndiaPopulationWithoutL() {
        return indiaPopulationWithoutL;
    }

    public void setIndiaPopulationWithoutL(long newIndiaPopulationWithoutL) {
        indiaPopulationWithoutL = newIndiaPopulationWithoutL;
    }

    public long getIndiaPopulationWithL() {
        return indiaPopulationWithL;
    }
    public void setIndiaPopulationWithL(long newIndiaPopulationWithL){
        indiaPopulationWithL = newIndiaPopulationWithL;
        }

    public long getPopulationOfStars() {
        return populationOfStars;
    }

    public void setPopulationOfStars(long newPopulationOfStars){
        populationOfStars = newPopulationOfStars;

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
        LongOOPsWay longObj1;
        longObj1 = new LongOOPsWay(
                (long) 7000000000L, (long)1300000000, (long)1300000000L, (long) 2000000000L, (long)100000000000L);

        System.out.println("World Population: " + longObj1.getWorldPopulation());
        System.out.println("India Population Without L...: " + longObj1.getIndiaPopulationWithoutL());
        System.out.println("India Population With L......: " + longObj1.getIndiaPopulationWithL());
        System.out.println("Product Stock Count: ........: " + longObj1.getProductStockCount());
        System.out.println("Population of Stars..........: " + longObj1.getPopulationOfStars());

        longObj1.setWorldPopulation(7852359812L);
        longObj1.setIndiaPopulationWithoutL(1380004385);
        longObj1.setIndiaPopulationWithL(1380004385L);
        longObj1.setProductStockCount(2000000000L);
        longObj1.setPopulationOfStars(100000000000L);

        System.out.println("World Population: " + longObj1.getWorldPopulation());
        System.out.println("India Population Without L...: " + longObj1.getIndiaPopulationWithoutL());
        System.out.println("India Population With L......: " + longObj1.getIndiaPopulationWithL());
        System.out.println("Product Stock Count: ........: " + longObj1.getProductStockCount());
        System.out.println("Population of Stars..........: " + longObj1.getPopulationOfStars());


        longObj1.displayBinaryRepresentation();
        longObj1.displayLongDataTypeSize();
    }
}


// Compiling using the command prompt:
/*
javac -d ../../../../../../../out LongOOPsWay.java
*/

// To execute:
// You can either click on the 'run' button (green) at the top or use the command below:
// Navigate to the compiled files in the 'out' directory by entering a space followed by
// pressing the 'tab' key.
/*
java -cp ../../../../../../../out C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C4_04_Long.LongOOPsWay
*/

// The output of the above program is shown as below:

/*

World Population: 7000000000
India Population Without L...: 1300000000
India Population With L......: 2000000000
Product Stock Count: ........: 1300000000
Population of Stars..........: 100000000000
World Population: 2000000000
India Population Without L...: 1380004385
India Population With L......: 1380004385
Product Stock Count: ........: 1300000000
Population of Stars..........: 100000000000
Binary Representation (World Population).............: 1110111001101011001010000000000
Binary Representation (Product Stock Count)..........: 1001101011111000110110100000000
Binary Representation (India Population Without L)...: 1010010010000010011001000100001
Binary Representation (India Population With L)......: 1010010010000010011001000100001
Binary Representation (Population of Stars)..........: 1011101001000011101101110100000000000
Size of long data type in bytes......................: 8 bytes
Size of long data type in bits.......................: 64 bits


 */