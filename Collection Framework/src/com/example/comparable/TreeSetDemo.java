package com.example.comparable;

import java.util.Comparator;
import java.util.TreeSet;

class mySorting implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2= (Integer) o2;
        //        if(i1<i2){
//            return +1;
//        }
//        else if(i1>i2){
//            return  -1;
//        }
//        else {
//            return  0;
//        }
        return - i1.compareTo(i2);
    }
}




public class TreeSetDemo  {

    public static void main(String[] args) {

        TreeSet t=new TreeSet(new mySorting());
        t.add(70);
        t.add(60);
        t.add(11);
        t.add(18);
        System.out.println(t);
    }
}
