package Lessons.ModelQuestionsAnswers.Set1.Eight;

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
        System.out.println("Woof! Woof!");
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
        Animal dogObj;
        dogObj = new Dog();
        Animal catObj;
        catObj = new Cat();

        // Polymorphism: calling overridden method
        dogObj.makeSound(); // Calls Dog's makeSound method
        catObj.makeSound(); // Calls Cat's makeSound method
    }
}

// The output of the above program is shown below:
/*
Woof! Woof!
Meow! Meow!
 */