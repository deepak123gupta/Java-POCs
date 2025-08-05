package com.exmale.ListPractice;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(11);
        list.addLast(24);
        list.removeFirst();
        list.remove(1);
        list.remove(Integer.valueOf(20));
        System.out.println(list);


    }



}
