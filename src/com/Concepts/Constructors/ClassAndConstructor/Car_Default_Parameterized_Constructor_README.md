# Understanding the `Car` Class in Java

## What is the `Car` Class?
The `Car` class represents a blueprint for creating car objects in Java. It contains attributes such as brand, model, and year, along with methods to access and modify these attributes.

## Why use the `Car` Class in Java?
- The `Car` class encapsulates car-related data and functionality in a single unit.
- It provides a way to create multiple car objects with different properties but the same behavior.

## When to use the `Car` Class in Java?
- Use the `Car` class whenever there's a need to model and work with car entities in Java applications.
- It's applicable when managing car information, such as details about various car instances.

## How to use the `Car` Class in Java?
- Create a `Car` object using the default constructor or the parameterized constructor.
- Access or modify car attributes using getter and setter methods.
- Retrieve car information using the `getCarInfo()` method.

## Where is the `Car` Class applicable in Java?
The `Car` class is used within Java programs where car entities need to be represented, manipulated, or managed. It's suitable for applications dealing with automotive-related data.

## Who benefits from using the `Car` Class in Java?
- Developers working on projects involving car-related functionalities benefit from using the `Car` class.
- It aids in organizing and managing car information efficiently within Java applications.

## Main Program

Here's an example of how to use the `Car` class in a Java program:

```java
public class CarMain {
    public static void main(String[] args) {
        // Creating Car objects using both constructors
        Car defaultCar = new Car(); // Using default constructor
        Car paramCar = new Car("Toyota", "Corolla", 2022); // Using parameterized constructor

        // Modifying car attributes using setter methods
        defaultCar.setBrand("BMW");
        defaultCar.setModel("X5");
        defaultCar.setYear(2020);

        // Retrieving car information using getter methods and getCarInfo() method
        System.out.println("Default Car Info: " + defaultCar.getCarInfo());
        System.out.println("Parameterized Car Info: " + paramCar.getCarInfo());
    }
}
```
