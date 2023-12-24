# Model Question Paper 1:

4. **Design and implement a Java constructor class that demonstrates the greeting message with one with initial message another message by setter method.**

## Introduction to Constructors and Setter Methods:
In Java, constructors are special methods used to initialize objects when they are created. They allow for the initialization of class attributes upon object instantiation. Setter methods, on the other hand, are used to modify or update the values of instance variables within a class.

### Example: GreetingMessage Class

The `GreetingMessage` class demonstrates the use of a constructor and setter method to manage greeting messages.

### Java Code Example:

```java
public class GreetingMessage {
    private String message;

    // Constructor with an initial message
    public GreetingMessage(String initialMessage) {
        this.message = initialMessage;
    }

    // Setter method to set a new message
    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    // Getter method to retrieve the current message
    public String getMessage() {
        return this.message;
    }

    // Method to display the greeting message
    public void greet() {
        System.out.println("Greeting Message: " + this.message);
    }

    public static void main(String[] args) {
        // Creating an instance using constructor
        GreetingMessage greeting1 = new GreetingMessage("Hello, welcome to OOPs way of coding using JAVA!");

        // Displaying the initial message using the greet method
        greeting1.greet();

        // Setting a new message using the setter method
        greeting1.setMessage("Good morning! Begin coding in JAVA!");

        // Displaying the updated message using the greet method
        greeting1.greet();
    }
}
```
### Explanation:
The GreetingMessage class features a constructor that initializes the message with an initial value.

It includes a setMessage method to modify the message content.

The greet method displays the greeting message.