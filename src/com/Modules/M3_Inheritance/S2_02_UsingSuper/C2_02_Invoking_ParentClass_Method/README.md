# Purpose
This Java program demonstrates inheritance and method invocation by calling a method from a parent class within a method of its child class using the `super` keyword.

## Explanation

### Classes
- **`Parent` Class:**
    - Defines a `Parent` class with a method `parentMethod()`.
    - The method contains a `println` statement that outputs `"Parent class method"` when invoked.

- **`Child` Class:**
    - Extends the `Parent` class and contains a method `childMethod()`.
    - Inside `childMethod()`:
        - Calls the `parentMethod()` from the parent class using `super.parentMethod()`.
        - Prints `"Child class method"` to the console.

- **`InvokingParentClassMethod` Class (Main Class):**
    - Contains the `main()` method, serving as the entry point of the program.
    - Creates an instance of the `Child` class (`childObj = new Child();`).
    - Invokes the `childMethod()` of the `Child` class (`childObj.childMethod();`).

### Concept
- **Inheritance:** Demonstrates how a child class (`Child`) inherits methods from its parent class (`Parent`) and extends its functionality.
- **Method Invocation:** Shows the use of `super` to call the parent class method (`parentMethod()`) from within the child class method (`childMethod()`).
- **Execution Flow:** Illustrates the sequence of method calls, executing the parent class method followed by the child class method.

## How to Run
1. Compile the Java file: `javac InvokingParentClassMethod.java`
2. Run the program: `java InvokingParentClassMethod`

Upon execution, the program will create an instance of the `Child` class and demonstrate the invocation of methods from the parent and child classes.
