package com.Modules.M5_MultiThreading.S4_CreateMultipleThreads;

/*
1. Develop a JAVA program to add TWO matrices of suitable order N (The value of N should be read from
command line arguments).

 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SimulationTask implements Runnable {
    private int taskId;

    public SimulationTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        // Simulate complex calculations for scientific simulation
        System.out.println("Performing calculation for task ID: " + taskId);
        // Additional computation logic can be added here
    }
}

public class ScientificSimulation {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executorServiceRefObj;
        executorServiceRefObj = Executors.newFixedThreadPool(8);

        // Simulate multiple tasks for parallel processing
        for (int i = 1; i <= 10; i++) {
            // Submit tasks to the thread pool
            executorServiceRefObj.submit(new SimulationTask(i));
        }

        // Shut down the thread pool
        executorServiceRefObj.shutdown();
    }
}

// The output of the above program is shown as below
/*
Performing calculation for task ID: 8
Performing calculation for task ID: 5
Performing calculation for task ID: 1
Performing calculation for task ID: 7
Performing calculation for task ID: 3
Performing calculation for task ID: 2
Performing calculation for task ID: 4
Performing calculation for task ID: 6
Performing calculation for task ID: 9
Performing calculation for task ID: 10
 */