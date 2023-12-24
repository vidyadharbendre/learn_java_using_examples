package Lessons.Concepts.ClassAndConstructor;

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