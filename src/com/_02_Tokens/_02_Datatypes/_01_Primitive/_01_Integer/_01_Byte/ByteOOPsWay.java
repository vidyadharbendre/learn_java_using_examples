/**
 * Author: Vidyadhar Bendre
 * Email: vidyadhar.bendre@gmail.com
 * Date: 28 November, 2023
 *
 * Purpose:
 * Illustrate byte data type in stack memory.
 *
 * Description:
 * This program demonstrates the usage of the byte data type and its memory allocation in the stack.
 * It represents a smaller range of integers (-128 to 127).
 * It occupies 8 bits (1 byte) of memory in the stack.
 *
 * Stack Memory Allocation:
 * - When this method is invoked, a stack frame is created.
 * - 'quantity' is allocated 1 byte in the stack frame.
 * - Once the method finishes execution, the stack frame and memory for 'quantity' are removed.
 *
 * Real-time Scenario:
 * Storing a small quantity.
 *
 * Binary Representation:
 * For example, 100 in binary is 01100100 (8 bits, 1 byte)
 *
 * Example: Storing a small quantity.
 */
public class ByteOOPsWay {
    private byte quantity; // Represents a small quantity or status

    // Constructor to initialize the quantity
    public ByteOOPsWay(byte quantity) {
        this.quantity = quantity;
    }

    // Getter method to retrieve the quantity
    public byte getQuantity() {
        return quantity;
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
        ByteOOPsWay smallQuantity;
        smallQuantity = new ByteOOPsWay((byte) 100); // Storing a small quantity

        System.out.println("Byte Example in Stack Memory.......: " + smallQuantity.getQuantity());
        smallQuantity.displayBinaryRepresentation();
        smallQuantity.displayByteDataTypeSize();
    }
}

// The output of the above program is shown below
/*

Byte Example in Stack Memory.......: 100
Binary Representation..............: 01100100
Size of byte data type in bytes....: 1 bytes
Size of byte data type in bits.....: 8 bits

 */