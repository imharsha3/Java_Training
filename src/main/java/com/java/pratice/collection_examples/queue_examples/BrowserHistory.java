package com.java.pratice.collection_examples.queue_examples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Deque<String> backStack = new ArrayDeque<>();
        Deque<String> forwardStack = new ArrayDeque<>();

        String currantPage = "Home";
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Current Page:" +currantPage);
            System.out.println("Commands allowed: exit, forward, backward, visit-url");
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
            if(command.startsWith("visit")){
                String url = command.substring(6);
                backStack.push(currantPage);
                currantPage = url;
                forwardStack.clear();
                System.out.println("Visiting to:"+currantPage);
            }else if(command.equalsIgnoreCase("back")){
                if(!backStack.isEmpty()){
                    forwardStack.push(currantPage);
                    currantPage = backStack.pop();
                    System.out.println("Going back to:" +currantPage);
                }else{
                    System.out.println("No back history available");
                }
            }else if(command.equalsIgnoreCase("forward")){
                if(!forwardStack.isEmpty()){
                    backStack.push(currantPage);
                    currantPage = forwardStack.pop();
                    System.out.println("Going forward to:"+currantPage);
                }else{
                    System.out.println("No forward history available");
                }
            }else{
                System.out.println("Invalid command. Please check the commands");
            }
        }
        scanner.close();
    }
}
