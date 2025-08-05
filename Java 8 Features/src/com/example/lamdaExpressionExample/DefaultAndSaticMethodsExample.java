package com.example.lamdaExpressionExample;



interface MyInterface{
    default void defaultMethiod(){
        System.out.println("Default method in interface");
    }
    static void staticMethod(){
        System.out.println("Static method in interface");
    }
}
public class DefaultAndSaticMethodsExample implements MyInterface {

    public static void main(String[] args) {
        MyInterface m=new DefaultAndSaticMethodsExample();
        MyInterface.staticMethod();
        m.defaultMethiod();

    }
}
