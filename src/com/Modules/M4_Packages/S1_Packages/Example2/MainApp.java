package com.Modules.M4_Packages.S1_Packages.Example2;

import com.Modules.M4_Packages.S1_Packages.Example.MyClass;

public class MainApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum, difference;

        sum = CalculatorPackageDemo.add(num1, num2);
        difference = CalculatorPackageDemo.subtract(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        MyClass myClassRef;
        myClassRef = new MyClass();

        System.out.println("public variable : "+myClassRef.publicVar);
        myClassRef.publicMethod();
        myClassRef.accessPrivateMethod();
    }
}

