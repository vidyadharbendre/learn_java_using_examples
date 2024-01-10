package com.Trials.LearnInheritance.Example_2;

public class Inheritance_learn_2 {
    public static void main(String[] args) {

//        Vehicle vehicleObj;
//        vehicleObj = new Vehicle("Toyota", "Fortuner");
//        vehicleObj.displayDetails();

        Car carParObj;
        carParObj = new Car("Toyoto", "Fortuner", 4);
        carParObj.displayCarDetails();
        System.out.println("------------------------------------------");
        carParObj.displayDetails();
        System.out.println("Car------------------------------------------");
        Bike bikeParObj;
        bikeParObj = new Bike("Hero Honda", "Splendor", "Sports");
        bikeParObj.displayBikeDetails();
        System.out.println("___________________________________________");
    }
}

class Vehicle{
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayDetails(){
        System.out.println("Brand :"+brand);
        System.out.println("Model :"+model);
    }

}
class Car extends Vehicle{

    private int doors;

    public Car(String brand, String model, int doors) {
        super(brand, model);
        this.doors = doors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }

    public void displayCarDetails(){
        super.displayDetails();
        System.out.println("Doors :"+doors);
    }

}

class Bike extends Vehicle{
    private String type;

    public Bike(String brand, String model, String type) {
        super(brand, model);
        this.type = type;
    }
    public void displayBikeDetails(){
        super.displayDetails();
        System.out.println("Type :"+type);
    }
}

// The output of the above program is shown as below
/*
Brand :Toyoto
Model :Fortuner
Doors :4
------------------------------------------
Brand :Toyoto
Model :Fortuner
Car------------------------------------------
Brand :Hero Honda
Model :Splendor
Type :Sports
___________________________________________
 */