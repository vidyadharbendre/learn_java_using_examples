package com.modules.M3_Inheritance.S11_11_Interface.C5_05_Private_InterfaceMethod;




// Interface with a private method
interface DataProcessor {
    default void process(String data) {
        // Call the private processing method
        processDataInternally(data);
    }

    private void processDataInternally(String data) {
        // Private processing implementation
        System.out.println("Processing Data: " + data);
    }
}

// Class implementing the interface
class DataProcessorImpl implements DataProcessor {
    // No need to implement the private method, as it's handled internally
}

public class PrivateMethodInterface {
    public static void main(String[] args) {
        // Creating an instance of DataProcessorImpl
        DataProcessorImpl dataProcessorImpl = new DataProcessorImpl();

        // Using the default method from the interface
        dataProcessorImpl.process("Sample Data");
    }
}
// The output of the above program is shown as below:
/*
Processing Data: Sample Data
 */