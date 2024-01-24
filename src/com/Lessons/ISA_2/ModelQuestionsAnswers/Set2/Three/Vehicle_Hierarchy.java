package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Three;

/*
16.	You are tasked with designing a class hierarchy for modeling vehicles
in a transportation system.
The hierarchy should include various types of vehicles, such as cars,
motorcycles, and bicycles.
Each vehicle type has specific properties and behaviors.
Explain how you would use inheritance in Java to create this hierarchy,
 */



// Base class (Superclass)
class Vehicle {
    String make;
    String model;
    int year;

    void start() {
        System.out.println("Starting the vehicle");
    }

    void accelerate() {
        System.out.println("Accelerating the vehicle");
    }

    void brake() {
        System.out.println("Applying brakes");
    }
}

// Subclass for Cars
class Car extends Vehicle {
    int numberOfDoors;

    void engageConvertibleTop() {
        System.out.println("Engaging convertible top");
    }
}

// Subclass for Motorcycles
class Motorcycle extends Vehicle {
    boolean hasFairing;

    void kickstand() {
        System.out.println("Using kickstand");
    }
}

// Subclass for Bicycles
class Bicycle extends Vehicle {
    int numberOfGears;

    void adjustSeatHeight() {
        System.out.println("Adjusting seat height");
    }
}

public class Vehicle_Hierarchy {
    public static void main(String[] args) {
        // Creating instances of each type of vehicle
        Car myCarRefObj;
        myCarRefObj = new Car();
        myCarRefObj.make = "Toyota";
        myCarRefObj.model = "Camry";
        myCarRefObj.year = 2022;
        myCarRefObj.numberOfDoors = 4;

        Motorcycle myMotorcycleRefObj;
        myMotorcycleRefObj = new Motorcycle();
        myMotorcycleRefObj.make = "Harley-Davidson";
        myMotorcycleRefObj.model = "Sportster";
        myMotorcycleRefObj.year = 2021;
        myMotorcycleRefObj.hasFairing = true;

        Bicycle myBicycleRefObj;
        myBicycleRefObj = new Bicycle();
        myBicycleRefObj.make = "Giant";
        myBicycleRefObj.model = "Talon";
        myBicycleRefObj.year = 2020;
        myBicycleRefObj.numberOfGears = 21;

        // Demonstrating common methods
        myCarRefObj.start();
        myCarRefObj.accelerate();
        myCarRefObj.brake();
        myCarRefObj.engageConvertibleTop();

        myMotorcycleRefObj.start();
        myMotorcycleRefObj.accelerate();
        myMotorcycleRefObj.brake();
        myMotorcycleRefObj.kickstand();

        myBicycleRefObj.start();
        myBicycleRefObj.accelerate();
        myBicycleRefObj.brake();
        myBicycleRefObj.adjustSeatHeight();
    }
}

// The output of the above program is shown as below
/*
Starting the vehicle
Accelerating the vehicle
Applying brakes
Engaging convertible top
Starting the vehicle
Accelerating the vehicle
Applying brakes
Using kickstand
Starting the vehicle
Accelerating the vehicle
Applying brakes
Adjusting seat height
 */