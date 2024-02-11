package modules.M2_Introducing_Classes;

public class Car {
    // Instance variables representing the state of the Car class
    private String make;
    private String model;
    private int year;
    private String color;

    // Constructor to initialize the state of Car objects
    public Car(String make, String model, int year, String color) {
        this.make = make;     // Assigning values to make instance variable
        this.model = model;   // Assigning values to model instance variable
        this.year = year;     // Assigning values to year instance variable
        this.color = color;   // Assigning values to color instance variable
    }

    // Method to update the state (behavior affecting state)
    public void repaint(String newColor) {
        this.color = newColor;
    }

    // Getter methods to access the state of individual attributes
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Main method to demonstrate the usage of the Car class
    public static void main(String[] args) {
        // Creating an object (instance) of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022, "Blue");

        // Accessing and modifying the state of the object
        System.out.println(myCar.getMake());    // Output: Toyota
        System.out.println(myCar.getColor());   // Output: Blue

        myCar.repaint("Red");   // Modifying the state
        System.out.println(myCar.getColor());   // Output: Red
    }
}

