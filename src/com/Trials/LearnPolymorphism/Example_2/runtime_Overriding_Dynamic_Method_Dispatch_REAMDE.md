# Dynamic Method Dispatch/Runtime Overriding

Dynamic Method Dispatch and Runtime Overriding are terms often used interchangeably in Java. They refer to the concept of selecting the appropriate overridden method at runtime based on the actual object type when dealing with inheritance and polymorphism.

## Overview

- **Definition:** Dynamic Method Dispatch or Runtime Overriding is the process where the appropriate method to be executed is determined during runtime based on the actual object type rather than the reference type.
- **Use Case:** This mechanism allows a reference variable of a superclass to hold a reference to a subclass object. When a method is invoked through this reference, the overridden method in the subclass is executed instead of the superclass's method.
- **Polymorphic Behavior:** It enables the ability to achieve polymorphic behavior, allowing different classes to provide their specific implementation of methods with the same signature.

## Key Points

- **Inheritance and Polymorphism:** Critical concepts in Java that facilitate Dynamic Method Dispatch.
- **Superclass Reference, Subclass Object:** Superclass reference variables can refer to subclass objects.
- **Execution of Overridden Methods:** During runtime, the overridden method in the subclass is executed based on the actual object type.

## Example

Consider a scenario where a superclass `Shape` has a method `calculateArea()` and subclasses `Rectangle` and `Circle` override this method to calculate their specific areas. By using the superclass reference variable to refer to subclass objects and invoking the `calculateArea()` method, the appropriate overridden method gets executed based on the actual object type.

This feature enhances flexibility, allowing more extensible and maintainable code.

