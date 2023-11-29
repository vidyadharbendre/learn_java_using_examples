/**
 * Author: Vidyadhar Bendre
 * Email: vidyadhar.bendre@gmail.com
 * Date: 27th November, 2023
 *
 * Purpose:
 * Illustrate short data type in stack memory.
 *
 * Description:
 * This program demonstrates the usage of the short data type and its memory allocation in the stack.
 * It represents a wider range of integers (-32,768 to 32,767).
 * It occupies 16 bits (2 bytes) of memory in the stack.
 *
 * Stack Memory Allocation:
 * - When this method is invoked, a stack frame is created.
 * - 'roomTemperature' is allocated 2 bytes in the stack frame.
 * - Once the method finishes execution, the stack frame and memory for 'roomTemperature' are removed.
 *
 * Real-time Scenario:
 * Storing typical room temperature.
 *
 * Binary Representation:
 * For example, 25 in binary is 00000000 00011001 (16 bits, 2 bytes)
 *
 * Example: Storing typical room temperature.
 */
public class ShortOOPsWay {
    private short roomTemperature; // Represents typical room temperature in Celsius

    public void setRoomTemperature(short temperature) {
        this.roomTemperature = temperature;
    }

    public short getRoomTemperature() {
        return roomTemperature;
    }

    // Method to display binary representation
    public void displayBinaryRepresentation() {
        System.out.println("Binary Representation........................: " + String.format("%16s", Integer.toBinaryString(roomTemperature & 0xFFFF)).replace(' ', '0'));
    }

    // Method to display the size of short data type
    public void displayShortDataTypeSize() {
        System.out.println("Size of short data type in bytes.............: " + Short.BYTES + " bytes");
        System.out.println("Size of short data type in bits..............: " + Short.SIZE + " bits");
    }

    // Main method for testing
    public static void main(String[] args) {
        ShortOOPsWay temperature = new ShortOOPsWay();
        temperature.setRoomTemperature((short) 25); // Storing room temperature

        System.out.println("Storing Room Temperature (25°C) as a Short...: " + temperature.getRoomTemperature());
        temperature.displayBinaryRepresentation();
        temperature.displayShortDataTypeSize();
    }
}

// The output of the above program is shown below
/*

Storing Room Temperature (25°C) as a Short...: 25
Binary Representation........................: 0000000000011001
Size of short data type in bytes.............: 2 bytes
Size of short data type in bits..............: 16 bits

 */