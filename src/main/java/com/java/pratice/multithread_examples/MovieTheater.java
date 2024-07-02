package com.java.pratice.multithread_examples;

public class MovieTheater {

    private int availableSeats;

    public MovieTheater(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized boolean bookSeat(int numberOfSeats){
        System.out.println(Thread.currentThread().getName()+ " is trying to book" + numberOfSeats + " seats.");
        if(availableSeats >= numberOfSeats){
            System.out.println("Seats Available.Booking starts now...");
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            availableSeats = availableSeats-numberOfSeats;
            System.out.println(Thread.currentThread().getName() + " Successfully booked " + numberOfSeats+ " seats. Remaining Seats: " +availableSeats);
            return true;
        }else{
            System.out.println("Not enough seats are available for " +Thread.currentThread().getName());
            return false;
        }
    }
}
