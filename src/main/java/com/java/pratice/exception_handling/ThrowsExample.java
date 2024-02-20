package com.java.pratice.exception_handling;

import java.sql.SQLException;

public class ThrowsExample {
    public static void main(String[] args) throws InterruptedException, SQLException {
        Thread.sleep(1000);
        System.out.println("Hello Java");
    }
}
