package com.example.pattern;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=12345;
        int reverse=0;
        while(number>0){
            int r=number%10;
            reverse=r+reverse*10;
            number=number/10;

        }
        System.out.println(reverse);
    }
}
