package com.java.pratice.java8_examples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaExample {

    public static void main(String[] args) {


        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
        Stream<Integer> arrayStream = Stream.of(new Integer[]{1, 2, 3, 4});

        int[] array = new int[]{2, 4, 6, 8};
        IntStream intStream = Arrays.stream(array);

        Map<Integer, String> mapEx = new HashMap<>();
        mapEx.put(1, "Java");
        mapEx.put(2,"AWS");
        mapEx.put(3,"C++");

        Stream<Map.Entry<Integer,String>> streamMap = convertMapToStream(mapEx);
        System.out.println("Map Stream" + Arrays.toString(streamMap.toArray()));

        List<String> stringList = Arrays.asList("abc","bca","","acd","","jk","c");

        long emptyStrCount = stringList.stream().filter(s -> s.isEmpty()).count();
        System.out.println("Empty String count"+emptyStrCount);

        long lengthStr = stringList.stream().filter(s -> s.length()>3).count();
        System.out.println("String count which are having length "+lengthStr);

        long countOfA = stringList.stream().filter(s -> s.startsWith("a")).count();
        System.out.println(countOfA);

        List<String> filtered = stringList.stream().filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println("List without empty strings" +filtered);

        List<String> upperString = stringList.stream().map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Upper case List"+upperString);

        String str = stringList.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(str);

        List<Integer> numbers = Arrays.asList(2,3,5,3,6,7,9);

        List<Integer> distinctSquareNum = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println("Distinct Sqaure:"+distinctSquareNum);

        int min = numbers.stream().min(Integer::compareTo).orElse(0);
        int max = numbers.stream().max(Integer::compareTo).orElse(0);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Min:"+min + "Max:"+max + "SUM:"+sum + "Average:"+avg);


        String str1 = " Java is Powerful language is easy to learn";
    }

    public static <K,V> Stream<Map.Entry<K,V>> convertMapToStream(Map<K,V> map){

        return map
                .entrySet().stream();
    }
}
