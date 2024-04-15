package com.bit.maipulation;

public class MinimumBitFlips {

    public static void main(String[] args) {
        System.out.println(minimumBitFlips(10,7));
    }

    public static int minimumBitFlips(int a,int b){
        int xor=a^b;
        return countSetBits(xor);
    }

    public static int countSetBits(int num){
        int count=0;
        while(num!=0){
            num=(num&(num-1));
            count++;
        }
        return count;
    }

}
