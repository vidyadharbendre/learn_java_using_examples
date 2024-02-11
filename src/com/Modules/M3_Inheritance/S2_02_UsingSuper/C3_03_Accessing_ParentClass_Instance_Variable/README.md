# Purpose
This Java program demonstrates inheritance and accessing instance variables from both parent and child classes. It showcases how a child class (`Child`) inherits instance variables from its parent class (`Parent`) and compares their values.

## Explanation

### Classes
- **`Parent` Class:**
    - Defines a `Parent` class with an instance variable `parentVar` initialized to `33`.

- **`Child` Class:**
    - Extends the `Parent` class and introduces an instance variable `childVar` initialized to `66`.
    - Contains a method `displayVariables()` to display the values of parent and child variables and compare them.
        - Uses `super.parentVar` to access the `parentVar` from the parent class.
        - Utilizes `this.childVar` to access the `childVar` from the child class.
        - Prints the values and compares them using conditional statements.

- **`AccessingParentClassInstanceVariable` Class (Main Class):**
    - Contains the `main()` method, serving as the entry point of the program.
    - Creates an instance of the `Child` class (`childObj = new Child();`).
    - Invokes the `displayVariables()` method of the `Child` class (`childObj.displayVariables();`).

### Output
Upon execution, the program outputs:
