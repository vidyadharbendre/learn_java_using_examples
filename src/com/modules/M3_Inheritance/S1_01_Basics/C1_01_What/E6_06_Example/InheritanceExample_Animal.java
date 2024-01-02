package modules.M3_Inheritance.S1_01_Basics.C1_01_What.E6_06_Example;

// Animal superclass
class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Mammal subclass
class Mammal extends Animal {
    public void run() {
        System.out.println("Mammals can run.");
    }
}

// Bird subclass
class Bird extends Animal {
    public void fly() {
        System.out.println("Birds can fly.");
    }
}

// Reptile subclass
class Reptile extends Animal {
    public void crawl() {
        System.out.println("Reptiles can crawl.");
    }
}

// Example usage
public class InheritanceExample_Animal {
    public static void main(String[] args) {
        Mammal lion = new Mammal();
        Bird eagle = new Bird();
        Reptile snake = new Reptile();

        lion.eat();
        lion.sleep();
        lion.run();
        System.out.println();

        eagle.eat();
        eagle.sleep();
        eagle.fly();
        System.out.println();

        snake.eat();
        snake.sleep();
        snake.crawl();
    }
}

// The output of the above program is shown as below:
/*
The animal is eating.
The animal is sleeping.
Mammals can run.

The animal is eating.
The animal is sleeping.
Birds can fly.

The animal is eating.
The animal is sleeping.
Reptiles can crawl.
 */