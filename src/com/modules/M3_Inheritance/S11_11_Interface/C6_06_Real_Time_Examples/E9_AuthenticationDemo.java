package com.modules.M3_Inheritance.S11_11_Interface.C6_06_Real_Time_Examples;

// Authenticatable interface
interface Authenticatable {
    boolean authenticate(String username, String password);
}

// Concrete classes implementing the Authenticatable interface
class UserManager implements Authenticatable {
    @Override
    public boolean authenticate(String username, String password) {
        // Authentication logic for user management
        return true;
    }
}

class PaymentGateway implements Authenticatable {
    @Override
    public boolean authenticate(String username, String password) {
        // Authentication logic for payment gateway
        return false;
    }
}

// Usage
public class E9_AuthenticationDemo {
    public static void main(String[] args) {
        boolean userAuth, paymentAuth;

        Authenticatable userManagerRefObj;
        userManagerRefObj = new UserManager();
        Authenticatable paymentGatewayRefObj;
        paymentGatewayRefObj = new PaymentGateway();

        userAuth = userManagerRefObj.authenticate("john_doe", "pass123");
        paymentAuth = paymentGatewayRefObj.authenticate("admin", "admin123");

        System.out.println("User Authentication: " + userAuth);
        System.out.println("Payment Gateway Authentication: " + paymentAuth);
    }
}

// The output of the above
/*
User Authentication: true
Payment Gateway Authentication: false
 */