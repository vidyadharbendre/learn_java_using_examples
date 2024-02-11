package com.C0_00_Basics.S3_03_Core_OOPs_Concepts.C1_01_Encapsulation.S2_02_EncapsulationConstructorExample;

public class Main {
    public static void main(String[] args) {
        // Creating a Person object using the constructor
        Person personObj;
        personObj = new Person("Vidyadhar", 101, 52.5f, 85.5f);

        // Getting attributes using getters
        System.out.println("Name: " + personObj.getName());
        System.out.println("Roll Number: " + personObj.getRollNumber());
        System.out.println("Age: " + personObj.getAge());
        System.out.println("Marks: " + personObj.getMarks());
    }
}
// The output of the above program is shown as below
/*
Name: Vidyadhar
Roll Number: 101
Age: 52.5
Marks: 85.5
 */