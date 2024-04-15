package com.bit.maipulation;

public class SingleNumber3 {
    public static void main(String[] args) {
        //int [] arr={2,4,2,6,3,7,7,3};
        int [] arr={3, 3 ,1, 2};
        singleNumber3(arr);
    }

    public static void singleNumber3(int [] arr){
        int xor=0;
        int rightMostBit,firstBucket=0,secondBucket=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }

        rightMostBit=(xor&xor-1)^xor;

        for(int i=0;i<arr.length;i++){
           if( (arr[i]&rightMostBit)!=0)
               firstBucket^=arr[i];
           else
               secondBucket^=arr[i];
        }

        System.out.println(firstBucket);
        System.out.println(secondBucket);



    }

}
