package com.Modules.M3_Inheritance.S11_11_Interface.C6_06_Real_Time_Examples;

// MessagingApp interface
interface MessagingApp {
    void sendMessage(String message, String recipient);
    void receiveMessage();
    void displayNotification();
}

// WhatsApp class implementing the MessagingApp interface
class WhatsApp implements MessagingApp {
    @Override
    public void sendMessage(String message, String recipient) {
        // WhatsApp-specific implementation
        System.out.println("WhatsApp Message Sent: \"" + message + "\" to " + recipient);
    }

    @Override
    public void receiveMessage() {
        // WhatsApp-specific implementation
        System.out.println("WhatsApp Message Received");
    }

    @Override
    public void displayNotification() {
        // WhatsApp-specific implementation
        System.out.println("WhatsApp Notification Displayed");
    }
}

// Usage
public class E2_MessagingApplication {
    public static void main(String[] args) {
        MessagingApp whatsappRefObj;
        whatsappRefObj = new WhatsApp();

        whatsappRefObj.sendMessage("Hello, How are you?", "Vidyadhar");
        whatsappRefObj.receiveMessage();
        whatsappRefObj.displayNotification();
    }
}

// The output of the above program is shown as below:
/*
WhatsApp Message Sent: "Hello, How are you?" to Vidyadhar
WhatsApp Message Received
WhatsApp Notification Displayed
 */