package com.Modules.M3_Inheritance.S1_01_Basics.C1_01_What.E1_01_Example;

class Animal {
    void makeSound() {
        System.out.println("Base Class or Super Class Method - makes some sound...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Derived Class or Sub Class Method - makes sound as Bow Bow!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Sub Class Cat - method makes Meow! Sound");
    }
}

public class InheritanceExample_1 {
    public static void main(String[] args) {
        Animal animalObj;
        animalObj = new Animal();
        animalObj.makeSound(); // Output: Some sound...

        Dog dogObj;
        dogObj = new Dog();
        dogObj.makeSound(); // Output: Woof!

        Cat catObj = new Cat();
        catObj.makeSound(); // Output: Meow!
    }
}
// The output of the above program is shown below:
/*
Base Class or Super Class Method - makes some sound...
Derived Class or Sub Class Method - makes sound as Bow Bow!
Sub Class Cat - method makes Meow! Sound
 */
