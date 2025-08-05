package com.exmale.ListPractice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(20);

        for(int i=1; i<=10; i++) {
            numbers.add(i);
        }
        numbers.add(9);
        numbers.add(11);
        System.out.println("Original List: " + numbers);
        numbers.remove(2);
        numbers.remove(1);
        numbers.remove(Integer.valueOf(9));
        numbers.remove(Integer.valueOf(10));

        System.out.println(numbers.contains(9));
        System.out.println(numbers.contains(11));
        System.out.println(numbers.contains(12));


        System.out.println(numbers.indexOf(Integer.valueOf(9)));

        numbers.set(1,2);



        System.out.println(numbers);



        //create  a list and copy into another List
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> copiedList = new ArrayList<>(myList);

        System.out.println(myList);
        myList.add(4);
        myList.add(11);
        System.out.println(copiedList);
        copiedList.add(12);
        System.out.println(copiedList);
        ArrayList<Integer> myList2 = new ArrayList<>(List.of(1,2,3,4,5,6));
        myList2.add(11);
        System.out.println(myList2);


        List<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");

        List<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("C");
        list2.add("C++");

        list1.retainAll(list2);  // Intersection

        System.out.println(list1);  // Output: [Java]



    }
}
