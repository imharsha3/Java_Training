package com.java.pratice.multithread_examples;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater(10);

        Thread user1 = new Thread(new BookingTicketTask(theater, 5), "User-1");
        Thread user2 = new Thread(new BookingTicketTask(theater, 4), "User-2");
        Thread user3 = new Thread(new BookingTicketTask(theater, 3), "User-3");

        user1.start();
        user2.start();
        user3.start();
    }
}
