package com.modules.M4_Packages.S1_Packages.Example2;


public class MainApp {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = CalculatorPackageDemo.add(num1, num2);
        int difference = CalculatorPackageDemo.subtract(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}

