package C0_00_Basics.S3_03_Core_OOPs_Concepts.C2_02_Inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicleObj;
        vehicleObj = new Vehicle();

        Car carObj;
        carObj = new Car();

        Motorcycle motorcycleObj;
        motorcycleObj = new Motorcycle();

        vehicleObj.vehicleInfo();
        carObj.carInfo();
        carObj.vehicleInfo();
        motorcycleObj.motorcycleInfo();
        motorcycleObj.vehicleInfo();

    }
}
/*

Additionally, instructions for compiling and running the program from the command line are provided
as shown below and output of this program as well.

Compilation Command:
javac -d ../../../../out *.java
Execution Command:

java -cp ../../../../out C0_00_Basics.S3_03_Core_OOPs_Concepts.C3_03_Polymorphism.Main

**/

// In the program
/*
        vehicleObj.vehicleInfo();
        carObj.carInfo();
        carObj.vehicleInfo();
        motorcycleObj.motorcycleInfo();
        motorcycleObj.vehicleInfo();
 */

// The output
/*
This is a vehicle
This is a car
This is a vehicle
This is a motorcycle
This is a vehicle
 */
