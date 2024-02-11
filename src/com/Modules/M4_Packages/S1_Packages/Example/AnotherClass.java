package com.Modules.M4_Packages.S1_Packages.Example;

public class AnotherClass {
    public static void main(String[] args) {
        MyClass myClassRefObj;
        myClassRefObj = new MyClass();

        System.out.println("publicVar: "+myClassRefObj.publicVar);
        myClassRefObj.publicMethod();

        System.out.println("protectedVar:" +myClassRefObj.protectedVar);
        myClassRefObj.protectedMethod();

        System.out.println("defaultVar : "+myClassRefObj.defaultVar);
        myClassRefObj.defaultMethod();

        System.out.println("privateVar : "+myClassRefObj.getPrivateVar());
        myClassRefObj.accessPrivateMethod();
    }
}

// The output of the above program is shown as below
/*
1
Public Method
2
Protected Method
3
Default Method
4
Private Method
 */