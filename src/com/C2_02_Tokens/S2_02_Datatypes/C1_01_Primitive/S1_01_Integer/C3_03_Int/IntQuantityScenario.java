/**
 * Author: Vidyadhar Bendre
 * Email: vidyadhar.bendre@gmail.com
 * Date: 28 November, 2023

 * Purpose:
 * Illustrate quantity scenarios using different data types in Java.

 * Description:
 * This program demonstrates scenarios related to quantities and uses appropriate data types
 * in Java.
 * It represents inventory count, record count, and product stock count scenarios.

 * Real-time Scenarios:
 * 1. Inventory Management - Quantity of Items in a Warehouse
 * 2. Product Availability - Stock Count of a Specific Product in a Store
 */
package C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C3_03_Int;
public class IntQuantityScenario {
    private int inventoryCount; // Represents the count of items in the warehouse
    private int productStockCount; // Represents the stock count of a specific product in a store

    public IntQuantityScenario(int initInventoryCount, int initProductStockCount) {
        this.inventoryCount = initInventoryCount;
        this.productStockCount = initProductStockCount;
    }

    // Getter and Setter methods for inventoryCount
    public int getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(int newInventoryCount) {
        this.inventoryCount = newInventoryCount;
    }

    // Getter and Setter methods for productStockCount
    public int getProductStockCount() {
        return productStockCount;
    }

    public void setProductStockCount(int newProductStockCount) {
        productStockCount = newProductStockCount;
    }

    // Method to display binary representation of quantities
    public void displayBinaryRepresentation() {
        System.out.println("Binary Representation of Inventory Count.......: " + Integer.toBinaryString(inventoryCount & 0xFF));
        System.out.println("Binary Representation of Product Stock Count...: " + Integer.toBinaryString(productStockCount & 0xFF));
    }

    // Method to display the size of byte data type
    public void displayByteDataTypeSize() {
        System.out.println("Size of byte data type in bytes................: " + Byte.BYTES + " bytes");
        System.out.println("Size of byte data type in bits.................: " + (Byte.SIZE) + " bits");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an object to represent quantity scenarios
        IntQuantityScenario qtyObjInt;
        qtyObjInt = new IntQuantityScenario(1000, 500);

        // Displaying quantities and related information
        System.out.println("Inventory Count................................: " + qtyObjInt.getInventoryCount());
        System.out.println("Product Stock Count............................: " + qtyObjInt.getProductStockCount());

        // Displaying binary representations and byte data type size
        qtyObjInt.displayBinaryRepresentation();
        qtyObjInt.displayByteDataTypeSize();

        qtyObjInt.setInventoryCount(1500);
        qtyObjInt.setProductStockCount(750);
        System.out.println("Inventory Count................................: " + qtyObjInt.getInventoryCount());
        System.out.println("Product Stock Count............................: " + qtyObjInt.getProductStockCount());
        // Displaying binary representations and byte data type size
        qtyObjInt.displayBinaryRepresentation();
        qtyObjInt.displayByteDataTypeSize();

    }
}


// Compiling using the command prompt:
/*
javac -d ../../../../../../../out IntQuantityScenario.java
*/

// To execute:
// You can either click on the 'run' button (green) at the top or use the command below:
// Navigate to the compiled files in the 'out' directory by entering a space followed by
// pressing the 'tab' key.
/*
java -cp ../../../../../../../out C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C3_03_Int.IntQuantityScenario
*/


// The output of the above program is shown below
/*

Inventory Count................................: 1000
Product Stock Count............................: 500
Binary Representation of Inventory Count.......: 11101000
Binary Representation of Product Stock Count...: 11110100
Size of byte data type in bytes................: 1 bytes
Size of byte data type in bits.................: 8 bits
Inventory Count................................: 1500
Product Stock Count............................: 750
Binary Representation of Inventory Count.......: 11011100
Binary Representation of Product Stock Count...: 11101110
Size of byte data type in bytes................: 1 bytes
Size of byte data type in bits.................: 8 bits

 */