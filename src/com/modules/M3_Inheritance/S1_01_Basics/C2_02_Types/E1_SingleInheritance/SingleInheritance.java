package modules.M3_Inheritance.S1_01_Basics.C2_02_Types.E1_SingleInheritance;

// Superclass: Vehicle
class Vehicle {
    protected String brand;
    protected String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("Starting the vehicle engine...");
    }

    public void stopEngine() {
        System.out.println("Stopping the vehicle engine...");
    }
}

// Subclass: Car
class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, String color, int numOfDoors) {
        super(brand, color);
        this.numOfDoors = numOfDoors;
    }

    public void drive() {
        System.out.println("Driving the car...");
    }

    public void park() {
        System.out.println("Parking the car...");
    }
}

// Main class for Single Inheritance example
public class SingleInheritance {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCarObj;
        myCarObj = new Car("Toyota", "Red", 4);

        // Accessing superclass (Vehicle) methods
        myCarObj.startEngine();
        myCarObj.stopEngine();

        // Accessing subclass (Car) methods
        myCarObj.drive();
        myCarObj.park();
    }
}

// The output of the above program is shown as below:
/*
Starting the vehicle engine...
Stopping the vehicle engine...
Driving the car...
Parking the car...
 */