# Runtime Polymorphism Example in Java

This Java program demonstrates the concept of runtime polymorphism using a hierarchy of Box classes.

## Purpose

The purpose of this program is to illustrate the concept of runtime polymorphism in Java. It showcases the inheritance hierarchy involving the Box class and its subclasses, BoxWeight and BoxPrice, demonstrating how methods can be overridden to exhibit different behaviors during runtime.

## Explanation

1. The program contains a base class `Box`, representing a generic box with properties like length, width, and height. It has constructors to initialize these properties and a method `displayDetails()` to print box dimensions.

2. `BoxWeight` extends `Box` to include a weight property. It overrides the `displayDetails()` method to include weight information.

3. `BoxPrice` extends `BoxWeight` and adds a price property. It also overrides the `displayDetails()` method to include price information.

## Demonstration of Runtime Polymorphism

The program demonstrates runtime polymorphism using the following scenarios:

- Creation of various box objects and displaying their details.
- Using a reference of the base class to refer to objects of its derived classes (`Box`, `BoxWeight`, `BoxPrice`). This showcases how the method `displayDetails()` behaves differently based on the actual object type at runtime.



