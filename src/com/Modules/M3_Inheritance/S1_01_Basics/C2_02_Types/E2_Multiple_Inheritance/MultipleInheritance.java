package com.Modules.M3_Inheritance.S1_01_Basics.C2_02_Types.E2_Multiple_Inheritance;

// First Parent Class
class Parent1 {
    public void display1() {
        System.out.println("Displaying from Parent1");
    }
}

// Second Parent Class
class Parent2 {
    public void display2() {
        System.out.println("Displaying from Parent2");
    }
}

// Child Class inheriting from both Parent1 and Parent2
//class Child extends Parent1, Parent2 {  // Error: Multiple inheritance not supported in Java
//    // Child class code
//}

// Main class for Multiple Inheritance example
public class MultipleInheritance {
    public static void main(String[] args) {
        // Creating a Child object (not possible due to multiple inheritance constraint)
    }
}
