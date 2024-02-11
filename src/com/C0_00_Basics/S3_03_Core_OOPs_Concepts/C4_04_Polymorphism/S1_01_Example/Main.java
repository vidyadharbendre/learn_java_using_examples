package com.C0_00_Basics.S3_03_Core_OOPs_Concepts.C4_04_Polymorphism.S1_01_Example;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.vehicleInfo();  // Output: This is a car
        motorcycle.vehicleInfo();  // Output: This is a motorcycle
    }
}
/*

Additionally, instructions for compiling and running the program from the command line are provided
as shown below and output of this program as well.

Compilation Command:
javac -d ../../../../out *.java
Execution Command:

java -cp ../../../../out com.C0_00_Basics.S3_03_Core_OOPs_Concepts.C3_03_Polymorphism.Main

**/
