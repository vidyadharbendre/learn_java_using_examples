package com.Modules.M5_MultiThreading.L99_Trials;

class Class1A{
    int i=0, n=3;
    public void displayMessage(){
        for (i = 0; i < n; i++) {
            System.out.println("Hi");
        }
    }
}

class Class1B{
    int j=0, m=3;
    public void displayMessage(){
        for (int j = 0; j < m; j++) {
            System.out.println("Hello");
        }
    }
}

public class Trial1 {
    public static void main(String[] args) {
        Class1A class1ARefObj;
        class1ARefObj = new Class1A();

        Class1B class1BRefObj;
        class1BRefObj = new Class1B();

        class1BRefObj.displayMessage();
        class1BRefObj.displayMessage();
    }
}
