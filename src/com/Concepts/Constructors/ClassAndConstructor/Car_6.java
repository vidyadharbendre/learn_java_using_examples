package com.Concepts.Constructors.ClassAndConstructor;
/**
 * Author   : Vidyadhar Bendre
 * Email    : vidyadhar.bendre@gmail.com
 * Date     : 25 December 2023
 * Purpose  : This class demonstrates the use of constructors in Java for a 'Car' object.
 *
 * In this scenario:
 *
 * 1. 'Car_6' class represents a car with attributes such as brand, model, and year.
 *
 * 2. Constructors:
 *    - 'Car_6()' is the default constructor initializing default values for brand, model, and year.
 *    - 'Car_6(String, String, int)' is the parameterized constructor to set values based on arguments.
 *
 * 3. Instance variables:
 *    - 'brand' (String) stores the brand of the car.
 *    - 'model' (String) stores the model of the car.
 *    - 'year' (int) stores the manufacturing year of the car.
 *
 * 4. Methods:
 *    - 'getBrand()' retrieves the brand of the car.
 *    - 'getModel()' retrieves the model of the car.
 *    - 'getYear()' retrieves the manufacturing year of the car.
 *    - 'setBrand(String)' sets the brand of the car.
 *    - 'setModel(String)' sets the model of the car.
 *    - 'setYear(int)' sets the manufacturing year of the car.
 *    - 'getCarInfo()' retrieves all car details in a formatted string.
 */
public class Car_6 {
    // Instance variables with comments
    private String brand; // Stores the brand of the car
    private String model; // Stores the model of the car
    private int year;     // Stores the manufacturing year of the car

    // Default constructor with comments
    public Car_6() {
        // Initializing default values for brand, model, and year
        this.brand = "Maruthi"; // Default brand
        this.model = "Alto";     // Default model
        this.year = 2020;        // Default year
    }

    // Parameterized constructor with comments
    public Car_6(String brand, String model, int year) {
        // Initializing values based on arguments
        this.brand = brand;   // Setting brand from argument
        this.model = model;   // Setting model from argument
        this.year = year;     // Setting year from argument
    }

    // Method to retrieve the brand of the car
    public String getBrand() {
        return this.brand; // Returning the brand of the car
    }

    // Method to retrieve the model of the car
    public String getModel() {
        return this.model; // Returning the model of the car
    }

    // Method to retrieve the manufacturing year of the car
    public int getYear() {
        return this.year; // Returning the manufacturing year of the car
    }

    // Method to set the brand of the car
    public void setBrand(String brand) {
        this.brand = brand; // Setting the brand of the car
    }

    // Method to set the model of the car
    public void setModel(String model) {
        this.model = model; // Setting the model of the car
    }

    // Method to set the manufacturing year of the car
    public void setYear(int year) {
        this.year = year; // Setting the manufacturing year of the car
    }

    // Method to get all car details in a formatted string
    public String getCarInfo() {
        return "Brand: " + this.brand + ", Model: " + this.model + ", Year: " + this.year; // Returning formatted car details
    }
}
