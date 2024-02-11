# Use of @Override Annotation in Java

## What is `@Override` in Java?
`@Override` is an annotation in Java that indicates that the annotated method in a subclass is intended to override a method in its superclass. It helps in ensuring that the method signature in the subclass matches the method being overridden in the superclass.

## Why Use `@Override`?
- **Enforcement:** Helps in ensuring that a method is correctly overridden from the superclass. It checks if the annotated method actually overrides a method in the superclass.
- **Readability and Maintainability:** Improves code readability by explicitly indicating the intention to override a method.
- **Preventing Errors:** Helps prevent accidental overloading instead of overriding a method due to a mismatch in method signatures.

## When to Use `@Override`?
- Use `@Override` whenever a method in a subclass is intended to override a method in its superclass.
- When you want the compiler to verify that the method signature in the subclass matches the one in the superclass.

## Where is `@Override` Used?
`@Override` is commonly used in Java when implementing methods in subclasses that are meant to override methods in their respective superclasses.

## How Does `@Override` Work in Java?
- When a method is annotated with `@Override`, the compiler checks if there is a matching method in the superclass. If not, it raises an error.
- If the annotated method doesn't override any method from the superclass, the compiler generates an error.

## Example of Using `@Override` in Java:
```java
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
```
In the example, the @Override annotation indicates that the makeSound() method in the Dog class is meant to override the makeSound() method from its superclass Animal.
