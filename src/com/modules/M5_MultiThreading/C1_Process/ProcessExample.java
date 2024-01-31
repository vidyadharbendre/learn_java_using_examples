package com.modules.M5_MultiThreading.C1_Process;

import java.io.IOException;

/*
This program demonstrates the use of ProcessBuilder to start a new process that
runs the "ls -l" command (listing files in the current directory).
The program then waits for the process to finish and prints the exit code.
The try-catch block handles potential IOException and InterruptedException during
process execution.
 */

public class ProcessExample {
    public static void main(String[] args) {
        int exitCode;
        try {
            // Run a simple command as a new process
            ProcessBuilder processBuilderRefObj;
            processBuilderRefObj = new ProcessBuilder("ls", "-l");
            Process processRefObj;
            processRefObj = processBuilderRefObj.start();

            // Wait for the process to finish
            exitCode = processRefObj.waitFor();
            System.out.println("Process exited with code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
