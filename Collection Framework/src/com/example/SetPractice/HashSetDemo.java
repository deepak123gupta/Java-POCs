package com.example.SetPractice;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Deepak");
        names.add("Ravi");
        names.add("Amit");
        names.add("Deepak"); // Duplicate, won't be added

        System.out.println("HashSet after add(): " + names);

        System.out.println("Contains 'Ravi'? " + names.contains("Ravi"));
        System.out.println("Contains 'Manish'? " + names.contains("Manish"));

        System.out.println("Size of HashSet: " + names.size());

        System.out.println("Is HashSet empty? " + names.isEmpty());

        names.remove("Amit");
        System.out.println("After removing 'Amit': " + names);

        System.out.print("Using Iterator: ");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


        System.out.print("Using for-each loop: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();


        Object[] nameArray = names.toArray();
        System.out.print("Using toArray(): ");
        for (Object obj : nameArray) {
            System.out.print(obj + " ");
        }
        System.out.println();


        Set<String> newNames = new HashSet<>();
        newNames.add("Karan");
        newNames.add("Ravi"); // Duplicate, won't be added again

        names.addAll(newNames);
        System.out.println("After addAll(): " + names);

        Set<String> common = new HashSet<>();
        common.add("Ravi");
        common.add("Manish");

        names.retainAll(common);
        System.out.println("After retainAll(): " + names); // Keeps only "Ravi"


        names.clear();
        System.out.println("After clear(): " + names);
    }
}
