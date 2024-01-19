package com.modules.M3_Inheritance.S11_11_Interface.C6_06_Real_Time_Examples;

// Vehicle interface
interface Vehicle {
    void start();
}

interface FuelConsumable{
    void refuel();
}

// Concrete classes implementing the Vehicle interface
class Car implements Vehicle, FuelConsumable {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void refuel() {
        System.out.println("refuelling Car with diesel");
    }
}

class Motorcycle implements Vehicle, FuelConsumable {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void refuel() {
        System.out.println("refuelling Motorcycle petrol");
    }
}
class ElectricCar implements Vehicle, FuelConsumable{
    @Override
    public void start() {
        System.out.println("Electric Car started");
    }

    @Override
    public void refuel() {
        System.out.println("Charging Electric Car");
    }
}

// Usage
public class E4_VehicleDemo {
    public static void main(String[] args) {
        Car carRefObj;
        carRefObj = new Car();
        carRefObj.start();
        carRefObj.refuel();

        Motorcycle motorcycleRefObj;
        motorcycleRefObj = new Motorcycle();
        motorcycleRefObj.start();
        motorcycleRefObj.refuel();

        ElectricCar electricCarRefObj;
        electricCarRefObj = new ElectricCar();
        electricCarRefObj.refuel();
        electricCarRefObj.start();



    }
}

// The output of the above program is shown as below:
/*
Car started
refuelling Car with diesel
Motorcycle started
refuelling Motorcycle petrol
Charging Electric Car
Electric Car started
 */