package com.java.pratice.collection_examples.queue_examples;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessagingApp {
    public static void main(String[] args) {
        // Create a Deque to manage messages
        Deque<String> messageQueue = new ArrayDeque<>();

        // Simulate sending messages
        sendMessage(messageQueue, "Hello, how are you?");
        sendMessage(messageQueue, "What are you doing?");
        sendMessage(messageQueue, "Let's meet in sometime.");

        // Simulate receiving and displaying messages
        displayMessages(messageQueue);

        // Send more messages
        sendMessage(messageQueue, "What's for lunch?");
        sendMessage(messageQueue, "See you soon!");

        // Display remaining messages
        displayMessages(messageQueue);
    }

    // Method to send a message (add to the end of the Deque)
    public static void sendMessage(Deque<String> messageQueue, String message) {
        messageQueue.offerLast(message);
        System.out.println("Sent: " + message);
    }

    // Method to display received messages (remove from the front of the Deque)
    public static void displayMessages(Deque<String> messageQueue) {
        System.out.println("\nReceived messages:");
        while (!messageQueue.isEmpty()) {
            String message = messageQueue.pollFirst();
            System.out.println(" - " + message);
        }
        System.out.println();
    }
}