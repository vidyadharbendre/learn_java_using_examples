/**
 * Author: Vidyadhar Bendre
 * Email: vidyadhar.bendre@gmail.com
 * Date: 28 November, 2023
 *
 * Purpose:
 * Illustrate quantity scenarios using the double data type in Java.
 *
 * Description:
 * This class encapsulates scenarios related to quantities using the double data type in Java.
 * It focuses on representing various real-time examples using doubles.
 */
public class DoubleOOPsWay {
    private double futureValue;
    private double gravitationalForce;
    private double distanceBetweenCities;
    private double temperature;
    private double pressure;
    private double rotationX;
    private double rotationY;
    private double rotationZ;

    // Constructor to initialize quantities
    public DoubleOOPsWay() {
        calculateFutureValue();
        calculateGravitationalForce();
        calculateDistanceBetweenCities();
        setTemperature(98.6);
        setPressure(1013.25);
        setRotationValues(30.0, 45.0, 60.0);
    }

    // Method for Scenario 1: Financial Calculations - Compound Interest Calculation
    private void calculateFutureValue() {
        double principal = 10000.0;
        double annualInterestRate = 0.05;
        int years = 10;
        futureValue = principal * Math.pow((1 + annualInterestRate), years);
    }

    // Method for Scenario 2: Scientific Calculations - Gravitational Force Calculation
    private void calculateGravitationalForce() {
        double mass1 = 100.0;
        double mass2 = 150.0;
        double distance = 10.5;
        gravitationalForce = (6.67e-11 * mass1 * mass2) / (distance * distance);
    }

    // Method for Scenario 3: Geographical Systems - Distance Calculation between Cities
    private void calculateDistanceBetweenCities() {
        double latitude1 = 37.7749;
        double longitude1 = -122.4194;
        double latitude2 = 34.0522;
        double longitude2 = -118.2437;
        distanceBetweenCities = calculateDistance(latitude1, longitude1, latitude2, longitude2);
    }

    // Method to calculate distance between cities based on coordinates
    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        // Calculation logic to find the distance between cities
        // Implementation omitted for brevity
        return 0.0; // Placeholder return
    }

    // Getter methods for accessing quantities
    public double getFutureValue() {
        return futureValue;
    }

    public double getGravitationalForce() {
        return gravitationalForce;
    }

    public double getDistanceBetweenCities() {
        return distanceBetweenCities;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getRotationX() {
        return rotationX;
    }

    public double getRotationY() {
        return rotationY;
    }

    public double getRotationZ() {
        return rotationZ;
    }

    // Setter methods for setting temperature, pressure, and rotation values
    public void setTemperature(double temp) {
        temperature = temp;
    }

    public void setPressure(double press) {
        pressure = press;
    }

    public void setRotationValues(double rotX, double rotY, double rotZ) {
        rotationX = rotX;
        rotationY = rotY;
        rotationZ = rotZ;
    }

    // Display binary representation of quantities
    public void displayBinaryRepresentation() {
        System.out.println("Binary Representation (Temperature): " + Double.toHexString(temperature));
        System.out.println("Binary Representation (Pressure): " + Double.toHexString(pressure));
        System.out.println("Binary Representation (Rotation X): " + Double.toHexString(rotationX));
        System.out.println("Binary Representation (Rotation Y): " + Double.toHexString(rotationY));
        System.out.println("Binary Representation (Rotation Z): " + Double.toHexString(rotationZ));
    }

    // Display the size of double data type
    public void displayDoubleDataTypeSize() {
        System.out.println("Size of double data type in bytes: " + Double.BYTES + " bytes");
        System.out.println("Size of double data type in bits: " + (Double.SIZE) + " bits");
    }

    // Main method for testing
    public static void main(String[] args) {
        DoubleOOPsWay quantities = new DoubleOOPsWay();

        System.out.println("Future Value: " + quantities.getFutureValue());
        System.out.println("Gravitational Force: " + quantities.getGravitationalForce());
        System.out.println("Distance between cities: " + quantities.getDistanceBetweenCities());
        System.out.println("Temperature: " + quantities.getTemperature());
        System.out.println("Pressure: " + quantities.getPressure());
        System.out.println("Rotation X: " + quantities.getRotationX());
        System.out.println("Rotation Y: " + quantities.getRotationY());
        System.out.println("Rotation Z: " + quantities.getRotationZ());

        quantities.displayBinaryRepresentation();
        quantities.displayDoubleDataTypeSize();
    }
}

// The output of the above program is shown as below:
/*

Future Value: 16288.946267774423
Gravitational Force: 9.07482993197279E-9
Distance between cities: 0.0
Temperature: 98.6
Pressure: 1013.25
Rotation X: 30.0
Rotation Y: 45.0
Rotation Z: 60.0
Binary Representation (Temperature): 0x1.8a66666666666p6
Binary Representation (Pressure): 0x1.faap9
Binary Representation (Rotation X): 0x1.ep4
Binary Representation (Rotation Y): 0x1.68p5
Binary Representation (Rotation Z): 0x1.ep5
Size of double data type in bytes: 8 bytes
Size of double data type in bits: 64 bits


 */