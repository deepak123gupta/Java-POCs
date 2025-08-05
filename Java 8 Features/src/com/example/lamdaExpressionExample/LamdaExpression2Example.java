package com.example.lamdaExpressionExample;

@FunctionalInterface
interface Greeting {
 void greet();
}



public class LamdaExpression2Example {
    public static void main(String[] args) {
        Greeting g=(()-> {System.out.println("hello");
            System.out.println("hii...");;});
        g.greet();
    }

}
