package com.Concepts.Constructors.ClassAndConstructor;

/**
 * Author   : Vidyadhar Bendre
 * Email    : vidyadhar.bendre@gmail.com
 * Date     : 25 December 2023
 * Purpose  : This class demonstrates the creation and usage of a basic class and its objects in Java.
 *
 * In this scenario:
 *
 * 1. 'ClassTrial_2' is a simple class showcasing the usage of class variables and instantiation of objects.
 *
 * 2. Class variables:
 *    - 'rollNumberStudent' (int) stores the student's roll number.
 *    - 'nameStudent' (String) stores the student's name.
 *    - 'marksJava' (float) stores marks obtained in Java subject.
 *
 * 3. 'main()' method serves as the entry point, demonstrating:
 *    - Declaration and initialization of a reference variable 'classObj' of type 'ClassTrial_2'.
 *    - Instantiation of an object of 'ClassTrial_2' using 'new ClassTrial_2()'.
 *    - Printing the default values of the class variables ('rollNumberStudent', 'nameStudent', 'marksJava').
 *    - Assigning new values to the class variables and displaying them.
 */

public class ClassTrial_2 {
    // Declaring integer variable for student's roll number
    int rollNumberStudent;

    // Declaring string variable for student's name
    String nameStudent;

    // Declaring float variable for marks in Java
    float marksJava;

    public static void main(String[] args) {
        // Declaring a reference variable of type ClassTrial_2
        ClassTrial_2 classObj;

        // Initializing the object of ClassTrial_2
        classObj = new ClassTrial_2();

        System.out.println("Printing Default Values");

        // Printing the default value of rollNumberStudent
        System.out.println(classObj.rollNumberStudent);

        // Printing the default value of nameStudent
        System.out.println(classObj.nameStudent);

        // Printing the default value of marksJava
        System.out.println(classObj.marksJava);

        System.out.println("Printing assigned values");

        // Assign new values
        classObj.rollNumberStudent = 101;
        classObj.nameStudent = "Vidyadhar";
        classObj.marksJava = 90;

        // Printing the assigned values
        System.out.println(classObj.rollNumberStudent);
        System.out.println(classObj.nameStudent);
        System.out.println(classObj.marksJava);
    }
}

// The output of the above program is shown below:
/*
Printing Default Values
0
null
0.0
Printing assigned values
101
Vidyadhar
90.0
 */
