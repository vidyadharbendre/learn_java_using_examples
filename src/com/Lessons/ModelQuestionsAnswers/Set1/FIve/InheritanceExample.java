package Lessons.ModelQuestionsAnswers.Set1.FIve;

class Vehicle {
// Superclass Vehicle
    private String brand;
    private String model;
    private int year;

    // Constructor for Vehicle
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass Car inheriting from Vehicle
class Car extends Vehicle {
    private int doors;

    // Constructor for Car
    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year); // Call to superclass constructor
        this.doors = doors;
    }

    // Method to display car details
    public void displayCarDetails() {
        displayDetails(); // Call to superclass method
        System.out.println("Number of doors: " + doors);
    }
}

// Subclass Motorcycle inheriting from Vehicle
class Motorcycle extends Vehicle {
    private String type;

    // Constructor for Motorcycle
    public Motorcycle(String brand, String model, int year, String type) {
        super(brand, model, year); // Call to superclass constructor
        this.type = type;
    }

    // Method to display motorcycle details
    public void displayMotorcycleDetails() {
        displayDetails(); // Call to superclass method
        System.out.println("Type: " + type);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating instances of Car and Motorcycle
        Car carObj;
        carObj = new Car("Toyota", "Camry", 2022, 4);
        Motorcycle motorcycleObj;
        motorcycleObj = new Motorcycle("Honda", "CBR500R", 2021, "Sport");

        // Displaying details of Car and Motorcycle
        System.out.println("Car Details:");
        carObj.displayCarDetails();

        System.out.println("\nMotorcycle Details:");
        motorcycleObj.displayMotorcycleDetails();
    }
}

