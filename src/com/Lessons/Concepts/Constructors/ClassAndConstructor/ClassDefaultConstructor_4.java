package Lessons.Concepts.Constructors.ClassAndConstructor;

/**
 * Author   : Vidyadhar Bendre
 * Email    : vidyadhar.bendre@gmail.com
 * Date     : 25 December 2023
 * Purpose  : This class demonstrates the use of a default constructor in Java.
 *
 * In this scenario:
 *
 * 1. 'ClassDefaultConstructor_4' showcases the usage of a default constructor.
 *
 * 2. Class variables:
 *    - 'rollNumberStudent' (int) stores the student's roll number.
 *    - 'nameStudent' (String) stores the student's name.
 *    - 'marksJava' (float) stores marks obtained in the Java subject.
 *
 * 3. The default constructor 'ClassDefaultConstructor_4()' initializes no values.
 *
 * 4. 'main()' method serves as the entry point, demonstrating:
 *    - Declaration and initialization of a reference variable 'defConObj' of type 'ClassDefaultConstructor_4'.
 *    - Instantiation of an object of 'ClassDefaultConstructor_4' using the default constructor.
 *    - Printing default values of class variables.
 */

public class ClassDefaultConstructor_4 {
    // Declaring integer variable for student's roll number
    int rollNumberStudent;

    // Declaring string variable for student's name
    String nameStudent;

    // Declaring float variable for marks in Java
    float marksJava;

    // Default constructor (no explicit initialization)
    ClassDefaultConstructor_4() {
    }

    public static void main(String[] args) {
        // Declaring a reference variable of type ClassDefaultConstructor_4
        ClassDefaultConstructor_4 defConObj;

        // Initializing the object of ClassDefaultConstructor_4 using default constructor
        defConObj = new ClassDefaultConstructor_4();

        System.out.println("The default constructor printing default values");

        // Printing the default values of class variables
        System.out.println(defConObj.rollNumberStudent);
        System.out.println(defConObj.nameStudent);
        System.out.println(defConObj.marksJava);
    }
}

// The output of the above program is shown below:
/*
The default constructor printing default values
0
null
0.0
 */
