package com.modules.M3_Inheritance.S11_11_Interface.C6_06_Real_Time_Examples;

// Loggable interface
interface Loggable {
    void logInfo(String message);

    void logError(String message);
}

// Concrete classes implementing the Loggable interface
class DatabaseService implements Loggable {
    @Override
    public void logInfo(String message) {
        System.out.println("DatabaseService: " + message);
    }

    @Override
    public void logError(String message) {
        System.out.println("DatabaseService Error: " + message);
    }
}

class PaymentProcessor implements Loggable {
    @Override
    public void logInfo(String message) {
        System.out.println("PaymentProcessor: " + message);
    }

    @Override
    public void logError(String message) {
        System.out.println("PaymentProcessor Error: " + message);
    }
}

// Usage
public class E7_LoggingDemo {
    public static void main(String[] args) {
        Loggable databaseServiceRefObj;
        databaseServiceRefObj = new DatabaseService();

        Loggable paymentProcessorRefObj;
        paymentProcessorRefObj = new PaymentProcessor();

        databaseServiceRefObj.logInfo("Connecting to the database");
        paymentProcessorRefObj.logError("Payment failed");
    }
}

// The output of the above program is shown as below
/*
DatabaseService: Connecting to the database
PaymentProcessor Error: Payment failed
 */
