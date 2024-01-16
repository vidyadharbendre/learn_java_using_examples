package com.modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C5_05_Real_Time_Examples;

public class E6_Employee_Demo {
    public static void main(String[] args) {
        Employee managerRefObj;
        managerRefObj = new Manager();
        Employee developerRefObj;
        developerRefObj = new Developer();

        managerRefObj.calculateSalary();
        managerRefObj.displayDetails();

        developerRefObj.calculateSalary();
        developerRefObj.displayDetails();
    }
}

abstract class Employee {
    abstract void calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Calculating Manager's salary");
    }

    @Override
    void displayDetails() {
        System.out.println("Displaying Manager's details");
    }
}

class Developer extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Calculating Developer's salary");
    }

    @Override
    void displayDetails() {
        System.out.println("Displaying Developer's details");
    }
}

// The output of the above program is shown as below:
/*

Calculating Manager's salary
Displaying Manager's details
Calculating Developer's salary
Displaying Developer's details

 */