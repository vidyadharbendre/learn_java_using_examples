package C0_00_Basics.S3_03_Core_OOPs_Concepts.C1_01_Encapsulation.S3_03_EncapsulationExample;

public class Main {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount myAccountObj;
        myAccountObj = new BankAccount("1234567890", 1000.0);

        // Retrieving account information
        System.out.println("Account Number: " + myAccountObj.getAccountNumber());
        System.out.println("Current Balance: $" + myAccountObj.getBalance());

        // Depositing money
        myAccountObj.deposit(500.0);
        System.out.println("Current Balance after deposit: $" + myAccountObj.getBalance());

        // Withdrawal attempt
        myAccountObj.withdraw(200.0);
        System.out.println("Current Balance after withdrawal: $" + myAccountObj.getBalance());

        // Attempting to withdraw more than the available balance
        myAccountObj.withdraw(2000.0);
        System.out.println("Final Balance: $" + myAccountObj.getBalance());
    }
}
