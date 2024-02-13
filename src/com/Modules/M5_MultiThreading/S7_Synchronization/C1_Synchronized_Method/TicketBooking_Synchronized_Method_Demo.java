package com.Modules.M5_MultiThreading.S7_Synchronization.C1_Synchronized_Method;

/*
Using synchronized method:

Each thread that invokes the bookTickets method acquires the lock
associated with the TicketCounter object, preventing other threads from
executing the method until the lock is released.

This ensures that only one passenger can book tickets at a time,
regardless of the number of tickets they want to book.

Therefore, the output will show the booking process of each passenger
sequentially, with no concurrency between them.
*/

class TicketCounter {
    private int availableTickets = 15; // Total available tickets

    // Synchronized method to book tickets
    public synchronized void bookTickets(String passengerName,
                                         int numberOfTickets) {
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

class Passenger extends Thread {
    private TicketCounter ticketCounter;
    private String passengerName;
    private int numberOfTicketsToBook;

    public Passenger(TicketCounter ticketCounter, String passengerName, int numberOfTicketsToBook) {
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

public class TicketBooking_Synchronized_Method_Demo {
    public static void main(String[] args) {
        TicketCounter ticketCounterRefObj;
        ticketCounterRefObj = new TicketCounter();

        // Creating passenger threads
        Passenger passenger1RefObj;
        passenger1RefObj = new Passenger(ticketCounterRefObj, "Passenger 1", 2);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Passenger passenger2RefObj;
        passenger2RefObj = new Passenger(ticketCounterRefObj, "Passenger 2", 4);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Passenger passenger3RefObj;
        passenger3RefObj = new Passenger(ticketCounterRefObj, "Passenger 3", 3);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Passenger passenger4RefObj;
        passenger4RefObj = new Passenger(ticketCounterRefObj, "Passenger 4", 6);

        Passenger passenger5RefObj;
        passenger5RefObj = new Passenger(ticketCounterRefObj, "Passenger 5", 4);

        // Starting passenger threads
        passenger1RefObj.start();
        passenger2RefObj.start();
        passenger3RefObj.start();
        passenger4RefObj.start();
        passenger5RefObj.start();
    }
}

// The output of the above program is shown as below
/*
Passenger 1 booked 2 ticket(s).
Passenger 5 booked 4 ticket(s).
Passenger 4 booked 6 ticket(s).
Passenger 2 could not book 4 ticket(s). Insufficient tickets.
Passenger 3 booked 3 ticket(s).
 */

/*
The output of both examples will be similar, as both ensure that only one
thread can access the critical section (the bookTickets method) at a time.

However, the way synchronization is achieved differs between the two
examples:

Using synchronized method:

Each thread that invokes the bookTickets method acquires the lock
associated with the TicketCounter object, preventing other threads from
executing the method until the lock is released.

This ensures that only one passenger can book tickets at a time, regardless
of the number of tickets they want to book.
Therefore, the output will show the booking process of each passenger
sequentially, with no concurrency between them.

Using synchronized block:

The critical section of the bookTickets method is synchronized on the
TicketCounter object using a synchronized block.
Each thread that enters the synchronized block acquires the lock on the
TicketCounter object, preventing other threads from executing the critical
section until the lock is released.

As a result, only one thread can execute the critical section at a time,
ensuring thread safety.

Therefore, the output will also show the booking process of each passenger
sequentially, with no concurrency between them.

The primary difference is that with synchronized block, you have more flexibility
in controlling the scope of synchronization.
 */