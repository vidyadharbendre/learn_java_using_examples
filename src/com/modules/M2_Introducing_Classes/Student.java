package modules.M2_Introducing_Classes;

public class Student {
    private String name;       // Attribute: name
    private int age;          // Attribute: age
    private String studentID;  // Attribute: studentID
    private double gpa;       // Attribute: gpa

    // Constructor to initialize Student objects
    public Student(String name, int age, String studentID, double gpa) {
        this.name = name;           // Initialize name attribute
        this.age = age;             // Initialize age attribute
        this.studentID = studentID; // Initialize studentID attribute
        this.gpa = gpa;             // Initialize gpa attribute
    }

    // Getter methods to access individual attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentID() {
        return studentID;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter method to modify GPA attribute
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Method to display information about the student
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Student ID: " + studentID + ", GPA: " + gpa);
    }

    public static void main(String[] args) {
        // Creating an object (instance) of the Student class
        Student myStudent = new Student("Atharva", 20, "S123456", 3.8);

        // Accessing and displaying the state of the object
        myStudent.displayInfo();
    }
}

// The output of the above program is shown below
/*
Name: Atharva, Age: 20, Student ID: S123456, GPA: 3.8
 */
