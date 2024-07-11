package com.Concepts.Constructors.ClassAndConstructor;

/**
 * Author   : Vidyadhar Bendre
 * Email    : vidyadhar.bendre@gmail.com
 * Date     : 25 December 2023
 * Purpose  : This class demonstrates the usage of a basic class and its objects in Java.
 *
 * In this scenario:
 *
 * 1. 'ClassTrial_3' is a simple class showcasing class variables, object instantiation, and printing values.
 *
 * 2. Class variables:
 *    - 'rollNumberStudent' (int) stores the student's roll number.
 *    - 'nameStudent' (String) stores the student's name.
 *    - 'marksJava' (float) stores marks obtained in the Java subject.
 *
 * 3. 'main()' method serves as the entry point, demonstrating:
 *    - Declaration and initialization of a reference variable 'classObj' of type 'ClassTrial_3'.
 *    - Instantiation of an object of 'ClassTrial_3' using 'new ClassTrial_3()'.
 *    - Printing default and assigned values of the class variables.
 *    - Creating a new object 'classObj1' and printing its default values.
 */

public class ClassTrial_3 {
    // Declaring integer variable for student's roll number
    int rollNumberStudent;

    // Declaring string variable for student's name
    String nameStudent;

    // Declaring float variable for marks in Java
    float marksJava;

    public static void main(String[] args) {
        // Declaring a reference variable of type ClassTrial_3
        ClassTrial_3 classObj;

        // Initializing the object of ClassTrial_3
        classObj = new ClassTrial_3();

        System.out.println("Printing Default Values");

        // Printing the default value of rollNumberStudent
        System.out.println(classObj.rollNumberStudent);

        // Printing the default value of nameStudent
        System.out.println(classObj.nameStudent);

        // Printing the default value of marksJava
        System.out.println(classObj.marksJava);

        System.out.println("Printing assigned values");

        // Assigning new values
        classObj.rollNumberStudent = 101;
        classObj.nameStudent = "Vidyadhar";
        classObj.marksJava = 90;

        // Printing the assigned values
        System.out.println(classObj.rollNumberStudent);
        System.out.println(classObj.nameStudent);
        System.out.println(classObj.marksJava);

        System.out.println("New object's reference printing default values");

        // Creating a new object 'classObj1' and printing its default values
        ClassTrial_3 classObj1;
        classObj1 = new ClassTrial_3();

        System.out.println(classObj1.rollNumberStudent);
        System.out.println(classObj1.nameStudent);
        System.out.println(classObj1.marksJava);
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
New object's reference printing default values
0
null
0.0
 */
