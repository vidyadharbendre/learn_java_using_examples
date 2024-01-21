package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;

import java.net.MalformedURLException;
import java.net.URL;

public class MailFormedURLExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to create a URL with an invalid URL string
            URL url = new URL("invalid-url");

            // The above line will throw a MalformedURLException,
            // and the code below this line won't be executed.
            System.out.println("URL created successfully.");
        } catch (MalformedURLException e) {
            // Catch and handle the MalformedURLException
            System.out.println("MalformedURLException caught:");
            e.printStackTrace();
        }
    }
}

// The output of the above program is shown as below:
/*
MalformedURLException caught:
java.net.MalformedURLException: no protocol: invalid-url
	at java.base/java.net.URL.<init>(URL.java:772)
	at java.base/java.net.URL.<init>(URL.java:654)
	at java.base/java.net.URL.<init>(URL.java:590)
	at com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn.MailFormedURLExceptionDemo.main(MailFormedURLExceptionDemo.java:10)

 */