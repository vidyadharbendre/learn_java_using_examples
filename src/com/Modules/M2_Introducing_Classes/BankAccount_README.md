# BankAccount Class

The `BankAccount` class, located in the `modules.M2_Introducing_Classes` package, represents a simple model of a bank account in Java, showcasing the basic functionalities of depositing, withdrawing, and displaying account information.

### Purpose

- **Identity:** Each `BankAccount` object is uniquely identified by an account number (`accountNumber`).
- **State:** Attributes like `balance` and `accountHolder` represent the state of the account.
- **Behavior:** Methods allow for deposits, withdrawals, and displaying account information.

### Usage

#### `BankAccount` Class Structure

- `BankAccount(String accountNumber, String accountHolder)`: Constructor to initialize a new bank account with an account number and account holder's name.
- `deposit(double amount)`: Method to deposit funds into the account.
- `withdraw(double amount)`: Method to withdraw funds from the account.
- `displayAccountInfo()`: Method to display account information.

#### Sample Usage

```java
package modules.M2_Introducing_Classes;

public class BankAccount {
    //... (existing class code)

    public static void main(String[] args) {
        // Creating BankAccount objects
        BankAccount account1Obj = new BankAccount("A123456", "Atharva");
        BankAccount account2Obj = new BankAccount("B789012", "Akshara");

        // Performing transactions
        account1Obj.deposit(1000);
        account2Obj.deposit(500);
        account1Obj.withdraw(300);
        account2Obj.withdraw(1000); // Attempting withdrawal with insufficient funds

        // Displaying account information
        account1Obj.displayAccountInfo();
        account2Obj.displayAccountInfo();
    }
}
```
### Example Output
The provided code snippet demonstrates the usage of BankAccount class methods and displays the resulting account information.

## How to Use
- 1. Clone or download the Java file (BankAccount.java) containing the BankAccount class.
- 2. Place the Java file in the appropriate package directory (modules/M2_Introducing_Classes/).
- 3. Incorporate the BankAccount class into your Java project within the specified package.
- 4. Use the BankAccount class methods as demonstrated in the sample usage to perform transactions and manage accounts.
