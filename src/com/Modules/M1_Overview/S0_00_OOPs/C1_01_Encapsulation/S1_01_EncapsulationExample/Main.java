package com.Modules.M1_Overview.S0_00_OOPs.C1_01_Encapsulation.S1_01_EncapsulationExample;

public class Main {
    public static void main(String[] args) {
        Person personObj;
        personObj = new Person();

        // Setting attributes using setter methods
        personObj.setName("Poornima");
        personObj.setRollNumber(101);
        personObj.setAge(46.5f);
        personObj.setMarks(95.5f);

        // Getting attributes using getter methods
        System.out.println("Name: " + personObj.getName());
        System.out.println("Roll Number: " + personObj.getRollNumber());
        System.out.println("Age: " + personObj.getAge());
        System.out.println("Marks: " + personObj.getMarks());
    }
}

// The output of the above program is shown as below
/*
Name: Poornima
Roll Number: 101
Age: 46.5
Marks: 95.5
 */