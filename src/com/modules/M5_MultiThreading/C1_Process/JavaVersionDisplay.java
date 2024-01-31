package com.modules.M5_MultiThreading.C1_Process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaVersionDisplay {
    public static void main(String[] args) {
        int exitCode;
        String line;
        try {
            // Run a command to get Java version information
            ProcessBuilder processBuilderRefObj;
            processBuilderRefObj = new ProcessBuilder("java", "-version");
            Process processRefObj;
            processRefObj = processBuilderRefObj.start();

            // Capture the output and error streams of the process
            BufferedReader stdInputRefObj;
            stdInputRefObj = new BufferedReader(new InputStreamReader(processRefObj.getInputStream()));
            BufferedReader stdErrorRefObj;
            stdErrorRefObj = new BufferedReader(new InputStreamReader(processRefObj.getErrorStream()));

            // Print the standard output
            System.out.println("Standard Output:");
            while ((line = stdInputRefObj.readLine()) != null) {
                System.out.println(line);
            }

            // Print the standard error
            System.out.println("\nStandard Error:");
            while ((line = stdErrorRefObj.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the process to finish
            exitCode = processRefObj.waitFor();

            // Print the exit code
            System.out.println("\nProcess exited with code: " + exitCode);

        } catch (IOException | InterruptedException e1) {
            e1.printStackTrace();
        }
    }
}

// The output of the above program is shown as below
/*
Standard Output:

Standard Error:
java version "21.0.1" 2023-10-17 LTS
Java(TM) SE Runtime Environment (build 21.0.1+12-LTS-29)
Java HotSpot(TM) 64-Bit Server VM (build 21.0.1+12-LTS-29, mixed mode, sharing)

Process exited with code: 0
 */