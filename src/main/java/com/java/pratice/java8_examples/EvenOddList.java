package com.java.pratice.java8_examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenOddList {

    public static void main(String[] args) {


        List<Integer> integerList = Arrays.asList(3, 8, 9, 25, 27, 89, 71, 56, 98);
        Map<Boolean, List<Integer>> oddEvenMap = integerList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenMap.entrySet();

        for (Map.Entry<Boolean, List<Integer>> entry : entrySet) {
            System.out.println("________");
            if (entry.getKey()) {
                System.out.println("Even Number");
            } else
                System.out.println("Odd Numbers");

            List<Integer> list = entry.getValue();
            for (int i : list){
                System.out.println(i);
            }

        }
    }
}
