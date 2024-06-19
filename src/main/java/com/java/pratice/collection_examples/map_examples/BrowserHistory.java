package com.java.pratice.collection_examples.map_examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class BrowserHistory {
    public static void main(String[] args) {
        Map<String, String> browserHistory = new LinkedHashMap<>();

        visitPage(browserHistory, "https://google.com");
        visitPage(browserHistory, "https://youtube.com");
        visitPage(browserHistory, "https://amazon.com");

        System.out.println("Browser history:");
        displayHistory(browserHistory);

        visitPage(browserHistory, "https://Abc.com");
        System.out.println("updated Browser history:");
        displayHistory(browserHistory);

        clearHistory(browserHistory);
    }

    public static void visitPage(Map<String, String> history, String url){
        history.put(url, "Visited");
        System.out.println("Visited Page:" +url);
    }
    public static void displayHistory(Map<String, String> history){
        for(String url: history.keySet()){
            System.out.println(url);
        }
    }
    public static void clearHistory(Map<String, String> history){
        history.clear();
        System.out.println("History cleared!!");
    }
}
