package com.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListAverage {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("The average is: " + average);
    	
    	//Stream.generate(()->"Hello").forEach(System.out.println());
    }
}