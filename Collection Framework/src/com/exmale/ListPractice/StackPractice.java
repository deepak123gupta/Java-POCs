package com.exmale.ListPractice;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class StackPractice {

    public static void main(String[] args) {
        Stack<String> s=new Stack<>();
        s.add("Deepak");
        s.add("XYZ");
        s.add("XYZ1");
        s.add("ABC");
        s.set(1,"Deepak");
        System.out.println(s.get(1));
        System.out.println(s.peek());
        System.out.println(s.push("Deep"));
        System.out.println(s.pop());
//        System.out.println(s.elements());
        System.out.println(s);

        Object[] array= s.toArray();
        System.out.println(Arrays.toString(array));






    }
}
