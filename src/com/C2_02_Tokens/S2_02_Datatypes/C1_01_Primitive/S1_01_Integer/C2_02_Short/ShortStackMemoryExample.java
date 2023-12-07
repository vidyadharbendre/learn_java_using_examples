/*

    Author:
    Vidyadhar Bendre

    Email:
    vidyadhar.bendre@gmail.com

    Date:
    27th November, 2023

    Question:
    How can we represent typical room temperature?

    Purpose:
    Illustrate short data type in stack memory.

    Description:
    This program demonstrates the usage of the short data type and its memory allocation in
    the stack.
    It represents a wider range of integers (-32,768 to 32,767).
    It occupies 16 bits (2 bytes) of memory in the stack.

    Stack Memory Allocation:
    - When this method is invoked, a stack frame is created.
    - 'roomTemperature' is allocated 2 bytes in the stack frame.
    - Once the method finishes execution, the stack frame and memory for 'roomTemperature' are removed.

    Real-time Scenario:
    Storing typical room temperature.

    Binary Representation:
    For example, 25 in binary is 00000000 00011001 (16 bits, 2 bytes)

    Example: Storing typical room temperature.
*/

package C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C2_02_Short;
public class ShortStackMemoryExample {
    public static void main(String[] args) {
        short roomTemperature = 25;  // Represents typical room temperature in Celsius
        System.out.println("Storing Room Temperature (25°C) as a Short...: " + roomTemperature);

        // Displaying the binary representation of 25
        System.out.println("Binary Representation........................: " + Integer.toBinaryString(roomTemperature & 0xFFFF));

        // Displaying the size of short data type in bytes and bits
        System.out.println("Size of short data type in bytes.............: " + Short.BYTES + " bytes");
        System.out.println("Size of short data type in bits..............: " + (Short.SIZE) + " bits");
    }
}

// Compiling using the command prompt:
/*
javac -d ../../../../../../../out ShortStackMemoryExample.java
*/

// To execute:
// You can either click on the 'run' button (green) at the top or use the command below:
// Navigate to the compiled files in the 'out' directory by entering a space followed by pressing the 'tab' key.
/*
java -cp ../../../../../../../out C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C2_02_Short.ShortStackMemoryExample
*/

// The output of the above program is

/*

Storing Room Temperature (25°C) as a Short...: 25
Binary Representation........................: 11001
Size of short data type in bytes.............: 2 bytes
Size of short data type in bits..............: 16 bits

 */