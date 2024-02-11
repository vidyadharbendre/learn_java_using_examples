package com.Modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C4_04_Abstract_Class_With_Extending_Another;

public class AbstractClassExtensionDemo {
    public static void main(String[] args) {
        SparrowImplementation sparrowimplementationRefObj;
        sparrowimplementationRefObj = new SparrowImplementation();

        sparrowimplementationRefObj.fly();
        sparrowimplementationRefObj.chirp();

    }
}
abstract class Bird{
    abstract void fly();
}
abstract class Sparrow extends Bird{
    void chirp(){
        System.out.println(" Chirp Chirp");
    }
}
class SparrowImplementation extends Sparrow{
    @Override
    void fly() {
        System.out.println("Sparrow flying");
    }
}

// The output of the above program is shown as below:
/*

Sparrow flying
 Chirp Chirp

 */