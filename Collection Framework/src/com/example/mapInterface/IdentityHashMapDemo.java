package com.example.mapInterface;

import java.util.IdentityHashMap;
//@SuppressWarnings("deprecation")
public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<Integer,String> mymap=new IdentityHashMap<>();
        Integer v1 = new Integer(100); // Deprecated but allowed with warning
        Integer v2 = new Integer(100);


        mymap.put(1,"one");
        mymap.put(2,"two");
        mymap.put(3,"three");
        mymap.put(1,"four");
        mymap.put(v1,"Deepak");
        mymap.put(v2,"Gupta");




        System.out.println(mymap);
    }
}
