package Lessons.ModelQuestionsAnswers.Set1.Four;

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
        GreetingMessage greeting1;
        greeting1 = new GreetingMessage("Hello, welcome to OOPs way of coding using JAVA!");

        // Displaying the initial message using the greet method
        greeting1.greet();

        // Setting a new message using the setter method
        greeting1.setMessage("Good morning! Begin coding in JAVA!");

        // Displaying the updated message using the greet method
        greeting1.greet();
    }
}

// The output of the above program is shown as below:
/*
Greeting Message: Hello, welcome to OOPs way of coding using JAVA!
Greeting Message: Good morning! Begin coding in JAVA!
 */
