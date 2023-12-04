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
    It focuses on representing various real-time examples using the double data type.

    Real-time Scenarios:
    1. Financial Calculations - Compound Interest Calculation
    2. Scientific Calculations - Gravitational Force Calculation
    3. Geographical Systems - Distance Calculation between Cities
    4. Physical Measurements - Temperature and Pressure
    5. Simulation and Graphics - 3D Rotation Values
*/
package _02_Tokens._02_Datatypes._01_Primitive._02_FloatingPoint._02_Double;
public class DoubleDataTypeExample {
    public static void main(String[] args) {
        // Scenario 1: Financial Calculations - Compound Interest Calculation
        double principal = 10000.0;
        double annualInterestRate = 0.05;
        int years = 10;
        double futureValue = principal * Math.pow((1 + annualInterestRate), years);
        System.out.println("Future Value: " + futureValue);

        // Scenario 2: Scientific Calculations - Gravitational Force Calculation
        double mass1 = 100.0;
        double mass2 = 150.0;
        double distance = 10.5;
        double gravitationalForce = (6.67e-11 * mass1 * mass2) / (distance * distance);
        System.out.println("Gravitational Force: " + gravitationalForce);

        // Scenario 3: Geographical Systems - Distance Calculation between Cities
        double latitude1 = 37.7749;
        double longitude1 = -122.4194;
        double latitude2 = 34.0522;
        double longitude2 = -118.2437;
//        double distanceBetweenCities = calculateDistance(latitude1, longitude1, latitude2, longitude2);
//        System.out.println("Distance between cities: " + distanceBetweenCities);

        // Scenario 4: Physical Measurements - Temperature and Pressure
        double temperature = 98.6;
        double pressure = 1013.25;
        System.out.println("Temperature: " + temperature);
        System.out.println("Pressure: " + pressure);

        // Scenario 5: Simulation and Graphics - 3D Rotation Values
        double rotationX = 30.0;
        double rotationY = 45.0;
        double rotationZ = 60.0;
        System.out.println("Rotation X: " + rotationX);
        System.out.println("Rotation Y: " + rotationY);
        System.out.println("Rotation Z: " + rotationZ);

        // Displaying the binary representation of the values
        System.out.println("Binary Representation (Temperature): " + Double.toHexString(temperature));
        System.out.println("Binary Representation (Pressure): " + Double.toHexString(pressure));
        System.out.println("Binary Representation (Rotation X): " + Double.toHexString(rotationX));
        System.out.println("Binary Representation (Rotation Y): " + Double.toHexString(rotationY));
        System.out.println("Binary Representation (Rotation Z): " + Double.toHexString(rotationZ));

        // Displaying the size of double data type in bytes and bits
        System.out.println("Size of double data type in bytes: " + Double.BYTES + " bytes");
        System.out.println("Size of double data type in bits: " + (Double.SIZE) + " bits");
    }
}
