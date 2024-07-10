package com.java.pratice.java8_examples;

import java.util.Arrays;
import java.util.List;

public class OrderingSystem {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
               new Order("1", "Java",2500.50),
               new Order("2","AWS",1500.75),
               new Order("3","Phyton",1000.60)
        );
        System.out.println("Order details:");
        orders.forEach(System.out::println);

        final double[] totalAmount = {0.0};
        orders.forEach(order -> totalAmount[0] = totalAmount[0] +order.getAmount());
        System.out.println("Total order value:" +totalAmount[0]);
    }
}
