package Lessons.Concepts.ClassAndConstructor;

public class ClassTrial_3 {
    // Declaring integer variable for student's roll number
    int rollNumberStudent;
    // Declaring string variable for student's name
    String nameStudent;
    // Declaring float variable for marks in Java
    float marksJava;

    public static void main(String[] args) {
        // Declaring a reference variable of type ClassTrial_1
        ClassTrial_3 classObj;
        // Initializing the object of ClassTrial_1
        classObj = new ClassTrial_3();
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
        System.out.println(classObj.rollNumberStudent);
        System.out.println(classObj.nameStudent);
        System.out.println(classObj.marksJava);
        System.out.println("new objects reference are printing class initial/default values ");

        ClassTrial_3 classObj1;
        classObj1 = new ClassTrial_3();

        System.out.println(classObj1.rollNumberStudent);
        System.out.println(classObj1.nameStudent);
        System.out.println(classObj1.marksJava);
    }
}

// The output of the above program is shown as below:
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