/**
 * Author: Vidyadhar Bendre
 * Email: vidyadhar.bendre@gmail.com
 * Date: 27th November, 2023

 * Purpose:
 * Illustrate short data type in stack memory.

 * Description:
 * This program demonstrates the usage of the short data type and its memory allocation in the stack.
 * It represents a wider range of integers (-32,768 to 32,767).
 * It occupies 16 bits (2 bytes) of memory in the stack.

 * Stack Memory Allocation:
 * - When this method is invoked, a stack frame is created.
 * - 'roomTemperature' is allocated 2 bytes in the stack frame.
 * - Once the method finishes execution, the stack frame and memory for 'roomTemperature' are removed.

 * Real-time Scenario:
 * Storing typical room temperature.

 * Binary Representation:
 * For example, 25 in binary is 00000000 00011001 (16 bits, 2 bytes)

 * Example: Storing typical room temperature.
 */

package com.C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C2_02_Short;

public class ShortOOPsWay {
    private short roomTemperature; // Represents typical room temperature in Celsius

    public ShortOOPsWay(short InitilizeRoomTemp){
        this.roomTemperature = InitilizeRoomTemp;
    }

    public void setRoomTemperature(short updateTemperature) {
        roomTemperature = updateTemperature;
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
        ShortOOPsWay tempObject1;
        tempObject1 = new ShortOOPsWay((short)25);
        System.out.println("Storing Room Temperature (25°C) as a Short...: " + tempObject1.getRoomTemperature());

        tempObject1.setRoomTemperature((short) 8);
        System.out.println("Storing Room Temperature (28°C) as a Short...: " + tempObject1.getRoomTemperature());

        tempObject1.displayBinaryRepresentation();
        tempObject1.displayShortDataTypeSize();

        ShortOOPsWay tempObject2;
        tempObject2 = new ShortOOPsWay((short) 28);
        System.out.println("Initilized temperature as a short ..........: " + tempObject2.getRoomTemperature());
        tempObject2.setRoomTemperature((short)10);
        System.out.println("The updated temperature as a short .........: " + tempObject2.getRoomTemperature());

        tempObject2.displayBinaryRepresentation();
        tempObject2.displayShortDataTypeSize();
    }
}


// Compiling using the command prompt:
/*
javac -d ../../../../../../../out ShortOOPsWay.java
*/

// To execute:
// You can either click on the 'run' button (green) at the top or use the command below:
// Navigate to the compiled files in the 'out' directory by entering a space followed by pressing the 'tab' key.
/*
java -cp ../../../../../../../out C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C2_02_Short.Short.ShortOOPsWay
*/

// The output of the above program is shown below
/*
(base) vidyadharbendre@Vidyadhars-MacBook-Pro C2_02_Short % java -cp ../../../../../../../out C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C2_02_Short.ShortOOPsWay
Storing Room Temperature (25°C) as a Short...: 25
Storing Room Temperature (28°C) as a Short...: 801_Integer.C1_01_Byte.ByteStackMemoryExample
Binary Representation........................: 0000000000001000
Size of short data type in bytes.............: 2 bytes
Size of short data type in bits..............: 16 bits
Initilized temperature as a short ..........: 28
The updated temperature as a short .........: 10
Binary Representation........................: 0000000000001010
Size of short data type in bytes.............: 2 bytes
Size of short data type in bits..............: 16 bits

 */