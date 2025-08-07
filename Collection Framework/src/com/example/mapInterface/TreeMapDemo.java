package com.example.mapInterface;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(30, "Thirty");

        System.out.println("Original Map: " + map);
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        System.out.println("Lower Key of 25: " + map.lowerKey(25)); // 20
        System.out.println("Floor Key of 20: " + map.floorKey(20)); // 20
        System.out.println("Ceiling Key of 25: " + map.ceilingKey(25)); // 30
        System.out.println("Higher Key of 20: " + map.higherKey(20)); // 30

        System.out.println("Descending Map: " + map.descendingMap());

        System.out.println("SubMap(10, 30): " + map.subMap(10, 30)); // 10, 20
    }
}
