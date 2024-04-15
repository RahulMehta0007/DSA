package com.bit.maipulation;

public class SwapTwoNumbers {
    /* Swap two numbers using bit manipulation
    * (a^a)=0
    *
    * */
    public static void main(String[] args) {

        int a=5;
        int b=6;

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a);
        System.out.println(b);
    }

}
