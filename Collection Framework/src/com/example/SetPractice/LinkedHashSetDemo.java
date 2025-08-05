package com.example.SetPractice;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");
        set.add(null);

        System.out.println("Initial LinkedHashSet: " + set);

        System.out.println("Contains 'Python'? " + set.contains("Python"));
        System.out.println("Contains 'Kotlin'? " + set.contains("Kotlin"));


        System.out.println("Size: " + set.size());


        System.out.println("Is empty? " + set.isEmpty());


        set.remove("C++");
        System.out.println("After removing 'C++': " + set);


        System.out.print("Using Iterator: ");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();


        System.out.print("Using for-each: ");
        for (String lang : set) {
            System.out.print(lang + " ");
        }
        System.out.println();

        Object[] arr = set.toArray();
        System.out.print("Using toArray(): ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();


        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Kotlin");
        set2.add("Python"); // Duplicate

        set.addAll(set2);
        System.out.println("After addAll(): " + set);


        LinkedHashSet<String> common = new LinkedHashSet<>();
        common.add("Java");
        common.add("Go");


        set.retainAll(common);
        System.out.println("After retainAll(): " + set);


        set.clear();
        System.out.println("After clear(): " + set);


        set.forEach((n) -> {
            System.out.println(n);
        });

        System.out.println("Is set empty after clear? " + set.isEmpty());
    }
}
