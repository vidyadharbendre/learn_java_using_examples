# Compile-Time Polymorphism or Method Overloading

In Java, compile-time polymorphism or method overloading allows a class to have multiple methods with the same name but different parameters. During compilation, the appropriate method to be called is determined based on the number or type of arguments passed.

## Overview

- **Definition:** Method Overloading is a feature that allows a class to have multiple methods with the same name but different parameters within the same class scope.
- **Use Case:** It provides flexibility and improves code readability by enabling the use of the same method name for different functionalities based on different parameter sets.
- **Compile-Time Resolution:** During compile-time, the Java compiler determines which overloaded method to call based on the method name, number of parameters, and their types.
- **Rules:** Overloaded methods must have different parameter types or a different number of parameters. The return type can be the same or different.

## Example Explanation

The provided Java program demonstrates method overloading within the `Overloading` class. Different `area()` methods are defined with varying parameter counts and types.

- `area()`: No arguments method displays the default value of the side.
- `area(int side1)`: Computes and displays the area of a square and cube with a single argument.
- `area(int side1, int side2)`: Calculates and prints the area of a rectangle based on two arguments.
- `area(int side1, int side2, int side3)`: Computes and shows the area of a cuboid with three arguments.

The output demonstrates the calling of these overloaded methods with different parameter sets, showcasing how the appropriate method is resolved at compile-time based on the provided arguments.

