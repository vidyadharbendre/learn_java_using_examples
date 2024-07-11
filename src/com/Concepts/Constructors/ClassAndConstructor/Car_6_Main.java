package com.Concepts.Constructors.ClassAndConstructor;

/**
 * Author   : Vidyadhar Bendre
 * Email    : vidyadhar.bendre@gmail.com
 * Date     : 25 December 2023
 * Purpose  : This class demonstrates the usage of the 'Car_6' class and its constructors in a main program.
 *
 * In this scenario:
 *
 * 1. 'Car_6_Main' class contains the main method to create 'Car_6' objects and manipulate their attributes.
 *
 * 2. 'main()' method serves as the entry point, demonstrating:
 *    - Creation of 'Car_6' objects using both default and parameterized constructors.
 *    - Modification of car attributes using setter methods.
 *    - Retrieval of car information using getter methods and 'getCarInfo()' method.
 */
public class Car_6_Main {
    public static void main(String[] args) {
        // Creating Car objects using both constructors
        Car_6 defaultCarObj;
        defaultCarObj = new Car_6(); // Using default constructor
        System.out.println("Default Car Info: " + defaultCarObj.getCarInfo());

        Car_6 paramCarObj;
        paramCarObj = new Car_6("Toyota", "Corolla", 2022); // Using parameterized constructor

        // Modifying car attributes using setter methods
        defaultCarObj.setBrand("BMW");   // Setting brand using setter method
        defaultCarObj.setModel("X5");    // Setting model using setter method
        defaultCarObj.setYear(2020);     // Setting year using setter method

        // Retrieving car information using getter methods and getCarInfo() method
        System.out.println("Default Car Info: " + defaultCarObj.getCarInfo());   // Getting default car info
        System.out.println("Parameterized Car Info: " + paramCarObj.getCarInfo()); // Getting parameterized car info
    }
}
// The output of the above program is shown as below:
/*
Default Car Info: Brand: Maruthi, Model: Alto, Year: 2020
Default Car Info: Brand: BMW, Model: X5, Year: 2020
Parameterized Car Info: Brand: Toyota, Model: Corolla, Year: 2022
 */