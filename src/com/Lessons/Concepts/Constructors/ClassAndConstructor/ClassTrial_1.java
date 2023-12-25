package Lessons.Concepts.Constructors.ClassAndConstructor;

/**
 * Author:
 * Vidyadhar Bendre
 *
 * Email:
 * vidyadhar.bendre@gmail.com
 *
 * Date:
 * 25 December 2023
 *
 * Purpose:
 * This class demonstrates the creation and usage of a basic class and its objects in Java.
 *
 * In this scenario:
 *
 * 1. 'ClassTrial_1' is a simple class showcasing the usage of class variables and instantiation of objects.
 *
 * 2. Class variables:
 *    - 'rollNumberStudent' (int) stores the student's roll number.
 *    - 'nameStudent' (String) stores the student's name.
 *    - 'marksJava' (float) stores marks obtained in Java subject.
 *
 * 3. 'main()' method serves as the entry point, demonstrating:
 *    - Declaration and initialization of a reference variable 'classObj' of type 'ClassTrial_1'.
 *    - Instantiation of an object of 'ClassTrial_1' using 'new ClassTrial_1()'.
 *    - Printing the default values of the class variables:
 *        - 'rollNumberStudent'
 *        - 'nameStudent'
 *        - 'marksJava'
 */

public class ClassTrial_1 {
    // Declaring integer variable for student's roll number
    int rollNumberStudent;

    // Declaring string variable for student's name
    String nameStudent;

    // Declaring float variable for marks in Java
    float marksJava;

    public static void main(String[] args) {
        // Declaring a reference variable of type ClassTrial_1
        ClassTrial_1 classObj;

        // Initializing the object of ClassTrial_1
        classObj = new ClassTrial_1();

        // Printing the default value of rollNumberStudent
        System.out.println(classObj.rollNumberStudent);

        // Printing the default value of nameStudent
        System.out.println(classObj.nameStudent);

        // Printing the default value of marksJava
        System.out.println(classObj.marksJava);
    }
}

// The output of the above program is shown below:
/*
0
null
0.0
 */
