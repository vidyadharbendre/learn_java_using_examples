package com.Concepts.OuterClasses;

class OutSideClass{
    public static String name;

    public OutSideClass(){
        this.name = "Narayan";
    }
    public OutSideClass(String name) {
        OutSideClass.name = name;
    }
}
public class OuterClassExample {

    public static void main(String[] args) {

        OutSideClass obj1;
        obj1 = new OutSideClass();
        System.out.println(obj1.name);

        OutSideClass obj2;
        obj2 = new OutSideClass("Vidyadhar");
        System.out.println(obj2.name);

        OutSideClass obj3;
        obj3 = new OutSideClass("Poornima");
        System.out.println(obj3.name);

    }
}
// The output of the above program is shown as below:
/*
Narayan
Vidyadhar
Poornima
 */

