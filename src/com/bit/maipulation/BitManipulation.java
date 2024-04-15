package com.bit.maipulation;

public class BitManipulation {
    /*

You have a 32-bit unsigned integer called 'num' and another integer called 'i'.
You need to perform the following operations on the 'num' integer based on the value of 'i':
1. Get the bit value at the "i"th position of "num".
2. Set the bit at the "i"th position of "num".
3. Clear the bit at the "i"th position of "num"*/
    public static void main(String[] args) {
        getTheithBit(9,3);
        getTheithBit(5,0);
        setTheithBit(9,2);
        clearTheithBit(13,2);
        System.out.println(isKthBitSet(5,2));
    }


    static boolean isKthBitSet(int n, int k) {
        return (n & (1 << k)) != 0;
    }
public static void getTheithBit(int num,int i){
        if((num & (1<<i))!=0){
            System.out.println(1);
        }
        else
            System.out.println(0);

}
    public static void setTheithBit(int num,int i){
        System.out.println((num | (1<<i)));
    }

    public static void clearTheithBit(int num,int i){
        System.out.println((num & ~(1<<i)));
    }

}
