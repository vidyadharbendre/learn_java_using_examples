package modules.M3_Inheritance.S2_02_UsingSuper.C2_02_Invoking_ParentClass_Method;

/*

Author:
Vidyadhar Bendre

Email:
vidyadhar.bendre@gmail.com

Date:
29th December 2023

Purpose:
This Java program demonstrates inheritance and method invocation by calling a method from a parent class within a method of its child class using the `super` keyword.

 */


class Parent{
    void parentMethod(){
        //parent method
        System.out.println("Parent Class Method");
    }
}


class Child extends Parent{
    void childMethod(){
        super.parentMethod();// Invoking Parent class method using Super
        // Child class method
        System.out.println("Child Class Method");
    }
}



public class InvokingParentClassMethod {

    public static void main(String[] args) {
        Child childObj;
        childObj = new Child();

        childObj.childMethod();

    }

}
