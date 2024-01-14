package com.modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C2_02_Abstract_Class_With_Concrete_Method;

public class ConcreteMethodDemo {
    public static void main(String[] args) {
        Dog dogRefObj;
        dogRefObj = new Dog();

        // calling concrete method
        dogRefObj.sleep();
        // calling abstract method
        dogRefObj.makeSound();

    }
}


abstract class Animal{
    void sleep(){
        System.out.println("Zzz");
    }

    abstract void makeSound();
}



class Dog extends Animal{

    void makeSound(){
        System.out.println("Dog barks - Bow bow bow");
    }
}

// The output of the above program is shown as below
/*
Zzz
Dog barks - Bow bow bow
 */