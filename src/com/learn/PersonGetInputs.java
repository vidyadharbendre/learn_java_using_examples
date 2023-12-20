import java.util.Scanner;

public class PersonGetInputs {
    private String name;
    private int age;

    // Default constructor
    public PersonGetInputs() {
        this.name = "John Doe";
        this.age = 30;
    }

    // Parameterized constructor
    public PersonGetInputs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Scanner scannerObj;
        scannerObj = new Scanner(System.in);

        // Creating object using default constructor
        PersonGetInputs person1;
        person1 = new PersonGetInputs();

        // Accessing object properties using getters
        System.out.println("Initial Details:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Getting inputs for name and age from the keyboard
        System.out.println("\nEnter name:");
        String newName = scannerObj.nextLine();
        person1.setName(newName); // Set the name using the setName method of person1

        System.out.println("Enter age:");
        int newAge = scannerObj.nextInt();
        person1.setAge(newAge);

        // Displaying updated details of person1 using display method
        System.out.println("\nUpdated Details of person1:");
        person1.display();

        scannerObj.close(); // Close the scanner to release resources
    }
}

/*
 * Compilation Command:
         * javac -d ../../../out PersonGetInputs.java
         *
         * Execution Command:
         * java -cp ../../../out PersonGetInputs

         */

/*
Initial Details:
Name: John Doe
Age: 30

Enter name:
Vidyadhar
Enter age:
53

Updated Details of person1:
Name: Vidyadhar
Age: 53

 */