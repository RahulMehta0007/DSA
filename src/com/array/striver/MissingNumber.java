package com.array.striver;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr={9,6,4,2,3,5,7,0,1};
        System.out.println(betterSolutionMissingNumber(arr));
        System.out.println(optimalSolutionMissingNumber(arr));
        System.out.println(bestSolutionMissingNumber(arr));
    }

    // Time Complexity is : 0(2N), Space Complexity : O(n)
    public static int  betterSolutionMissingNumber(int [] arr){

        int [] hashArray =new int[arr.length+1];
        for(int i=0;i< arr.length;i++){
            hashArray[arr[i]]=1;
        }
        for (int i = 0; i < hashArray.length; i++) {
            if(hashArray[i]==0)
                return i;
        }
        return -1;
    }

    public static int  optimalSolutionMissingNumber(int [] arr){
        int summation=0;
        int n= arr.length+1;
        int sum=(n*(n-1))/2;

        for (int i = 0; i < arr.length; i++) {
            summation+=arr[i];
        }
        return sum-summation;
    }

    public static int  bestSolutionMissingNumber(int [] arr){
        int xor1=0,xor2=0;
        int n= arr.length-1;

        for (int i = 0; i < n; i++) {
            xor1=xor1^arr[i];
            xor2=xor2^(i+1);
        }
        xor2=xor2^ n;
        return xor1^xor2;
    }
}
