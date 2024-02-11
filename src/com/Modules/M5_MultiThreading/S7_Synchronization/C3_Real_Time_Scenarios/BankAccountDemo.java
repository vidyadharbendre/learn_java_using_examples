package com.Modules.M5_MultiThreading.S7_Synchronization.C3_Real_Time_Scenarios;

/*
Mac OS: Use the Option key and the number 4 (Option + 4) to type the rupee symbol (₹).
Windows: Use the Alt code 8377 to type the rupee symbol (₹).
 */
class BankAccount {
    private double balance;

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }

    // Other methods...
}

public class BankAccountDemo {
    static class DepositTask implements Runnable {
        private BankAccount account;
        private double amount;
        private String threadName;

        public DepositTask(BankAccount account, double amount, String threadName) {
            this.account = account;
            this.amount = amount;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                account.deposit(amount);
                System.out.println(threadName + ": Deposited ₹" + amount);
            }
        }
    }

    static class WithdrawTask implements Runnable {
        private BankAccount account;
        private double amount;
        private String threadName;

        public WithdrawTask(BankAccount account, double amount, String threadName) {
            this.account = account;
            this.amount = amount;
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                account.withdraw(amount);
                System.out.println(threadName + ": Withdrew ₹" + amount);
            }
        }
    }

    public static void main(String[] args) {

        // Create multiple threads for deposit and withdrawal

        // Create an instance of BankAccount
        BankAccount account_RefObj;
        account_RefObj = new BankAccount();

        // Create an instance of DepositTask with account_RefObj
        DepositTask depositTask_Instance1_RefObj;
        depositTask_Instance1_RefObj = new DepositTask(account_RefObj, 100, "Deposit Thread 1");

        // Create a Thread object for depositThread1
        Thread depositThread1_RefObj;
        depositThread1_RefObj = new Thread(depositTask_Instance1_RefObj);

        // Create an instance of DepositTask with account_RefObj
        DepositTask depositTask_Instance2_RefObj;
        depositTask_Instance2_RefObj = new DepositTask(account_RefObj, 200, "Deposit Thread 2");

        // Create a Thread object for depositThread1
        Thread depositThread2_RefObj;
        depositThread2_RefObj = new Thread(depositTask_Instance2_RefObj);

        // Create an instance of WithdrawTask with account_RefObj
        WithdrawTask withdrawTask_Instance1_RefObj;
        withdrawTask_Instance1_RefObj = new WithdrawTask(account_RefObj, 150, "Withdraw Thread 1");

        Thread withdrawThread1_RefObj;
        withdrawThread1_RefObj = new Thread(withdrawTask_Instance1_RefObj);

        WithdrawTask withdrawTask_Instance2_RefObj;
        withdrawTask_Instance2_RefObj = new WithdrawTask(account_RefObj, 250, "Withdraw Thread 2");

        Thread withdrawThread2_RefObj;
        withdrawThread2_RefObj = new Thread(withdrawTask_Instance2_RefObj);

        Thread depositThread3 = new Thread(new DepositTask(account_RefObj, 300, "Deposit Thread 3"));
        Thread withdrawThread3 = new Thread(new WithdrawTask(account_RefObj, 350, "Withdraw Thread 3"));

        // Start the threads
        depositThread1_RefObj.start();
        depositThread2_RefObj.start();
        withdrawThread1_RefObj.start();
        withdrawThread2_RefObj.start();

        depositThread3.start();
        withdrawThread3.start();
    }
}

/*
Insufficient funds
Insufficient funds
Deposit Thread 2: Deposited ₹200.0
Withdraw Thread 1: Withdrew ₹150.0
Deposit Thread 1: Deposited ₹100.0
Deposit Thread 1: Deposited ₹100.0
Deposit Thread 1: Deposited ₹100.0
Withdraw Thread 2: Withdrew ₹250.0
Deposit Thread 3: Deposited ₹300.0
Deposit Thread 3: Deposited ₹300.0
Withdraw Thread 3: Withdrew ₹350.0
Withdraw Thread 3: Withdrew ₹350.0
Withdraw Thread 3: Withdrew ₹350.0
Deposit Thread 2: Deposited ₹200.0
Deposit Thread 2: Deposited ₹200.0
Withdraw Thread 1: Withdrew ₹150.0
Withdraw Thread 1: Withdrew ₹150.0
Withdraw Thread 1: Withdrew ₹150.0
Withdraw Thread 1: Withdrew ₹150.0
Deposit Thread 1: Deposited ₹100.0
Withdraw Thread 2: Withdrew ₹250.0
Insufficient funds
Deposit Thread 3: Deposited ₹300.0
Deposit Thread 3: Deposited ₹300.0
Deposit Thread 3: Deposited ₹300.0
Withdraw Thread 3: Withdrew ₹350.0
Withdraw Thread 3: Withdrew ₹350.0
Deposit Thread 2: Deposited ₹200.0
Deposit Thread 2: Deposited ₹200.0
Deposit Thread 1: Deposited ₹100.0
Withdraw Thread 2: Withdrew ₹250.0
Withdraw Thread 2: Withdrew ₹250.0
Withdraw Thread 2: Withdrew ₹250.0

Process finished with exit code 0
 */

/*
In this above example, I have created separate static inner classes
DepositTask and WithdrawTask to represent the tasks of depositing and
withdrawing funds, respectively.

These classes implement the Runnable interface and override the run()
method to perform the respective operations on the BankAccount object.
 */