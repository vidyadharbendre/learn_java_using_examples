# Purpose
This program demonstrates the concept of inheritance in Java and showcases the use of the `super()` keyword to invoke the constructor of the parent class within the child class.

## Explanation

### Package Structure
The program is organized within the package `modules.M3_Inheritance.S2_02_UsingSuper.C1_01_Accessing_ParentClass_Constructor`.

### Classes
- **`Parent` Class:**
    - Defines a `Parent` class with a default constructor (`Parent()`).
    - The constructor contains a `println` statement that outputs `"Parent class constructor"` when an instance of `Parent` or its subclass is created.

- **`Child` Class:**
    - Extends the `Parent` class using `extends Parent`.
    - Defines a constructor (`Child()`) for the `Child` class.
    - Inside the `Child` class constructor:
        - Uses `super()` to call the constructor of the `Parent` class before executing its own constructor logic.
        - Prints `"Child class constructor"` to the console.

- **`AccessingParentClassConstructor` Class (Main Class):**
    - Contains the `main()` method, serving as the entry point of the program.
    - Inside the `main()` method:
        - Creates an instance of the `Child` class (`childObj = new Child();`).

### Concept
- **Inheritance:** The `Child` class inherits from the `Parent` class, showcasing the acquisition of properties and behaviors from its parent class.
- **Constructor Chaining:** Demonstrates the use of `super()` to invoke the parent class constructor, ensuring its execution before the child class constructor logic.
- **Execution Flow:** Shows the sequence of constructor calls when creating an instance of the `Child` class, executing the parent class constructor first followed by the child class constructor.
