
# Model Question Paper 1:

7. ** Design and implement a Java class that demonstrates class fundamentals, including constructors, methods, and the 'this' keyword, with a practical example **

## Person Class

This Java class, `Person`, demonstrates fundamental concepts of object-oriented programming including constructors, methods, and the `this` keyword.

## Java Code

```java
public class Person {
    private String name;
    private int age;

    // Constructors and other methods...

    // Method to display details using 'this' keyword
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Main method demonstrating 'this' keyword usage
    public static void main(String[] args) {
        // Creating instances and updating details...
        // ...

        // Displaying details using 'this' keyword
        person1.displayDetails();
    }
}
```
## Explanation
**Constructors:**

The Person class has constructors to initialize name and age.
There are three constructors: one without parameters, one with only a name parameter, and one with both name and age parameters.
Methods:

displayDetails method demonstrates the usage of the this keyword.
It prints the name and age of a person using this.name and this.age.
**Usage:**

The main method demonstrates creating instances using different constructors, updating details, and displaying information using the displayDetails method that utilizes the this keyword.
This example illustrates the application of constructors, methods, and highlights the usage of the this keyword within a Person class to manage and display individual's details in Java.