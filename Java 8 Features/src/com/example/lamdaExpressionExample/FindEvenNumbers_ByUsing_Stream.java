package com.example.lamdaExpressionExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers_ByUsing_Stream {
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<>(Arrays.asList(9,11,17,2,26,20));
        myList.stream()
                .filter(n->n%2==0)
                .forEach(n-> System.out.println(n));

    }
}
