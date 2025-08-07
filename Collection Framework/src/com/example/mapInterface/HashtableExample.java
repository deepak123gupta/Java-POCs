package com.example.mapInterface;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Set;
import java.util.Map.Entry;

public class HashtableExample {
    public static void main(String[] args) {

        // ✅ 1. Create a Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // ✅ 2. put() – Add entries
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");

        System.out.println("Initial Hashtable: " + table);

        // ✅ 3. get() – Retrieve a value
        System.out.println("Value at key 2: " + table.get(2)); // Banana

        // ✅ 4. containsKey() – Check if key exists
        System.out.println("Contains key 3? " + table.containsKey(3)); // true

        // ✅ 5. containsValue() – Check if value exists
        System.out.println("Contains value 'Banana'? " + table.containsValue("Banana")); // true

        // ✅ 6. remove() – Remove an entry
        table.remove(1);
        System.out.println("After removing key 1: " + table);

        // ✅ 7. size() – Number of entries
        System.out.println("Size: " + table.size()); // 2

        // ✅ 8. isEmpty()
        System.out.println("Is hashtable empty? " + table.isEmpty()); // false

        // ✅ 9. keySet() – Get all keys
        Set<Integer> keys = table.keySet();
        System.out.println("Keys: " + keys);

        // ✅ 10. values() – Get all values
        System.out.println("Values: " + table.values());

        // ✅ 11. entrySet() – Iterate key-value pairs
        System.out.println("Entries:");
        for (Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ✅ 12. putIfAbsent() – Only add if key not present
        table.putIfAbsent(3, "Coconut"); // Already present
        table.putIfAbsent(4, "Date"); // Not present
        System.out.println("After putIfAbsent: " + table);

        // ✅ 13. replace() – Replace value at a key
        table.replace(2, "Blueberry"); // Replaces Banana
        System.out.println("After replace: " + table);

        // ✅ 14. clear() – Remove all elements
        table.clear();
        System.out.println("After clear: " + table); // {}
    }
}
