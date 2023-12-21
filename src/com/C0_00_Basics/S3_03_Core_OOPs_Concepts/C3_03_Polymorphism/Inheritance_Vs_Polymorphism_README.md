# Inheritance vs Polymorphism

## Inheritance

### Definition
Inheritance is about creating new classes based on existing ones. The new class (child class) inherits properties and behaviors from the existing class (parent class).

### Example
```java
// Parent class
class Vehicle {
    void startEngine() {
        System.out.println("Engine started");
    }
}

// Child class 1
class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a car");
    }
}

// Child class 2
class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Riding a motorcycle");
    }
}
```
## Polymorphism
### Definition
Polymorphism allows objects of different classes to be treated as objects of a common superclass. It allows for methods to be overridden in subclasses and exhibit different behaviors based on the actual object type.

### Example
```java
class Vehicle {
void startEngine() {
System.out.println("Engine started");
}

    void vehicleInfo() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
void drive() {
System.out.println("Driving a car");
}

    void vehicleInfo() {
        System.out.println("This is a car");
    }
}

class Motorcycle extends Vehicle {
void ride() {
System.out.println("Riding a motorcycle");
}

    void vehicleInfo() {
        System.out.println("This is a motorcycle");
    }
}
```
### Polymorphism in Action
```java
class Vehicle {
    void startEngine() {
        System.out.println("Engine started");
    }

    void vehicleInfo() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a car");
    }

    void vehicleInfo() {
        System.out.println("This is a car");
    }
}

class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Riding a motorcycle");
    }

    void vehicleInfo() {
        System.out.println("This is a motorcycle");
    }


    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.vehicleInfo();  // Output: This is a car
        motorcycle.vehicleInfo();  // Output: This is a motorcycle
    }
}
```
