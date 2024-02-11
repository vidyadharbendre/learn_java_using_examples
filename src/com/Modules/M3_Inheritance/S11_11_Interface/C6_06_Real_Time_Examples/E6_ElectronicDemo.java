package com.Modules.M3_Inheritance.S11_11_Interface.C6_06_Real_Time_Examples;

// Powerable interface
interface Powerable {
    void turnOn();

    void turnOff();
}

// Concrete classes implementing the Powerable interface
class Television implements Powerable {
    @Override
    public void turnOn() {
        System.out.println("Television is powered on");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is powered off");
    }
}

class Laptop implements Powerable {
    @Override
    public void turnOn() {
        System.out.println("Laptop is powered on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is powered off");
    }
}

// Usage
public class E6_ElectronicDemo {
    public static void main(String[] args) {
        Powerable tvRefObj;
        tvRefObj = new Television();

        Powerable laptopRefObj;
        laptopRefObj = new Laptop();

        tvRefObj.turnOn();
        tvRefObj.turnOff();

        laptopRefObj.turnOn();
        laptopRefObj.turnOff();
    }
}

/*
Television is powered on
Television is powered off
Laptop is powered on
Laptop is powered off
 */
