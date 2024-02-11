package modules.M2_Introducing_Classes;

public class BankAccount {
    // Identity: Unique account number defines the identity of each account
    private String accountNumber;

    // State attributes: Represents the state of the account
    private double balance;
    private String accountHolder;

    // Constructor to initialize BankAccount objects
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0; // Initializing balance to zero for new accounts
    }

    // Method to deposit money and update balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money and update balance
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber +
                ", Account Holder: " + accountHolder +
                ", Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Creating two objects (instances) of the BankAccount class
        BankAccount account1Obj;
        account1Obj = new BankAccount("A123456", "Atharva");
        BankAccount account2Obj;
        account2Obj = new BankAccount("B789012", "Akshara");

        // Performing transactions and displaying account info
        account1Obj.deposit(1000);
        account1Obj.displayAccountInfo(); // Output for account1 after deposit

        account2Obj.deposit(500);
        account2Obj.displayAccountInfo(); // Output for account2 after deposit

        account1Obj.withdraw(300);
        account1Obj.displayAccountInfo(); // Output for account1 after withdrawal

        account2Obj.withdraw(1000); // Attempting withdrawal with insufficient funds
        account2Obj.displayAccountInfo(); // Output for account2 after attempted withdrawal
    }
}


// The output of the above program is shown below

/*
Deposit of $1000.0 successful.
Account Number: A123456, Account Holder: Alice, Balance: $1000.0
Deposit of $500.0 successful.
Account Number: B789012, Account Holder: Bob, Balance: $500.0
Withdrawal of $300.0 successful.
Account Number: A123456, Account Holder: Alice, Balance: $700.0
Insufficient funds or invalid withdrawal amount.
Account Number: B789012, Account Holder: Bob, Balance: $500.0
 */



