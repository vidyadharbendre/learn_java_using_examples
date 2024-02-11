package com.Modules.M5_MultiThreading.S5_Using_IsAlive_join;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class UserRequestTask implements Runnable {
    private String username;
    public UserRequestTask(String username) {
        this.username = username;
    }
    @Override
    public void run() {
        // Simulate processing of user request
        System.out.println("Processing user request for: " + username);
        // Additional business logic can be added here
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executorServiceRefObj;
        executorServiceRefObj = Executors.newFixedThreadPool(5);

        // Simulate multiple user requests
        for (int i = 1; i <= 10; i++) {
            String username = "User" + i;
            // Submit tasks to the thread pool
            executorServiceRefObj.submit(new UserRequestTask(username));
        }

        // Shut down the thread pool
        executorServiceRefObj.shutdown();
    }
}

// The output of the above program is shown as below
/*
Processing user request for: User4
Processing user request for: User3
Processing user request for: User2
Processing user request for: User1
Processing user request for: User5
Processing user request for: User10
Processing user request for: User6
Processing user request for: User7
Processing user request for: User8
Processing user request for: User9
 */
