package com.java.pratice.java8_examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Java", "AWS", "Phyton", "Java", "C","AWS");

        System.out.println(stringList.stream().distinct().collect(Collectors.toList()));

        Map<String,Long> countMap = stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countMap);
    }
}
