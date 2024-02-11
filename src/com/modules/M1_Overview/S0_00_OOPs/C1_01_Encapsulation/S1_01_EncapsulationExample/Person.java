package com.modules.M1_Overview.S0_00_OOPs.C1_01_Encapsulation.S1_01_EncapsulationExample;

public class Person {
    private String name;
    private int rollNumber;
    private float age;
    private float marks;

    // Setter methods for the private attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setAge(float age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public void setMarks(float marks) {
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
