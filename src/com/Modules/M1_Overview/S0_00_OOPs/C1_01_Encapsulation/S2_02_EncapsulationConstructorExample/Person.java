package com.Modules.M1_Overview.S0_00_OOPs.C1_01_Encapsulation.S2_02_EncapsulationConstructorExample;

public class Person {
    private String name;
    private int rollNumber;
    private float age;
    private float marks;

    // Constructor with parameters
    public Person(String name, int rollNumber, float age, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;

        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }

        this.marks = marks;
    }

    // Getters for the private attributes
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public float getAge() {
        return age;
    }

    public float getMarks() {
        return marks;
    }

}

