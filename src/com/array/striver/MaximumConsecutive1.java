package com.array.striver;

public class MaximumConsecutive1 {
    public static void main(String[] args) {
        int [] arr={1,0,1,1,0,1,1,1,1,0};
        int count=0;
        int maxCount=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i]==1){
                    count++;
                    if(count>maxCount)
                        maxCount=count;

                }else
                    count=0;

        }

        System.out.println(maxCount);
        System.out.println(betterApproach(arr));
    }

    public static int betterApproach(int [] arr){
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor=xor^arr[i];
        }
    return xor;
    }
}
