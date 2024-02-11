package com.Modules.M5_MultiThreading.C1_Process;

import java.io.IOException;

public class JavaVersionProcessExample {
    public static void main(String[] args) {
        int exitCode;
        try {
            // Run a command to get Java version information
            ProcessBuilder processBuilderRefObj;
            processBuilderRefObj = new ProcessBuilder("java", "-version");

            Process processRefObj;
            processRefObj = processBuilderRefObj.start();

            // Wait for the process to finish
            exitCode = processRefObj.waitFor();

            // Print the exit code
            System.out.println("Process exited with code: " + exitCode);

        } catch (IOException | InterruptedException e1) {
            e1.printStackTrace();
        }
    }
}

