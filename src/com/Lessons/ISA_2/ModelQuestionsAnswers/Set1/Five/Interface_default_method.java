package com.Lessons.ISA_2.ModelQuestionsAnswers.Set1.Five;

/*
Define interfaces in Java.
Discuss the concept of default and static methods in interfaces and
their role in enhancing backward compatibility.
Provide examples demonstrating the use of default and static methods
in interfaces.
 */
/*
Interfaces in Java:
In Java, an interface is a collection of abstract methods.
It serves as a contract that defines a set of methods without providing
any implementation.
It allows multiple classes to implement these methods, providing a way to
 achieve abstraction, multiple inheritance, and polymorphism.

Default Methods:
Introduced in Java 8, default methods are methods within an interface
that have a default implementation.
These methods can be overridden by implementing classes, but they provide
a default behavior if not overridden.
Default methods enable the addition of new methods to interfaces without
breaking the existing implementations.
 */

// 1. Example of Default Method:

public class Interface_default_method {
    public static void main(String[] args) {
        Greeting greetingRefObj;
        greetingRefObj = new GreetingImpl();
        greetingRefObj.sayHello();
        greetingRefObj.sayDefaultHello(); // Using the default method
    }
}

// Example interface with a default method
interface Greeting {
    void sayHello();

    default void sayDefaultHello() {
        System.out.println("Default Hello!");
    }
}

// Class implementing the interface
class GreetingImpl implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}
/*
Hello!
Default Hello!
 */

/*
Enhancing Backward Compatibility:
Default and static methods in interfaces were introduced to enhance backward compatibility in Java.
Before their introduction, adding new methods to an interface would
break all the classes implementing that interface.
With default and static methods, existing classes can still work without
modification, and they can choose to override the default methods if
needed.

These features enable the evolution of interfaces over time without
affecting the existing codebase, promoting more flexible and extensible
designs.
 */