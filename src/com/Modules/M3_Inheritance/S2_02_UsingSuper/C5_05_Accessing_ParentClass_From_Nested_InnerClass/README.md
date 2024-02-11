i# Purpose
This Java program demonstrates accessing a parent class variable from an inner class (`Inner`) within the same parent class (`Parent`). It showcases how an inner class can access and utilize a variable defined in its enclosing parent class.

## Explanation

### Classes
- **`Parent` Class:**
    - Defines a `Parent` class with an instance variable `num` initialized to `100`.
    - Contains an inner class `Inner` that has a method `display()`.
        - The `display()` method accesses the `num` variable from the `Parent` class using `Parent.this.num`.

- **`AccessingParentClassFromNestedClass` Class (Main Class):**
    - Contains the `main()` method, serving as the entry point of the program.
    - Creates an instance of the `Parent` class (`parentObj = new Parent();`).
    - Instantiates an object of the inner class `Inner` using `parentObj.new Inner()`.
    - Invokes the `display()` method of the `Inner` class (`innerObj.display();`).

### Output
Upon execution, the program outputs the value of the `num` variable from the `Parent` class, which is `"Parent num: 100"` in this case.

## How to Run
1. Compile the Java file: `javac AccessingParentClassFromNestedClass.java`
2. Run the program: `java AccessingParentClassFromNestedClass`

This will execute the program and demonstrate the inner class's ability to access and utilize the parent class's variable.
