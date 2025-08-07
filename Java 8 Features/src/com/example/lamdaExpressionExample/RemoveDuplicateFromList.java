package com.example.lamdaExpressionExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> myarr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5));
       List<Integer> list= myarr.stream()
                .distinct()
                .collect(Collectors.toList());


        System.out.println(list);
    }

}
