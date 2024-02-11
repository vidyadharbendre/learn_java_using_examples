package com.Modules.M5_MultiThreading.S3_CreateThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class StockPriceTask implements Runnable {
    private String stockSymbol;

    public StockPriceTask(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    @Override
    public void run() {
        // Simulate fetching and processing real-time stock prices
        System.out.println("Fetching stock prices for: " + stockSymbol);
        // Additional stock price processing logic can be added here
    }
}

public class FinancialApplication {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executorServiceRefObj;
        executorServiceRefObj = Executors.newFixedThreadPool(3);

        // Simulate multiple stock symbols to fetch prices for
        String[] stockSymbols = {"AAPL", "GOOGL", "MSFT"};

        // Submit stock price tasks to the thread pool
        for (String stockSymbol : stockSymbols) {
            executorServiceRefObj.submit(new StockPriceTask(stockSymbol));
        }

        // Shut down the thread pool
        executorServiceRefObj.shutdown();
    }
}
// The output of the above program is shown as below
/*
Fetching stock prices for: GOOGL
Fetching stock prices for: AAPL
Fetching stock prices for: MSFT
 */
