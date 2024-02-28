package com.Modules.M5_MultiThreading.S15_Annotations;


@interface MyFirstAnnotation{
    String Degree() default "SSLC";
    int Experience() default 4;

}
@MyFirstAnnotation()
class Person{
    String name;
    int age;

    public Person() {
        this.name = "Vidyadhar";
        this.age = 54;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Marker_Demo_3 {
    public static void main(String[] args) {
        Person personRefObj;
        personRefObj = new Person();

        Person personRefObj1;
        personRefObj1 = new Person("Vivek", 48);
        System.out.println("name : "+personRefObj1.name);

    }
}
