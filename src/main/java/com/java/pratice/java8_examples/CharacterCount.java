package com.java.pratice.java8_examples;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "java is powerful";
        char targetChar ='z';

        System.out.println("Occurance: "+countOccurances(str,targetChar));
        Map<Character,Long> charCountMap = count(str);

        charCountMap.forEach((character, counter) -> System.out.println(character + ":" + counter));
    }

    public static long countOccurances(String str, char targetChar){

        return str.chars()
                .filter(ch -> ch==targetChar)
                .count();
    }

    public static Map<Character,Long> count(String inputStr){

        return inputStr.chars()
                .mapToObj( c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
