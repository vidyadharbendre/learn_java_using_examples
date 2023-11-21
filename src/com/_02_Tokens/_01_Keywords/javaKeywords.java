/**
 * Program: JavaKeywordsExamples
 *
 * Purpose:
 * This program demonstrates the usage of Java keywords through code examples.
 * It showcases various keywords such as data types, control flow statements, and others.
 */

public class javaKeywords {

    public static void main(String[] args) {
        // Integer Variable Declaration
        int age = 30;
        System.out.println("Age: " + age);

        // Floating-Point Variable Declaration
        float pi = 3.14f;
        System.out.println("PI: " + pi);

        // Character Variable Declaration
        char grade = 'A';
        System.out.println("Grade: " + grade);

        // Conditional Execution - if-else
        int score = 85;
        if (score > 80) {
            System.out.println("First class with Distinction");
        } else {
            System.out.println("Pass");
        }

        // Looping - while
        int i = 1;
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++;
        }

        // Looping - for
        for (int j = 0; j < 3; j++) {
            System.out.println("Iteration: " + j);
        }

        // Return Statement
        int result = add(5, 7);
        System.out.println("Result of addition: " + result);

        // Void Method
        sayHello();

        // instanceof - Checking Object Type
        Object obj = "Hello";
        if (obj instanceof String) {
            System.out.println("Object is of type String");
        }
    }

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with void return type
    public static void sayHello() {
        System.out.println("Hello, World!");
    }
}
