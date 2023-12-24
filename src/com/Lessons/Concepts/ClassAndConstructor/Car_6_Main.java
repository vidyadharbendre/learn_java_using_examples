package Lessons.Concepts.ClassAndConstructor;

public class Car_6_Main {
    public static void main(String[] args) {
        // Creating Car objects using both constructors
        Car_6 defaultCarObj;
        defaultCarObj = new Car_6(); // Using default constructor
        System.out.println("Default Car Info: " + defaultCarObj.getCarInfo());
        Car_6 paramCarObj;
        paramCarObj = new Car_6("Toyota", "Corolla", 2022); // Using parameterized constructor

        // Modifying car attributes using setter methods
        defaultCarObj.setBrand("BMW");
        defaultCarObj.setModel("X5");
        defaultCarObj.setYear(2020);

        // Retrieving car information using getter methods and getCarInfo() method
        System.out.println("Default Car Info: " + defaultCarObj.getCarInfo());
        System.out.println("Parameterized Car Info: " + paramCarObj.getCarInfo());
    }
}
