package com.modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S05_05_Throws;

public class ThrowsExample2 {
    public static void main(String[] args) {
        try {
            average();
        }finally {
            System.out.println("Caught!");
        }

    }

    public static void average() throws ArithmeticException{
        System.out.println("Within average...");
        throw new ArithmeticException("Demonstrating Throw");
    }
}

// The output of the above program is shown as below
/*
Within average...
Caught!
Exception in thread "main" java.lang.ArithmeticException: Demonstrating Throw
	at com.modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S05_05_Throws.ThrowsExample2.average(ThrowsExample2.java:15)
	at com.modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S05_05_Throws.ThrowsExample2.main(ThrowsExample2.java:6)

 */
