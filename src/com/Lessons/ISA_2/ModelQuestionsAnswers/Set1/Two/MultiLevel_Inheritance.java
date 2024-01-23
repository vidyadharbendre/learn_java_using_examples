package com.Lessons.ISA_2.ModelQuestionsAnswers.Set1.Two;

/*
Discuss the concept of a multilevel hierarchy in Java's inheritance.
Explain the sequence of execution for constructors in both superclass and subclass
instances within a multilevel hierarchy.

Provide a code example illustrating a multilevel hierarchy and constructor execution.

 */
public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        SportsCar sportsCarRefObj;
        sportsCarRefObj = new SportsCar();
    }
}

class Vehicle {
    Vehicle() {
        System.out.println("Constructor of Vehicle");
    }
}

class Car extends Vehicle {
    Car() {
        System.out.println("Constructor of Car");
    }
}

class SportsCar extends Car {
    SportsCar() {
        System.out.println("Constructor of SportsCar");
    }
}

/*
Constructor of Vehicle
Constructor of Car
Constructor of SportsCar
 */

/*
The SportsCar class extends Car, and Car extends Vehicle.
When a SportsCar object is created (new SportsCar()), the constructors are executed in the following sequence:
Vehicle constructor is called first.
Car constructor is called next.
Finally, the SportsCar constructor is executed.
This example illustrates the concept of a multilevel hierarchy in the context of a car. Each class in the hierarchy represents a more specialized type of vehicle, and the constructors are executed in a sequence from the topmost superclass (Vehicle) to the subclass (SportsCar).
 */

/*
 Java, a multilevel hierarchy in inheritance refers to a situation where a class extends another class, and then another class extends the second class. This creates a chain of inheritance, forming a multilevel structure. Each class in the hierarchy inherits properties and behaviors from its immediate superclass and, transitively, from all the superclasses up the hierarchy.

Sequence of Execution for Constructors in Multilevel Hierarchy:

The sequence of execution for constructors in a multilevel hierarchy is as follows:

Superclass Constructors:

Constructors of the superclass are executed first, starting from the topmost superclass in the hierarchy.
Each superclass constructor initializes its own fields and performs any necessary operations.
Subclass Constructors:

Constructors of the subclass are executed after the superclass constructors.
The subclass constructor initializes its own fields and may also perform additional operations specific to the subclass.
 */





