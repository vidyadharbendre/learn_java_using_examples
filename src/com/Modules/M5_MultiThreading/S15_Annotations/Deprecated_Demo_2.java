package com.Modules.M5_MultiThreading.S15_Annotations;

class Parent{
    @Deprecated
    public void showMessage(){
        System.out.println("In Parent - showMessage() as one of the methods");
    }

    public void displayShortMessage(){
        System.out.println("In Parent - displayShortMessage");
    }
}

class Child extends Parent{

    @Override
    public void showMessage() {
        super.showMessage();
    }

    public void displayShortMessage(){
        System.out.println("Child class - displayShortMessage()");
    }
}



public class Deprecated_Demo_2 {
    public static void main(String[] args) {
        System.out.println("Demo to display Deprecated Message");

        Parent parentRefObj;
        parentRefObj = new Parent();
        parentRefObj.displayShortMessage();

        Parent childRefObj;
        childRefObj = new Child();
        childRefObj.displayShortMessage();

        childRefObj.showMessage();
    }
}
