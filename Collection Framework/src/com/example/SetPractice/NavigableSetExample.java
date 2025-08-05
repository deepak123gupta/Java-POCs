package com.example.SetPractice;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {


        NavigableSet<Integer> navSet = new TreeSet<>();

        // ✅ Add elements
        navSet.add(10);
        navSet.add(20);
        navSet.add(30);
        navSet.add(40);
        navSet.add(50);

        System.out.println("Original Set: " + navSet); // [10, 20, 30, 40, 50]

        // ✅ Methods from SortedSet Interface
        SortedSet<Integer> sortedSet = navSet;

        System.out.println("\n🔷 SortedSet Methods:");
        System.out.println("First element: " + sortedSet.first()); // 10
        System.out.println("Last element: " + sortedSet.last());   // 50
        System.out.println("Head Set (< 30): " + sortedSet.headSet(30)); // [10, 20]
        System.out.println("Tail Set (>= 30): " + sortedSet.tailSet(30)); // [30, 40, 50]
        System.out.println("Sub Set (20 to 50): " + sortedSet.subSet(20, 50)); // [20, 30, 40]

        // ✅ Methods from NavigableSet Interface
        System.out.println("\n🔷 NavigableSet Methods:");
        System.out.println("Lower than 30: " + navSet.lower(30));     // 20
        System.out.println("Floor of 30: " + navSet.floor(30));       // 30
        System.out.println("Ceiling of 25: " + navSet.ceiling(25));   // 30
        System.out.println("Higher than 30: " + navSet.higher(30));   // 40

        System.out.println("Poll First (removes): " + navSet.pollFirst()); // 10
        System.out.println("Poll Last (removes): " + navSet.pollLast());   // 50

        System.out.println("Set after polling: " + navSet); // [20, 30, 40]

        System.out.println("Descending Set: " + navSet.descendingSet()); // [40, 30, 20]

        System.out.println("SubSet with inclusive bounds (20 to 40): " +
                navSet.subSet(20, true, 40, true)); // [20, 30, 40]

        System.out.println("HeadSet (<=30): " + navSet.headSet(30, true)); // [20, 30]
        System.out.println("TailSet (>=30): " + navSet.tailSet(30, true)); // [30, 40]
    }
}
