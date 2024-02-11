package com.Modules.M2_Introducing_Classes.S01_Class;

public class MyClass {
    int x;  // Instance variable

    public MyClass(int initialValue) {
        this.x = initialValue;
    }

    public static void main(String[] args) {
        // Step 1: Class Loading (assuming MyClass is not loaded yet)

        // Step 2: Memory Allocation on Heap
        MyClass myObject;

        // Step 3: Object Creation
        myObject = new MyClass(10);

        // Step 4: Initialization (constructor is called, setting x to 10)

        // Step 5: Reference Assignment
        // Now, myObject holds a reference to the newly created object
    }
}

