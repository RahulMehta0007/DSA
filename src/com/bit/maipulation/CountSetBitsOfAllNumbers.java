package com.bit.maipulation;

public class CountSetBitsOfAllNumbers {
    public static void main(String[] args) {
        int n=4;
        int counter=0;
        while(n>0){
            counter+=countSetBitsEach(n);
            n--;
        }

        System.out.println(counter);
    }
    public static int countSetBitsEach(int n){
        int count =0;

        while(n!=0){
            if((n&1)==1)
                count++;
            n=n>>1;


        }

        return count;
    }
}
