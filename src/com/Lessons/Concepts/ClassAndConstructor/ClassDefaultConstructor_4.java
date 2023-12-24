package Lessons.Concepts.ClassAndConstructor;

public class ClassDefaultConstructor_4 {
    // Declaring integer variable for student's roll number
    int rollNumberStudent;
    // Declaring string variable for student's name
    String nameStudent;
    // Declaring float variable for marks in Java
    float marksJava;

    ClassDefaultConstructor_4() {
    }

    public static void main(String[] args) {
        ClassDefaultConstructor_4 defConObj;
        defConObj = new ClassDefaultConstructor_4();
        System.out.println("The default constructor printing default values");
        System.out.println(defConObj.rollNumberStudent);
        System.out.println(defConObj.nameStudent);
        System.out.println(defConObj.marksJava);

    }
}