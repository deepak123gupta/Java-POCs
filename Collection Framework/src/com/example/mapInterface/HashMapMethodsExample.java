package com.example.mapInterface;

import java.util.*;

public class HashMapMethodsExample {

    public static void main(String[] args) {

        // 1. Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. put() - Add key-value pairs
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("Initial Map: " + map);

        // 3. get() - Get value by key
      System.out.println("Get key 2: " + map.get(2));  // Python
//
//        // 4. putIfAbsent() - Add only if key not present
         map.putIfAbsent(3, "Go");  // Already present, won't change
       map.putIfAbsent(4, "Kotlin"); // Added
       System.out.println("After putIfAbsent: " + map);
//
//        // 5. containsKey() - Check key existence
       System.out.println("Contains key 3? " + map.containsKey(3));
//
//        // 6. containsValue() - Check value existence
      System.out.println("Contains value 'Java'? " + map.containsValue("Java"));
//
//        // 7. keySet() - Get all keys
       System.out.println("Keys: " + map.keySet());
//
//        // 8. values() - Get all values
       System.out.println("Values: " + map.values());
//
       // 9. entrySet() - Get all key-value pairs
       System.out.println("Entries:");
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " => " + entry.getValue());
//        }
//
//        // 10. remove(key)
       map.remove(2);
        System.out.println("After removing key 2: " + map);
//
//        // 11. remove(key, value) - Remove only if both match
       map.remove(3, "C++"); // true
     map.remove(4, "Java"); // false
//        System.out.println("After conditional remove: " + map);
//
      // 12. replace(key, newValue)
       map.replace(1, "Spring Boot");
//        System.out.println("After replace: " + map);
//
//        // 13. replace(key, oldValue, newValue) - conditional
//        map.replace(1, "Spring Boot", "Java 17");
//        map.replace(1, "Spring Boot", "Not Updated");
//        System.out.println("After conditional replace: " + map);
//
//        // 14. isEmpty() - Check if map is empty
//        System.out.println("Is map empty? " + map.isEmpty());
//
//        // 15. size() - Get total entries
//        System.out.println("Size of map: " + map.size());
//
//        // 16. clone() - Make shallow copy
//        HashMap<Integer, String> copy = (HashMap<Integer, String>) map.clone();
//        System.out.println("Cloned map: " + copy);
//
//        // 17. clear() - Remove all entries
//        map.clear();
//        System.out.println("After clear(): " + map);
//
//        // 18. forEach() - Lambda iteration (Java 8+)
//        copy.forEach((key, value) -> System.out.println(key + " maps to " + value));
    }
}
