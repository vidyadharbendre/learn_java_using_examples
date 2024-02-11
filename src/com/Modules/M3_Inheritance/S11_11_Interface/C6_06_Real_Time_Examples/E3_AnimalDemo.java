package com.Modules.M3_Inheritance.S11_11_Interface.C6_06_Real_Time_Examples;

// Animal interface
interface Animal {
    void makeSound();
}

// Concrete classes implementing the Animal interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// Usage
public class E3_AnimalDemo {
    public static void main(String[] args) {
        Animal dogRefObj;
        dogRefObj = new Dog();
        Animal catRefObj;
        catRefObj = new Cat();

        dogRefObj.makeSound();
        catRefObj.makeSound();
    }
}

// The output of the above program is shown as below:
/*
Dog barks
Cat meows
 */