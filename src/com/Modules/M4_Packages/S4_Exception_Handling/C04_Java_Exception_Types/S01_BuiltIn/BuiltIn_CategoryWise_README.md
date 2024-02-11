# Java Exceptions

Java exceptions play a crucial role in handling errors and exceptional conditions in Java programs. This README provides an overview of various exception types categorized into different packages.

## 1. java.lang Exceptions

These exceptions are part of the `java.lang` package, automatically imported into every Java program.

### ArithmeticException

Thrown when an arithmetic operation has an exceptional condition, such as division by zero.

### NullPointerException

Thrown when attempting to access an object or invoke a method on a null reference.

### ArrayIndexOutOfBoundsException

Thrown when trying to access an array element with an index outside the bounds of the array.

### ArrayStoreException

Thrown when storing the wrong type of object in an array.

### ClassCastException

Thrown when an attempt is made to cast an object to a subclass type of which it is not an instance.

### NumberFormatException

Thrown when attempting to convert a string to a numeric type, but the format is invalid.

### IllegalArgumentException

Thrown when a method is called with an illegal or inappropriate argument.

### IllegalStateException

Thrown when an object is in an inappropriate state for the requested operation.

### SecurityException

Thrown by the security manager to indicate a security violation.

## 2. java.io Exceptions

These exceptions are part of the `java.io` package and are related to input/output operations.

### IOException

Base class for exceptions thrown during I/O operations.

### FileNotFoundException

Thrown when attempting to access a file that does not exist.

### EOFException

Thrown when the end of a file or stream is reached unexpectedly.

## 3. java.util Exceptions

These exceptions are part of the `java.util` package and are related to utility classes.

### NoSuchElementException

Thrown by various methods in the Enumeration and Iterator interfaces to indicate that there are no more elements.

## 4. java.sql Exceptions

These exceptions are part of the `java.sql` package and are related to database operations.

### SQLException

Base class for exceptions related to database access.

### SQLSyntaxErrorException

Thrown when a syntax error is encountered while processing SQL statements.

### SQLIntegrityConstraintViolationException

Thrown when a violation of a database integrity constraint is detected.

## 5. java.net Exceptions

These exceptions are part of the `java.net` package and are related to networking.

### MalformedURLException

Thrown when a malformed URL has occurred.

### UnknownHostException

Thrown to indicate that the IP address of a host could not be determined.

### SocketException

Thrown to indicate an error in the underlying network protocol, such as a TCP error.

These are just a few examples, and there are many more exceptions available in Java. Each exception serves a specific purpose and is designed to handle different error scenarios.
