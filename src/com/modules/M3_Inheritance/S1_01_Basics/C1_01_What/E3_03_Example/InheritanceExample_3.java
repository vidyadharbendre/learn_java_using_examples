package com.modules.M3_Inheritance.S1_01_Basics.C1_01_What.E3_03_Example;

// Superclass: Vehicle
class Vehicle {
    void start() {
        System.out.println("Starting the vehicle...");
    }
}

// Subclass: Car
class Car extends Vehicle {
    void start() {
        System.out.println("Starting the car...");
    }
}

// Subclass: Bicycle
class Bicycle extends Vehicle {
    // No start method overridden
}

public class InheritanceExample_3 {
    public static void main(String[] args) {
        Vehicle vehicleObj;
        vehicleObj = new Vehicle();
        vehicleObj.start(); // Output: Starting the vehicle...

        Car carObj;
        carObj = new Car();
        carObj.start(); // Output: Starting the car...

        Bicycle bicycleObj;
        bicycleObj = new Bicycle();
        bicycleObj.start(); // Output: Starting the vehicle... (inherits from superclass)
    }
}

// The output of the above program is shown below:
/*
Starting the vehicle...
Starting the car...
Starting the vehicle...
 */