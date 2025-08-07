package com.example.lamdaExpressionExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FactorialDemo {
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>(Arrays.asList(5,3,7));
        List<Integer> factorial= myList.stream()
                .map(n-> IntStream.rangeClosed(1,n)
                        .reduce(1,(a,b)->a*b))
                .collect(Collectors.toList());
        System.out.println(factorial);

    }
}
