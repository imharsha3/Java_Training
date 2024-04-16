package com.java.pratice.java8_examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class reverseDoubleList {
    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(11.13, 10.58, 17.13, 99.85, 21.02);


        doubleList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(35, 21, 80, 110, 23, 75);
        integerList.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
        System.out.println("Max:" + integerList.stream().max(Comparator.naturalOrder()).get());

        int[] a = new int[]{2, 8, 5, 1};
        int[] b = new int[]{7, 4, 6, 0};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));

        String s1 = "Cat";
        String s2 = "Acts";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if (s1.equals(s2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }


        String string = "MADAMS";

        Boolean palin = IntStream.range(0, string.length() / 2).noneMatch(i -> string.charAt(i) != string.charAt(string.length() - i - 1));
        if (palin) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
