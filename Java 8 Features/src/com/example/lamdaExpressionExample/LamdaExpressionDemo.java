package com.example.lamdaExpressionExample;

import java.util.ArrayList;

@FunctionalInterface
interface  MyFunctionalInterface {
    int display(int a,int b);
}

@FunctionalInterface
interface MyFunctionalInterface1{
    public void display1();
}

public class LamdaExpressionDemo {


        public static void main(String[] args) {
            MyFunctionalInterface m=((a,b)->
                    a+b);
            MyFunctionalInterface1 m1=(()-> System.out.println("hello"));

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.forEach(n->{
            System.out.println(n);
        });

            System.out.println(m.display(3,5));





    }




}
