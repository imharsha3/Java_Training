package com.java.pratice.multithread_examples;

public class BookingTicketTask implements Runnable{
    private MovieTheater movieTheater;
    private int seatsToBook;

    public BookingTicketTask(MovieTheater movieTheater, int seatsToBook) {
        this.movieTheater = movieTheater;
        this.seatsToBook = seatsToBook;
    }

    @Override
    public void run() {
       movieTheater.bookSeat(seatsToBook);
    }
}
