package modules.M3_Inheritance.S2_02_UsingSuper.C1_01_Accessing_ParentClass_Consturctor;

/*

Author:
Vidyadhar Bendre

Email:
vidyadhar.bendre@gmail.com

Date:
29 December 2023

Purpose:
This program aims to demonstrate the relationship between a parent class (Parent) and its child class (Child) by showing how the child class constructor implicitly calls the constructor of its parent class using super(). It serves to illustrate how constructors are inherited and executed in an inheritance hierarchy.

 */


class Parent {
    Parent() {
        // Parent class constructor
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // Invoking parent class constructor using super
        // Child class constructor
        System.out.println("Child class constructor");
    }
}

public class AccessingParentClassConstructor {
    public static void main(String[] args) {
        Child childObj;
        childObj = new Child();
    }
}

// The output of the above program is shown as below:
/*
Parent class constructor
Child class constructor
 */