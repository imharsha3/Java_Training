package com.java.pratice.multithread_examples;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Runnable vipBooking = new TicketBooking("VIP User");
        Runnable regularBooking = new TicketBooking("Regular User");

        Thread vipThread1 = new Thread(vipBooking);
        Thread vipThread2 = new Thread(vipBooking);

        Thread regularThread1 = new Thread(regularBooking);
        Thread regularThread2 = new Thread(regularBooking);

        vipThread1.setPriority(Thread.MAX_PRIORITY);
        vipThread2.setPriority(10);

        regularThread1.setPriority(Thread.MIN_PRIORITY);
        regularThread2.setPriority(1);

        vipThread1.start();
        vipThread2.start();
        regularThread1.start();
        regularThread2.start();
    }
}
