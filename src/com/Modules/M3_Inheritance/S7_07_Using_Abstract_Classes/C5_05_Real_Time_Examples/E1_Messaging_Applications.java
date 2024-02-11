package com.Modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C5_05_Real_Time_Examples;

public class E1_Messaging_Applications {
    public static void main(String[] args) {
        WhatsApp whatsappRefObj;
        whatsappRefObj = new WhatsApp();

        // Example Usage:
        whatsappRefObj.sendMessage("Hello, How are you?", "Vidyadhar");
        whatsappRefObj.receiveMessage();
        whatsappRefObj.displayNotification();
    }
}

abstract class MessagingApp {
    abstract void sendMessage(String message, String recipient);
    abstract void receiveMessage();
    abstract void displayNotification();
}

class WhatsApp extends MessagingApp {

    @Override
    void sendMessage(String message, String recipient) {
        // WhatsApp-specific implementation
        System.out.println("WhatsApp Message Sent: \"" + message + "\" to " + recipient);
    }

    @Override
    void receiveMessage() {
        // WhatsApp-specific implementation
        System.out.println("WhatsApp Message Received");
    }

    @Override
    void displayNotification() {
        // WhatsApp-specific implementation
        System.out.println("WhatsApp Notification Displayed");
    }
}

// The output of the above program is shown as below:
/*

WhatsApp Message Sent: "Hello, How are you?" to Vidyadhar
WhatsApp Message Received
WhatsApp Notification Displayed

 */