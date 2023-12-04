/**
 * Author: Vidyadhar Bendre
 * Email: vidyadhar.bendre@gmail.com
 * Date: 28 November, 2023
 *
 * Purpose:
 * Illustrate quantity scenarios using the float data type in Java.
 *
 * Description:
 * This program demonstrates scenarios related to quantities and uses the float data type in Java.
 * It focuses on representing various real-time examples using floats.
 *
 * Real-time Scenarios:
 * 1. Temperature in Celsius
 * 2. Amount of Liquid in a Tank
 * 3. Distance Traveled by a Vehicle
 */

public class FloatOOPsWay {
    private float temperatureInCelsius;
    private float liquidAmountInTank;
    private float distanceTraveled;

    // Constructor to initialize the quantities
    public FloatOOPsWay(float temperatureInCelsius, float liquidAmountInTank, float distanceTraveled) {
        this.temperatureInCelsius = temperatureInCelsius;
        this.liquidAmountInTank = liquidAmountInTank;
        this.distanceTraveled = distanceTraveled;
    }

    // Getter methods for accessing the quantities
    public float getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public float getLiquidAmountInTank() {
        return liquidAmountInTank;
    }

    public float getDistanceTraveled() {
        return distanceTraveled;
    }

    // Display binary representation of the quantities
    public void displayBinaryRepresentation() {
        System.out.println("Binary Representation (Temperature).........: " + Float.toHexString(temperatureInCelsius));
        System.out.println("Binary Representation (Liquid Amount).......: " + Float.toHexString(liquidAmountInTank));
        System.out.println("Binary Representation (Distance Traveled)...: " + Float.toHexString(distanceTraveled));
    }

    // Display the size of float data type
    public void displayFloatDataTypeSize() {
        System.out.println("Size of float data type in bytes............: " + Float.BYTES + " bytes");
        System.out.println("Size of float data type in bits.............: " + (Float.SIZE) + " bits");
    }

    // Main method for testing
    public static void main(String[] args) {
        FloatOOPsWay quantities = new FloatOOPsWay(25.5f, 1234.56f, 256.75f);

        System.out.println("Temperature in Celsius......................: " + quantities.getTemperatureInCelsius());
        System.out.println("Liquid Amount in Tank.......................: " + quantities.getLiquidAmountInTank());
        System.out.println("Distance Traveled...........................: " + quantities.getDistanceTraveled());

        quantities.displayBinaryRepresentation();
        quantities.displayFloatDataTypeSize();
    }
}

// The output of the above program is shown as below

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
