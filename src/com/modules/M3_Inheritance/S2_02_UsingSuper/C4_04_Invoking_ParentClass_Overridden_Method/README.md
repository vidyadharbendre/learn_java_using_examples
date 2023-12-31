# Purpose
This Java program illustrates method overriding in inheritance and demonstrates how a child class can invoke the overridden method from its parent class using the `super` keyword.

## Explanation

### Classes
- **`Parent` Class:**
    - Defines a `Parent` class with a method `display()` that prints `"Parent Class Method"` to the console.

- **`Child` Class:**
    - Extends the `Parent` class and overrides the `display()` method.
    - Inside `display()` of the `Child` class:
        - Invokes the overridden method from the `Parent` class using `super.display()`.
        - Prints `"Child Class Method"` to the console.

- **`InvokingParentClassOverriddenMethod` Class (Main Class):**
    - Contains the `main()` method, serving as the entry point of the program.
    - Creates an instance of the `Child` class (`childObj = new Child();`).
    - Invokes the `display()` method of the `Child` class (`childObj.display();`).

### Concept
- **Method Overriding:** Demonstrates how a child class (`Child`) overrides a method (`display()`) from its parent class (`Parent`) to provide its implementation.
- **`super` Keyword:** Illustrates the use of `super` within the overridden method to call the overridden method from the parent class and extend its functionality.
- **Execution Flow:** Shows the sequence of method calls, where the overridden method from the parent class is invoked first, followed by the child class method.

## How to Run
1. Compile the Java file: `javac InvokingParentClassOverriddenMethod.java`
2. Run the program: `java InvokingParentClassOverriddenMethod`

Upon execution, the program will create an instance of the `Child` class and demonstrate the invocation of the overridden method from the parent class followed by the child class method.
