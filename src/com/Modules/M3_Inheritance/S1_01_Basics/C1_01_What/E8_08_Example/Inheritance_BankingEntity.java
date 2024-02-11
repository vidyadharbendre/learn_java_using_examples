package com.Modules.M3_Inheritance.S1_01_Basics.C1_01_What.E8_08_Example;


// Example usage
public class Inheritance_BankingEntity {
    public static void main(String[] args) {
        SavingsAccount savingsObj;
        savingsObj = new SavingsAccount(5000, 0.05);
        CheckingAccount checkingObj;
        checkingObj = new CheckingAccount(3000, 1000);
        InvestmentAccount investmentObj;
        investmentObj = new InvestmentAccount(10000, "Stocks");

        savingsObj.deposit(1000);
        savingsObj.withdraw(500);

        System.out.println("Savings Account Interest Rate: " + savingsObj.getInterestRate());
        System.out.println();

        checkingObj.deposit(500);
        checkingObj.withdraw(200);

        System.out.println("Checking Account Transaction Limit: " + checkingObj.getTransactionLimit());
        System.out.println();

        investmentObj.deposit(2000);
        investmentObj.withdraw(1000);

        System.out.println("Investment Account Type: " + investmentObj.getInvestmentType());
    }
}

// Account superclass
class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

// SavingsAccount subclass
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Additional methods or functionalities specific to SavingsAccount can be added here
}

// CheckingAccount subclass
class CheckingAccount extends Account {
    private double transactionLimit;

    public CheckingAccount(double balance, double transactionLimit) {
        super(balance);
        this.transactionLimit = transactionLimit;
    }

    public double getTransactionLimit() {
        return transactionLimit;
    }

    // Additional methods or functionalities specific to CheckingAccount can be added here
}

// InvestmentAccount subclass
class InvestmentAccount extends Account {
    private String investmentType;

    public InvestmentAccount(double balance, String investmentType) {
        super(balance);
        this.investmentType = investmentType;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    // Additional methods or functionalities specific to InvestmentAccount can be added here
}

// The output of the above program is shown as below:
/*
Deposited: 1000.0
Current balance: 6000.0
Withdrawn: 500.0
Current balance: 5500.0
Savings Account Interest Rate: 0.05

Deposited: 500.0
Current balance: 3500.0
Withdrawn: 200.0
Current balance: 3300.0
Checking Account Transaction Limit: 1000.0

Deposited: 2000.0
Current balance: 12000.0
Withdrawn: 1000.0
Current balance: 11000.0
Investment Account Type: Stocks
 */
