package com.example.lamdaExpressionExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StramApiExample {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(31);
        Stream<Integer> stream = l.stream();
        Stream<Integer> newStream = stream.sorted();
        Stream<Integer> modifiedStream = newStream.map(n -> n * 2);
        modifiedStream.forEach((n) -> {
            //System.out.println(n);
        });

        //we can do whole things in one line

        //For filter() methods
        //Just for Practice
        Predicate<Integer> pred = (n -> n % 2 == 0);


//        l.stream()
//                .filter(n->n%2==0)
//                .sorted()
//                .map(n->n*2)
//                .forEach(n-> System.out.println(n));
//
//
//    }

        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(16);
        l1.add(18);
        l1.add(20);

        Integer res = l1.stream().
                reduce(0, (a, b) -> a + b);
        System.out.println(res);


//    Stream<Integer> newStream=l1.stream();


//
    }
}