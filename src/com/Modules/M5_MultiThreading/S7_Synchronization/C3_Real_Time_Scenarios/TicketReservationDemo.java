package com.Modules.M5_MultiThreading.S7_Synchronization.C3_Real_Time_Scenarios;

class TicketReservationSystem {
    private int availableSeats = 50;

    public void bookTicket(String user, int seatsToBook) {
        synchronized (this) {
            if (seatsToBook <= availableSeats) {
                System.out.println(user + " is booking " + seatsToBook + " seats.");
                availableSeats -= seatsToBook;
                System.out.println("Booking successful. Remaining seats: " + availableSeats);
            } else {
                System.out.println("Sorry, " + user + ". Not enough seats available.");
            }
        }
    }
}

class User1 implements Runnable {
    private TicketReservationSystem reservationSystem;

    public User1(TicketReservationSystem reservationSystem) {
        this.reservationSystem = reservationSystem;
    }

    @Override
    public void run() {
        reservationSystem.bookTicket("User1", 3);
    }
}

class User2 implements Runnable {
    private TicketReservationSystem reservationSystem;

    public User2(TicketReservationSystem reservationSystem) {
        this.reservationSystem = reservationSystem;
    }

    @Override
    public void run() {
        reservationSystem.bookTicket("User2", 5);
    }
}

class User3 implements Runnable {
    private TicketReservationSystem reservationSystem;

    public User3(TicketReservationSystem reservationSystem) {
        this.reservationSystem = reservationSystem;
    }

    @Override
    public void run() {
        reservationSystem.bookTicket("User3", 2);
    }
}

class User4 implements Runnable {
    private TicketReservationSystem reservationSystem;

    public User4(TicketReservationSystem reservationSystem) {
        this.reservationSystem = reservationSystem;
    }

    @Override
    public void run() {
        reservationSystem.bookTicket("User4", 4);
    }
}

public class TicketReservationDemo {
    public static void main(String[] args) {

        // Create threads for booking tickets for each user

        // Create an instance of TicketReservationSystem
        TicketReservationSystem reservationSystem_RefObj;
        reservationSystem_RefObj = new TicketReservationSystem();

        // Create an instance of User1 with reservationSystemRefObj
        User1 user1Instance_RefObj;
        user1Instance_RefObj = new User1(reservationSystem_RefObj);

        // Create a Thread object for User1
        Thread user1_RefObj;
        user1_RefObj = new Thread(user1Instance_RefObj);

        User2 user2Instance_RefObj;
        user2Instance_RefObj = new User2(reservationSystem_RefObj);

        Thread user2_RefObj;
        user2_RefObj = new Thread(user2Instance_RefObj);

        User3 user3Instance_RefObj;
        user3Instance_RefObj = new User3(reservationSystem_RefObj);

        Thread user3_RefObj;
        user3_RefObj = new Thread(user3Instance_RefObj);

        User4 user4Instance_RefObj;
        user4Instance_RefObj = new User4(reservationSystem_RefObj);

        Thread user4_RefObj;
        user4_RefObj = new Thread(user3Instance_RefObj);


        // Start the threads
        user1_RefObj.start();
        user2_RefObj.start();
        user3_RefObj.start();
        user4_RefObj.start();
    }
}

/*
User1 is booking 3 seats.
Booking successful. Remaining seats: 47
User3 is booking 2 seats.
Booking successful. Remaining seats: 45
User3 is booking 2 seats.
Booking successful. Remaining seats: 43
User2 is booking 5 seats.
Booking successful. Remaining seats: 38

Process finished with exit code 0
*/


/*
The synchronized (this) statement creates a synchronized block that locks on the current instance of the TicketReservationSystem class. Only one thread can execute the code inside this synchronized block at a time for a given instance of TicketReservationSystem. This ensures that concurrent access to the critical section (where the availableSeats variable is being updated) is properly synchronized, preventing race conditions and ensuring data consistency.

Therefore, the usage of synchronized block (synchronized (this)) demonstrates the synchronized statement, which allows more fine-grained control over synchronization compared to synchronizing entire methods.
*/