# Built-in Java Exceptions

Java provides a rich set of built-in exceptions to handle various error scenarios. These exceptions are categorized into different packages based on their functionalities. Here's an overview of some common categories of built-in Java exceptions along with examples.

## 1. Java.lang Exceptions

### `ArithmeticException`
Thrown when an arithmetic operation has an exceptional condition, such as division by zero.

```java
int result = 10 / 0; // ArithmeticException
```

NullPointerException
Thrown when attempting to access an object or invoke a method on a null reference.

```java
String str = null;
int length = str.length(); // NullPointerException
ArrayIndexOutOfBoundsException
Thrown when trying to access an array element with an index outside the bounds of the array.
```

```java
int[] arr = {1, 2, 3};
int value = arr[5]; // ArrayIndexOutOfBoundsException
ClassCastException
Thrown when an attempt is made to cast an object to a subclass type of which it is not an instance.
```

```java
Object obj = "Hello";
Integer num = (Integer) obj; // ClassCastException
```

2. Java.io Exceptions
   IOException
   Base class for exceptions thrown during I/O operations.

```java
try {
FileInputStream fis = new FileInputStream("nonexistent-file.txt");
} catch (IOException e) {
// Handle IOException
e.printStackTrace();
}
FileNotFoundException
Thrown when attempting to access a file that does not exist.
```

```java
try {
FileInputStream fis = new FileInputStream("nonexistent-file.txt"); // FileNotFoundException
} catch (FileNotFoundException e) {
// Handle FileNotFoundException
e.printStackTrace();
}
```

3. Java.util Exceptions
   NoSuchElementException
   Thrown by various methods in the Enumeration and Iterator interfaces to indicate that there are no more elements.

```java
List<String> list = new ArrayList<>();
Iterator<String> iterator = list.iterator();
String element = iterator.next(); // NoSuchElementException
```

4. Java.sql Exceptions
   SQLException
   Base class for exceptions related to database access.

```java
try {
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "password");
} catch (SQLException e) {
// Handle SQLException
e.printStackTrace();
}
SQLSyntaxErrorException
Thrown when a syntax error is encountered while processing SQL statements.
```

```java
try {
Statement statement = connection.createStatement();
statement.execute("SELECT * FROM non_existent_table"); // SQLSyntaxErrorException
} catch (SQLSyntaxErrorException e) {
// Handle SQLSyntaxErrorException
e.printStackTrace();
}
```

5. Java.net Exceptions
   MalformedURLException
   Thrown when a malformed URL has occurred.

```java
try {
URL url = new URL("invalid-url"); // MalformedURLException
} catch (MalformedURLException e) {
// Handle MalformedURLException
e.printStackTrace();
}
UnknownHostException
Thrown to indicate that the IP address of a host could not be determined.
```


```java
try {
InetAddress address = InetAddress.getByName("unknown-host"); // UnknownHostException
} catch (UnknownHostException e) {
// Handle UnknownHostException
e.printStackTrace();
}
SocketException
Thrown to indicate an error in the underlying network protocol, such as a TCP error.
```

```java
try {
Socket socket = new Socket("invalid-host", 8080); // SocketException
} catch (SocketException e) {
// Handle SocketException
e.printStackTrace();
}
```
