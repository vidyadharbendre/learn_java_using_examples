package com.Model_Questions_and_Answers.ISA_1.ModelQuestionsAnswers.Set3.Ten;

public class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor to initialize account number and initial balance
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating an instance of BankAccount with account number and initial balance
        BankAccount accountObj;
        accountObj = new BankAccount(123456789, 1000.0);

        // Displaying initial account details
        System.out.println("Initial Account Details:");
        accountObj.displayAccountDetails();

        // Depositing funds
        accountObj.deposit(500.0);

        // Displaying updated account details
        System.out.println("\nUpdated Account Details:");
        accountObj.displayAccountDetails();
    }
}

// The output of the above program is shown as below:
/*
Initial Account Details:
Account Number: 123456789
Balance: 1000.0
Deposited: 500.0

Updated Account Details:
Account Number: 123456789
Balance: 1500.0
 */
