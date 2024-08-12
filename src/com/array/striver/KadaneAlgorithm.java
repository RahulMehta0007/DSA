package com.array.striver;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        // maximum subarray with largest sum
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int maximumSum = Integer.MIN_VALUE;
        int start=0;int startI=0;int endI=0;

        for (int i = 0; i < arr.length; i++) {

            if(sum==0)
                start=i;


            sum += arr[i];

            if (sum > maximumSum) {
                maximumSum = sum;
                startI=start;
                endI=i;

            }

            if (sum < 0) {
                sum = 0;
            }

        }
        System.out.println(maximumSum);
        System.out.println("StartIndex:"+startI+", endIndex: "+endI);
    }
}
