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
 * It represents inventory count, record count, and product stock count scenarios.
 *
 * Real-time Scenarios:
 * 1. Inventory Management - Quantity of Items in a Warehouse
 * 2. Product Availability - Stock Count of a Specific Product in a Store
 */
public class IntQuantityScenario {
    private int inventoryCount; // Represents the count of items in the warehouse
    private int productStockCount; // Represents the stock count of a specific product in a store

    public IntQuantityScenario(int inventoryCount, int productStockCount) {
        this.inventoryCount = inventoryCount;
        this.productStockCount = productStockCount;
    }

    // Getter and Setter methods for inventoryCount
    public int getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(int inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    // Getter and Setter methods for productStockCount
    public int getProductStockCount() {
        return productStockCount;
    }

    public void setProductStockCount(int productStockCount) {
        this.productStockCount = productStockCount;
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
    }
}

// The output of the above program is shown below
/*

Inventory Count................................: 1000
Product Stock Count............................: 500
Binary Representation of Inventory Count.......: 11101000
Binary Representation of Product Stock Count...: 11110100
Size of byte data type in bytes................: 1 bytes
Size of byte data type in bits.................: 8 bits

 */