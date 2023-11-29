/*
    Author:
    Vidyadhar Bendre

    Email:
    vidyadhar.bendre@gmail.com

    Date:
    28 November, 2023

    Question:
    How can we represent a small quantity in a limited memory space using stack memory?

    Purpose:
    Illustrate byte data type in stack memory.

    Description:
    This program demonstrates the usage of the byte data type and its memory allocation in the stack.
    It represents a smaller range of integers (-128 to 127).
    It occupies 8 bits (1 byte) of memory in the stack.

    Stack Memory Allocation:
    - When this method is invoked, a stack frame is created.
    - 'quantity' is allocated 1 byte in the stack frame.
    - Once the method finishes execution, the stack frame and memory for 'quantity' are removed.

    Real-time Scenario:
    Storing a small quantity.

    Binary Representation:
    For example, 100 in binary is 01100100 (8 bits, 1 byte)

    Example: Storing a small quantity.
*/

public class ByteStackMemoryExample {
    public static void main(String[] args) {
        byte quantity = 100;  // Represents a small quantity or status
        System.out.println("Byte Example in Stack Memory.....: " + quantity);

        // Displaying the binary representation of 100
        System.out.println("Binary Representation............: " + Integer.toBinaryString(quantity & 0xFF));

        // Displaying the size of byte data type in bytes and bits
        System.out.println("Size of byte data type in bytes..: " + Byte.BYTES + " bytes");
        System.out.println("Size of byte data type in bits...: " + (Byte.SIZE) + " bits");

    }
}

// The output of the above program is

/*

Byte Example in Stack Memory.....: 100
Binary Representation............: 1100100
Size of byte data type in bytes..: 1 bytes
Size of byte data type in bits...: 8 bits

 */