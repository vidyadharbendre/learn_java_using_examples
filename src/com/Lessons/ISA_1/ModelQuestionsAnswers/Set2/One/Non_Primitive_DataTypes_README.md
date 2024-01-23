# Model Question Paper 2:

1. **What are non-primitive data types in Java, and explain their memory allocation process at the time of compile time and runtime?**
# Non-Primitive Data Types in Java

Non-primitive data types, also known as reference types in Java, include classes, interfaces, arrays, and enumerations. These types don't store the actual data but hold references (addresses) to the memory locations where the data is stored.

## Memory Allocation for Non-Primitive Types:

- **Compile Time:**
  - At compile time, memory for non-primitive types involves allocating memory for reference variables. These references will later point to the actual objects or arrays during runtime.
  - For instance, when declaring a variable of a class type, memory is allocated for the reference variable only, not for the entire object.

- **Runtime:**
  - Memory allocation for the actual objects or arrays of non-primitive types occurs during runtime when objects are created using the `new` keyword or when arrays are initialized.
  - When an object is instantiated using `new`, memory is allocated from the heap to hold the object's data.
  - Similarly, when an array is initialized, memory is allocated dynamically to hold the array elements.

- **Garbage Collection:**
  - Non-primitive types are allocated memory in the heap, and Java's garbage collector manages memory by identifying and removing unreferenced objects or arrays to free up memory.
  - When an object or array is no longer referenced, it becomes eligible for garbage collection, allowing the memory it occupies to be reclaimed.

## Example: Accessing Content through Object Reference

```java
class MyClass {
    String content = "Display this content"; // Variable within MyClass

    // Other fields, methods, etc.
}

public class NonPrimitiveMemoryAllocation {
    public static void main(String[] args) {
        // Memory allocation at compile time
        MyClass objRef; // Allocates memory for the reference 'objRef' of type 'MyClass'

        // Memory allocation at runtime
        objRef = new MyClass(); // Allocates memory for an object of 'MyClass'

        // Accessing and displaying content using the object reference
        System.out.println(objRef.content);
    }
}
```