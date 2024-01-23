package com.Lessons.ISA_2.ModelQuestionsAnswers.Set1.Three;

public class Overriding_RunTime_Polymorphism_dispatch {
    public static void main(String[] args) {
        Animal animal1RefObj;
        animal1RefObj = new Cat();
        Animal animal2RefObj;
        animal2RefObj = new Dog();

        animal1RefObj.makeSound(); // Output: Meow
        animal2RefObj.makeSound(); // Output: Woof
    }
}

class Animal {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

/*
Meow
Woof
 */
