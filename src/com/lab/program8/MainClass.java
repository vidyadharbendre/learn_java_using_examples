package com.lab.program8;

// Outer class
class OuterClass {
    // Method in the outer class
    public void display() {
        System.out.println("OuterClass display method");
    }

    // Inner class
    class InnerClass {
        // Method in the inner class
        public void display() {
            System.out.println("InnerClass display method");
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outerRefObj;
        outerRefObj = new OuterClass();

        // Calling the display method of the outer class
        outerRefObj.display();

        // Creating an instance of the inner class using the outer class instance
        OuterClass.InnerClass innerRefObj;
        innerRefObj = outerRefObj.new InnerClass();

        // Calling the display method of the inner class
        innerRefObj.display();
    }
}

//The output of the above program is shown as below

/*
OuterClass display method
InnerClass display method
 */