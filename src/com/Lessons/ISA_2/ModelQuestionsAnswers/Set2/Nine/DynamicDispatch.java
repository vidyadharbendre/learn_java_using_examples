package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Nine;

/*
Create a program that emphasizes dynamic method dispatch in Java,
showcasing method overriding and explaining its practical implications
 */


class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Animal animal1RefObj;
        animal1RefObj = new Dog();
        Animal animal2RefObj;
        animal2RefObj = new Cat();

        // Dynamic method dispatch
        animal1RefObj.makeSound();  // Output: Dog barks
        animal2RefObj.makeSound();  // Output: Cat meows
    }
}

// The output of the above program is shown as below
/*
Dog barks
Cat meows
 */