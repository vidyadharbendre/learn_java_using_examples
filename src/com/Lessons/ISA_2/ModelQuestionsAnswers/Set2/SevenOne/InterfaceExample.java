package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.SevenOne;

/*
In Java, an interface is a collection of abstract methods.
An interface can also contain constants (static final fields) and, starting from
Java 8, default and static methods.
Interfaces provide a way to achieve abstraction, allowing the definition of a
contract that classes must adhere to.

Default Methods:
A default method in an interface is a method that provides a default
implementation.
It allows adding new methods to existing interfaces without breaking the
implementation of the classes that already implement the interface.
Default methods are declared with the default keyword.
 */



public class InterfaceExample {
    public static void main(String[] args) {
        Car myCarRefObj;
        myCarRefObj = new Car();

        myCarRefObj.start();
        myCarRefObj.stop();
        myCarRefObj.honk();
    }
}


interface Vehicle{
    void start();
    void stop();
    default void honk(){
        System.out.println("Default Method - Honking the horn!");
    }
}

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

