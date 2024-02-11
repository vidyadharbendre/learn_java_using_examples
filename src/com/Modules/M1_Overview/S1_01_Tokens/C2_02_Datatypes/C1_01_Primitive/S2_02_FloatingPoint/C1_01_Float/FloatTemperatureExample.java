/*
    Author:
    Vidyadhar Bendre

    Email:
    vidyadhar.bendre@gmail.com

    Date:
    28 November, 2023

    Question:
    How can we represent various quantity-related scenarios using different data types in Java?

    Purpose:
    Illustrate quantity scenarios using different data types in Java.

    Description:
    This program demonstrates scenarios related to quantities and uses appropriate data types in Java.
    It focuses on representing various real-time examples using the float data type.

    Real-time Scenarios:
    1. Temperature in Celsius
    2. Amount of Liquid in a Tank
    3. Distance Traveled by a Vehicle
*/
package com.C2_02_Tokens.S2_02_Datatypes.C1_01_Primitive.S2_02_FloatingPoint.C1_01_Float;

public class FloatTemperatureExample {
    public static void main(String[] args) {
        // Scenario 1: Temperature in Celsius
        float temperatureInCelsius = 25.5f; // Represents temperature in Celsius
        System.out.println("Temperature in Celsius......................: " + temperatureInCelsius);

        // Scenario 2: Amount of Liquid in a Tank
        float liquidAmountInTank = 1234.56f; // Represents the amount of liquid in a tank
        System.out.println("Liquid Amount in Tank.......................: " + liquidAmountInTank);

        // Scenario 3: Distance Traveled by a Vehicle
        float distanceTraveled = 256.75f; // Represents distance traveled by a vehicle
        System.out.println("Distance Traveled...........................: " + distanceTraveled);

        // Displaying the binary representation of the values
        System.out.println("Binary Representation (Temperature).........: " + Float.toHexString(temperatureInCelsius));
        System.out.println("Binary Representation (Liquid Amount).......: " + Float.toHexString(liquidAmountInTank));
        System.out.println("Binary Representation (Distance Traveled)...: " + Float.toHexString(distanceTraveled));

        // Displaying the size of float data type in bytes and bits
        System.out.println("Size of float data type in bytes............: " + Float.BYTES + " bytes");
        System.out.println("Size of float data type in bits.............: " + (Float.SIZE) + " bits");
    }
}

// The output of the above program is

/*

Temperature in Celsius......................: 25.5
Liquid Amount in Tank.......................: 1234.56
Distance Traveled...........................: 256.75
Binary Representation (Temperature).........: 0x1.98p4
Binary Representation (Liquid Amount).......: 0x1.34a3d8p10
Binary Representation (Distance Traveled)...: 0x1.00cp8
Size of float data type in bytes............: 4 bytes
Size of float data type in bits.............: 32 bits

 */