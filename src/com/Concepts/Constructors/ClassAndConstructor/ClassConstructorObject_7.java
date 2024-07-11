package com.Concepts.Constructors.ClassAndConstructor;

/**
 * Author   : Vidyadhar Bendre
 * Email    : vidyadhar.bendre@gmail.com
 * Date     : 25 December 2023
 * Purpose  : This class showcases the usage of constructors in Java with default, parameterized, and copy constructors.
 *
 * In this scenario:
 *
 * 1. 'ClassConstructorObject_7' demonstrates the default, parameterized, and copy constructors.
 *
 * 2. Class variables:
 *    - 'rollNumberStudent' (int) stores the student's roll number.
 *    - 'nameStudent' (String) stores the student's name.
 *    - 'marksJava' (float) stores marks obtained in the Java subject.
 *
 * 3. The default constructor initializes default values.
 *
 * 4. The parameterized constructor 'ClassConstructorObject_7(int, String, float)' initializes values based on arguments passed.
 *
 * 5. The copy constructor 'ClassConstructorObject_7(ClassConstructorObject_7)' copies values from another object of the same type.
 *
 * 6. 'main()' method serves as the entry point, demonstrating:
 *    - Creation of objects using default and parameterized constructors.
 *    - Initialization of objects using parameterized constructors.
 *    - Using a copy constructor to create objects with the same values as another object.
 */
public class ClassConstructorObject_7 {
    // Declaring variables for student's roll number, name, and marks in Java
    int rollNumberStudent;
    String nameStudent;
    float marksJava;

    // Default constructor (not explicitly defined as it's not needed here)
    ClassConstructorObject_7() {
        this.rollNumberStudent = 1;
        this.nameStudent = "Atharva";
        this.marksJava = 99.0f;
    }

    // Parameterized constructor to initialize values
    ClassConstructorObject_7(int rollNumberStudent, String nameStudent, float marksJava) {
        this.rollNumberStudent = rollNumberStudent;
        this.nameStudent = nameStudent;
        this.marksJava = marksJava;
    }

    // Copy constructor to copy values from another object
    ClassConstructorObject_7(ClassConstructorObject_7 conObject) {
        this.rollNumberStudent = conObject.rollNumberStudent;
        this.nameStudent = conObject.nameStudent;
        this.marksJava = conObject.marksJava;
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        // (default constructor is not explicitly defined)
        ClassConstructorObject_7 defConObj;
        defConObj = new ClassConstructorObject_7();

        // Printing default values
        System.out.println("The default constructor doesn't exist, so no default values initialized:");
        System.out.println(defConObj.rollNumberStudent); // Will print 0 (default value for int)
        System.out.println(defConObj.nameStudent); // Will print null (default value for String)
        System.out.println(defConObj.marksJava); // Will print 0.0 (default value for float)

        // Creating an object using the parameterized constructor
        ClassConstructorObject_7 paramObj;
        paramObj = new ClassConstructorObject_7(19, "Poornima", 89.0f);

        // Printing values initialized through the parameterized constructor
        System.out.println("\nPrinting parameters passed as arguments to Constructor:");
        System.out.println(paramObj.rollNumberStudent); // Will print 19
        System.out.println(paramObj.nameStudent); // Will print "Poornima"
        System.out.println(paramObj.marksJava); // Will print 89.0

        // Using the copy constructor to create objects with the same values as other objects
        ClassConstructorObject_7 classObjParam;
        classObjParam = new ClassConstructorObject_7(paramObj);
        System.out.println(classObjParam.marksJava); // Will print 89.0

        classObjParam = new ClassConstructorObject_7(defConObj);
        System.out.println(classObjParam.marksJava); // Will print 99.0
    }
}
// The output of the above program is shown as below:
/*
The default constructor doesn't exist, so no default values initialized:
1
Atharva
99.0

Printing parameters passed as arguments to Constructor:
19
Poornima
89.0
89.0
99.0
 */