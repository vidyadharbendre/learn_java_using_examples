# Understanding the `final` Keyword in Java

## What is the `final` keyword?
The `final` keyword in Java is used to denote constants that cannot be modified once assigned. It's applicable to variables, methods, and classes.

## When to use `final`?
- **Variables:** Use `final` when values should remain constant after initialization.
- **Methods:** Apply `final` to prevent method overriding in subclasses.
- **Classes:** Marking a class as `final` prevents inheritance.

## Where can `final` be used?
- **Variables:** `final int myNumber = 10;`
- **Methods:** `public final void myMethod() { // code }`
- **Classes:** `public final class MyClass { // code }`

## Why use the `final` keyword?
- Ensures constant values and immutable variables.
- Prevents unintentional modifications to critical methods or variables.
- Secures critical classes or methods from being overridden.

## How does the `final` keyword work?
- **Variables:** Once initialized, `final` variables cannot be reassigned.
- **Methods:** `final` methods cannot be overridden by subclasses.
- **Classes:** `final` classes cannot be extended or inherited.

## Who benefits from using `final`?
- Developers ensuring immutability and safety in code.
- Architects defining unchangeable classes/methods for specific architectural reasons.

## Example Usage:
```java
public class FinalExample {
    public final int myNumber = 10;

    public final void myMethod() {
        // code
    }
}

public final class FinalClass {
    // code
}
```
