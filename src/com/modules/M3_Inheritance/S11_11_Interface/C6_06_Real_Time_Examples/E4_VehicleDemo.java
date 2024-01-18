package com.modules.M3_Inheritance.S11_11_Interface.C6_06_Real_Time_Examples;

// Vehicle interface
interface Vehicle {
    void start();
}

// Concrete classes implementing the Vehicle interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }
}

// Usage
public class E4_VehicleDemo {
    public static void main(String[] args) {
        Vehicle carRefObj;
        carRefObj = new Car();
        Vehicle motorcycleRefObj;
        motorcycleRefObj = new Motorcycle();

        carRefObj.start();
        motorcycleRefObj.start();
    }
}

// The output of the above program is shown as below:
/*
Car started
Motorcycle started
 */