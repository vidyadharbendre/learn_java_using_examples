# Type Conversion in Java

Type conversion in Java refers to the process of converting one data type into another. There are two types of type conversion in Java:

1. **Explicit Type Conversion (Type Casting)**:
    - Explicit type conversion, also known as type casting, is when you manually convert one data type into another.
    - It is done by specifying the desired data type in parentheses before the value or variable to be converted.
    - Explicit type conversion is necessary when there is a possibility of data loss, such as converting a larger data type to a smaller one.

    Example:
    ```java
        // Explicit type conversion (Type Casting)
        double d = 10.5;
        int i = (int) d; // Convert double to int (possible loss of data)
    ```
   2. **Implicit Type Conversion (Automatic Type Promotion)**:
       - Implicit type conversion, also known as automatic type promotion, is when Java automatically converts one data type into another without the need for any explicit casting.
       - It occurs when performing operations involving operands of different data types, and Java promotes the data type of one operand to match the other.
       - Implicit type conversion is safe and does not result in data loss.
       Example
       ```java
       // Implicit type conversion (Automatic Type Promotion)
        int numInt = 10;
        double numDouble = numInt; // Convert int to double (no data loss)
       ```
     