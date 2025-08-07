package com.example.lamdaExpressionExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FactorialEachElement {
    public static void main(String[] args) {
        

        List<Integer> numbers = List.of(3, 4, 5);


        List<Integer> factorials = numbers.stream()
            .map(n -> 
                // For each number `n`, create a stream from 1 to n and reduce it by multiplying
                IntStream.rangeClosed(1, n)  // creates a stream of numbers [1, 2, ..., n]
                         .reduce(1, (a, b) -> a * b)  // multiplies all values: factorial
            )
            .collect(Collectors.toList());  // collect the result into a List

        // ✅ Step 3: Display original numbers and their corresponding factorials
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Factorial of " + numbers.get(i) + " = " + factorials.get(i));
        }
    }
}
