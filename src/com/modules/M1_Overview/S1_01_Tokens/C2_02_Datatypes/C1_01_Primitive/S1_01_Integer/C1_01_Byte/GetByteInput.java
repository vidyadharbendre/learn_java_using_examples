package com.C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C1_01_Byte;

import java.util.Scanner;

public class GetByteInput {
    public static void main(String[] args) {
        byte quantity;

        Scanner inpObj1;
        inpObj1 = new Scanner(System.in);

        System.out.println("Enter data for Byte datatype - quantity");
        quantity = inpObj1.nextByte();
        System.out.println("Entered data in Bytes in Stack Memory.....: " + quantity);

        // Displaying the size of byte data type in bytes and bits
        System.out.println("Size of byte data type in bytes...........: " + Byte.BYTES + " bytes");
        System.out.println("Size of byte data type in bits............: " + (Byte.SIZE) + " bits");
    }
}

// Compiling using the command prompt:
/*
javac -d ../../../../../../../out GetByteInput.java
*/

/*
java -cp ../../../../../../../out C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S1_01_Integer.C1_01_Byte.
 */

// The output of the above program is shown as below:
/*
Enter data for Byte datatype - quantity
99
Entered data in Bytes in Stack Memory.....: 99
Size of byte data type in bytes...........: 1 bytes
Size of byte data type in bits............: 8 bits
*/