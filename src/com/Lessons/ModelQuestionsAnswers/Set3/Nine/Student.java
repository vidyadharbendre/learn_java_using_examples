package Lessons.ModelQuestionsAnswers.Set3.Nine;

public class Student {
    private int rollNumber;
    private String name;
    private int age;

    // Constructor to initialize roll-number, name, and age
    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    // Method to set roll number
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Method to set student name
    public void setName(String name) {
        this.name = name;
    }

    // Method to set student age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to get roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // Method to get student name
    public String getName() {
        return name;
    }

    // Method to get student age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating a student object using the constructor
        Student studentObj;
        studentObj = new Student(1, "Vidyadhar", 52);

        // Displaying initial student details
        System.out.println("Initial Student Details:");
        studentObj.displayDetails();

        // Updating student details
        studentObj.updateDetails(2, "Atharva", 23);

        // Displaying updated student details
        System.out.println("\nUpdated Student Details:");
        studentObj.displayDetails();
    }
    // Method to update student details
    public void updateDetails(int rollNumber, String name, int age) {
        setRollNumber(rollNumber);
        setName(name);
        setAge(age);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

//The output of the above program is shown below:
/*
Initial Student Details:
Roll Number: 1
Name: Vidyadhar
Age: 52

Updated Student Details:
Roll Number: 2
Name: Atharva
Age: 23
 */