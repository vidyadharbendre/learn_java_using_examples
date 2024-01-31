package com.modules.M5_MultiThreading.C1_Process;

import java.io.IOException;

public class RunTimeProcessExample {
    public static void main(String[] args) {
        int exitCode;
        try {
            // Get the runtime object
            Runtime runtimeRefObj;
            runtimeRefObj = Runtime.getRuntime();

            // Run a command to get Java version information
            Process processRefObj;
            processRefObj = runtimeRefObj.exec("java -version");

            // Wait for the process to finish
            exitCode = processRefObj.waitFor();

            // Print the exit code
            System.out.println("Process exited with code: " + exitCode);

        } catch (IOException | InterruptedException e1) {
            e1.printStackTrace();
        }
    }
}
