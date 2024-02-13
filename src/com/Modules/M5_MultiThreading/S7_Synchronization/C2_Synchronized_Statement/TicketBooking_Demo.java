package com.Modules.M5_MultiThreading.S7_Synchronization.C2_Synchronized_Statement;

/*
The bookTickets() method in the TicketCounter class is modified to use a
synchronized block instead of being a synchronized method.

Inside the synchronized block, the critical section where tickets are
booked is synchronized on the instance of the TicketCounter object.

This ensures that only one thread can access the critical section at a
time, preventing race conditions and ensuring thread safety when booking
tickets.

synchronized block" and "synchronized statement" refer to the same concept in Java.
It's a feature of the language used to achieve thread safety by allowing only one
thread to access a particular block of code or method at a time.

The term "synchronized block" is often used to refer to a block of code synchronized
on a specific object using the synchronized keyword, like this:

synchronized (object) {
    // Synchronized block of code
}

The term "synchronized statement" can also be used interchangeably and refers to the
same construct.
It's essentially a block of code that's synchronized on an object to achieve mutual
exclusion among multiple threads
 */

class TicketCounter {
    private int availableTickets = 25; // Total available tickets

    // Method to book tickets
    public void bookTickets(String passengerName,
                            int numberOfTickets) {
        synchronized (this) { // Synchronized block or Synchronized Statement
            if (availableTickets >= numberOfTickets) {
                // Sufficient tickets available, book tickets
                System.out.println(passengerName + " booked " + numberOfTickets + " ticket(s).");
                availableTickets -= numberOfTickets; // Reduce available tickets
            } else {
                // Insufficient tickets available
                System.out.println(passengerName + " could not book " + numberOfTickets + " ticket(s). Insufficient tickets.");
            }
        }
    }
}

class Passenger extends Thread {
    private TicketCounter ticketCounter;
    private String passengerName;
    private int numberOfTicketsToBook;

    public Passenger(TicketCounter ticketCounter,
                     String passengerName,
                     int numberOfTicketsToBook) {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.numberOfTicketsToBook = numberOfTicketsToBook;
    }

    @Override
    public void run() {
        super.run();
        ticketCounter.bookTickets(passengerName, numberOfTicketsToBook);
    }
}

public class TicketBooking_Demo {
    public static void main(String[] args) {
        TicketCounter ticketCounterRefObj;
        ticketCounterRefObj = new TicketCounter();

        // Creating passenger threads
        Passenger passenger1RefObj;
        passenger1RefObj = new Passenger(ticketCounterRefObj, "Passenger 1", 2);
        Passenger passenger2RefObj;
        passenger2RefObj = new Passenger(ticketCounterRefObj, "Passenger 2", 4);
        Passenger passenger3RefObj;
        passenger3RefObj = new Passenger(ticketCounterRefObj, "Passenger 3", 3);
        Passenger passenger4RefObj;
        passenger4RefObj = new Passenger(ticketCounterRefObj, "Passenger 4", 6);

        // Starting passenger threads
        passenger1RefObj.start();
        passenger2RefObj.start();
        passenger3RefObj.start();
        passenger4RefObj.start();
    }
}

// The output of the above program is shown as below
/*
Passenger 1 booked 2 ticket(s).
Passenger 4 booked 6 ticket(s).
Passenger 2 booked 4 ticket(s).
Passenger 3 booked 3 ticket(s).
 */