package com.Modules.M5_MultiThreading.S15_Annotations;

class ParentClass{
    public void display(){
        System.out.println("display method in Parent Class ");
    }

    @Deprecated
    @SuppressWarnings("unchecked")
    public void show(){
        System.out.println("Deprecated");
    }

    public void displayMyOwnWrittenMessage(){
        System.out.println("Parent - displayMyOwnWrittenMessage");
    }
}


class ChildClass extends ParentClass{

    public void display(){
        System.out.println("display method in ChildClass");

    }
//    public void displayMyOwnWrittenmessage(){
//        System.out.println("Child - displayMyOwnWrittenmessage");
//    }
    @Override
    public void displayMyOwnWrittenMessage(){
        System.out.println("Child - displayMyOwnWrittenMessage");
    }
}


public class Annotations_Demo_1 {
    public static void main(String[] args) {
        ParentClass parentRefObj;
        parentRefObj = new ParentClass();
        parentRefObj.display();

        ChildClass childRefObj;
        childRefObj = new ChildClass();
        childRefObj.display();

        childRefObj.displayMyOwnWrittenMessage();

        childRefObj.show();

    }
}

// The output of the above program is shown as below
/*
display method in Parent Class
display method in ChildClass
Child - displayMyOwnWrittenMessage
 */