package com.Modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class UnKnownHostExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to get InetAddress for an unknown host
            InetAddress address = InetAddress.getByName("unknown-host");

            // The above line will throw an UnknownHostException,
            // and the code below this line won't be executed.
            System.out.println("InetAddress retrieved successfully: " + address);
        } catch (UnknownHostException e) {
            // Catch and handle the UnknownHostException
            System.out.println("UnknownHostException caught:");
            e.printStackTrace();
        }
    }
}

/*
In this program:

We attempt to get the InetAddress for a host with the name "unknown-host," which is an unknown host.
The attempt to get the InetAddress will throw an UnknownHostException.
We use a try-catch block to catch the UnknownHostException and print a message indicating that the exception was caught. The e.printStackTrace() prints the stack trace of the exception, providing detailed information about the error.

The output of the above program is shown as below
UnknownHostException caught:
java.net.UnknownHostException: unknown-host: nodename nor servname provided, or not known
	at java.base/java.net.Inet6AddressImpl.lookupAllHostAddr(Native Method)
	at java.base/java.net.Inet6AddressImpl.lookupAllHostAddr(Inet6AddressImpl.java:52)
	at java.base/java.net.InetAddress$PlatformResolver.lookupByName(InetAddress.java:1211)
	at java.base/java.net.InetAddress.getAddressesFromNameService(InetAddress.java:1828)
	at java.base/java.net.InetAddress$NameServiceAddresses.get(InetAddress.java:1139)
	at java.base/java.net.InetAddress.getAllByName0(InetAddress.java:1818)
	at java.base/java.net.InetAddress.getAllByName(InetAddress.java:1688)
	at java.base/java.net.InetAddress.getByName(InetAddress.java:1568)
	at com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S01_BuiltIn.UnKnownHostExceptionDemo.main(UnKnownHostExceptionDemo.java:10)

 */
