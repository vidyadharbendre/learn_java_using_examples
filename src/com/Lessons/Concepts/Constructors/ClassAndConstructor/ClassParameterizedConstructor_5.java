package Lessons.Concepts.Constructors.ClassAndConstructor;

/**
 * Author   : Vidyadhar Bendre
 * Email    : vidyadhar.bendre@gmail.com
 * Date     : 25 December 2023
 * Purpose  : This class demonstrates the use of parameterized constructors in Java.
 *
 * In this scenario:
 *
 * 1. 'ClassParameterizedConstructor_5' displays the use of default and parameterized constructors.
 *
 * 2. Class variables:
 *    - 'rollNumberStudent' (int) stores the student's roll number.
 *    - 'nameStudent' (String) stores the student's name.
 *    - 'marksJava' (float) stores marks obtained in the Java subject.
 *
 * 3. The default constructor isn't explicitly defined but variables are initialized in the constructor.
 *
 * 4. The parameterized constructor 'ClassParameterizedConstructor_5(int, String, float)' initializes values
 *    based on the arguments passed.
 *
 * 5. 'main()' method serves as the entry point, demonstrating:
 *    - Creation of an object using the default constructor (no explicit definition).
 *    - Printing default values.
 *    - Creation of an object using the parameterized constructor, passing arguments.
 *    - Printing values initialized through the parameterized constructor.
 */

public class ClassParameterizedConstructor_5 {
    // Declaring variables for student's roll number, name, and marks in Java
    int rollNumberStudent;
    String nameStudent;
    float marksJava;

    // Default constructor (not explicitly defined as it's not needed here)
    ClassParameterizedConstructor_5() {
        // Initializing values without the default constructor
        this.rollNumberStudent = 1;
        this.nameStudent = "Atharva";
        this.marksJava = 99.0f;
    }

    // Parameterized constructor to initialize values
    ClassParameterizedConstructor_5(int rollNumberStudent, String nameStudent, float marksJava) {
        this.rollNumberStudent = rollNumberStudent;
        this.nameStudent = nameStudent;
        this.marksJava = marksJava;
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        // (default constructor is not explicitly defined)
        ClassParameterizedConstructor_5 defConObj;
        defConObj = new ClassParameterizedConstructor_5();

        // Printing default values
        System.out.println("The default constructor doesn't exist, so no default values initialized:");
        System.out.println(defConObj.rollNumberStudent); // Will print 0 (default value for int)
        System.out.println(defConObj.nameStudent); // Will print null (default value for String)
        System.out.println(defConObj.marksJava); // Will print 0.0 (default value for float)

        // Creating an object using the parameterized constructor
        ClassParameterizedConstructor_5 paramObj;
        paramObj = new ClassParameterizedConstructor_5(19, "Poornima", 89.0f);

        // Printing values initialized through the parameterized constructor
        System.out.println("\nPrinting parameters passed as arguments to Constructor:");
        System.out.println(paramObj.rollNumberStudent); // Will print 19
        System.out.println(paramObj.nameStudent); // Will print "Poornima"
        System.out.println(paramObj.marksJava); // Will print 89.0
    }
}

// The output of the above program is shown below:
/*
0
null
0.0

Printing parameters passed as arguments to Constructor:
19
Poornima
89.0
 */
