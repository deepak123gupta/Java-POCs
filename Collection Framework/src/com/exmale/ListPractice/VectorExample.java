package com.exmale.ListPractice;

import java.util.Arrays;
import java.util.Vector;

public class VectorExample {



    public static void main(String[] args) {
   Vector<String> v =new Vector<>();
   Vector<String> v1=new Vector<>(Arrays.asList("Deepak1","XYZ"));
   v.add("Deepak");
   v.add("XYZ");
   v.add("LFG");
   v.addAll(v1);
        System.out.println(v);


    }
}
