package com.Modules.M3_Inheritance.S11_11_Interface.C3_03_Default_Method;

// Interface with a default method
interface Logger {
    void log(String message);

    default void logError(String errorMessage) {
        // Default error logging implementation
        System.err.println("Error: " + errorMessage);
    }
}

// Class implementing the interface
class FileLogger implements Logger {
    @Override
    public void log(String message) {
        // File logging implementation
        System.out.println("Logging to File: " + message);
    }
}

public class DefaultMethodInterface {
    public static void main(String[] args) {
        // Creating an instance of FileLogger
        FileLogger fileLoggerRefObj = new FileLogger();

        // Using methods from the interface
        fileLoggerRefObj.log("logging...");
        fileLoggerRefObj.logError("E108 error message");
    }
}
// The output of the above program is shown as below
/*
Logging to File: logging...
Error: E108 error message
 */