package com.Modules.M3_Inheritance.S11_11_Interface.C6_06_Real_Time_Examples;

// Bird interface
interface Bird {
    void fly();
}

// Sparrow class implementing the Bird interface
class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    void chirp() {
        System.out.println("Chirp Chirp");
    }
}

// Usage
public class E5_BirdDemo {
    public static void main(String[] args) {
        Bird sparrowRefObj;
        sparrowRefObj = new Sparrow();

        sparrowRefObj.fly();
        // Note: chirp() is not accessible through the Bird interface.
    }
}

// The output of the above program is shown as below:
/*
Sparrow is flying
 */