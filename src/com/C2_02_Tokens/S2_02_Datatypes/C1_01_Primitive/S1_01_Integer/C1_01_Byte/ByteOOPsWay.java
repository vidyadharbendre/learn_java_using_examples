/**
 * Author: Vidyadhar Bendre
 * Email: vidyadhar.bendre@gmail.com
 * Date: 28 November, 2023

 * Purpose:
 * Illustrate byte data type in stack memory.

 * Description:
 * This program demonstrates the usage of the byte data type and its memory allocation
 * in the stack.
 * It represents a smaller range of integers (-128 to 127).
 * It occupies 8 bits (1 byte) of memory in the stack.

 * Stack Memory Allocation:
 * - When this method is invoked, a stack frame is created.
 * - 'quantity' is allocated 1 byte in the stack frame.
 * - Once the method finishes execution, the stack frame and memory for 'quantity' are removed.

 * Real-time Scenario:
 * Storing a small quantity.

 * Binary Representation:
 * For example, 100 in binary is 01100100 (8 bits, 1 byte)

 * Example: Storing a small quantity.
 */
package com.C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C1_01_Byte;

public class ByteOOPsWay {
    private byte quantity; // Represents a small quantity or status

    // Constructor to initialize the quantity
    public ByteOOPsWay(byte quantityInput) {
        this.quantity = quantityInput;
    }

    // Getter method to retrieve the quantity
    public byte getQuantity() {
        return quantity;
    }

    public void setQuantity(byte quantityUpdate) {
        quantity = quantityUpdate;
    }

    // Method to display the binary representation of the quantity
    public void displayBinaryRepresentation() {
        System.out.println("Binary Representation..............: " + String.format("%8s", Integer.toBinaryString(quantity & 0xFF)).replace(' ', '0'));
    }

    // Method to display the size of byte data type
    public void displayByteDataTypeSize() {
        System.out.println("Size of byte data type in bytes....: " + Byte.BYTES + " bytes");
        System.out.println("Size of byte data type in bits.....: " + Byte.SIZE + " bits");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating multiple instances with different initial quantities

        ByteOOPsWay objByteOOPs1;
        objByteOOPs1 = new ByteOOPsWay((byte)10);

        // Displaying information for each instance
        System.out.println("Byte Example in Stack Memory (Quantity 10): " + objByteOOPs1.getQuantity());

        objByteOOPs1.setQuantity((byte)20);
        System.out.println("Byte Example in Stack Memory (Quantity 20): " + objByteOOPs1.getQuantity());

        objByteOOPs1.displayBinaryRepresentation();
        objByteOOPs1.displayByteDataTypeSize();

        ByteOOPsWay objByteOOPs2;
        objByteOOPs2 = new ByteOOPsWay((byte)30);

        System.out.println("\nByte Example in Stack Memory (Quantity 30): " + objByteOOPs2.getQuantity());
        objByteOOPs2.setQuantity((byte)40);
        System.out.println("\nByte Example in Stack Memory (Quantity 40): " + objByteOOPs2.getQuantity());

        objByteOOPs2.displayBinaryRepresentation();
        objByteOOPs2.displayByteDataTypeSize();
    }
}

// Compiling using the command prompt:
/*
javac -d ../../../../../../../out ByteOOPsWay.java
*/

// To execute:
// You can either click on the 'run' button (green) at the top or use the command below:
// Navigate to the compiled files in the 'out' directory by entering a space followed by pressing the 'tab' key.
/*
java -cp ../../../../../../../out C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C1_01_Byte.ByteOOPsWay.java
*/

// The output of the above program is
/*
Byte Example in Stack Memory (Quantity 10): 10
Binary Representation..............: 00001010
Size of byte data type in bytes....: 1 bytes
Size of byte data type in bits.....: 8 bits

Byte Example in Stack Memory (Quantity 20): 20
Binary Representation..............: 00010100
Size of byte data type in bytes....: 1 bytes
Size of byte data type in bits.....: 8 bits

*/

/*

Integer.toBinaryString(quantity & 0xFF): This part does the actual conversion to binary.
quantity is an integer variable. & 0xFF performs a bitwise AND operation with 0xFF
(which is 255 in decimal).
This operation extracts the least significant 8 bits (1 byte) from quantity, effectively
masking all bits except the 8 least significant bits.

Integer.toBinaryString converts the resulting value to a string representation in binary
format.
*/