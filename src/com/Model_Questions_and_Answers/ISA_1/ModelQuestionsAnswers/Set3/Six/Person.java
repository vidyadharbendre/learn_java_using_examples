package com.Model_Questions_and_Answers.ISA_1.ModelQuestionsAnswers.Set3.Six;

public class Person {
    private String name;
    private int age;

    // Constructor without parameters
    public Person() {
        this.name = "Undefined";
        this.age = 0;
    }

    // Constructor with name parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to set name using 'this' keyword
    public void setName(String name) {
        this.name = name;
    }

    // Method to set age using 'this' keyword
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display details using 'this' keyword
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        // Creating instances of the Person class using different constructors
        Person person1;
        person1 = new Person();
        Person person2;
        person2 = new Person("Poornima");
        Person person3;
        person3 = new Person("Akshara", 18);

        // Displaying details of each person
        System.out.println("Person 1 Details:");
        person1.displayDetails();

        System.out.println("\nPerson 2 Details:");
        person2.displayDetails();

        System.out.println("\nPerson 3 Details:");
        person3.displayDetails();

        // Updating details using methods and 'this' keyword
        person1.setName("Atharva");
        person1.setAge(23);

        System.out.println("\nUpdated Person 1 Details:");
        person1.displayDetails();
    }
}

//The output of the above program is shown below

/*
Person 1 Details:
Name: Undefined
Age: 0

Person 2 Details:
Name: Poornima
Age: 0

Person 3 Details:
Name: Akshara
Age: 18

Updated Person 1 Details:
Name: Atharva
Age: 23
 */


