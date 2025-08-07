package com.example.mapInterface;

import java.util.*;

public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {
        // Normal HashMap
        Map<Object, String> hashMap = new HashMap<>();

        // WeakHashMap
        Map<Object, String> weakHashMap = new WeakHashMap<>();

        // Key objects
        Object hashKey = new String("hashMapKey");
        Object weakKey = new String("weakMapKey");

        // Add to maps
        hashMap.put(hashKey, "I am in HashMap");
        weakHashMap.put(weakKey, "I am in WeakHashMap");

        // Remove strong references to keys
        hashKey = null;
        weakKey = null;

        // Ask JVM to do garbage collection
        System.gc();

        // Wait for GC to complete
        Thread.sleep(3000);

        System.out.println("HashMap content: " + hashMap);
        System.out.println("WeakHashMap content: " + weakHashMap);
    }
}
