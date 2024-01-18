package com.modules.M3_Inheritance.S11_11_Interfaces.C1_01_Basic;

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
        EmailMessenger emailMessengerRefObj;
        emailMessengerRefObj = new EmailMessenger();
        emailMessengerRefObj.sendMessage("Hello How are you?");

    }

}