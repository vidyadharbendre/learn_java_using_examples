package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set1.One;

/*
Explain the fundamental concepts of inheritance in Java.

Describe how the super keyword is used to invoke superclass methods and
constructors.

Provide a code example demonstrating the use of super in a multilevel
hierarchy. (10 marks)
 */

/*
Analyze the use of the 'super' keyword in Java and its significance
in creating and maintaining class hierarchies, providing practical examples.
 */




public class Inheritance_Super {
    public static void main(String[] args) {
        Dog myDogRefObj;
        myDogRefObj = new Dog("Buddy");
        myDogRefObj.dogDetails();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal is breathing");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }

    // Using super to invoke superclass methods
    void dogDetails() {
        super.eat();    // Invoking eat() method of the Animal class
        super.breathe(); // Invoking breathe() method of the Mammal class
        bark();          // Invoking bark() method of the Dog class
    }

    // Using super to invoke superclass constructor
    Dog(String name) {
        super(); // Invoking the default constructor of the Mammal class
        System.out.println("Dog's name is " + name);
    }
}


// The output of the above program is shown as below
/*
Dog's name is Buddy
Animal is eating
Mammal is breathing
Dog is barking
 */

/*
Inheritance is a fundamental concept in object-oriented programming that allows a
class (subclass or derived class) to inherit properties and behaviors from another
class (superclass or base class).
The subclass can reuse, extend, or override the functionalities of the superclass.
This promotes code reuse, extensibility, and the creation of a hierarchical structure
of classes.

Usage of super Keyword:

The super keyword in Java is used to refer to the superclass or parent class.
It can be used to call the superclass methods, access the superclass fields, and
invoke the superclass constructor.
It is particularly useful when there is a need to differentiate between the superclass
and subclass members with the same name.

Example of Using super in a Multilevel Hierarchy:

Consider a multilevel hierarchy involving three classes: Animal, Mammal, and Dog.
Animal is the superclass of Mammal, and Mammal is the superclass of Dog.
The super keyword helps invoke the superclass methods and constructors at each level.
*/