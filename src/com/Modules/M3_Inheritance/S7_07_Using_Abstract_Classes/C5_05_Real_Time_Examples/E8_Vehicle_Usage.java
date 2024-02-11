package com.Modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C5_05_Real_Time_Examples;

public class E8_Vehicle_Usage {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        // Example Usage:
        System.out.println("Car:");
        car.start();
        car.stop();

        System.out.println("\nMotorcycle:");
        motorcycle.start();
        motorcycle.stop();
    }
}

abstract class Vehicle {
    protected String model;

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        // Car-specific implementation
        System.out.println("Car started");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        // Motorcycle-specific implementation
        System.out.println("Motorcycle started");
    }

    @Override
    void stop() {
        // Motorcycle-specific implementation
        System.out.println("Motorcycle stopped");
    }
}

// The output of the above program is shown as below:
/*

Car:
Car started
Vehicle stopped

Motorcycle:
Motorcycle started
Motorcycle stopped

 */