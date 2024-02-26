# Boxing for Primitive Data Types

Boxing is the process of converting a primitive data type into its corresponding wrapper class. In Java, each primitive data type has a corresponding wrapper class that encapsulates it. The purpose of boxing is to allow primitive data types to be used in scenarios where objects are required, such as collections or methods that expect objects.

Boxing can be performed explicitly by invoking the `valueOf()` method of the wrapper class and passing the primitive value as an argument. For example, to box an `int` value, you can use `Integer.valueOf(intValue)`.

Here's an example of boxing for all primitive data types:

- `int`: `Integer.valueOf(intValue)`
- `byte`: `Byte.valueOf(byteValue)`
- `short`: `Short.valueOf(shortValue)`
- `long`: `Long.valueOf(longValue)`
- `float`: `Float.valueOf(floatValue)`
- `double`: `Double.valueOf(doubleValue)`
- `char`: `Character.valueOf(charValue)`
- `boolean`: `Boolean.valueOf(booleanValue)`
