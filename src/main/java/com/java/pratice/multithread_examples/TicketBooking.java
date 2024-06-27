package com.java.pratice.multithread_examples;

public class TicketBooking implements Runnable{
    private static  int availableTickets = 10;
    private String userType;

    public TicketBooking(String userType) {
        this.userType = userType;
    }

    @Override
    public void run() {
        while (availableTickets > 0){
            bookTicket();
        }
    }

    private synchronized void bookTicket(){
        if(availableTickets > 0){
            System.out.println(userType + "booked 1 ticket. Ticket left"+ --availableTickets);
        }
        else {
            System.out.println("No tickets left. We are House full");
        }
    }
}
