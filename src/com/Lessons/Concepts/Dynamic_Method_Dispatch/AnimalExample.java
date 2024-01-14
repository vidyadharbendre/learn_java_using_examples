package com.Lessons.Concepts.Dynamic_Method_Dispatch;

class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class AnimalExample {
    public static void main(String[] args) {
        Animal animalRefObj;  // Reference variable of type Animal

        animalRefObj = new Animal();
        animalRefObj.makeSound();  // Output: Some sound

        animalRefObj = new Dog();  // Dynamic Method Dispatch
        animalRefObj.makeSound();  // Output: Bark
    }
}
// The output of the above program is shown as below:
/*
Some sound
Bark
 */

/*
Here, animalRefObj is of type Animal but can reference objects of type Animal or its subclasses like Dog.
When animalRefObj points to a Dog object, animalRef.makeSound() calls the overridden makeSound() method in the Dog class at runtime,
demonstrating dynamic method dispatch.

This behavior allows for flexibility and polymorphic behavior, allowing methods to be called based on the actual type of the object
being referred to at runtime, not just the type of the reference variable.
 */