package com.collections;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountRepeatChars {
    public static void main(String[] args) {
        String str = "Kuladeep";

        Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Repeated characters:");
        charCount.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}