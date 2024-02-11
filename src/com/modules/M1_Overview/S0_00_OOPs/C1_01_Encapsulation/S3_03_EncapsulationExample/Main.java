package com.modules.M1_Overview.S0_00_OOPs.C1_01_Encapsulation.S3_03_EncapsulationExample;

public class Main {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount myAccountObj;
        myAccountObj = new BankAccount("1234567890", 1000.0);

        // Retrieving account information
        System.out.println("Account Number: " + myAccountObj.getAccountNumber());
        System.out.println("Current Balance: ₹" + myAccountObj.getBalance());

        // Depositing money
        myAccountObj.deposit(500.0);
        System.out.println("Current Balance after deposit: ₹" + myAccountObj.getBalance());

        // Withdrawal attempt
        myAccountObj.withdraw(200.0);
        System.out.println("Current Balance after withdrawal: ₹" + myAccountObj.getBalance());

        // Attempting to withdraw more than the available balance
        myAccountObj.withdraw(2000.0);
        System.out.println("Final Balance: ₹" + myAccountObj.getBalance());
    }
}

// The output of the above program is shown as below
/*
Account Number: 1234567890
Current Balance: ₹1000.0
500.0 deposited successfully.
Current Balance after deposit: ₹1500.0
200.0 withdrawn successfully.
Current Balance after withdrawal: ₹1300.0
Insufficient balance or invalid amount for withdrawal.
Final Balance: ₹1300.0
 */