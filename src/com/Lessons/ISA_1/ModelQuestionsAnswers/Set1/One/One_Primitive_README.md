# Model Question Paper 1: 

1. **Q1:What are primitive data types in Java, and explain their memory allocation process at the time of compile time and runtime?**

In Java, primitive data types are the basic building blocks for storing simple values. They are not objects and lack additional functionalities like wrapper classes. Java has eight primitive data types:

1. **byte:** 8-bit signed two's complement integer (-128 to 127)
2. **short:** 16-bit signed two's complement integer (-32,768 to 32,767)
3. **int:** 32-bit signed two's complement integer (-2^31 to 2^31-1)
4. **long:** 64-bit signed two's complement integer (-2^63 to 2^63-1)
5. **float:** 32-bit single-precision IEEE 754 floating-point (stores decimal values)
6. **double:** 64-bit double-precision IEEE 754 floating-point (stores decimal values)
7. **char:** 16-bit Unicode character (0 to 65,535)
8. **boolean:** Represents true or false values (often used for conditional statements)

### Memory Allocation in Java for Primitive Types:

- **Compile Time:**
    - During compile time, the Java compiler reserves memory for variables based on their data types. The amount of memory allocated is fixed and determined by the specific type.
    - For example:
        - `byte` allocates 1 byte.
        - `int` allocates 4 bytes.
        - `float` allocates 4 bytes.
        - `double` allocates 8 bytes.

- **Runtime:**
    - Primitive types are typically allocated memory in the stack memory area.
    - When a primitive variable is declared, memory is allocated directly.
    - The memory allocation for primitive types occurs when the variables are declared or created, and it remains constant during their lifecycle.
    - Memory allocation for primitives doesn't involve dynamic allocation or garbage collection.

For example, consider an `int` variable:

```java

public class PrimitiveMemoryAllocation {

    public static void main(String[] args) {
        // Declaration and initialization of variables
        byte myByte = 100;
        short myShort = 1000;
        int myInt = 100000;
        long myLong = 1000000000L;
        float myFloat = 10.5f;
        double myDouble = 10.543;
        char myChar = 'A';
        boolean myBoolean = true;

        // Displaying values and their memory sizes
        System.out.println("byte: " + myByte);
        System.out.println("Size of byte: " + Byte.BYTES + " bytes");

        System.out.println("short: " + myShort);
        System.out.println("Size of short: " + Short.BYTES + " bytes");

        System.out.println("int: " + myInt);
        System.out.println("Size of int: " + Integer.BYTES + " bytes");

        System.out.println("long: " + myLong);
        System.out.println("Size of long: " + Long.BYTES + " bytes");

        System.out.println("float: " + myFloat);
        System.out.println("Size of float: " + Float.BYTES + " bytes");

        System.out.println("double: " + myDouble);
        System.out.println("Size of double: " + Double.BYTES + " bytes");

        System.out.println("char: " + myChar);
        System.out.println("Size of char: " + Character.BYTES + " bytes");

        System.out.println("boolean: " + myBoolean);
        System.out.println("Size of boolean: Not defined (JVM specific)");

        // Example to demonstrate runtime memory allocation
        int num = 10; // Allocated in stack memory
        System.out.println("Runtime memory allocation for int: " + num);
    }
}

// The output of the above program is shown as below:
/*
byte: 100
Size of byte: 1 bytes
short: 1000
Size of short: 2 bytes
int: 100000
Size of int: 4 bytes
long: 1000000000
Size of long: 8 bytes
float: 10.5
Size of float: 4 bytes
double: 10.543
Size of double: 8 bytes
char: A
Size of char: 2 bytes
boolean: true
Size of boolean: Not defined (JVM specific)
Runtime memory allocation for int: 10

 */
```