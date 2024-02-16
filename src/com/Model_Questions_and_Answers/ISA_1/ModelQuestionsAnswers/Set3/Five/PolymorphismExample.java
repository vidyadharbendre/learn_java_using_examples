package com.Model_Questions_and_Answers.ISA_1.ModelQuestionsAnswers.Set3.Five;

// Superclass Animal
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass Dog inheriting from Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Bow! Bow!");
    }
}

// Subclass Cat inheriting from Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating instances of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Polymorphism: calling overridden method
        dog.makeSound(); // Calls Dog's makeSound method
        cat.makeSound(); // Calls Cat's makeSound method
    }
}

// The output of the above program is shown as below:
/*
Woof! Bow! Bow!
Meow! Meow!
 */