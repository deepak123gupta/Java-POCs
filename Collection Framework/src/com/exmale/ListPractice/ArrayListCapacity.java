package com.exmale.ListPractice;

import java.util.ArrayList;
import java.lang.reflect.Field;

public class ArrayListCapacity {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(20);

        // Add elements to increase internal capacity
        list.add(10);
        list.add(20);
        list.add(30);

        // Use reflection to get capacity
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);  // Allow access to private field
        Object[] elementData = (Object[]) dataField.get(list);

        System.out.println("Size: " + list.size());
        System.out.println("Capacity: " + elementData.length);
    }
}
