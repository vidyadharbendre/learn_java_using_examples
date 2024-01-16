package com.modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C5_05_Real_Time_Examples;

public class E5_Banking_System {
    public static void main(String[] args) {
        SavingsAccount savingsAccountRefObj;
        savingsAccountRefObj = new SavingsAccount();

        savingsAccountRefObj.deposit(10000);
        savingsAccountRefObj.withdraw(1);
        savingsAccountRefObj.displayBalance();


    }
}


abstract class BankAccount{
    double balance;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void displayBalance();

}

class SavingsAccount extends BankAccount{

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited + "+ amount + "Current Balance : "+ balance);

    }

    @Override
    void withdraw(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". Current balance is : "+ balance);
        }
        else {
            System.out.println(" Insufficient Funds");
        }
    }

    @Override
    void displayBalance() {
        System.out.println(" Current balance in Savings account is : "+ balance);
    }
}

// The output of the above program is shown as below:

/*

Deposited + 10000.0Current Balance : 10000.0
Withdrawn 1.0. Current balance is : 9999.0
 Current balance in Savings account is : 9999.0

 */