/*
In this example, the BankAccount class demonstrates encapsulation by having private attributes (accountNumber and balance) and providing public methods to interact with these attributes (getAccountNumber, getBalance, deposit, withdraw).

accountNumber and balance are kept private, preventing direct access from outside the class.
Getter methods (getAccountNumber and getBalance) allow retrieval of account information.
Methods like deposit and withdraw provide controlled access to modify the balance, performing validations before making changes.
Encapsulation ensures that the internal state of the BankAccount object is secure and accessed only through defined methods, promoting data integrity and controlled manipulation of object properties.
 */
package C0_00_Basics.S3_03_Core_OOPs_Concepts.C1_01_Encapsulation.S3_03_EncapsulationExample;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }
}
