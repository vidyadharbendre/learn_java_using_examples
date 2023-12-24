package Lessons.Concepts.ClassAndConstructor;

public class ClassParameterizedConstructor_5 {

    // Declaring variables for student's roll number, name, and marks in Java
    int rollNumberStudent;
    String nameStudent;
    float marksJava;

    // Default constructor (not explicitly defined as it's not needed here)
    ClassParameterizedConstructor_5(){
        this.rollNumberStudent = 1;
        this.nameStudent = "Atharva";
        this.marksJava = 99.0f;
    }

    // Parameterized constructor to initialize values
    // Constructor overloading as by default without passing vs by passing arguments
    // Polymorphism
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
        System.out.println(paramObj.rollNumberStudent); // Will print 109
        System.out.println(paramObj.nameStudent); // Will print "Poornima"
        System.out.println(paramObj.marksJava); // Will print 89.0
    }
}

// The output of the above program is shown as below:
/*
0
null
0.0

Printing parameters passed as arguments to Constructor:
19
Poornima
89.0
 */