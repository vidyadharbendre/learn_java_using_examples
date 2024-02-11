package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set2.Twelve;



// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Intermediate class inheriting from Animal
class Mammal extends Animal {
    void run() {
        System.out.println("Mammal is running");
    }
}

// Derived class inheriting from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class inheriting from Mammal
class Cat extends Mammal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        // Creating objects of different classes
        Animal animalRefObj;
        animalRefObj = new Animal();
        Mammal mammalRefObj;
        mammalRefObj = new Mammal();
        Dog dogRefObj;
        dogRefObj = new Dog();
        Cat catRefObj;
        catRefObj = new Cat();

        // Demonstrating multilevel hierarchy
        animalRefObj.eat(); // Output: Animal is eating

        mammalRefObj.eat(); // Output: Animal is eating
        mammalRefObj.run(); // Output: Mammal is running

        dogRefObj.eat();    // Output: Animal is eating
        dogRefObj.run();    // Output: Mammal is running
        dogRefObj.bark();   // Output: Dog is barking

        catRefObj.eat();    // Output: Animal is eating
        catRefObj.run();    // Output: Mammal is running
        catRefObj.meow();   // Output: Cat is meowing
    }
}

//The output of the above program is shown as below
/*
Animal is eating
Animal is eating
Mammal is running
Animal is eating
Mammal is running
Dog is barking
Animal is eating
Mammal is running
Cat is meowing
 */