package com.modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C3_03_Abstract_Class_With_Constructor;

// Main class to test Abstract Class with Constructor
public class AbstractClassConstructor {
    public static void main(String[] args) {

        // Creating an instance of Car
        Car carRefObj;
        carRefObj = new Car("Tata");
        // Calling abstract method start
        carRefObj.start();
    }
}

abstract class Vehicle{
    String model;

    public Vehicle(String model) {
        this.model = model;
    }
    abstract void start();
}

class Car extends Vehicle{

    public Car(String model) {
        super(model);
    }
    @Override
    void start() {
        System.out.println("Car starting, Model : "+model);
    }
}