package com.modules.M3_Inheritance.S11_11_Interface.C1_01_Basic;

// Basic interface with a method
interface Messenger {
    void sendMessage(String message);
}

// Class implementing the interface
class EmailMessenger implements Messenger {
    @Override
    public void sendMessage(String message) {
        // Email-specific implementation
        System.out.println("Sending Email: " + message);
    }
}

public class BasicInterface_Messenger {
    public static void main(String[] args) {
        // Creating an instance of EmailMessenger
        EmailMessenger emailMessengerRefObj;
        emailMessengerRefObj = new EmailMessenger();

        // Using the sendMessage method from the interface
        emailMessengerRefObj.sendMessage("Hello, How are you?");
    }
}
// The output of the above program is shown as below:

/*
Sending Email: Hello, How are you?
 */